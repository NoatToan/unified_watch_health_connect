package ex2;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.ImageHelper", f = "ImageHelper.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 210}, m = "loadImageIntoView", v = 1)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f66974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f66975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f66976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f66977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f66978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppCompatImageView f66979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f66981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f66982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f66983j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f66982i = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f66981h = obj;
        this.f66983j |= Integer.MIN_VALUE;
        return this.f66982i.f(null, null, null, null, null, null, 0, this);
    }
}
