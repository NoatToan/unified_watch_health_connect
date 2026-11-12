package com.garmin.android.apps.connectmobile.group.service.model;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/service/model/d;", "Lcom/garmin/android/apps/connectmobile/s1;", "<init>", "()V", "b", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f36413a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/service/model/d$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        NOT_DEFINED,
        REQUESTED,
        /* JADX INFO: Fake field, exist only in values array */
        ACCEPTED,
        /* JADX INFO: Fake field, exist only in values array */
        DECLINE
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        b bVarValueOf;
        if (jSONObject != null) {
            s1.u(jSONObject, "groupMemberRequestId");
            s1.u(jSONObject, "userGroupId");
            jSONObject.optLong("requestDate");
            s1.u(jSONObject, "requestorId");
            String strU = s1.u(jSONObject, "requestStatus");
            if (TextUtils.isEmpty(strU)) {
                bVarValueOf = b.NOT_DEFINED;
            } else {
                strU.getClass();
                bVarValueOf = b.valueOf(strU);
            }
            this.f36413a = bVarValueOf;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/service/model/d$a;", "", "<init>", "()V", "", "GROUP_MEMBER_REQUEST_ID_PK", "Ljava/lang/String;", "USER_GROUP_ID_PK", "REQUEST_DATE_PK", "REQUESTOR_ID_PK", "REQUEST_STATUS_PK", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
