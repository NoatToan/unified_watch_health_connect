package sy2;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import sy2.c;
import sy2.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\f\b\u0001\u0010\u0004*\u0006\u0012\u0002\b\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsy2/b;", "Lsy2/c;", "ModelType", "Lsy2/e;", "ViewType", "Lsy2/d;", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b<ModelType extends c<?>, ViewType extends e<?>> implements d<ModelType, ViewType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ModelType f161297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewType f161298b;

    @Override // sy2.d
    public final void M(ViewType viewtype) {
        this.f161298b = viewtype;
    }

    @Override // sy2.d
    public final void e(ModelType modeltype) {
        this.f161297a = modeltype;
    }

    public final ModelType f0() {
        ModelType modeltype = this.f161297a;
        if (modeltype != null) {
            return modeltype;
        }
        s.m(ModelSourceWrapper.TYPE);
        throw null;
    }

    @Override // sy2.d
    public final ViewType getView() {
        ViewType viewtype = this.f161298b;
        if (viewtype != null) {
            return viewtype;
        }
        s.m("view");
        throw null;
    }
}
