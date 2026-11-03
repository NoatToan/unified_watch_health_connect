package com.unified.health.core.ble.driver

import com.unified.health.core.model.CredentialRequirement

/** A vendor protocol step failed (bad frame, NAK, timeout, unsupported device…). */
open class WearableProtocolException(message: String, cause: Throwable? = null) : Exception(message, cause)

/** The device needs a credential the user has not provided yet. */
class MissingCredentialException(val requirement: CredentialRequirement) :
    WearableProtocolException("${requirement.label} is required to connect")

/** The watch rejected our authentication (wrong key, unbound device…). */
class AuthenticationException(message: String, cause: Throwable? = null) : WearableProtocolException(message, cause)

/** The device speaks a protocol variant this driver does not implement. */
class UnsupportedDeviceException(message: String) : WearableProtocolException(message)
