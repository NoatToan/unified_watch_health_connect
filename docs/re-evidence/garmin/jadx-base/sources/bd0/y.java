package bd0;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public enum y {
    AUTHENTICATING(R.string.pairing_authenticating),
    AUTHENTICATION_FAILURE(R.string.pairing_authentication_failure),
    AUTHENTICATED(R.string.pairing_authenticated),
    CONNECTING(R.string.pairing_connecting_to_device),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECTING_TIMEOUT(R.string.pairing_connecting_to_device_timed_out_a),
    CONNECTING_FAILURE(R.string.pairing_connecting_to_device_failure),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECTING_FAILURE_BAD_BLUETOOTH_STATE(R.string.pairing_connecting_to_device_failure_bad_bluetooth_state),
    CONNECTING_SUCCESS(R.string.txt_garmin_device_connected),
    DISCONNECTED(R.string.dialog_title_device_disconnected_a),
    CHECKING_DEVICE_REGISTRATION_STATUS(R.string.pairing_checking_device_registration_status),
    CHECKING_DEVICE_REGISTRATION_STATUS_FAILURE(R.string.pairing_checking_device_registration_status_unsuccessful),
    CHECKING_DEVICE_REGISTRATION_STATUS_SUCCESS(R.string.pairing_checking_device_registration_status_success),
    SENDING_DEVICE_RESET_COMMAND(R.string.pairing_reset_sending_reset_command),
    SENDING_DEVICE_RESET_COMMAND_FAILURE(R.string.pairing_reset_sending_reset_command_unsuccessful),
    SENDING_DEVICE_RESET_COMMAND_SUCCESS(R.string.pairing_reset_sending_reset_command_successful),
    RESETTING_DEVICE(R.string.pairing_reset_progress),
    DISCONNECTING(R.string.txt_garmin_device_disconnecting),
    RETRIEVING_GARMIN_DEVICE_XML(R.string.pairing_requesting_device_identification_file),
    RETRIEVING_GARMIN_DEVICE_XML_FAILURE(R.string.pairing_requesting_device_identification_file_failed),
    RETRIEVING_GARMIN_DEVICE_XML_SUCCESS(R.string.pairing_requesting_device_identification_file_success),
    REGISTERING_DEVICE(R.string.pairing_registering_device),
    REGISTERING_DEVICE_FAILURE(R.string.pairing_registering_device_failure),
    REGISTERING_DEVICE_SUCCESS(R.string.pairing_registering_device_success),
    CHECKING_FOR_FIRMWARE_UPDATE(R.string.pairing_checking_for_device_software_updates),
    CHECKING_FOR_FIRMWARE_UPDATE_FAILURE(R.string.pairing_checking_for_device_software_updates_failed),
    CHECKING_FOR_FIRMWARE_UPDATE_SUCCESS(R.string.pairing_checking_for_device_software_updates_success),
    SYNC_STARTED(R.string.pairing_sync_started),
    SYNC_UPLOAD_PREPARED(R.string.pairing_sync_upload_x_of_y_bytes_transferred),
    SYNC_DOWNLOAD_PREPARED(R.string.pairing_sync_download_x_of_y_items_transferred),
    SYNC_DOWNLOAD_SOFTWARE_UPDATE_SENDING(R.string.pairing_sync_downloading_software_update_sending),
    /* JADX INFO: Fake field, exist only in values array */
    SYNC_DOWNLOAD_SOFTWARE_UPDATE_SENDING_FAILURE(R.string.pairing_sync_downloading_software_update_sending_failure),
    SYNC_DOWNLOAD_SOFTWARE_UPDATE_SENDING_SUCCESS(R.string.pairing_sync_downloading_software_update_sending_success),
    SYNC_FINISHED(R.string.pairing_sync_finished),
    SAVED_DEVICE_TO_LOCAL_DATABASE(R.string.pairing_saved_device);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17660a;

    y(int i14) {
        this.f17660a = i14;
    }
}
