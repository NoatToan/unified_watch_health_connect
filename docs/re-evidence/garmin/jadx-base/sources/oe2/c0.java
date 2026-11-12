package oe2;

import com.mapbox.maps.extension.compose.style.sources.generated.RasterDemSourceState;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c0 extends p005kotlin.jvm.internal.w implements e23.a<RasterDemSourceState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f131468a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(String str) {
        super(0);
        this.f131468a = str;
    }

    @Override // e23.a
    public final RasterDemSourceState invoke() {
        return new RasterDemSourceState(this.f131468a);
    }
}
