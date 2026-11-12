package com.mapbox.maps.extension.compose.style.imports;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.extension.compose.MapboxMapScopeMarker;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import com.mapbox.maps.extension.compose.style.ImportConfigs;
import e23.l;
import e23.p;
import o13.e;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.c;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.z;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/imports/StyleImportsScope;", "", "<init>", "()V", "", "importId", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/extension/compose/style/ImportConfigs;", "configs", "", "StyleImport", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/style/ImportConfigs;Lp3/m;II)V", "Lcom/mapbox/maps/extension/compose/style/imports/StyleImportState;", "styleImportState", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/style/imports/StyleImportState;Lp3/m;II)V", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxMapScopeMarker
public final class StyleImportsScope {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.imports.StyleImportsScope$StyleImport$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass3 extends w implements e23.a<StyleImportNode> {
        final /* synthetic */ b0 $coroutineScope;
        final /* synthetic */ String $importId;
        final /* synthetic */ String $style;
        final /* synthetic */ StyleImportState $styleImportState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, StyleImportState styleImportState, b0 b0Var) {
            super(0);
            this.$importId = str;
            this.$style = str2;
            this.$styleImportState = styleImportState;
            this.$coroutineScope = b0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final StyleImportNode invoke() {
            return new StyleImportNode(this.$importId, this.$style, this.$styleImportState.getImportConfigs(), this.$styleImportState.getStyleColorTheme(), this.$coroutineScope);
        }
    }

    @MapboxStyleImportComposable
    public final void StyleImport(String str, String str2, StyleImportState styleImportState, m mVar, int i14, int i15) {
        int i16;
        StyleImportState styleImportState2;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, 1960768824);
        c<?> cVar = o0VarK.f135177b;
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 14) == 0) {
            i16 = (o0VarK.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 112) == 0) {
            i16 |= o0VarK.B(str2) ? 32 : 16;
        }
        if ((i14 & 896) == 0) {
            if ((i15 & 4) == 0) {
                styleImportState2 = styleImportState;
                int i17 = o0VarK.B(styleImportState2) ? 256 : 128;
                i16 |= i17;
            } else {
                styleImportState2 = styleImportState;
            }
            i16 |= i17;
        } else {
            styleImportState2 = styleImportState;
        }
        if ((i16 & 731) == 146 && o0VarK.b()) {
            o0VarK.e();
        } else {
            o0VarK.G0();
            int i18 = i14 & 1;
            m.a aVar = m.f135153a;
            if (i18 != 0 && !o0VarK.o0()) {
                o0VarK.e();
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                }
            } else if ((i15 & 4) != 0) {
                o0VarK.L(1566321068);
                StyleImportStateKt.AnonymousClass1 anonymousClass1 = StyleImportStateKt.AnonymousClass1.INSTANCE;
                Object objK = fb1.c.k(o0VarK, -492369756, aVar);
                if (objK == m.a.f135155b) {
                    objK = new StyleImportState();
                    o0VarK.K(objK);
                }
                o0VarK.g0(false);
                anonymousClass1.invoke(objK);
                styleImportState2 = (StyleImportState) objK;
                o0VarK.g0(false);
                i16 &= -897;
            }
            o0VarK.h0();
            x1 x1Var = n.f135158a;
            MapApplier mapApplier = cVar instanceof MapApplier ? (MapApplier) cVar : null;
            if (mapApplier == null) {
                h.z("Illegal use of StyleImport composable outside of MapboxMapComposable");
                return;
            }
            o0VarK.N(1606415695, styleImportState2.getInteractionsState());
            styleImportState2.getInteractionsState().BindTo$extension_compose_release(mapApplier.getMapView().getMapboxMapDeprecated(), str, o0VarK, ((i16 << 3) & 112) | 8);
            o0VarK.g0(false);
            o0VarK.L(773894976);
            o0VarK.L(-492369756);
            Object objQ = o0VarK.q();
            aVar.getClass();
            if (objQ == m.a.f135155b) {
                objQ = com.garmin.proto.generated.a.d(l0.j(t13.h.f161748a, o0VarK), o0VarK);
            }
            o0VarK.g0(false);
            b0 b0Var = ((z) objQ).f135391a;
            o0VarK.g0(false);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(str, str2, styleImportState2, b0Var);
            o0VarK.L(1886828752);
            if (!(cVar instanceof MapApplier)) {
                p0.l();
                throw null;
            }
            o0VarK.H();
            if (o0VarK.T) {
                o0VarK.M(new StyleImportsScope$StyleImport$$inlined$ComposeNode$1(anonymousClass3));
            } else {
                o0VarK.c();
            }
            b4.d(StyleImportsScope$StyleImport$4$1.INSTANCE, str, o0VarK);
            b4.d(StyleImportsScope$StyleImport$4$2.INSTANCE, str2, o0VarK);
            b4.d(new StyleImportsScope$StyleImport$4$3(styleImportState2), styleImportState2.getImportConfigs(), o0VarK);
            b4.d(StyleImportsScope$StyleImport$4$4.INSTANCE, styleImportState2.getStyleColorTheme(), o0VarK);
            o0VarK.g0(true);
            o0VarK.g0(false);
        }
        p2 p2VarI0 = o0VarK.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass5(str, str2, styleImportState2, i14, i15);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.imports.StyleImportsScope$StyleImport$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<StyleImportState, Unit> {
        final /* synthetic */ ImportConfigs $configs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ImportConfigs importConfigs) {
            super(1);
            this.$configs = importConfigs;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StyleImportState styleImportState) {
            styleImportState.getClass();
            styleImportState.setImportConfigs(this.$configs);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(StyleImportState styleImportState) {
            invoke2(styleImportState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.imports.StyleImportsScope$StyleImport$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ ImportConfigs $configs;
        final /* synthetic */ String $importId;
        final /* synthetic */ String $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, ImportConfigs importConfigs, int i14, int i15) {
            super(2);
            this.$importId = str;
            this.$style = str2;
            this.$configs = importConfigs;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            StyleImportsScope.this.StyleImport(this.$importId, this.$style, this.$configs, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.imports.StyleImportsScope$StyleImport$5, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass5 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $importId;
        final /* synthetic */ String $style;
        final /* synthetic */ StyleImportState $styleImportState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, String str2, StyleImportState styleImportState, int i14, int i15) {
            super(2);
            this.$importId = str;
            this.$style = str2;
            this.$styleImportState = styleImportState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            StyleImportsScope.this.StyleImport(this.$importId, this.$style, this.$styleImportState, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @e
    @MapboxStyleImportComposable
    public final void StyleImport(String str, String str2, ImportConfigs importConfigs, m mVar, int i14, int i15) {
        int i16;
        ImportConfigs importConfigs2;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, 1061221191);
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 14) == 0) {
            i16 = (o0VarK.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 112) == 0) {
            i16 |= o0VarK.B(str2) ? 32 : 16;
        }
        int i17 = i15 & 4;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((i14 & 896) == 0) {
            i16 |= o0VarK.B(importConfigs) ? 256 : 128;
        }
        if ((i15 & 8) != 0) {
            i16 |= 3072;
        } else if ((i14 & 7168) == 0) {
            i16 |= o0VarK.B(this) ? 2048 : 1024;
        }
        if ((i16 & 5851) == 1170 && o0VarK.b()) {
            o0VarK.e();
            importConfigs2 = importConfigs;
        } else {
            ImportConfigs importConfigs3 = i17 != 0 ? null : importConfigs;
            x1 x1Var = n.f135158a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(importConfigs3);
            o0VarK.L(1566321068);
            o0VarK.L(-492369756);
            Object objQ = o0VarK.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new StyleImportState();
                o0VarK.K(objQ);
            }
            o0VarK.g0(false);
            anonymousClass1.invoke(objQ);
            o0VarK.g0(false);
            StyleImport(str, str2, (StyleImportState) objQ, o0VarK, i16 & 7294, 0);
            importConfigs2 = importConfigs3;
        }
        p2 p2VarI0 = o0VarK.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(str, str2, importConfigs2, i14, i15);
    }
}
