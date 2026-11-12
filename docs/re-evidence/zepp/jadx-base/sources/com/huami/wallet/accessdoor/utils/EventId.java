package com.huami.wallet.accessdoor.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/huami/wallet/accessdoor/utils/EventId;", "", "", "NFC_ACCESS_OPEN_SUCCESS", "Ljava/lang/String;", "NFC_ACCESS_OPEN_FAIL", "NFC_ACCESS_DELETE_SUCCESS", "NFC_ACCESS_DELETE_FAILURE", "NFC_ACCESS_DETECTION_SUCCESS", "NFC_ACCESS_DETECTION_FAILURE", "NFC_ACCESS_CERTIFICATION_SUCCESS", "NFC_ACCESS_CERTIFICATION_FAILURE", "DOOR_VIEW_NUM", "LAB_ENTRANCE_VIEWNUM", "LAB_DOOR_ENABLE", "DOOR_DETAIL_OUT", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class EventId {

    @NotNull
    public static final String DOOR_DETAIL_OUT = "DoorDetail_Out";

    @NotNull
    public static final String DOOR_VIEW_NUM = "Door_ViewNum";

    @NotNull
    public static final EventId INSTANCE = new EventId();

    @NotNull
    public static final String LAB_DOOR_ENABLE = "LabDoor_Enable";

    @NotNull
    public static final String LAB_ENTRANCE_VIEWNUM = "LabEntrance_ViewNum";

    @NotNull
    public static final String NFC_ACCESS_CERTIFICATION_FAILURE = "NFC_Access_CertificationFail";

    @NotNull
    public static final String NFC_ACCESS_CERTIFICATION_SUCCESS = "NFC_Access_CertificationSuccess";

    @NotNull
    public static final String NFC_ACCESS_DELETE_FAILURE = "NFC_Access_DeleteFail";

    @NotNull
    public static final String NFC_ACCESS_DELETE_SUCCESS = "NFC_Access_DeleteSuccess";

    @NotNull
    public static final String NFC_ACCESS_DETECTION_FAILURE = "NFC_Access_DetectionFail";

    @NotNull
    public static final String NFC_ACCESS_DETECTION_SUCCESS = "NFC_Access_DetectionSuccess";

    @NotNull
    public static final String NFC_ACCESS_OPEN_FAIL = "NFC_Access_OpenFail";

    @NotNull
    public static final String NFC_ACCESS_OPEN_SUCCESS = "NFC_Access_OpenSuccess";

    private EventId() {
    }
}
