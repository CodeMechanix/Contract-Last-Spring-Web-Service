package com.codemechanix.contractLast.controller.ws.dto;

import com.codemechanix.contractLast.controller.dto.UserUpdateRequest;
import com.codemechanix.contractLast.controller.ws.WSEndpoint;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userUpdateRequestPayload", propOrder = {
        "userUpdateRequest",
        "userPayload"
})
public class UserUpdatePayload {
    @XmlElement(required = true)
    @XmlSchemaType(name = "userUpdateRequest", namespace = WSEndpoint.NAMESPACE_URI)
    private UserUpdateRequest userUpdateRequest;

    @XmlElement(required = true)
    @XmlSchemaType(name = "userPayload", namespace = WSEndpoint.NAMESPACE_URI)
    private UserPayload userPayload;

    public UserUpdateRequest getUserUpdateRequest() {
        return userUpdateRequest;
    }

    public void setUserUpdateRequest(UserUpdateRequest userUpdateRequest) {
        this.userUpdateRequest = userUpdateRequest;
    }

    public UserPayload getUserPayload() {
        return userPayload;
    }

    public void setUserPayload(UserPayload userPayload) {
        this.userPayload = userPayload;
    }
}

