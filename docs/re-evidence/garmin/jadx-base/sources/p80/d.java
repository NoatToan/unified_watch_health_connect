package p80;

import android.content.IntentSender;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0003\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lp80/d;", "", "Ln80/a;", "device", "Landroid/content/IntentSender;", "intentSender", "", "loading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "deviceLinkMessageResId", "<init>", "(Ln80/a;Landroid/content/IntentSender;ZZI)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n80.a f136358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentSender f136359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f136360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f136361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f136362e;

    public /* synthetic */ d(n80.a aVar, IntentSender intentSender, boolean z14, boolean z15, int i14, int i15, j jVar) {
        this(aVar, (i15 & 2) != 0 ? null : intentSender, (i15 & 4) != 0 ? false : z14, (i15 & 8) != 0 ? false : z15, (i15 & 16) != 0 ? R.string.msg_link_device_info : i14);
    }

    public static d a(d dVar, IntentSender intentSender, boolean z14, boolean z15, int i14, int i15) {
        IntentSender intentSender2 = intentSender;
        n80.a aVar = dVar.f136358a;
        if ((i15 & 2) != 0) {
            intentSender2 = dVar.f136359b;
        }
        if ((i15 & 4) != 0) {
            z14 = dVar.f136360c;
        }
        if ((i15 & 8) != 0) {
            z15 = dVar.f136361d;
        }
        if ((i15 & 16) != 0) {
            i14 = dVar.f136362e;
        }
        int i16 = i14;
        dVar.getClass();
        aVar.getClass();
        boolean z16 = z15;
        return new d(aVar, intentSender2, z14, z16, i16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f136358a, dVar.f136358a) && s.g(this.f136359b, dVar.f136359b) && this.f136360c == dVar.f136360c && this.f136361d == dVar.f136361d && this.f136362e == dVar.f136362e;
    }

    public final int hashCode() {
        int iHashCode = this.f136358a.hashCode() * 31;
        IntentSender intentSender = this.f136359b;
        return Integer.hashCode(this.f136362e) + q6.f.g(q6.f.g((iHashCode + (intentSender == null ? 0 : intentSender.hashCode())) * 31, 31, this.f136360c), 31, this.f136361d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CompanionDeviceLinkState(device=");
        sb3.append(this.f136358a);
        sb3.append(", intentSender=");
        sb3.append(this.f136359b);
        sb3.append(", loading=");
        kg.f.q(", error=", ", deviceLinkMessageResId=", sb3, this.f136360c, this.f136361d);
        return am.j.q(sb3, this.f136362e, ")");
    }

    public d(n80.a aVar, IntentSender intentSender, boolean z14, boolean z15, int i14) {
        aVar.getClass();
        this.f136358a = aVar;
        this.f136359b = intentSender;
        this.f136360c = z14;
        this.f136361d = z15;
        this.f136362e = i14;
    }
}
