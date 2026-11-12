package ya1;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lya1/m;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "headline", "message", "action", "Lkotlin/Function0;", "", "onDismiss", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "", "startAnimation", "", "animatedValue", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f195571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f195573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f195574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<Unit> f195575e;

    public m(Context context, String str, String str2, String str3, e23.a<Unit> aVar) {
        context.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        aVar.getClass();
        this.f195571a = context;
        this.f195572b = str;
        this.f195573c = str2;
        this.f195574d = str3;
        this.f195575e = aVar;
    }

    public final ComposeView a() {
        ComposeView composeView = new ComposeView(this.f195571a, null, 0, 6, null);
        composeView.setVisibility(0);
        composeView.setContent(new z3.e(289062316, true, new j(this, 0)));
        return composeView;
    }
}
