package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f8803b;

    public /* synthetic */ c(Context context, int i14) {
        this.f8802a = i14;
        this.f8803b = context;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f8802a) {
            case 0:
                AudioManager audioManager = (AudioManager) this.f8803b.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                audioManager.getClass();
                return audioManager;
            case 1:
                return new wa.e(this.f8803b);
            case 2:
                return new androidx.media3.exoplayer.source.e(this.f8803b, new bb.j());
            case 3:
                return xa.h.g(this.f8803b);
            case 4:
                return new l(this.f8803b);
            case 5:
                return new l(this.f8803b);
            default:
                return new androidx.media3.exoplayer.source.e(this.f8803b, new bb.j());
        }
    }
}
