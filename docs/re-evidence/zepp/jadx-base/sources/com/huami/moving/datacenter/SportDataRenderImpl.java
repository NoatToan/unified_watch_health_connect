package com.huami.moving.datacenter;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.utils.SportDataVerificationKt;
import com.huami.moving.config.DataGroup;
import com.huami.moving.config.DataItem;
import com.huami.moving.config.SportConfigManager;
import com.huami.moving.utils.ext.TrackrecordKt;
import com.loc.z;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import kotlin.collections.q;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u00002\u00020\u0001:\u0004\u0012EF\u0015B'\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\bC\u0010DJ(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\u001a\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u000eH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR/\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001c\u0010 R-\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u000e*\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010.\u001a\u0004\u0018\u00010\t*\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001c\u00100\u001a\u0004\u0018\u00010\t*\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-R\u001c\u00102\u001a\u0004\u0018\u00010\t*\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010-R\u001c\u00104\u001a\u0004\u0018\u00010\t*\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010-R\u001c\u00106\u001a\u0004\u0018\u00010\t*\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010-R\u001c\u00108\u001a\u0004\u0018\u00010\t*\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010-R\u001c\u0010:\u001a\u0004\u0018\u00010\t*\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010-R\u001c\u0010<\u001a\u0004\u0018\u00010\t*\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010-R\u001c\u0010=\u001a\u0004\u0018\u00010\t*\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010-R\u001c\u0010?\u001a\u0004\u0018\u00010\t*\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010-R\u001a\u0010B\u001a\u00020\u0004*\u00020\u00038B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006G"}, d2 = {"Lcom/huami/moving/datacenter/SportDataRenderImpl;", "Lcom/huami/moving/datacenter/SportDataRender;", "", "Lcom/huami/moving/config/DataItem;", "", "appendSubTime", "appendSwitchTime", "Lcom/huami/moving/datacenter/SportDataItem;", SOAP.XMLNS, "", "f", "(Lcom/huami/moving/config/DataItem;)Ljava/lang/Double;", "e", "getCardDataList", "", "Lcom/huami/moving/config/DataGroup;", "getDataList", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "a", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "record", "b", "Ljava/util/List;", "subRecords", "Lcom/huami/moving/config/SportConfigManager;", "c", "Lcom/huami/moving/config/SportConfigManager;", "configManager", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Ljava/util/List;", "cardItems", "()Ljava/util/Map;", "dataItems", "Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing;", "Lcom/huami/moving/datacenter/SportDataRenderImpl$b;", "Lcom/huami/moving/datacenter/SportDataRenderImpl$a;", b.r, "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;)Ljava/util/Map;", "_tennisSwing", "", "g", LogUtil.I, "compatibleType", DTransferConstants.SEARCH_KEY, "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;)Ljava/lang/Double;", "_totalTime", "o", "_pauseTime", hl.k, "_avgStrokeRate", GoogleApiAvailabilityLight.b, "_maxStrokeRate", "i", "_avgPace", "l", "_bestPace", z.j, "_avgSpeed", "m", "_maxSpeed", "_aerobicTE", "h", "_anaerobicTE", "r", "(Lcom/huami/moving/config/DataItem;)Z", "isSubRecordData", "<init>", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;Ljava/util/List;Lcom/huami/moving/config/SportConfigManager;)V", "TennisSwing", "TennisSwingCalculator", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportDataRenderImpl implements SportDataRender {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Trackrecord record;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Trackrecord> subRecords;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SportConfigManager configManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardItems;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataItems;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final a _tennisSwing;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int compatibleType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing;", "", "<init>", "()V", "Backhand", "ForeHand", "Serve", "Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing$Serve;", "Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing$ForeHand;", "Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing$Backhand;", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class TennisSwing {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing$Backhand;", "Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
        public static final class Backhand extends TennisSwing {

            @NotNull
            public static final Backhand INSTANCE = new Backhand();

            private Backhand() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing$ForeHand;", "Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
        public static final class ForeHand extends TennisSwing {

            @NotNull
            public static final ForeHand INSTANCE = new ForeHand();

            private ForeHand() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing$Serve;", "Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
        public static final class Serve extends TennisSwing {

            @NotNull
            public static final Serve INSTANCE = new Serve();

            private Serve() {
                super(null);
            }
        }

        private TennisSwing() {
        }

        public /* synthetic */ TennisSwing(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwingCalculator;", "", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "record", "", "Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing;", "Lcom/huami/moving/datacenter/SportDataRenderImpl$b;", "a", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TennisSwingCalculator {

        @NotNull
        public static final TennisSwingCalculator a = new TennisSwingCalculator();

        private TennisSwingCalculator() {
        }

        @NotNull
        public final Map<TennisSwing, TennisSwingData> a(@NotNull Trackrecord record) {
            int iIntValue;
            ArrayList<Item> arrayList = new ArrayList();
            int i = 0;
            int i2 = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            arrayList.add(new Item(TennisSwing.ForeHand.INSTANCE, new TennisSwingData(record.getTennisForeHand(), i, i2, defaultConstructorMarker)));
            arrayList.add(new Item(TennisSwing.Backhand.INSTANCE, new TennisSwingData(record.getTennisBackHand(), i, i2, defaultConstructorMarker)));
            arrayList.add(new Item(TennisSwing.Serve.INSTANCE, new TennisSwingData(record.getTennisServe(), i, i2, defaultConstructorMarker)));
            if (arrayList.size() > 1) {
                g.sortWith(arrayList, new Comparator() { // from class: com.huami.moving.datacenter.SportDataRenderImpl$TennisSwingCalculator$calc$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((Item) t).getData().e()), Integer.valueOf(((Item) t2).getData().e()));
                    }
                });
            }
            int tennisForeHand = record.getTennisForeHand() + record.getTennisBackHand() + record.getTennisServe();
            if (tennisForeHand == 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
                for (Item item : arrayList) {
                    linkedHashMap.put(item.getSwing(), item.getData());
                }
                return linkedHashMap;
            }
            int size = arrayList.size() - 1;
            int iF = 0;
            for (int i3 = 0; i3 < size; i3++) {
                TennisSwingData data = ((Item) arrayList.get(i3)).getData();
                if (data.e() <= 0) {
                    iIntValue = 0;
                } else {
                    iIntValue = new BigDecimal((((double) data.e()) * ((double) 100)) / ((double) tennisForeHand)).setScale(0, 4).intValue();
                    if (iIntValue == 0) {
                        iIntValue = 1;
                    }
                }
                data.g(iIntValue);
                iF += data.f();
            }
            TennisSwingData data2 = ((Item) CollectionsKt.last((List) arrayList)).getData();
            data2.g(data2.e() != 0 ? 100 - iF : 0);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
            for (Item item2 : arrayList) {
                linkedHashMap2.put(item2.getSwing(), item2.getData());
            }
            return linkedHashMap2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"com/huami/moving/datacenter/SportDataRenderImpl$a", "Lkotlin/Lazy;", "", "Lcom/huami/moving/datacenter/SportDataRenderImpl$TennisSwing;", "Lcom/huami/moving/datacenter/SportDataRenderImpl$b;", "", "isInitialized", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "a", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "record", "b", "Ljava/util/Map;", "_value", "()Ljava/util/Map;", "value", "<init>", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Lazy<Map<TennisSwing, ? extends TennisSwingData>> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Trackrecord record;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private Map<TennisSwing, TennisSwingData> _value;

        public a(@NotNull Trackrecord trackrecord) {
            this.record = trackrecord;
        }

        @Override // kotlin.Lazy
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<TennisSwing, TennisSwingData> getValue() {
            Map<TennisSwing, TennisSwingData> map = this._value;
            if (map != null) {
                return map;
            }
            Map<TennisSwing, TennisSwingData> mapA = TennisSwingCalculator.a.a(this.record);
            this._value = mapA;
            return mapA;
        }

        @Override // kotlin.Lazy
        public boolean isInitialized() {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/moving/config/DataItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<List<? extends DataItem>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends DataItem> invoke() {
            return SportDataRenderImpl.this.configManager.getDataCardItems(SportDataRenderImpl.this.compatibleType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n"}, d2 = {"", "Lcom/huami/moving/config/DataGroup;", "", "Lcom/huami/moving/config/DataItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Map<DataGroup, ? extends List<? extends DataItem>>> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<DataGroup, ? extends List<? extends DataItem>> invoke() {
            return SportDataRenderImpl.this.configManager.getDataList(SportDataRenderImpl.this.compatibleType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "type", "Lcom/huami/moving/config/DataItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Integer, DataItem> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @NotNull
        public final DataItem a(int i) {
            int sportType = TrackrecordKt.getSportType(i);
            if (sportType != 1 && sportType != 2 && sportType != 3 && sportType != 5) {
                if (sportType != 47) {
                    if (sportType != 14 && sportType != 15) {
                        if (sportType != 25 && sportType != 26) {
                            if (sportType != 155 && sportType != 156) {
                                switch (sportType) {
                                    case 7:
                                    case 8:
                                        break;
                                    case 9:
                                    case 10:
                                        break;
                                    default:
                                        return DataItem.SubItemTime.INSTANCE;
                                }
                            }
                        }
                    }
                    return DataItem.SwimmingTime.INSTANCE;
                }
                return DataItem.CyclingTime.INSTANCE;
            }
            return DataItem.RunningTime.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ DataItem invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportDataRenderImpl(@NotNull Trackrecord trackrecord, @NotNull List<? extends Trackrecord> list, @NotNull SportConfigManager sportConfigManager) {
        this.record = trackrecord;
        this.subRecords = list;
        this.configManager = sportConfigManager;
        this.cardItems = LazyKt__LazyJVMKt.lazy(new c());
        this.dataItems = LazyKt__LazyJVMKt.lazy(new d());
        this._tennisSwing = new a(trackrecord);
        this.compatibleType = TrackrecordKt.getCompatibleType(trackrecord);
    }

    private static final boolean a(float f, Trackrecord trackrecord) {
        return SportDataVerificationKt.isValidPace(f, trackrecord.getType().intValue());
    }

    private static final boolean b(float f) {
        return f > 1.0E-4f;
    }

    private final List<DataItem> c() {
        return (List) this.cardItems.getValue();
    }

    private final Map<DataGroup, List<DataItem>> d() {
        return (Map) this.dataItems.getValue();
    }

    private final List<SportDataItem> e(boolean appendSwitchTime) {
        if (this.subRecords.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(this.subRecords, new Comparator() { // from class: com.huami.moving.datacenter.SportDataRenderImpl$getSubTimes$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((Trackrecord) t).getTrackid(), ((Trackrecord) t2).getTrackid());
            }
        });
        e eVar = e.a;
        int size = listSortedWith.size();
        for (int i = 0; i < size; i++) {
            Trackrecord trackrecord = (Trackrecord) listSortedWith.get(i);
            DataItem dataItemInvoke = eVar.invoke(trackrecord.getType());
            Integer costtime = trackrecord.getCosttime();
            arrayList.add(new SportDataItem(dataItemInvoke, costtime == null ? null : Double.valueOf(costtime.intValue())));
            if (appendSwitchTime && i < listSortedWith.size() - 1) {
                arrayList.add(new SportDataItem(DataItem.SwitchTime.INSTANCE, Double.valueOf(((Trackrecord) listSortedWith.get(i + 1)).getTrackid().longValue() - trackrecord.getEndtime().longValue())));
            }
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    private final Double f(DataItem dataItem) {
        if (r(dataItem)) {
            return null;
        }
        if (Intrinsics.areEqual(dataItem, DataItem.Distance.INSTANCE)) {
            Integer revisedDistance = TrackrecordKt.getRevisedDistance(this.record);
            if (revisedDistance == null) {
                return null;
            }
            return Double.valueOf(revisedDistance.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.TotalJumps.INSTANCE) ? true : Intrinsics.areEqual(dataItem, DataItem.TotalRows.INSTANCE) ? true : Intrinsics.areEqual(dataItem, DataItem.TotalSwing.INSTANCE)) {
            return Double.valueOf(this.record.getTouchStrokes());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.RopeBreaks.INSTANCE)) {
            return Double.valueOf(this.record.getNumberOfBreak());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.DownhillTimes.INSTANCE)) {
            return Double.valueOf(this.record.getDownhillNumber());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.DownhillDistance.INSTANCE)) {
            Integer climbDisDescend = this.record.getClimbDisDescend();
            if (climbDisDescend == null) {
                return null;
            }
            return Double.valueOf(climbDisDescend.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.DownhillDropMax.INSTANCE)) {
            return Double.valueOf(this.record.getMaxDownhillFallMileage());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.DownhillDropTotal.INSTANCE)) {
            return Double.valueOf(this.record.getAccumulatedGap());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.TotalTime.INSTANCE)) {
            return q(this.record);
        }
        if (Intrinsics.areEqual(dataItem, DataItem.ExerciseTime.INSTANCE)) {
            Integer costtime = this.record.getCosttime();
            if (costtime == null) {
                return null;
            }
            return Double.valueOf(costtime.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.PauseTime.INSTANCE)) {
            return o(this.record);
        }
        if (Intrinsics.areEqual(dataItem, DataItem.TotalRestTime.INSTANCE)) {
            return Double.valueOf(this.record.getRopeSkippingRestTime());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.UpstairsFloors.INSTANCE)) {
            return Double.valueOf(this.record.getFloorNumber());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.DownstairsFloors.INSTANCE)) {
            Integer downstairsFloors = this.record.getDownstairsFloors();
            if (downstairsFloors == null) {
                return null;
            }
            return Double.valueOf(downstairsFloors.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.UpstairsHeight.INSTANCE)) {
            Float upstairsHeight = this.record.getUpstairsHeight();
            if (upstairsHeight == null) {
                return null;
            }
            return Double.valueOf(upstairsHeight.floatValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.DownstairsHeight.INSTANCE)) {
            Float downstairsHeight = this.record.getDownstairsHeight();
            if (downstairsHeight == null) {
                return null;
            }
            return Double.valueOf(downstairsHeight.floatValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AverageUpstairsFloors.INSTANCE)) {
            Float minUpstairsFloors = this.record.getMinUpstairsFloors();
            if (minUpstairsFloors == null) {
                return null;
            }
            return Double.valueOf(minUpstairsFloors.floatValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.SwimStyle.INSTANCE)) {
            Integer swimStyle = this.record.getSwimStyle();
            if (swimStyle == null) {
                return null;
            }
            return Double.valueOf(swimStyle.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.Trips.INSTANCE)) {
            Integer swimTurns = this.record.getSwimTurns();
            if (swimTurns == null) {
                return null;
            }
            return Double.valueOf(swimTurns.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.TotalStrokes.INSTANCE)) {
            Integer swimStrokes = this.record.getSwimStrokes();
            if (swimStrokes == null) {
                return null;
            }
            return Double.valueOf(swimStrokes.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AverageStrokeDistance.INSTANCE)) {
            Float swimDistancePerStroke = this.record.getSwimDistancePerStroke();
            if (swimDistancePerStroke == null) {
                return null;
            }
            return Double.valueOf(swimDistancePerStroke.floatValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.Swolf.INSTANCE)) {
            Integer swimSWOLF = this.record.getSwimSWOLF();
            if (swimSWOLF == null) {
                return null;
            }
            return Double.valueOf(swimSWOLF.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AverageStrokeRate.INSTANCE)) {
            return k(this.record);
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MaxStrokeRate.INSTANCE)) {
            return n(this.record);
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AveragePace.INSTANCE)) {
            return i(this.record);
        }
        if (Intrinsics.areEqual(dataItem, DataItem.BestPace.INSTANCE)) {
            return l(this.record);
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AverageSpeed.INSTANCE)) {
            return j(this.record);
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MaxSpeed.INSTANCE)) {
            return m(this.record);
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AverageStepFreq.INSTANCE) ? true : Intrinsics.areEqual(dataItem, DataItem.AverageRowingFreq.INSTANCE)) {
            Integer sfreq = this.record.getSfreq();
            if (sfreq == null) {
                return null;
            }
            return Double.valueOf(sfreq.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MaxStepFreq.INSTANCE) ? true : Intrinsics.areEqual(dataItem, DataItem.HighestRowingFreq.INSTANCE)) {
            return Double.valueOf(this.record.getMaxSFreq());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AverageStride.INSTANCE)) {
            Integer avgStrideLength = this.record.getAvgStrideLength();
            if (avgStrideLength == null) {
                return null;
            }
            return Double.valueOf(avgStrideLength.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.Step.INSTANCE)) {
            Integer totalStep = this.record.getTotalStep();
            if (totalStep == null) {
                return null;
            }
            return Double.valueOf(totalStep.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.HighestAltitude.INSTANCE)) {
            return Double.valueOf(this.record.getMaxAltitude());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.LowestAltitude.INSTANCE)) {
            return Double.valueOf(this.record.getMinAltitude());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AverageAltitude.INSTANCE)) {
            return Double.valueOf(this.record.getAvgAltitude().floatValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.TotalClimb.INSTANCE)) {
            Integer climbDisascend = this.record.getClimbDisascend();
            if (climbDisascend == null) {
                return null;
            }
            return Double.valueOf(climbDisascend.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.TotalUp.INSTANCE)) {
            Integer altitudeAscend = this.record.getAltitudeAscend();
            if (altitudeAscend == null) {
                return null;
            }
            return Double.valueOf(altitudeAscend.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.TotalDown.INSTANCE)) {
            Integer altitudeDescend = this.record.getAltitudeDescend();
            if (altitudeDescend == null) {
                return null;
            }
            return Double.valueOf(altitudeDescend.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AverageSlope.INSTANCE)) {
            return Double.valueOf(this.record.getAvgSlope());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MaxSlope.INSTANCE)) {
            return Double.valueOf(this.record.getMaxSlope());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.ForehandSwing.INSTANCE)) {
            TennisSwingData tennisSwingData = p(this.record).get(TennisSwing.ForeHand.INSTANCE);
            if (tennisSwingData == null) {
                return null;
            }
            return Double.valueOf(tennisSwingData.e());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.BackhandSwing.INSTANCE)) {
            TennisSwingData tennisSwingData2 = p(this.record).get(TennisSwing.Backhand.INSTANCE);
            if (tennisSwingData2 == null) {
                return null;
            }
            return Double.valueOf(tennisSwingData2.e());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.ServeTimes.INSTANCE)) {
            TennisSwingData tennisSwingData3 = p(this.record).get(TennisSwing.Serve.INSTANCE);
            if (tennisSwingData3 == null) {
                return null;
            }
            return Double.valueOf(tennisSwingData3.e());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.ForehandPercentage.INSTANCE)) {
            TennisSwingData tennisSwingData4 = p(this.record).get(TennisSwing.ForeHand.INSTANCE);
            if (tennisSwingData4 == null) {
                return null;
            }
            return Double.valueOf(tennisSwingData4.f());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.BackhandPercentage.INSTANCE)) {
            TennisSwingData tennisSwingData5 = p(this.record).get(TennisSwing.Backhand.INSTANCE);
            if (tennisSwingData5 == null) {
                return null;
            }
            return Double.valueOf(tennisSwingData5.f());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.ServePercentage.INSTANCE)) {
            TennisSwingData tennisSwingData6 = p(this.record).get(TennisSwing.Serve.INSTANCE);
            if (tennisSwingData6 == null) {
                return null;
            }
            return Double.valueOf(tennisSwingData6.f());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.GolfSwingCount.INSTANCE)) {
            return Double.valueOf(this.record.getTotalSwing());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.GolfAvgAngle.INSTANCE)) {
            return Double.valueOf(this.record.getAverageAngle());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.GolfAvgBeat.INSTANCE)) {
            return Double.valueOf(this.record.getAverageBeat());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.GolfAvgDownTime.INSTANCE)) {
            return Double.valueOf(this.record.getAverageDownTime());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.GolfAvgUpTime.INSTANCE)) {
            return Double.valueOf(this.record.getAverageUpTime());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.GolfAvgScore.INSTANCE)) {
            return Double.valueOf(this.record.getAverageScore());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.Calorie.INSTANCE)) {
            Integer cal = this.record.getCal();
            if (cal == null) {
                return null;
            }
            return Double.valueOf(cal.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AveragePullingTime.INSTANCE)) {
            Float avgPulloarTime = this.record.getAvgPulloarTime();
            if (avgPulloarTime == null) {
                return null;
            }
            return Double.valueOf(avgPulloarTime.floatValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AveragePaddleTime.INSTANCE)) {
            Float avgReturnTime = this.record.getAvgReturnTime();
            if (avgReturnTime == null) {
                return null;
            }
            return Double.valueOf(avgReturnTime.floatValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AverageFreq.INSTANCE)) {
            return Double.valueOf(this.record.getRopeSkippingAvgFrequency());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.HighestFreq.INSTANCE)) {
            return Double.valueOf(this.record.getRopeSkippingMaxFrequency());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AverageHr.INSTANCE)) {
            Integer avghr = this.record.getAvghr();
            if (avghr == null) {
                return null;
            }
            return Double.valueOf(avghr.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MaxHr.INSTANCE)) {
            Integer maxHR = this.record.getMaxHR();
            if (maxHR == null) {
                return null;
            }
            return Double.valueOf(maxHR.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MinHr.INSTANCE)) {
            Integer minHR = this.record.getMinHR();
            if (minHR == null) {
                return null;
            }
            return Double.valueOf(minHR.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AverageStress.INSTANCE)) {
            return Double.valueOf(this.record.getAveragePressure());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MaxStress.INSTANCE)) {
            return Double.valueOf(this.record.getMaximumPressure());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MinStress.INSTANCE)) {
            Integer minPressure = this.record.getMinPressure();
            if (minPressure == null) {
                return null;
            }
            return Double.valueOf(minPressure.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AverageTemperature.INSTANCE)) {
            Float averageTemperature = this.record.getAverageTemperature();
            if (averageTemperature == null) {
                return null;
            }
            return Double.valueOf(averageTemperature.floatValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MaxTemperature.INSTANCE)) {
            Float highestTemperature = this.record.getHighestTemperature();
            if (highestTemperature == null) {
                return null;
            }
            return Double.valueOf(highestTemperature.floatValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MinTemperature.INSTANCE)) {
            Float lowestTemperature = this.record.getLowestTemperature();
            if (lowestTemperature == null) {
                return null;
            }
            return Double.valueOf(lowestTemperature.floatValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.TotalGroups.INSTANCE)) {
            return Double.valueOf(this.record.getTotalGroup());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MaxSpO2.INSTANCE)) {
            return Double.valueOf(this.record.getSpo2Max());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MinSpO2.INSTANCE)) {
            return Double.valueOf(this.record.getSpo2Min());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AerobicTE.INSTANCE)) {
            return g(this.record);
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AnaerobicTE.INSTANCE)) {
            return h(this.record);
        }
        if (Intrinsics.areEqual(dataItem, DataItem.ExerciseLoad.INSTANCE)) {
            Integer thisExerciseLoad = this.record.getThisExerciseLoad();
            if (thisExerciseLoad == null) {
                return null;
            }
            return Double.valueOf(thisExerciseLoad.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MaxVO2.INSTANCE)) {
            Integer maxVO2 = this.record.getMaxVO2();
            if (maxVO2 == null) {
                return null;
            }
            return Double.valueOf(maxVO2.intValue());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.AveragePower.INSTANCE)) {
            return Double.valueOf(this.record.getAveragePower());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.MaxPower.INSTANCE)) {
            return Double.valueOf(this.record.getMaxPower());
        }
        if (Intrinsics.areEqual(dataItem, DataItem.WorkValue.INSTANCE)) {
            return Double.valueOf(this.record.getWorkValue());
        }
        return null;
    }

    private final Double g(Trackrecord trackrecord) {
        Integer teValue = trackrecord.getTeValue();
        if (teValue == null) {
            return null;
        }
        int iIntValue = teValue.intValue();
        boolean z = false;
        if (1 <= iIntValue && iIntValue <= 50) {
            z = true;
        }
        if (!z) {
            teValue = null;
        }
        if (teValue == null) {
            return null;
        }
        return Double.valueOf(((double) teValue.intValue()) / ((double) 10));
    }

    private final Double h(Trackrecord trackrecord) {
        Integer teAnaerobicValue = trackrecord.getTeAnaerobicValue();
        if (teAnaerobicValue == null) {
            return null;
        }
        int iIntValue = teAnaerobicValue.intValue();
        boolean z = false;
        if (1 <= iIntValue && iIntValue <= 50) {
            z = true;
        }
        if (!z) {
            teAnaerobicValue = null;
        }
        if (teAnaerobicValue == null) {
            return null;
        }
        return Double.valueOf(((double) teAnaerobicValue.intValue()) / ((double) 10));
    }

    private final Double i(Trackrecord trackrecord) {
        Float pace = trackrecord.getPace();
        if (pace == null) {
            return null;
        }
        if (!SportDataVerificationKt.isValidPace(pace.floatValue(), trackrecord.getType().intValue())) {
            pace = null;
        }
        if (pace == null) {
            return null;
        }
        return Double.valueOf(pace.floatValue());
    }

    private final Double j(Trackrecord trackrecord) {
        Float pace = trackrecord.getPace();
        if (pace == null) {
            return null;
        }
        if (!(pace.floatValue() > 1.0E-4f)) {
            pace = null;
        }
        if (pace == null) {
            return null;
        }
        return Double.valueOf(3600 / (pace.floatValue() * 1000));
    }

    private final Double k(Trackrecord trackrecord) {
        Float swimAvgStrokeSpeed = trackrecord.getSwimAvgStrokeSpeed();
        if (swimAvgStrokeSpeed == null) {
            return null;
        }
        if (!(swimAvgStrokeSpeed.floatValue() > 0.0f)) {
            swimAvgStrokeSpeed = null;
        }
        if (swimAvgStrokeSpeed == null) {
            return null;
        }
        return Double.valueOf(kotlin.math.c.roundToInt(swimAvgStrokeSpeed.floatValue() * 60));
    }

    private final Double l(Trackrecord trackrecord) {
        Float maxrtp;
        if (!((trackrecord.getMinrtp() == null || trackrecord.getMaxrtp() == null) ? false : true)) {
            trackrecord = null;
        }
        if (trackrecord == null) {
            return null;
        }
        if (!a(trackrecord.getMinrtp().floatValue(), trackrecord) && !a(trackrecord.getMaxrtp().floatValue(), trackrecord)) {
            maxrtp = null;
        } else if (a(trackrecord.getMinrtp().floatValue(), trackrecord)) {
            maxrtp = (a(trackrecord.getMaxrtp().floatValue(), trackrecord) && trackrecord.getMaxrtp().floatValue() <= trackrecord.getMinrtp().floatValue()) ? trackrecord.getMaxrtp() : trackrecord.getMinrtp();
        } else {
            maxrtp = trackrecord.getMaxrtp();
        }
        if (maxrtp == null) {
            return null;
        }
        return Double.valueOf(maxrtp.floatValue());
    }

    private final Double m(Trackrecord trackrecord) {
        Float maxrtp;
        if (!((trackrecord.getMinrtp() == null || trackrecord.getMaxrtp() == null) ? false : true)) {
            trackrecord = null;
        }
        if (trackrecord == null) {
            return null;
        }
        if (!b(trackrecord.getMinrtp().floatValue()) && !b(trackrecord.getMaxrtp().floatValue())) {
            maxrtp = null;
        } else if (b(trackrecord.getMinrtp().floatValue())) {
            maxrtp = (b(trackrecord.getMaxrtp().floatValue()) && trackrecord.getMaxrtp().floatValue() <= trackrecord.getMinrtp().floatValue()) ? trackrecord.getMaxrtp() : trackrecord.getMinrtp();
        } else {
            maxrtp = trackrecord.getMaxrtp();
        }
        if (maxrtp == null) {
            return null;
        }
        return Double.valueOf(3600 / (maxrtp.floatValue() * 1000));
    }

    private final Double n(Trackrecord trackrecord) {
        Float swimMaxStrokeSpeed = trackrecord.getSwimMaxStrokeSpeed();
        if (swimMaxStrokeSpeed == null) {
            return null;
        }
        if (!(swimMaxStrokeSpeed.floatValue() > 0.0f)) {
            swimMaxStrokeSpeed = null;
        }
        if (swimMaxStrokeSpeed == null) {
            return null;
        }
        return Double.valueOf(kotlin.math.c.roundToInt(swimMaxStrokeSpeed.floatValue() * 60));
    }

    private final Double o(Trackrecord trackrecord) {
        if (!((trackrecord.getEndtime() == null || trackrecord.getTrackid() == null) ? false : true)) {
            trackrecord = null;
        }
        if (trackrecord == null) {
            return null;
        }
        Long lValueOf = Long.valueOf(trackrecord.getRopeSkippingRestTime());
        Long l = lValueOf.longValue() >= 0 ? lValueOf : null;
        long jLongValue = l != null ? l.longValue() : 0L;
        long jLongValue2 = trackrecord.getEndtime().longValue() - trackrecord.getTrackid().longValue();
        Integer costtime = trackrecord.getCosttime();
        return Double.valueOf((jLongValue2 - ((long) (costtime != null ? costtime.intValue() : 0))) - jLongValue);
    }

    private final Map<TennisSwing, TennisSwingData> p(Trackrecord trackrecord) {
        return (Map) this._tennisSwing.getValue();
    }

    private final Double q(Trackrecord trackrecord) {
        if (!((trackrecord.getEndtime() == null || trackrecord.getTrackid() == null) ? false : true)) {
            trackrecord = null;
        }
        if (trackrecord == null) {
            return null;
        }
        return Double.valueOf(trackrecord.getEndtime().longValue() - trackrecord.getTrackid().longValue());
    }

    private final boolean r(DataItem dataItem) {
        if (Intrinsics.areEqual(dataItem, DataItem.SwimmingTime.INSTANCE) ? true : Intrinsics.areEqual(dataItem, DataItem.CyclingTime.INSTANCE) ? true : Intrinsics.areEqual(dataItem, DataItem.RunningTime.INSTANCE) ? true : Intrinsics.areEqual(dataItem, DataItem.SubItemTime.INSTANCE)) {
            return true;
        }
        return Intrinsics.areEqual(dataItem, DataItem.SwitchTime.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<SportDataItem> s(List<? extends DataItem> list, boolean z, boolean z2) {
        Object sportDataItem;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DataItem dataItem = (DataItem) it2.next();
            sportDataItem = r(dataItem) ? null : new SportDataItem(dataItem, f(dataItem));
            if (sportDataItem != null) {
                arrayList.add(sportDataItem);
            }
        }
        if (!z) {
            return arrayList;
        }
        List<SportDataItem> listE = e(z2);
        sportDataItem = listE.isEmpty() ^ true ? listE : null;
        if (sportDataItem == null) {
            return arrayList;
        }
        List<SportDataItem> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        mutableList.addAll(sportDataItem);
        Unit unit = Unit.INSTANCE;
        return mutableList;
    }

    @Override // com.huami.moving.datacenter.SportDataRender
    @NotNull
    public List<SportDataItem> getCardDataList() {
        return s(c(), !this.subRecords.isEmpty(), false);
    }

    @Override // com.huami.moving.datacenter.SportDataRender
    @NotNull
    public Map<DataGroup, List<SportDataItem>> getDataList() {
        Map<DataGroup, List<DataItem>> mapD = d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(q.mapCapacity(mapD.size()));
        Iterator<T> it2 = mapD.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), s((List) entry.getValue(), (entry.getKey() instanceof DataGroup.Duration) && (this.subRecords.isEmpty() ^ true), true));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: com.huami.moving.datacenter.SportDataRenderImpl$b, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"com/huami/moving/datacenter/SportDataRenderImpl$b", "", "", "a", "b", "count", "percent", "Lcom/huami/moving/datacenter/SportDataRenderImpl$b;", "c", "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "e", "()I", "f", "g", "(I)V", "<init>", "(II)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class TennisSwingData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int count;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private int percent;

        public TennisSwingData(int i, int i2) {
            this.count = i;
            this.percent = i2;
        }

        public static /* synthetic */ TennisSwingData d(TennisSwingData tennisSwingData, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = tennisSwingData.count;
            }
            if ((i3 & 2) != 0) {
                i2 = tennisSwingData.percent;
            }
            return tennisSwingData.c(i, i2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        @NotNull
        public final TennisSwingData c(int count, int percent) {
            return new TennisSwingData(count, percent);
        }

        public final int e() {
            return this.count;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TennisSwingData)) {
                return false;
            }
            TennisSwingData tennisSwingData = (TennisSwingData) other;
            return this.count == tennisSwingData.count && this.percent == tennisSwingData.percent;
        }

        public final int f() {
            return this.percent;
        }

        public final void g(int i) {
            this.percent = i;
        }

        public int hashCode() {
            return (this.count * 31) + this.percent;
        }

        @NotNull
        public String toString() {
            return "TennisSwingData(count=" + this.count + ", percent=" + this.percent + ")";
        }

        public /* synthetic */ TennisSwingData(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    public /* synthetic */ SportDataRenderImpl(Trackrecord trackrecord, List list, SportConfigManager sportConfigManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(trackrecord, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, sportConfigManager);
    }
}
