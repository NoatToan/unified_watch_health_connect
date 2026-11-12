package p81;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pi0.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp81/b;", "", "Landroidx/compose/ui/platform/ComposeView;", "listView", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "", "onItemSelected", "<init>", "(Landroidx/compose/ui/platform/ComposeView;Le23/l;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f136381e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f136382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<LocalDate, Unit> f136383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f136384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f136385d;

    static {
        int i14 = ComposeView.f6053c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(ComposeView composeView, l<? super LocalDate, Unit> lVar) {
        composeView.getClass();
        lVar.getClass();
        this.f136382a = composeView;
        this.f136383b = lVar;
        Context context = composeView.getContext();
        context.getClass();
        this.f136384c = new e(context);
        String string = composeView.getContext().getString(R.string.no_value);
        string.getClass();
        this.f136385d = string;
    }
}
