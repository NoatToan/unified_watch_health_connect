package com.mapbox.maps.extension.compose.style.sources.generated;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.IdGenerator;
import e23.a;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a?\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0014\b\u0006\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"", Action.KEY_ATTRIBUTE, "sourceId", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterArraySourceState;", "", "init", "rememberRasterArraySourceState", "(Ljava/lang/String;Ljava/lang/String;Le23/l;Lp3/m;II)Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterArraySourceState;", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class RasterArraySourceStateKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.sources.generated.RasterArraySourceStateKt$rememberRasterArraySourceState$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass3 extends w implements a<RasterArraySourceState> {
        final /* synthetic */ l<RasterArraySourceState, Unit> $init;
        final /* synthetic */ String $sourceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, l<? super RasterArraySourceState, Unit> lVar) {
            super(0);
            this.$sourceId = str;
            this.$init = lVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final RasterArraySourceState invoke() {
            RasterArraySourceState rasterArraySourceState = new RasterArraySourceState(this.$sourceId);
            this.$init.invoke(rasterArraySourceState);
            return rasterArraySourceState;
        }
    }

    @MapboxExperimental
    public static final RasterArraySourceState rememberRasterArraySourceState(String str, String str2, l<? super RasterArraySourceState, Unit> lVar, m mVar, int i14, int i15) {
        mVar.L(-835212734);
        if ((i15 & 1) != 0) {
            str = null;
        }
        String str3 = str;
        if ((i15 & 2) != 0) {
            mVar.L(-492369756);
            Object objQ = mVar.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = IdGenerator.INSTANCE.generateRandomSourceId("raster-array");
                mVar.K(objQ);
            }
            mVar.R();
            str2 = (String) objQ;
        }
        if ((i15 & 4) != 0) {
            lVar = AnonymousClass2.INSTANCE;
        }
        RasterArraySourceState rasterArraySourceState = (RasterArraySourceState) d4.a.d(new Object[0], RasterArraySourceState.INSTANCE.getSaver(), str3, new AnonymousClass3(str2, lVar), mVar, ((i14 << 6) & 896) | 72, 0);
        mVar.R();
        return rasterArraySourceState;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.sources.generated.RasterArraySourceStateKt$rememberRasterArraySourceState$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass2 extends w implements l<RasterArraySourceState, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(RasterArraySourceState rasterArraySourceState) {
            invoke2(rasterArraySourceState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RasterArraySourceState rasterArraySourceState) {
            rasterArraySourceState.getClass();
        }
    }
}
