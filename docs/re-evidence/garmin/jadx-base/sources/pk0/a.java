package pk0;

import com.garmin.android.apps.connectmobile.onboarding.education.VoiceAssistantEducationalActivity;
import kotlin.t3;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f138185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f138186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f138187d;

    public /* synthetic */ a(boolean z14, boolean z15, Object obj, int i14) {
        this.f138184a = i14;
        this.f138185b = z14;
        this.f138186c = z15;
        this.f138187d = obj;
    }

    @Override // e23.a
    public final Object invoke() {
        String str;
        int i14 = this.f138184a;
        String str2 = "";
        Object obj = this.f138187d;
        boolean z14 = this.f138186c;
        boolean z15 = this.f138185b;
        switch (i14) {
            case 0:
                String str3 = (String) obj;
                if ((z15 && z14 && str3.length() > 0) || ((!z15 || !z14) && z15)) {
                    str2 = str3;
                }
                return p0.n(str2);
            case 1:
                String str4 = (String) obj;
                return p0.n(((z15 && z14 && str4.length() > 0) || z15) ? str4 : "");
            default:
                t3 t3Var = (t3) obj;
                VoiceAssistantEducationalActivity.a aVar = VoiceAssistantEducationalActivity.f39694a;
                if (z15) {
                    str = "https://support.garmin.com/sas/grmn/?productId=730659&contentId=B0n9YwrwMg4j7yEgevIWgA";
                } else {
                    str = z14 ? "https://support.garmin.com/sas/grmn/?productId=869433&contentId=B0n9YwrwMg4j7yEgevIWgA" : "https://support.garmin.com/en-US/?faq=B0n9YwrwMg4j7yEgevIWgA";
                }
                t3Var.a(str);
                return Unit.INSTANCE;
        }
    }
}
