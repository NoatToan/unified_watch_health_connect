package com.huawei.openalliance.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.huawei.openalliance.ad.activity.AdComplainActivity;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class o extends j {
    private com.huawei.openalliance.ad.views.feedback.h d;

    public static class a implements com.huawei.openalliance.ad.views.feedback.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f19805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ContentRecord f19806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private FeedbackInfo f19807c;
        private String d;
        private RemoteCallResultCallback<String> e;

        @Override // com.huawei.openalliance.ad.views.feedback.h
        public void b() {
            if (this.f19805a == null) {
                return;
            }
            j.a(this.e, this.d, 1000, 1, true);
            c();
        }

        @Override // com.huawei.openalliance.ad.views.feedback.h
        public void a() {
            Context context = this.f19805a;
            if (context == null) {
                return;
            }
            o.b(context, this.f19806b, 3, this.f19807c);
            j.a(this.e, this.d, 1000, 0, true);
            c();
        }

        private void c() {
            this.f19805a = null;
            this.f19806b = null;
            this.f19807c = null;
            this.e = null;
            this.d = null;
        }

        a(Context context, ContentRecord contentRecord, FeedbackInfo feedbackInfo, RemoteCallResultCallback<String> remoteCallResultCallback, String str) {
            this.f19805a = context.getApplicationContext();
            this.f19806b = contentRecord;
            this.f19807c = feedbackInfo;
            this.e = remoteCallResultCallback;
            this.d = str;
        }
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        if (hw.a()) {
            hw.a("JsbFeedBackClick", "start");
        }
        JSONObject jSONObject = new JSONObject(str);
        ContentRecord contentRecordB = b(context, str);
        int iOptInt = jSONObject.optInt(JsbMapKeyNames.FEEDBACK_TYPE, -111111);
        if (contentRecordB == null) {
            hw.a("JsbFeedBackClick", "ad not exist");
            a(remoteCallResultCallback, this.f19295a, 3002, null, true);
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(JsbMapKeyNames.FEEDBACK_INFO);
        FeedbackInfo feedbackInfo = (FeedbackInfo) com.huawei.openalliance.ad.utils.bk.b(jSONObjectOptJSONObject.toString(), FeedbackInfo.class, new Class[0]);
        if (jSONObjectOptJSONObject == null || feedbackInfo == null) {
            return;
        }
        long jA = com.huawei.openalliance.ad.utils.dg.a(jSONObjectOptJSONObject.optString("id"), -111111L);
        Long lValueOf = Long.valueOf(jA);
        lValueOf.getClass();
        if (jA == -111111) {
            hw.b("JsbFeedBackClick", "invalid id");
            a(remoteCallResultCallback, this.f19295a, 4001, null, true);
            return;
        }
        lValueOf.getClass();
        feedbackInfo.a(jA);
        if (iOptInt != 3) {
            b(context, contentRecordB, iOptInt, feedbackInfo);
            a(remoteCallResultCallback, this.f19295a, 1000, null, true);
        } else {
            a aVar = new a(context, contentRecordB, feedbackInfo, remoteCallResultCallback, this.f19295a);
            this.d = aVar;
            a(context, contentRecordB, feedbackInfo, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Context context, ContentRecord contentRecord, int i, FeedbackInfo feedbackInfo) {
        try {
            pc pcVar = new pc(context, sw.a(context, contentRecord.f()));
            pcVar.a(contentRecord);
            ArrayList arrayList = new ArrayList();
            arrayList.add(feedbackInfo);
            hw.b("JsbFeedBackClick", "itemType is %s.", Integer.valueOf(i));
            if (i != 1) {
                if (i == 2) {
                    com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.o.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(context, R.string.hiad_feedback_had_feedback, 0).show();
                        }
                    });
                    pcVar.b(arrayList);
                    return;
                } else if (i != 3) {
                    hw.a("JsbFeedBackClick", "invalid feedback type");
                    return;
                }
            }
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.o.2
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(context, R.string.hiad_feedback_reduce_such_content, 0).show();
                }
            });
            pcVar.c(arrayList);
        } catch (Throwable th) {
            hw.c("JsbFeedBackClick", "itemClickAction error: %s", th.getClass().getSimpleName());
        }
    }

    private boolean a(Context context, ContentRecord contentRecord, FeedbackInfo feedbackInfo, com.huawei.openalliance.ad.views.feedback.h hVar) {
        hw.b("JsbFeedBackClick", "click complain");
        if (feedbackInfo == null) {
            return false;
        }
        try {
            Intent intent = new Intent(context, (Class<?>) AdComplainActivity.class);
            intent.putExtra(MapKeyNames.COMPLAIN_H5_TITLE, feedbackInfo.getLabel());
            AdComplainActivity.a(new com.huawei.openalliance.ad.views.feedback.a(context, contentRecord, hVar));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.huawei.openalliance.ad.utils.dk.a(context, intent);
            return true;
        } catch (Throwable th) {
            hw.c("JsbFeedBackClick", "start ac failed: %s", th.getClass().getSimpleName());
            return true;
        }
    }

    public o() {
        super("pps.feedback.click");
    }
}
