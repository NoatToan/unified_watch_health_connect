package com.mapbox.maps.extension.compose.style.internal;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import com.mapbox.maps.extension.compose.style.MapboxStyleComposable;
import e23.p;
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
import t13.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "importId", "name", "Lcom/mapbox/bindgen/Value;", "property", "", "StyleConfig", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lp3/m;I)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StyleConfigKt {
    @MapboxStyleComposable
    public static final void StyleConfig(String str, String str2, Value value, m mVar, int i14) {
        str.getClass();
        str2.getClass();
        value.getClass();
        o0 o0VarE = mVar.E(-809104639);
        x1 x1Var = n.f135158a;
        c<?> cVar = o0VarE.f135177b;
        Unit unit = null;
        MapApplier mapApplier = cVar instanceof MapApplier ? (MapApplier) cVar : null;
        o0VarE.L(773894976);
        o0VarE.L(-492369756);
        Object objQ = o0VarE.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = com.garmin.proto.generated.a.d(l0.j(h.f161748a, o0VarE), o0VarE);
        }
        o0VarE.g0(false);
        b0 b0Var = ((z) objQ).f135391a;
        o0VarE.g0(false);
        if (mapApplier != null) {
            StyleConfigKt$StyleConfig$1$1 styleConfigKt$StyleConfig$1$1 = new StyleConfigKt$StyleConfig$1$1(str, str2, mapApplier, b0Var);
            o0VarE.L(1886828752);
            if (!(cVar instanceof MapApplier)) {
                p0.l();
                throw null;
            }
            o0VarE.H();
            if (o0VarE.T) {
                o0VarE.M(new StyleConfigKt$StyleConfig$lambda$1$$inlined$ComposeNode$1(styleConfigKt$StyleConfig$1$1));
            } else {
                o0VarE.c();
            }
            b4.c(new StyleConfigKt$StyleConfig$1$2$1(value), value, o0VarE);
            o0VarE.g0(true);
            o0VarE.g0(false);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            vb.h.z("Illegal use of StyleConfig composable outside of MapboxMapComposable");
            return;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(str, str2, value, i14);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.StyleConfigKt$StyleConfig$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $importId;
        final /* synthetic */ String $name;
        final /* synthetic */ Value $property;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, Value value, int i14) {
            super(2);
            this.$importId = str;
            this.$name = str2;
            this.$property = value;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            StyleConfigKt.StyleConfig(this.$importId, this.$name, this.$property, mVar, this.$$changed | 1);
        }
    }
}
