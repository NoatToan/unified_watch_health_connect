package com.huami.account.userinfo.event;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/huami/account/userinfo/event/StatEvent;", "", "", "EVENT_PROFILE_VIEW_NUM", "Ljava/lang/String;", "EVENT_PROFILE_OUT", "VALUE_PHOTO", "VALUE_NICKNAME", "VALUE_GENDER", "VALUE_BORN", "VALUE_HEIGHT", "VALUE_WEIGHT", "VALUE_COPY_ID", "EVENT_UPLOAD_PICTURE_TYPE", "VALUE_PHOTO_CAMERA", "VALUE_PHOTO_ALBUM", "EVENT_SET_NEW_USER_INFO_VIEW_NUM", "EVENT_SET_NEW_USER_INFO_EDIT_NAME", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class StatEvent {

    @NotNull
    public static final String EVENT_PROFILE_OUT = "Profile_Out";

    @NotNull
    public static final String EVENT_PROFILE_VIEW_NUM = "Profile_ViewNum";

    @NotNull
    public static final String EVENT_SET_NEW_USER_INFO_EDIT_NAME = "SetNewUserInfo_EditName";

    @NotNull
    public static final String EVENT_SET_NEW_USER_INFO_VIEW_NUM = "SetNewUserInfo_ViewNum";

    @NotNull
    public static final String EVENT_UPLOAD_PICTURE_TYPE = "UploadPictureType";

    @NotNull
    public static final StatEvent INSTANCE = new StatEvent();

    @NotNull
    public static final String VALUE_BORN = "Born";

    @NotNull
    public static final String VALUE_COPY_ID = "CopyID";

    @NotNull
    public static final String VALUE_GENDER = "Gender";

    @NotNull
    public static final String VALUE_HEIGHT = "Height";

    @NotNull
    public static final String VALUE_NICKNAME = "Nickname";

    @NotNull
    public static final String VALUE_PHOTO = "Photo";

    @NotNull
    public static final String VALUE_PHOTO_ALBUM = "PhotoAlbum";

    @NotNull
    public static final String VALUE_PHOTO_CAMERA = "TakingPictures";

    @NotNull
    public static final String VALUE_WEIGHT = "Weight";

    private StatEvent() {
    }
}
