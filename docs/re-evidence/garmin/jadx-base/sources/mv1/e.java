package mv1;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import java.util.Locale;
import k11.n;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fBQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmv1/e;", "", "", "isTwoButton", "", "titleString", "msgString", "", "posBtnResId", "negBtnResId", "Lkotlin/Function1;", "", FirebaseAnalytics.Param.METHOD, "<init>", "(ZLjava/lang/String;Ljava/lang/String;IILe23/l;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f121184g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f121185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f121187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f121188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f121189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<Boolean, Unit> f121190f;

    public /* synthetic */ e(boolean z14, String str, String str2, int i14, int i15, l lVar, int i16, j jVar) {
        this((i16 & 1) != 0 ? true : z14, str, (i16 & 4) != 0 ? null : str2, (i16 & 8) != 0 ? R.string.lbl_common_continue : i14, (i16 & 16) != 0 ? R.string.common_cancel : i15, (i16 & 32) != 0 ? null : lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f121185a == eVar.f121185a && s.g(this.f121186b, eVar.f121186b) && s.g(this.f121187c, eVar.f121187c) && this.f121188d == eVar.f121188d && this.f121189e == eVar.f121189e && s.g(this.f121190f, eVar.f121190f);
    }

    public final int hashCode() {
        int iJ = g.j(Boolean.hashCode(this.f121185a) * 31, 31, this.f121186b);
        String str = this.f121187c;
        int iD = q2.d(this.f121189e, q2.d(this.f121188d, (iJ + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        l<Boolean, Unit> lVar = this.f121190f;
        return iD + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTMiniWizardConfirmationDialogModel(isTwoButton=");
        sb3.append(this.f121185a);
        sb3.append(", titleString=");
        sb3.append(this.f121186b);
        sb3.append(", msgString=");
        q6.f.q(this.f121188d, this.f121187c, ", posBtnResId=", ", negBtnResId=", sb3);
        sb3.append(this.f121189e);
        sb3.append(", method=");
        sb3.append(this.f121190f);
        sb3.append(")");
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmv1/e$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static e a(l22.a aVar, boolean z14, l lVar) {
            String string;
            if (z14) {
                string = aVar.getString(R.string.lbl_course_profile).toLowerCase(Locale.ROOT);
                string.getClass();
            } else {
                string = aVar.getString(R.string.course_or_course_profile);
            }
            return new e(false, aVar.getString(R.string.add_a_course), aVar.a(R.string.add_course_or_course_profile_question, string), 0, R.string.feedback_no_thanks_btn, new n(lVar, 28), 9, null);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(boolean z14, String str, String str2, int i14, int i15, l<? super Boolean, Unit> lVar) {
        str.getClass();
        this.f121185a = z14;
        this.f121186b = str;
        this.f121187c = str2;
        this.f121188d = i14;
        this.f121189e = i15;
        this.f121190f = lVar;
    }
}
