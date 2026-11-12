package w31;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import e32.l;
import e32.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw31/i;", "T", "Le32/p;", "Landroid/view/View;", "view", "Le32/l;", "Lj41/b;", "navigator", "<init>", "(Landroid/view/View;Le32/l;)V", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<j41.b> f181868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f181869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n41.a f181870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComposeView f181871d;

    public i(View view2, l<j41.b> lVar) {
        view2.getClass();
        lVar.getClass();
        this.f181868a = lVar;
        Context context = view2.getContext();
        context.getClass();
        this.f181869b = context;
        this.f181870c = new n41.a(context);
        this.f181871d = (ComposeView) view2.findViewById(R.id.gcm_stats_row_1);
    }
}
