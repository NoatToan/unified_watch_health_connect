package com.mapbox.maps.extension.compose.style.internal;

import com.google.mlkit.common.MlKitException;
import com.mapbox.maps.ColorTheme;
import com.mapbox.maps.StyleDataLoaded;
import e23.p;
import o13.r;
import o2.c;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.d2;
import r53.j;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
@e(c = "com.mapbox.maps.extension.compose.style.internal.MapStyleNode$updateStyleColorTheme$1", f = "MapStyleNode.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend")
public final class MapStyleNode$updateStyleColorTheme$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ ColorTheme $colorTheme;
    final /* synthetic */ boolean $isStyleDefault;
    int label;
    final /* synthetic */ MapStyleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapStyleNode$updateStyleColorTheme$1(MapStyleNode mapStyleNode, boolean z14, ColorTheme colorTheme, d<? super MapStyleNode$updateStyleColorTheme$1> dVar) {
        super(2, dVar);
        this.this$0 = mapStyleNode;
        this.$isStyleDefault = z14;
        this.$colorTheme = colorTheme;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapStyleNode$updateStyleColorTheme$1(this.this$0, this.$isStyleDefault, this.$colorTheme, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((MapStyleNode$updateStyleColorTheme$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            d2<StyleDataLoaded> styleDataLoaded$extension_compose_release = this.this$0.getStyleDataLoaded$extension_compose_release();
            final boolean z14 = this.$isStyleDefault;
            final MapStyleNode mapStyleNode = this.this$0;
            final ColorTheme colorTheme = this.$colorTheme;
            j<StyleDataLoaded> jVar = new j<StyleDataLoaded>() { // from class: com.mapbox.maps.extension.compose.style.internal.MapStyleNode$updateStyleColorTheme$1.1
                /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
                public final Object emit2(StyleDataLoaded styleDataLoaded, d<? super Unit> dVar) {
                    boolean z15 = z14;
                    MapStyleNode mapStyleNode2 = mapStyleNode;
                    if (z15) {
                        mapStyleNode2.getMapboxMap().setInitialStyleColorTheme();
                    } else {
                        mapStyleNode2.getMapboxMap().setStyleColorTheme(colorTheme);
                    }
                    return Unit.INSTANCE;
                }

                @Override // r53.j
                public /* bridge */ /* synthetic */ Object emit(StyleDataLoaded styleDataLoaded, d dVar) {
                    return emit2(styleDataLoaded, (d<? super Unit>) dVar);
                }
            };
            this.label = 1;
            if (styleDataLoaded$extension_compose_release.collect(jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        c.f();
        return null;
    }
}
