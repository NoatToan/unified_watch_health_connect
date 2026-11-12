package n63;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.m1;
import androidx.lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.ui.catalog.library.examples.templates.ReportsPagerExampleActivity;
import com.garmin.android.apps.ui.catalog.library.help.HelpActivity;
import com.google.firebase.perf.util.Constants;
import com.mapbox.maps.extension.style.StyleExtensionImpl;
import com.mapbox.maps.extension.style.expressions.dsl.generated.ExpressionDslKt;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayerDsl;
import com.mapbox.maps.extension.style.layers.properties.generated.IconAnchor;
import com.mapbox.maps.extension.style.sources.generated.RasterDemSource;
import com.mapbox.maps.extension.style.sources.generated.RasterDemSourceKt;
import com.mapbox.maps.extension.style.terrain.generated.TerrainKt;
import com.mapbox.maps.plugin.attribution.generated.AttributionSettings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o63.f0;
import p005kotlin.Unit;
import p13.t0;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123947a;

    public /* synthetic */ w(int i14) {
        this.f123947a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        b63.o oVarA;
        boolean z14 = true;
        int i14 = 0;
        switch (this.f123947a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                x.Companion aVar = x.INSTANCE;
                entry.getClass();
                String str = (String) entry.getKey();
                i iVar = (i) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                f0.a(str, sb3);
                sb3.append(CoreConstants.COLON_CHAR);
                sb3.append(iVar);
                return sb3.toString();
            case 1:
                e eVar = (e) obj;
                eVar.getClass();
                eVar.f123906e = true;
                eVar.f123905d = true;
                eVar.f123903b = false;
                eVar.f123904c = true;
                eVar.f123902a = true;
                return Unit.INSTANCE;
            case 2:
                Context context = (Context) obj;
                context.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("CUSTOM_EXTRA_VALUE", 40);
                HelpActivity.a aVar2 = HelpActivity.f49800a;
                s72.d dVar = s72.d.ABOUT;
                aVar2.getClass();
                dVar.getClass();
                bundle.putSerializable("TYPE", dVar);
                bundle.putString("EXTRA_ACTION", "DEFAULT_ACTION");
                Intent intent = new Intent(context, (Class<?>) HelpActivity.class);
                intent.putExtras(bundle);
                return intent;
            case 3:
                Context context2 = (Context) obj;
                return sn.a.d(context2, context2, ReportsPagerExampleActivity.class);
            case 4:
                List list = (List) obj;
                n82.b.a aVar3 = n82.b.f124946f;
                list.getClass();
                Long lJ = d53.t.j(list.get(1).toString());
                if (lJ == null) {
                    return null;
                }
                long jLongValue = lJ.longValue();
                b63.o.INSTANCE.getClass();
                b63.o oVarA2 = b63.o.Companion.a(jLongValue);
                Long lJ2 = d53.t.j(list.get(2).toString());
                if (lJ2 == null) {
                    return null;
                }
                b63.o oVarA3 = b63.o.Companion.a(lJ2.longValue());
                Object obj2 = list.get(0);
                obj2.getClass();
                return new n82.b((o82.g) obj2, new o82.a(oVarA2, oVarA3));
            case 5:
                Map map = (Map) obj;
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(map.size()));
                for (Map.Entry entry2 : map.entrySet()) {
                    linkedHashMap.put(o82.g.valueOf((String) entry2.getKey()), entry2.getValue());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(t0.a(linkedHashMap.size()));
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    Object key = entry3.getKey();
                    Long lJ3 = d53.t.j(String.valueOf(entry3.getValue()));
                    if (lJ3 != null) {
                        long jLongValue2 = lJ3.longValue();
                        b63.o.INSTANCE.getClass();
                        oVarA = b63.o.Companion.a(jLongValue2);
                    } else {
                        oVarA = null;
                    }
                    linkedHashMap2.put(key, oVarA);
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                    o82.g gVar = (o82.g) entry4.getKey();
                    b63.o oVar = (b63.o) entry4.getValue();
                    o13.p pVar = oVar == null ? null : new o13.p(gVar, oVar);
                    if (pVar != null) {
                        arrayList.add(pVar);
                    }
                }
                return new LinkedHashMap(u0.l(arrayList));
            case 6:
                ((Float) obj).getClass();
                return Float.valueOf(0.0f);
            case 7:
                return new nc.a(m1.a((CreationExtras) obj));
            case 8:
                return r1.u0.d(s1.l.d(Constants.FROZEN_FRAME_TIME, 0, null, 6), 2);
            case 9:
                return r1.u0.e(s1.l.d(Constants.FROZEN_FRAME_TIME, 0, null, 6), 2);
            case 10:
                return r1.u0.d(s1.l.d(Constants.FROZEN_FRAME_TIME, 0, null, 6), 2);
            case 11:
                return r1.u0.e(s1.l.d(Constants.FROZEN_FRAME_TIME, 0, null, 6), 2);
            case 12:
                return ((lc.v) obj).f111886f;
            case 13:
                return Double.valueOf(((Double) obj).doubleValue() + 30.0d);
            case 14:
                return Boolean.valueOf(((Double) obj).doubleValue() < 180.0d);
            case 15:
                return Double.valueOf(((Double) obj).doubleValue() - 10.0d);
            case 16:
                return Boolean.valueOf(((Double) obj).doubleValue() >= 45.0d);
            case 17:
                StyleExtensionImpl.Builder builder = (StyleExtensionImpl.Builder) obj;
                builder.getClass();
                builder.addSource(RasterDemSourceKt.rasterDemSource("TERRAIN_SOURCE", new w(18)));
                builder.setTerrain(TerrainKt.terrain$default("TERRAIN_SOURCE", null, 2, null));
                return Unit.INSTANCE;
            case 18:
                RasterDemSource.Builder builder2 = (RasterDemSource.Builder) obj;
                builder2.getClass();
                builder2.url("mapbox://mapbox.mapbox-terrain-dem-v1");
                builder2.tileSize(514L);
                return Unit.INSTANCE;
            case 19:
                AttributionSettings.Builder builder3 = (AttributionSettings.Builder) obj;
                int i15 = ne2.s.M0;
                builder3.getClass();
                builder3.m249setPosition(8388693);
                return Unit.INSTANCE;
            case 20:
                Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
                expressionBuilder.getClass();
                expressionBuilder.literal("point_count");
                return Unit.INSTANCE;
            case 21:
                RasterDemSource.Builder builder4 = (RasterDemSource.Builder) obj;
                builder4.getClass();
                builder4.url("mapbox://mapbox.mapbox-terrain-dem-v1");
                builder4.tileSize(514L);
                return Unit.INSTANCE;
            case 22:
                SymbolLayerDsl symbolLayerDsl = (SymbolLayerDsl) obj;
                symbolLayerDsl.getClass();
                Expression.Companion companion = Expression.INSTANCE;
                symbolLayerDsl.iconImage(companion.match(new w(25)));
                symbolLayerDsl.iconAnchor(IconAnchor.CENTER);
                symbolLayerDsl.filter(companion.not(new w(26)));
                return Unit.INSTANCE;
            case 23:
                Expression.FormatBuilder formatBuilder = (Expression.FormatBuilder) obj;
                formatBuilder.getClass();
                formatBuilder.formatSection(ExpressionDslKt.toString(new w(28)));
                return Unit.INSTANCE;
            case 24:
                Expression.ExpressionBuilder expressionBuilder2 = (Expression.ExpressionBuilder) obj;
                expressionBuilder2.getClass();
                expressionBuilder2.has(new w(27));
                return Unit.INSTANCE;
            case 25:
                Expression.ExpressionBuilder expressionBuilder3 = (Expression.ExpressionBuilder) obj;
                expressionBuilder3.getClass();
                expressionBuilder3.get(new ne2.t(i14));
                expressionBuilder3.stop(new ne2.t(z14 ? 1 : 0));
                expressionBuilder3.literal("unclustered_icon_tag");
                return Unit.INSTANCE;
            case 26:
                Expression.ExpressionBuilder expressionBuilder4 = (Expression.ExpressionBuilder) obj;
                expressionBuilder4.getClass();
                expressionBuilder4.has(new w(29));
                return Unit.INSTANCE;
            case 27:
                Expression.ExpressionBuilder expressionBuilder5 = (Expression.ExpressionBuilder) obj;
                expressionBuilder5.getClass();
                expressionBuilder5.literal("unclustered_icon_tag");
                return Unit.INSTANCE;
            case 28:
                Expression.ExpressionBuilder expressionBuilder6 = (Expression.ExpressionBuilder) obj;
                expressionBuilder6.getClass();
                expressionBuilder6.get(new w(20));
                return Unit.INSTANCE;
            default:
                Expression.ExpressionBuilder expressionBuilder7 = (Expression.ExpressionBuilder) obj;
                expressionBuilder7.getClass();
                expressionBuilder7.literal("point_count");
                return Unit.INSTANCE;
        }
    }
}
