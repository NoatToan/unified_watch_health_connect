package mq;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import ps.d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lmq/j;", "Lmq/l;", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "Lps/d0;", "dataFieldDto", "<init>", "(Ljava/lang/String;Lps/d0;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f120187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f120189c;

    static {
        new a(null);
        Parcelable.Creator<d0> creator = d0.CREATOR;
    }

    public j(String str, d0 d0Var) {
        str.getClass();
        d0Var.getClass();
        this.f120187a = View.generateViewId() + 100;
        if (TextUtils.isEmpty(str)) {
            vb.h.x("Invalid app ID: ".concat(str));
            throw null;
        }
        this.f120188b = str;
        this.f120189c = d0Var;
    }

    @Override // mq.l
    public final String a(Context context) {
        String str;
        d0 d0Var = this.f120189c;
        return (d0Var == null || (str = d0Var.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String()) == null) ? "" : str;
    }

    @Override // mq.l
    /* JADX INFO: renamed from: b */
    public final float getF120143b() {
        return 1.5f;
    }

    @Override // mq.l
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF120187a() {
        return this.f120187a;
    }

    @Override // mq.l
    public final String d(Context context, sr.b bVar) {
        return a(context);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lmq/j$a;", "", "<init>", "()V", "", "DEFAULT_DECIMAL_PRECISION", "I", "", "DEFAULT_VIEW_WEIGHT", "F", "", "DEFAULT_TEXT_VALUE", "Ljava/lang/String;", "INVALID_NUMERIC_VALUE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
