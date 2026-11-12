package kotlin.collections.unsigned;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.UArraySortingKt;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\n_UArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,10766:1\n3824#1:10816\n3832#1:10817\n3840#1:10818\n3848#1:10819\n3824#1:10820\n3832#1:10821\n3840#1:10822\n3848#1:10823\n3824#1:10824\n3832#1:10825\n3840#1:10826\n3848#1:10827\n3824#1:10884\n3832#1:10885\n3840#1:10886\n3848#1:10887\n3824#1:10888\n3832#1:10889\n3840#1:10890\n3848#1:10891\n3824#1:10892\n3832#1:10893\n3840#1:10894\n3848#1:10895\n3824#1:10896\n3832#1:10897\n3840#1:10898\n3848#1:10899\n3824#1:10900\n3832#1:10901\n3840#1:10902\n3848#1:10903\n3824#1:10904\n3832#1:10905\n3840#1:10906\n3848#1:10907\n3824#1:10908\n3832#1:10909\n3840#1:10910\n3848#1:10911\n3824#1:10912\n3832#1:10913\n3840#1:10914\n3848#1:10915\n3824#1:10916\n3832#1:10917\n3840#1:10918\n3848#1:10919\n3824#1:10920\n3832#1:10921\n3840#1:10922\n3848#1:10923\n3824#1:10924\n3832#1:10925\n3840#1:10926\n3848#1:10927\n3824#1:10928\n3832#1:10929\n3840#1:10930\n3848#1:10931\n3824#1:10932\n3832#1:10933\n3840#1:10934\n3848#1:10935\n3824#1:10936\n3832#1:10937\n3840#1:10938\n3848#1:10939\n3824#1:10940\n3832#1:10941\n3840#1:10942\n3848#1:10943\n3824#1:10944\n3832#1:10945\n3840#1:10946\n3848#1:10947\n3824#1:10948\n3832#1:10949\n3840#1:10950\n3848#1:10951\n3824#1:10952\n3832#1:10953\n3840#1:10954\n3848#1:10955\n3824#1:10956\n3832#1:10957\n3840#1:10958\n3848#1:10959\n3824#1:10960\n3832#1:10961\n3840#1:10962\n3848#1:10963\n3824#1:10964\n3832#1:10965\n3840#1:10966\n3848#1:10967\n3824#1:10968\n3832#1:10969\n3840#1:10970\n3848#1:10971\n3824#1:10972\n3832#1:10973\n3840#1:10974\n3848#1:10975\n3824#1:10976\n3832#1:10977\n3840#1:10978\n3848#1:10979\n3824#1:10980\n3832#1:10981\n3840#1:10982\n3848#1:10983\n3824#1:10984\n3832#1:10985\n3840#1:10986\n3848#1:10987\n3824#1:10988\n3832#1:10989\n3840#1:10990\n3848#1:10991\n3824#1:10992\n3832#1:10993\n3840#1:10994\n3848#1:10995\n3824#1:10996\n3832#1:10997\n3840#1:10998\n3848#1:10999\n3824#1:11000\n3832#1:11001\n3840#1:11002\n3848#1:11003\n3824#1:11004\n3832#1:11005\n3840#1:11006\n3848#1:11007\n3824#1:11008\n3832#1:11009\n3840#1:11010\n3848#1:11011\n3824#1:11012\n3832#1:11013\n3840#1:11014\n3848#1:11015\n3824#1:11016\n3832#1:11017\n3840#1:11018\n3848#1:11019\n3824#1:11020\n3832#1:11021\n3840#1:11022\n3848#1:11023\n3824#1:11024\n3832#1:11025\n3840#1:11026\n3848#1:11027\n3824#1:11028\n3832#1:11029\n3840#1:11030\n3848#1:11031\n3824#1:11032\n3832#1:11033\n3840#1:11034\n3848#1:11035\n1718#2,6:10767\n1730#2,6:10773\n1694#2,6:10779\n1706#2,6:10785\n1826#2,6:10791\n1838#2,6:10797\n1802#2,6:10803\n1814#2,6:10809\n1#3:10815\n381#4,7:10828\n381#4,7:10835\n381#4,7:10842\n381#4,7:10849\n381#4,7:10856\n381#4,7:10863\n381#4,7:10870\n381#4,7:10877\n*S KotlinDebug\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n*L\n1735#1:10816\n1752#1:10817\n1769#1:10818\n1786#1:10819\n2563#1:10820\n2580#1:10821\n2597#1:10822\n2614#1:10823\n2930#1:10824\n2946#1:10825\n2962#1:10826\n2978#1:10827\n5622#1:10884\n5642#1:10885\n5662#1:10886\n5682#1:10887\n5703#1:10888\n5725#1:10889\n5747#1:10890\n5769#1:10891\n5882#1:10892\n5901#1:10893\n5920#1:10894\n5939#1:10895\n5961#1:10896\n5990#1:10897\n6019#1:10898\n6048#1:10899\n6073#1:10900\n6098#1:10901\n6123#1:10902\n6148#1:10903\n6178#1:10904\n6201#1:10905\n6224#1:10906\n6247#1:10907\n6270#1:10908\n6293#1:10909\n6316#1:10910\n6339#1:10911\n6360#1:10912\n6383#1:10913\n6406#1:10914\n6429#1:10915\n6452#1:10916\n6473#1:10917\n6494#1:10918\n6515#1:10919\n6536#1:10920\n6557#1:10921\n6578#1:10922\n6599#1:10923\n6618#1:10924\n6639#1:10925\n6660#1:10926\n6681#1:10927\n6704#1:10928\n6727#1:10929\n6750#1:10930\n6773#1:10931\n6794#1:10932\n6815#1:10933\n6836#1:10934\n6857#1:10935\n6874#1:10936\n6889#1:10937\n6904#1:10938\n6919#1:10939\n6938#1:10940\n6957#1:10941\n6976#1:10942\n6995#1:10943\n7010#1:10944\n7025#1:10945\n7040#1:10946\n7055#1:10947\n7074#1:10948\n7093#1:10949\n7112#1:10950\n7131#1:10951\n7153#1:10952\n7182#1:10953\n7211#1:10954\n7240#1:10955\n7265#1:10956\n7290#1:10957\n7315#1:10958\n7340#1:10959\n7370#1:10960\n7393#1:10961\n7416#1:10962\n7439#1:10963\n7462#1:10964\n7485#1:10965\n7508#1:10966\n7531#1:10967\n7552#1:10968\n7575#1:10969\n7598#1:10970\n7621#1:10971\n7644#1:10972\n7665#1:10973\n7686#1:10974\n7707#1:10975\n7728#1:10976\n7749#1:10977\n7770#1:10978\n7791#1:10979\n7810#1:10980\n7831#1:10981\n7852#1:10982\n7873#1:10983\n7896#1:10984\n7919#1:10985\n7942#1:10986\n7965#1:10987\n7986#1:10988\n8007#1:10989\n8028#1:10990\n8049#1:10991\n8066#1:10992\n8081#1:10993\n8096#1:10994\n8111#1:10995\n8130#1:10996\n8149#1:10997\n8168#1:10998\n8187#1:10999\n8202#1:11000\n8217#1:11001\n8232#1:11002\n8247#1:11003\n8465#1:11004\n8490#1:11005\n8515#1:11006\n8540#1:11007\n8565#1:11008\n8590#1:11009\n8615#1:11010\n8640#1:11011\n8664#1:11012\n8688#1:11013\n8712#1:11014\n8736#1:11015\n8760#1:11016\n8784#1:11017\n8808#1:11018\n8832#1:11019\n8854#1:11020\n8879#1:11021\n8904#1:11022\n8929#1:11023\n8954#1:11024\n8980#1:11025\n9006#1:11026\n9032#1:11027\n9057#1:11028\n9082#1:11029\n9107#1:11030\n9132#1:11031\n9157#1:11032\n9181#1:11033\n9205#1:11034\n9229#1:11035\n841#1:10767,6\n851#1:10773,6\n861#1:10779,6\n871#1:10785,6\n881#1:10791,6\n891#1:10797,6\n901#1:10803,6\n911#1:10809,6\n4840#1:10828,7\n4860#1:10835,7\n4880#1:10842,7\n4900#1:10849,7\n4921#1:10856,7\n4942#1:10863,7\n4963#1:10870,7\n4984#1:10877,7\n*E\n"})
public class UArraysKt___UArraysKt extends UArraysKt___UArraysJvmKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: all-JOV_ifY, reason: not valid java name */
    private static final boolean m1420allJOV_ifY(byte[] all, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(all);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            if (!predicate.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(all, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: all-MShoTSo, reason: not valid java name */
    private static final boolean m1421allMShoTSo(long[] all, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(all);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            if (!predicate.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(all, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: all-jgv0xPQ, reason: not valid java name */
    private static final boolean m1422alljgv0xPQ(int[] all, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(all);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            if (!predicate.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(all, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: all-xTcfx_M, reason: not valid java name */
    private static final boolean m1423allxTcfx_M(short[] all, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(all);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            if (!predicate.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(all, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any--ajY-9A, reason: not valid java name */
    private static final boolean m1424anyajY9A(int[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt___ArraysKt.any(any);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-GBYM_sE, reason: not valid java name */
    private static final boolean m1425anyGBYM_sE(byte[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt___ArraysKt.any(any);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-JOV_ifY, reason: not valid java name */
    private static final boolean m1426anyJOV_ifY(byte[] any, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(any);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            if (predicate.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(any, i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-MShoTSo, reason: not valid java name */
    private static final boolean m1427anyMShoTSo(long[] any, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(any);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            if (predicate.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(any, i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-QwZRm1k, reason: not valid java name */
    private static final boolean m1428anyQwZRm1k(long[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt___ArraysKt.any(any);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-jgv0xPQ, reason: not valid java name */
    private static final boolean m1429anyjgv0xPQ(int[] any, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(any);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            if (predicate.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(any, i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-rL5Bavg, reason: not valid java name */
    private static final boolean m1430anyrL5Bavg(short[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt___ArraysKt.any(any);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-xTcfx_M, reason: not valid java name */
    private static final boolean m1431anyxTcfx_M(short[] any, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(any);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            if (predicate.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(any, i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: asByteArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m1432asByteArrayGBYM_sE(byte[] asByteArray) {
        Intrinsics.checkNotNullParameter(asByteArray, "$this$asByteArray");
        return asByteArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: asIntArray--ajY-9A, reason: not valid java name */
    private static final int[] m1433asIntArrayajY9A(int[] asIntArray) {
        Intrinsics.checkNotNullParameter(asIntArray, "$this$asIntArray");
        return asIntArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: asLongArray-QwZRm1k, reason: not valid java name */
    private static final long[] m1434asLongArrayQwZRm1k(long[] asLongArray) {
        Intrinsics.checkNotNullParameter(asLongArray, "$this$asLongArray");
        return asLongArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: asShortArray-rL5Bavg, reason: not valid java name */
    private static final short[] m1435asShortArrayrL5Bavg(short[] asShortArray) {
        Intrinsics.checkNotNullParameter(asShortArray, "$this$asShortArray");
        return asShortArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] asUByteArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return UByteArray.m957constructorimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] asUIntArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return UIntArray.m1036constructorimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] asULongArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return ULongArray.m1115constructorimpl(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] asUShortArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return UShortArray.m1220constructorimpl(sArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWith-JOV_ifY, reason: not valid java name */
    private static final <V> Map<UByte, V> m1436associateWithJOV_ifY(byte[] associateWith, Function1<? super UByte, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(UByteArray.m963getSizeimpl(associateWith)), 16));
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(associateWith);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(associateWith, i);
            linkedHashMap.put(UByte.m898boximpl(bM962getw2LRezQ), valueSelector.invoke2(UByte.m898boximpl(bM962getw2LRezQ)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWith-MShoTSo, reason: not valid java name */
    private static final <V> Map<ULong, V> m1437associateWithMShoTSo(long[] associateWith, Function1<? super ULong, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(ULongArray.m1121getSizeimpl(associateWith)), 16));
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(associateWith);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(associateWith, i);
            linkedHashMap.put(ULong.m1054boximpl(jM1120getsVKNKU), valueSelector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWith-jgv0xPQ, reason: not valid java name */
    private static final <V> Map<UInt, V> m1438associateWithjgv0xPQ(int[] associateWith, Function1<? super UInt, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(UIntArray.m1042getSizeimpl(associateWith)), 16));
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(associateWith);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(associateWith, i);
            linkedHashMap.put(UInt.m975boximpl(iM1041getpVg5ArA), valueSelector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWith-xTcfx_M, reason: not valid java name */
    private static final <V> Map<UShort, V> m1439associateWithxTcfx_M(short[] associateWith, Function1<? super UShort, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(UShortArray.m1226getSizeimpl(associateWith)), 16));
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(associateWith);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(associateWith, i);
            linkedHashMap.put(UShort.m1161boximpl(sM1225getMh2AYeg), valueSelector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWithTo-4D70W2E, reason: not valid java name */
    private static final <V, M extends Map<? super UInt, ? super V>> M m1440associateWithTo4D70W2E(int[] associateWithTo, M destination, Function1<? super UInt, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(associateWithTo);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(associateWithTo, i);
            destination.put(UInt.m975boximpl(iM1041getpVg5ArA), valueSelector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWithTo-H21X9dk, reason: not valid java name */
    private static final <V, M extends Map<? super UByte, ? super V>> M m1441associateWithToH21X9dk(byte[] associateWithTo, M destination, Function1<? super UByte, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(associateWithTo);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(associateWithTo, i);
            destination.put(UByte.m898boximpl(bM962getw2LRezQ), valueSelector.invoke2(UByte.m898boximpl(bM962getw2LRezQ)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWithTo-X6OPwNk, reason: not valid java name */
    private static final <V, M extends Map<? super ULong, ? super V>> M m1442associateWithToX6OPwNk(long[] associateWithTo, M destination, Function1<? super ULong, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(associateWithTo);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(associateWithTo, i);
            destination.put(ULong.m1054boximpl(jM1120getsVKNKU), valueSelector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWithTo-ciTST-8, reason: not valid java name */
    private static final <V, M extends Map<? super UShort, ? super V>> M m1443associateWithTociTST8(short[] associateWithTo, M destination, Function1<? super UShort, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(associateWithTo);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(associateWithTo, i);
            destination.put(UShort.m1161boximpl(sM1225getMh2AYeg), valueSelector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component1--ajY-9A, reason: not valid java name */
    private static final int m1444component1ajY9A(int[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return UIntArray.m1041getpVg5ArA(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component1-GBYM_sE, reason: not valid java name */
    private static final byte m1445component1GBYM_sE(byte[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return UByteArray.m962getw2LRezQ(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component1-QwZRm1k, reason: not valid java name */
    private static final long m1446component1QwZRm1k(long[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return ULongArray.m1120getsVKNKU(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component1-rL5Bavg, reason: not valid java name */
    private static final short m1447component1rL5Bavg(short[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return UShortArray.m1225getMh2AYeg(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component2--ajY-9A, reason: not valid java name */
    private static final int m1448component2ajY9A(int[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return UIntArray.m1041getpVg5ArA(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component2-GBYM_sE, reason: not valid java name */
    private static final byte m1449component2GBYM_sE(byte[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return UByteArray.m962getw2LRezQ(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component2-QwZRm1k, reason: not valid java name */
    private static final long m1450component2QwZRm1k(long[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return ULongArray.m1120getsVKNKU(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component2-rL5Bavg, reason: not valid java name */
    private static final short m1451component2rL5Bavg(short[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return UShortArray.m1225getMh2AYeg(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component3--ajY-9A, reason: not valid java name */
    private static final int m1452component3ajY9A(int[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return UIntArray.m1041getpVg5ArA(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component3-GBYM_sE, reason: not valid java name */
    private static final byte m1453component3GBYM_sE(byte[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return UByteArray.m962getw2LRezQ(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component3-QwZRm1k, reason: not valid java name */
    private static final long m1454component3QwZRm1k(long[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return ULongArray.m1120getsVKNKU(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component3-rL5Bavg, reason: not valid java name */
    private static final short m1455component3rL5Bavg(short[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return UShortArray.m1225getMh2AYeg(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component4--ajY-9A, reason: not valid java name */
    private static final int m1456component4ajY9A(int[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return UIntArray.m1041getpVg5ArA(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component4-GBYM_sE, reason: not valid java name */
    private static final byte m1457component4GBYM_sE(byte[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return UByteArray.m962getw2LRezQ(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component4-QwZRm1k, reason: not valid java name */
    private static final long m1458component4QwZRm1k(long[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return ULongArray.m1120getsVKNKU(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component4-rL5Bavg, reason: not valid java name */
    private static final short m1459component4rL5Bavg(short[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return UShortArray.m1225getMh2AYeg(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component5--ajY-9A, reason: not valid java name */
    private static final int m1460component5ajY9A(int[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return UIntArray.m1041getpVg5ArA(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component5-GBYM_sE, reason: not valid java name */
    private static final byte m1461component5GBYM_sE(byte[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return UByteArray.m962getw2LRezQ(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component5-QwZRm1k, reason: not valid java name */
    private static final long m1462component5QwZRm1k(long[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return ULongArray.m1120getsVKNKU(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component5-rL5Bavg, reason: not valid java name */
    private static final short m1463component5rL5Bavg(short[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return UShortArray.m1225getMh2AYeg(component5, 4);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-FGO6Aew, reason: not valid java name */
    public static boolean m1464contentEqualsFGO6Aew(@Nullable short[] sArr, @Nullable short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-KJPZfPQ, reason: not valid java name */
    public static boolean m1465contentEqualsKJPZfPQ(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-kV0jMPg, reason: not valid java name */
    public static boolean m1466contentEqualskV0jMPg(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-lec5QzE, reason: not valid java name */
    public static boolean m1467contentEqualslec5QzE(@Nullable long[] jArr, @Nullable long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-2csIQuQ, reason: not valid java name */
    public static final int m1468contentHashCode2csIQuQ(@Nullable byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-XUkPCBk, reason: not valid java name */
    public static final int m1469contentHashCodeXUkPCBk(@Nullable int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-d-6D3K8, reason: not valid java name */
    public static final int m1470contentHashCoded6D3K8(@Nullable short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-uLth9ew, reason: not valid java name */
    public static final int m1471contentHashCodeuLth9ew(@Nullable long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-2csIQuQ, reason: not valid java name */
    public static String m1472contentToString2csIQuQ(@Nullable byte[] bArr) {
        String strJoinToString$default;
        return (bArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(UByteArray.m955boximpl(bArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-XUkPCBk, reason: not valid java name */
    public static String m1473contentToStringXUkPCBk(@Nullable int[] iArr) {
        String strJoinToString$default;
        return (iArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(UIntArray.m1034boximpl(iArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-d-6D3K8, reason: not valid java name */
    public static String m1474contentToStringd6D3K8(@Nullable short[] sArr) {
        String strJoinToString$default;
        return (sArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(UShortArray.m1218boximpl(sArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-uLth9ew, reason: not valid java name */
    public static String m1475contentToStringuLth9ew(@Nullable long[] jArr) {
        String strJoinToString$default;
        return (jArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(ULongArray.m1113boximpl(jArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyInto--B0-L2c, reason: not valid java name */
    private static final long[] m1476copyIntoB0L2c(long[] copyInto, long[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i, i2, i3);
        return destination;
    }

    /* JADX INFO: renamed from: copyInto--B0-L2c$default, reason: not valid java name */
    public static /* synthetic */ long[] m1477copyIntoB0L2c$default(long[] copyInto, long[] destination, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = ULongArray.m1121getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i, i2, i3);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyInto-9-ak10g, reason: not valid java name */
    private static final short[] m1478copyInto9ak10g(short[] copyInto, short[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i, i2, i3);
        return destination;
    }

    /* JADX INFO: renamed from: copyInto-9-ak10g$default, reason: not valid java name */
    public static /* synthetic */ short[] m1479copyInto9ak10g$default(short[] copyInto, short[] destination, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UShortArray.m1226getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i, i2, i3);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyInto-FUQE5sA, reason: not valid java name */
    private static final byte[] m1480copyIntoFUQE5sA(byte[] copyInto, byte[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i, i2, i3);
        return destination;
    }

    /* JADX INFO: renamed from: copyInto-FUQE5sA$default, reason: not valid java name */
    public static /* synthetic */ byte[] m1481copyIntoFUQE5sA$default(byte[] copyInto, byte[] destination, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UByteArray.m963getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i, i2, i3);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyInto-sIZ3KeM, reason: not valid java name */
    private static final int[] m1482copyIntosIZ3KeM(int[] copyInto, int[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i, i2, i3);
        return destination;
    }

    /* JADX INFO: renamed from: copyInto-sIZ3KeM$default, reason: not valid java name */
    public static /* synthetic */ int[] m1483copyIntosIZ3KeM$default(int[] copyInto, int[] destination, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UIntArray.m1042getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i, i2, i3);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf--ajY-9A, reason: not valid java name */
    private static final int[] m1484copyOfajY9A(int[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        int[] iArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return UIntArray.m1036constructorimpl(iArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-GBYM_sE, reason: not valid java name */
    private static final byte[] m1485copyOfGBYM_sE(byte[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        byte[] bArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return UByteArray.m957constructorimpl(bArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-PpDY95g, reason: not valid java name */
    private static final byte[] m1486copyOfPpDY95g(byte[] copyOf, int i) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        byte[] bArrCopyOf = Arrays.copyOf(copyOf, i);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return UByteArray.m957constructorimpl(bArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-QwZRm1k, reason: not valid java name */
    private static final long[] m1487copyOfQwZRm1k(long[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        long[] jArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return ULongArray.m1115constructorimpl(jArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-nggk6HY, reason: not valid java name */
    private static final short[] m1488copyOfnggk6HY(short[] copyOf, int i) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        short[] sArrCopyOf = Arrays.copyOf(copyOf, i);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return UShortArray.m1220constructorimpl(sArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-qFRl0hI, reason: not valid java name */
    private static final int[] m1489copyOfqFRl0hI(int[] copyOf, int i) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        int[] iArrCopyOf = Arrays.copyOf(copyOf, i);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return UIntArray.m1036constructorimpl(iArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-r7IrZao, reason: not valid java name */
    private static final long[] m1490copyOfr7IrZao(long[] copyOf, int i) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        long[] jArrCopyOf = Arrays.copyOf(copyOf, i);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return ULongArray.m1115constructorimpl(jArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-rL5Bavg, reason: not valid java name */
    private static final short[] m1491copyOfrL5Bavg(short[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        short[] sArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return UShortArray.m1220constructorimpl(sArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOfRange--nroSd4, reason: not valid java name */
    private static final long[] m1492copyOfRangenroSd4(long[] copyOfRange, int i, int i2) {
        long[] jArrCopyOfRange;
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            jArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(copyOfRange, i, i2);
        } else {
            if (i2 > copyOfRange.length) {
                throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + copyOfRange.length);
            }
            jArrCopyOfRange = Arrays.copyOfRange(copyOfRange, i, i2);
            Intrinsics.checkNotNull(jArrCopyOfRange);
        }
        return ULongArray.m1115constructorimpl(jArrCopyOfRange);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOfRange-4UcCI2c, reason: not valid java name */
    private static final byte[] m1493copyOfRange4UcCI2c(byte[] copyOfRange, int i, int i2) {
        byte[] bArrCopyOfRange;
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(copyOfRange, i, i2);
        } else {
            if (i2 > copyOfRange.length) {
                throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + copyOfRange.length);
            }
            bArrCopyOfRange = Arrays.copyOfRange(copyOfRange, i, i2);
            Intrinsics.checkNotNull(bArrCopyOfRange);
        }
        return UByteArray.m957constructorimpl(bArrCopyOfRange);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOfRange-Aa5vz7o, reason: not valid java name */
    private static final short[] m1494copyOfRangeAa5vz7o(short[] copyOfRange, int i, int i2) {
        short[] sArrCopyOfRange;
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            sArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(copyOfRange, i, i2);
        } else {
            if (i2 > copyOfRange.length) {
                throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + copyOfRange.length);
            }
            sArrCopyOfRange = Arrays.copyOfRange(copyOfRange, i, i2);
            Intrinsics.checkNotNull(sArrCopyOfRange);
        }
        return UShortArray.m1220constructorimpl(sArrCopyOfRange);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOfRange-oBK06Vg, reason: not valid java name */
    private static final int[] m1495copyOfRangeoBK06Vg(int[] copyOfRange, int i, int i2) {
        int[] iArrCopyOfRange;
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            iArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(copyOfRange, i, i2);
        } else {
            if (i2 > copyOfRange.length) {
                throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + copyOfRange.length);
            }
            iArrCopyOfRange = Arrays.copyOfRange(copyOfRange, i, i2);
            Intrinsics.checkNotNull(iArrCopyOfRange);
        }
        return UIntArray.m1036constructorimpl(iArrCopyOfRange);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: count-JOV_ifY, reason: not valid java name */
    private static final int m1496countJOV_ifY(byte[] count, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(count);
        int i = 0;
        for (int i2 = 0; i2 < iM963getSizeimpl; i2++) {
            if (predicate.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(count, i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: count-MShoTSo, reason: not valid java name */
    private static final int m1497countMShoTSo(long[] count, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(count);
        int i = 0;
        for (int i2 = 0; i2 < iM1121getSizeimpl; i2++) {
            if (predicate.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(count, i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: count-jgv0xPQ, reason: not valid java name */
    private static final int m1498countjgv0xPQ(int[] count, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(count);
        int i = 0;
        for (int i2 = 0; i2 < iM1042getSizeimpl; i2++) {
            if (predicate.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(count, i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: count-xTcfx_M, reason: not valid java name */
    private static final int m1499countxTcfx_M(short[] count, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(count);
        int i = 0;
        for (int i2 = 0; i2 < iM1226getSizeimpl; i2++) {
            if (predicate.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(count, i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-PpDY95g, reason: not valid java name */
    public static final List<UByte> m1500dropPpDY95g(@NotNull byte[] drop, int i) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i >= 0) {
            return m2028takeLastPpDY95g(drop, RangesKt___RangesKt.coerceAtLeast(UByteArray.m963getSizeimpl(drop) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-nggk6HY, reason: not valid java name */
    public static final List<UShort> m1501dropnggk6HY(@NotNull short[] drop, int i) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i >= 0) {
            return m2029takeLastnggk6HY(drop, RangesKt___RangesKt.coerceAtLeast(UShortArray.m1226getSizeimpl(drop) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m1502dropqFRl0hI(@NotNull int[] drop, int i) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i >= 0) {
            return m2030takeLastqFRl0hI(drop, RangesKt___RangesKt.coerceAtLeast(UIntArray.m1042getSizeimpl(drop) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-r7IrZao, reason: not valid java name */
    public static final List<ULong> m1503dropr7IrZao(@NotNull long[] drop, int i) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i >= 0) {
            return m2031takeLastr7IrZao(drop, RangesKt___RangesKt.coerceAtLeast(ULongArray.m1121getSizeimpl(drop) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-PpDY95g, reason: not valid java name */
    public static final List<UByte> m1504dropLastPpDY95g(@NotNull byte[] dropLast, int i) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i >= 0) {
            return m2024takePpDY95g(dropLast, RangesKt___RangesKt.coerceAtLeast(UByteArray.m963getSizeimpl(dropLast) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-nggk6HY, reason: not valid java name */
    public static final List<UShort> m1505dropLastnggk6HY(@NotNull short[] dropLast, int i) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i >= 0) {
            return m2025takenggk6HY(dropLast, RangesKt___RangesKt.coerceAtLeast(UShortArray.m1226getSizeimpl(dropLast) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m1506dropLastqFRl0hI(@NotNull int[] dropLast, int i) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i >= 0) {
            return m2026takeqFRl0hI(dropLast, RangesKt___RangesKt.coerceAtLeast(UIntArray.m1042getSizeimpl(dropLast) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-r7IrZao, reason: not valid java name */
    public static final List<ULong> m1507dropLastr7IrZao(@NotNull long[] dropLast, int i) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i >= 0) {
            return m2027taker7IrZao(dropLast, RangesKt___RangesKt.coerceAtLeast(ULongArray.m1121getSizeimpl(dropLast) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropLastWhile-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m1508dropLastWhileJOV_ifY(byte[] dropLastWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(dropLastWhile, lastIndex))).booleanValue()) {
                return m2024takePpDY95g(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropLastWhile-MShoTSo, reason: not valid java name */
    private static final List<ULong> m1509dropLastWhileMShoTSo(long[] dropLastWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(dropLastWhile, lastIndex))).booleanValue()) {
                return m2027taker7IrZao(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropLastWhile-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m1510dropLastWhilejgv0xPQ(int[] dropLastWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(dropLastWhile, lastIndex))).booleanValue()) {
                return m2026takeqFRl0hI(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropLastWhile-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m1511dropLastWhilexTcfx_M(short[] dropLastWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(dropLastWhile, lastIndex))).booleanValue()) {
                return m2025takenggk6HY(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropWhile-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m1512dropWhileJOV_ifY(byte[] dropWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(dropWhile);
        boolean z = false;
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(dropWhile, i);
            if (z) {
                arrayList.add(UByte.m898boximpl(bM962getw2LRezQ));
            } else if (!predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m898boximpl(bM962getw2LRezQ));
                z = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropWhile-MShoTSo, reason: not valid java name */
    private static final List<ULong> m1513dropWhileMShoTSo(long[] dropWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(dropWhile);
        boolean z = false;
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(dropWhile, i);
            if (z) {
                arrayList.add(ULong.m1054boximpl(jM1120getsVKNKU));
            } else if (!predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m1054boximpl(jM1120getsVKNKU));
                z = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropWhile-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m1514dropWhilejgv0xPQ(int[] dropWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(dropWhile);
        boolean z = false;
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(dropWhile, i);
            if (z) {
                arrayList.add(UInt.m975boximpl(iM1041getpVg5ArA));
            } else if (!predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m975boximpl(iM1041getpVg5ArA));
                z = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropWhile-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m1515dropWhilexTcfx_M(short[] dropWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(dropWhile);
        boolean z = false;
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(dropWhile, i);
            if (z) {
                arrayList.add(UShort.m1161boximpl(sM1225getMh2AYeg));
            } else if (!predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m1161boximpl(sM1225getMh2AYeg));
                z = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrElse-CVVdw08, reason: not valid java name */
    private static final short m1516elementAtOrElseCVVdw08(short[] elementAtOrElse, int i, Function1<? super Integer, UShort> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i < 0 || i >= UShortArray.m1226getSizeimpl(elementAtOrElse)) ? defaultValue.invoke2(Integer.valueOf(i)).m1217unboximpl() : UShortArray.m1225getMh2AYeg(elementAtOrElse, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrElse-QxvSvLU, reason: not valid java name */
    private static final int m1517elementAtOrElseQxvSvLU(int[] elementAtOrElse, int i, Function1<? super Integer, UInt> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i < 0 || i >= UIntArray.m1042getSizeimpl(elementAtOrElse)) ? defaultValue.invoke2(Integer.valueOf(i)).m1033unboximpl() : UIntArray.m1041getpVg5ArA(elementAtOrElse, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrElse-Xw8i6dc, reason: not valid java name */
    private static final long m1518elementAtOrElseXw8i6dc(long[] elementAtOrElse, int i, Function1<? super Integer, ULong> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i < 0 || i >= ULongArray.m1121getSizeimpl(elementAtOrElse)) ? defaultValue.invoke2(Integer.valueOf(i)).m1112unboximpl() : ULongArray.m1120getsVKNKU(elementAtOrElse, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrElse-cO-VybQ, reason: not valid java name */
    private static final byte m1519elementAtOrElsecOVybQ(byte[] elementAtOrElse, int i, Function1<? super Integer, UByte> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i < 0 || i >= UByteArray.m963getSizeimpl(elementAtOrElse)) ? defaultValue.invoke2(Integer.valueOf(i)).m954unboximpl() : UByteArray.m962getw2LRezQ(elementAtOrElse, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrNull-PpDY95g, reason: not valid java name */
    private static final UByte m1520elementAtOrNullPpDY95g(byte[] elementAtOrNull, int i) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m1640getOrNullPpDY95g(elementAtOrNull, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrNull-nggk6HY, reason: not valid java name */
    private static final UShort m1521elementAtOrNullnggk6HY(short[] elementAtOrNull, int i) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m1641getOrNullnggk6HY(elementAtOrNull, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrNull-qFRl0hI, reason: not valid java name */
    private static final UInt m1522elementAtOrNullqFRl0hI(int[] elementAtOrNull, int i) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m1642getOrNullqFRl0hI(elementAtOrNull, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrNull-r7IrZao, reason: not valid java name */
    private static final ULong m1523elementAtOrNullr7IrZao(long[] elementAtOrNull, int i) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m1643getOrNullr7IrZao(elementAtOrNull, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-2fe2U9s, reason: not valid java name */
    public static final void m1524fill2fe2U9s(@NotNull int[] fill, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, i, i2, i3);
    }

    /* JADX INFO: renamed from: fill-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ void m1525fill2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = UIntArray.m1042getSizeimpl(iArr);
        }
        m1524fill2fe2U9s(iArr, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-EtDCXyQ, reason: not valid java name */
    public static final void m1526fillEtDCXyQ(@NotNull short[] fill, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, s, i, i2);
    }

    /* JADX INFO: renamed from: fill-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ void m1527fillEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m1226getSizeimpl(sArr);
        }
        m1526fillEtDCXyQ(sArr, s, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-K6DWlUc, reason: not valid java name */
    public static final void m1528fillK6DWlUc(@NotNull long[] fill, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, j, i, i2);
    }

    /* JADX INFO: renamed from: fill-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ void m1529fillK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m1121getSizeimpl(jArr);
        }
        m1528fillK6DWlUc(jArr, j, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-WpHrYlw, reason: not valid java name */
    public static final void m1530fillWpHrYlw(@NotNull byte[] fill, byte b2, int i, int i2) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, b2, i, i2);
    }

    /* JADX INFO: renamed from: fill-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ void m1531fillWpHrYlw$default(byte[] bArr, byte b2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m963getSizeimpl(bArr);
        }
        m1530fillWpHrYlw(bArr, b2, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filter-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m1532filterJOV_ifY(byte[] filter, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(filter);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(filter, i);
            if (predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m898boximpl(bM962getw2LRezQ));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filter-MShoTSo, reason: not valid java name */
    private static final List<ULong> m1533filterMShoTSo(long[] filter, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(filter);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(filter, i);
            if (predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m1054boximpl(jM1120getsVKNKU));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filter-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m1534filterjgv0xPQ(int[] filter, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(filter);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(filter, i);
            if (predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m975boximpl(iM1041getpVg5ArA));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filter-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m1535filterxTcfx_M(short[] filter, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(filter);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(filter, i);
            if (predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m1161boximpl(sM1225getMh2AYeg));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexed-ELGow60, reason: not valid java name */
    private static final List<UByte> m1536filterIndexedELGow60(byte[] filterIndexed, Function2<? super Integer, ? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(filterIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM963getSizeimpl) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(filterIndexed, i);
            int i3 = i2 + 1;
            if (predicate.invoke(Integer.valueOf(i2), UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m898boximpl(bM962getw2LRezQ));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexed-WyvcNBI, reason: not valid java name */
    private static final List<UInt> m1537filterIndexedWyvcNBI(int[] filterIndexed, Function2<? super Integer, ? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(filterIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1042getSizeimpl) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(filterIndexed, i);
            int i3 = i2 + 1;
            if (predicate.invoke(Integer.valueOf(i2), UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m975boximpl(iM1041getpVg5ArA));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexed-s8dVfGU, reason: not valid java name */
    private static final List<ULong> m1538filterIndexeds8dVfGU(long[] filterIndexed, Function2<? super Integer, ? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(filterIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1121getSizeimpl) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(filterIndexed, i);
            int i3 = i2 + 1;
            if (predicate.invoke(Integer.valueOf(i2), ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m1054boximpl(jM1120getsVKNKU));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexed-xzaTVY8, reason: not valid java name */
    private static final List<UShort> m1539filterIndexedxzaTVY8(short[] filterIndexed, Function2<? super Integer, ? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(filterIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1226getSizeimpl) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(filterIndexed, i);
            int i3 = i2 + 1;
            if (predicate.invoke(Integer.valueOf(i2), UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m1161boximpl(sM1225getMh2AYeg));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexedTo--6EtJGI, reason: not valid java name */
    private static final <C extends Collection<? super UInt>> C m1540filterIndexedTo6EtJGI(int[] filterIndexedTo, C destination, Function2<? super Integer, ? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(filterIndexedTo);
        int i = 0;
        int i2 = 0;
        while (i < iM1042getSizeimpl) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(filterIndexedTo, i);
            int i3 = i2 + 1;
            if (predicate.invoke(Integer.valueOf(i2), UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                destination.add(UInt.m975boximpl(iM1041getpVg5ArA));
            }
            i++;
            i2 = i3;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <C extends Collection<? super UShort>> C m1541filterIndexedToQqktQ3k(short[] filterIndexedTo, C destination, Function2<? super Integer, ? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(filterIndexedTo);
        int i = 0;
        int i2 = 0;
        while (i < iM1226getSizeimpl) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(filterIndexedTo, i);
            int i3 = i2 + 1;
            if (predicate.invoke(Integer.valueOf(i2), UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                destination.add(UShort.m1161boximpl(sM1225getMh2AYeg));
            }
            i++;
            i2 = i3;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <C extends Collection<? super UByte>> C m1542filterIndexedToeNpIKz8(byte[] filterIndexedTo, C destination, Function2<? super Integer, ? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(filterIndexedTo);
        int i = 0;
        int i2 = 0;
        while (i < iM963getSizeimpl) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(filterIndexedTo, i);
            int i3 = i2 + 1;
            if (predicate.invoke(Integer.valueOf(i2), UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                destination.add(UByte.m898boximpl(bM962getw2LRezQ));
            }
            i++;
            i2 = i3;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <C extends Collection<? super ULong>> C m1543filterIndexedTope2Q0Dw(long[] filterIndexedTo, C destination, Function2<? super Integer, ? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(filterIndexedTo);
        int i = 0;
        int i2 = 0;
        while (i < iM1121getSizeimpl) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(filterIndexedTo, i);
            int i3 = i2 + 1;
            if (predicate.invoke(Integer.valueOf(i2), ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                destination.add(ULong.m1054boximpl(jM1120getsVKNKU));
            }
            i++;
            i2 = i3;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNot-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m1544filterNotJOV_ifY(byte[] filterNot, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(filterNot);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(filterNot, i);
            if (!predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m898boximpl(bM962getw2LRezQ));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNot-MShoTSo, reason: not valid java name */
    private static final List<ULong> m1545filterNotMShoTSo(long[] filterNot, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(filterNot);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(filterNot, i);
            if (!predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m1054boximpl(jM1120getsVKNKU));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNot-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m1546filterNotjgv0xPQ(int[] filterNot, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(filterNot);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(filterNot, i);
            if (!predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m975boximpl(iM1041getpVg5ArA));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNot-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m1547filterNotxTcfx_M(short[] filterNot, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(filterNot);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(filterNot, i);
            if (!predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m1161boximpl(sM1225getMh2AYeg));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNotTo-HqK1JgA, reason: not valid java name */
    private static final <C extends Collection<? super ULong>> C m1548filterNotToHqK1JgA(long[] filterNotTo, C destination, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(filterNotTo);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(filterNotTo, i);
            if (!predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                destination.add(ULong.m1054boximpl(jM1120getsVKNKU));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNotTo-oEOeDjA, reason: not valid java name */
    private static final <C extends Collection<? super UShort>> C m1549filterNotTooEOeDjA(short[] filterNotTo, C destination, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(filterNotTo);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(filterNotTo, i);
            if (!predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                destination.add(UShort.m1161boximpl(sM1225getMh2AYeg));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNotTo-wU5IKMo, reason: not valid java name */
    private static final <C extends Collection<? super UInt>> C m1550filterNotTowU5IKMo(int[] filterNotTo, C destination, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(filterNotTo);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(filterNotTo, i);
            if (!predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                destination.add(UInt.m975boximpl(iM1041getpVg5ArA));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNotTo-wzUQCXU, reason: not valid java name */
    private static final <C extends Collection<? super UByte>> C m1551filterNotTowzUQCXU(byte[] filterNotTo, C destination, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(filterNotTo);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(filterNotTo, i);
            if (!predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                destination.add(UByte.m898boximpl(bM962getw2LRezQ));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterTo-HqK1JgA, reason: not valid java name */
    private static final <C extends Collection<? super ULong>> C m1552filterToHqK1JgA(long[] filterTo, C destination, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(filterTo);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(filterTo, i);
            if (predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                destination.add(ULong.m1054boximpl(jM1120getsVKNKU));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterTo-oEOeDjA, reason: not valid java name */
    private static final <C extends Collection<? super UShort>> C m1553filterTooEOeDjA(short[] filterTo, C destination, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(filterTo);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(filterTo, i);
            if (predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                destination.add(UShort.m1161boximpl(sM1225getMh2AYeg));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterTo-wU5IKMo, reason: not valid java name */
    private static final <C extends Collection<? super UInt>> C m1554filterTowU5IKMo(int[] filterTo, C destination, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(filterTo);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(filterTo, i);
            if (predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                destination.add(UInt.m975boximpl(iM1041getpVg5ArA));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterTo-wzUQCXU, reason: not valid java name */
    private static final <C extends Collection<? super UByte>> C m1555filterTowzUQCXU(byte[] filterTo, C destination, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(filterTo);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(filterTo, i);
            if (predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                destination.add(UByte.m898boximpl(bM962getw2LRezQ));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: find-JOV_ifY, reason: not valid java name */
    private static final UByte m1556findJOV_ifY(byte[] find, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(find);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(find, i);
            if (predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                return UByte.m898boximpl(bM962getw2LRezQ);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: find-MShoTSo, reason: not valid java name */
    private static final ULong m1557findMShoTSo(long[] find, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(find);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(find, i);
            if (predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                return ULong.m1054boximpl(jM1120getsVKNKU);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: find-jgv0xPQ, reason: not valid java name */
    private static final UInt m1558findjgv0xPQ(int[] find, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(find);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(find, i);
            if (predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                return UInt.m975boximpl(iM1041getpVg5ArA);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: find-xTcfx_M, reason: not valid java name */
    private static final UShort m1559findxTcfx_M(short[] find, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(find);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(find, i);
            if (predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                return UShort.m1161boximpl(sM1225getMh2AYeg);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: findLast-JOV_ifY, reason: not valid java name */
    private static final UByte m1560findLastJOV_ifY(byte[] findLast, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(findLast) - 1;
        if (iM963getSizeimpl >= 0) {
            while (true) {
                int i = iM963getSizeimpl - 1;
                byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(findLast, iM963getSizeimpl);
                if (predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                    return UByte.m898boximpl(bM962getw2LRezQ);
                }
                if (i >= 0) {
                    iM963getSizeimpl = i;
                }
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: findLast-MShoTSo, reason: not valid java name */
    private static final ULong m1561findLastMShoTSo(long[] findLast, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(findLast) - 1;
        if (iM1121getSizeimpl >= 0) {
            while (true) {
                int i = iM1121getSizeimpl - 1;
                long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(findLast, iM1121getSizeimpl);
                if (predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                    return ULong.m1054boximpl(jM1120getsVKNKU);
                }
                if (i >= 0) {
                    iM1121getSizeimpl = i;
                }
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: findLast-jgv0xPQ, reason: not valid java name */
    private static final UInt m1562findLastjgv0xPQ(int[] findLast, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(findLast) - 1;
        if (iM1042getSizeimpl >= 0) {
            while (true) {
                int i = iM1042getSizeimpl - 1;
                int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(findLast, iM1042getSizeimpl);
                if (predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                    return UInt.m975boximpl(iM1041getpVg5ArA);
                }
                if (i >= 0) {
                    iM1042getSizeimpl = i;
                }
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: findLast-xTcfx_M, reason: not valid java name */
    private static final UShort m1563findLastxTcfx_M(short[] findLast, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(findLast) - 1;
        if (iM1226getSizeimpl >= 0) {
            while (true) {
                int i = iM1226getSizeimpl - 1;
                short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(findLast, iM1226getSizeimpl);
                if (predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                    return UShort.m1161boximpl(sM1225getMh2AYeg);
                }
                if (i >= 0) {
                    iM1226getSizeimpl = i;
                }
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first--ajY-9A, reason: not valid java name */
    private static final int m1564firstajY9A(int[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return UInt.m981constructorimpl(ArraysKt___ArraysKt.first(first));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-GBYM_sE, reason: not valid java name */
    private static final byte m1565firstGBYM_sE(byte[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return UByte.m904constructorimpl(ArraysKt___ArraysKt.first(first));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-JOV_ifY, reason: not valid java name */
    private static final byte m1566firstJOV_ifY(byte[] first, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(first);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(first, i);
            if (predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                return bM962getw2LRezQ;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-MShoTSo, reason: not valid java name */
    private static final long m1567firstMShoTSo(long[] first, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(first);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(first, i);
            if (predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                return jM1120getsVKNKU;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-QwZRm1k, reason: not valid java name */
    private static final long m1568firstQwZRm1k(long[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return ULong.m1060constructorimpl(ArraysKt___ArraysKt.first(first));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-jgv0xPQ, reason: not valid java name */
    private static final int m1569firstjgv0xPQ(int[] first, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(first);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(first, i);
            if (predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                return iM1041getpVg5ArA;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-rL5Bavg, reason: not valid java name */
    private static final short m1570firstrL5Bavg(short[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return UShort.m1167constructorimpl(ArraysKt___ArraysKt.first(first));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-xTcfx_M, reason: not valid java name */
    private static final short m1571firstxTcfx_M(short[] first, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(first);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(first, i);
            if (predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                return sM1225getMh2AYeg;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m1572firstOrNullajY9A(@NotNull int[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UIntArray.m1044isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UInt.m975boximpl(UIntArray.m1041getpVg5ArA(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m1573firstOrNullGBYM_sE(@NotNull byte[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UByteArray.m965isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UByte.m898boximpl(UByteArray.m962getw2LRezQ(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: firstOrNull-JOV_ifY, reason: not valid java name */
    private static final UByte m1574firstOrNullJOV_ifY(byte[] firstOrNull, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(firstOrNull);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(firstOrNull, i);
            if (predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                return UByte.m898boximpl(bM962getw2LRezQ);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: firstOrNull-MShoTSo, reason: not valid java name */
    private static final ULong m1575firstOrNullMShoTSo(long[] firstOrNull, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(firstOrNull);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(firstOrNull, i);
            if (predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                return ULong.m1054boximpl(jM1120getsVKNKU);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m1576firstOrNullQwZRm1k(@NotNull long[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (ULongArray.m1123isEmptyimpl(firstOrNull)) {
            return null;
        }
        return ULong.m1054boximpl(ULongArray.m1120getsVKNKU(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: firstOrNull-jgv0xPQ, reason: not valid java name */
    private static final UInt m1577firstOrNulljgv0xPQ(int[] firstOrNull, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(firstOrNull);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(firstOrNull, i);
            if (predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                return UInt.m975boximpl(iM1041getpVg5ArA);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m1578firstOrNullrL5Bavg(@NotNull short[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UShortArray.m1228isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: firstOrNull-xTcfx_M, reason: not valid java name */
    private static final UShort m1579firstOrNullxTcfx_M(short[] firstOrNull, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(firstOrNull);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(firstOrNull, i);
            if (predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                return UShort.m1161boximpl(sM1225getMh2AYeg);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMap-JOV_ifY, reason: not valid java name */
    private static final <R> List<R> m1580flatMapJOV_ifY(byte[] flatMap, Function1<? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(flatMap);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(flatMap, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMap-MShoTSo, reason: not valid java name */
    private static final <R> List<R> m1581flatMapMShoTSo(long[] flatMap, Function1<? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(flatMap);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(flatMap, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMap-jgv0xPQ, reason: not valid java name */
    private static final <R> List<R> m1582flatMapjgv0xPQ(int[] flatMap, Function1<? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(flatMap);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(flatMap, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMap-xTcfx_M, reason: not valid java name */
    private static final <R> List<R> m1583flatMapxTcfx_M(short[] flatMap, Function1<? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(flatMap);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(flatMap, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexed-ELGow60, reason: not valid java name */
    private static final <R> List<R> m1584flatMapIndexedELGow60(byte[] flatMapIndexed, Function2<? super Integer, ? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(flatMapIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM963getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i2), UByte.m898boximpl(UByteArray.m962getw2LRezQ(flatMapIndexed, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexed-WyvcNBI, reason: not valid java name */
    private static final <R> List<R> m1585flatMapIndexedWyvcNBI(int[] flatMapIndexed, Function2<? super Integer, ? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(flatMapIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1042getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i2), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(flatMapIndexed, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexed-s8dVfGU, reason: not valid java name */
    private static final <R> List<R> m1586flatMapIndexeds8dVfGU(long[] flatMapIndexed, Function2<? super Integer, ? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(flatMapIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1121getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i2), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(flatMapIndexed, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexed-xzaTVY8, reason: not valid java name */
    private static final <R> List<R> m1587flatMapIndexedxzaTVY8(short[] flatMapIndexed, Function2<? super Integer, ? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(flatMapIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1226getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i2), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(flatMapIndexed, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexedTo--6EtJGI, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1588flatMapIndexedTo6EtJGI(int[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(flatMapIndexedTo);
        int i = 0;
        int i2 = 0;
        while (i < iM1042getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i2), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(flatMapIndexedTo, i))));
            i++;
            i2++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1589flatMapIndexedToQqktQ3k(short[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(flatMapIndexedTo);
        int i = 0;
        int i2 = 0;
        while (i < iM1226getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i2), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(flatMapIndexedTo, i))));
            i++;
            i2++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1590flatMapIndexedToeNpIKz8(byte[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(flatMapIndexedTo);
        int i = 0;
        int i2 = 0;
        while (i < iM963getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i2), UByte.m898boximpl(UByteArray.m962getw2LRezQ(flatMapIndexedTo, i))));
            i++;
            i2++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1591flatMapIndexedTope2Q0Dw(long[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(flatMapIndexedTo);
        int i = 0;
        int i2 = 0;
        while (i < iM1121getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i2), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(flatMapIndexedTo, i))));
            i++;
            i2++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMapTo-HqK1JgA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1592flatMapToHqK1JgA(long[] flatMapTo, C destination, Function1<? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(flatMapTo);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(flatMapTo, i))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMapTo-oEOeDjA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1593flatMapTooEOeDjA(short[] flatMapTo, C destination, Function1<? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(flatMapTo);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(flatMapTo, i))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMapTo-wU5IKMo, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1594flatMapTowU5IKMo(int[] flatMapTo, C destination, Function1<? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(flatMapTo);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(flatMapTo, i))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMapTo-wzUQCXU, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1595flatMapTowzUQCXU(byte[] flatMapTo, C destination, Function1<? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(flatMapTo);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(flatMapTo, i))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: fold-A8wKCXQ, reason: not valid java name */
    private static final <R> R m1596foldA8wKCXQ(long[] fold, R r2, Function2<? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(fold);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            r2 = operation.invoke(r2, ULong.m1054boximpl(ULongArray.m1120getsVKNKU(fold, i)));
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: fold-yXmHNn8, reason: not valid java name */
    private static final <R> R m1597foldyXmHNn8(byte[] fold, R r2, Function2<? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(fold);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            r2 = operation.invoke(r2, UByte.m898boximpl(UByteArray.m962getw2LRezQ(fold, i)));
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: fold-zi1B2BA, reason: not valid java name */
    private static final <R> R m1598foldzi1B2BA(int[] fold, R r2, Function2<? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(fold);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            r2 = operation.invoke(r2, UInt.m975boximpl(UIntArray.m1041getpVg5ArA(fold, i)));
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: fold-zww5nb8, reason: not valid java name */
    private static final <R> R m1599foldzww5nb8(short[] fold, R r2, Function2<? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(fold);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            r2 = operation.invoke(r2, UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(fold, i)));
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> R m1600foldIndexed3iWJZGE(byte[] foldIndexed, R r2, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(foldIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM963getSizeimpl) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, UByte.m898boximpl(UByteArray.m962getw2LRezQ(foldIndexed, i)));
            i++;
            i2++;
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldIndexed-bzxtMww, reason: not valid java name */
    private static final <R> R m1601foldIndexedbzxtMww(short[] foldIndexed, R r2, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(foldIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1226getSizeimpl) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(foldIndexed, i)));
            i++;
            i2++;
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> R m1602foldIndexedmwnnOCs(long[] foldIndexed, R r2, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(foldIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1121getSizeimpl) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, ULong.m1054boximpl(ULongArray.m1120getsVKNKU(foldIndexed, i)));
            i++;
            i2++;
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> R m1603foldIndexedyVwIW0Q(int[] foldIndexed, R r2, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(foldIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1042getSizeimpl) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, UInt.m975boximpl(UIntArray.m1041getpVg5ArA(foldIndexed, i)));
            i++;
            i2++;
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRight-A8wKCXQ, reason: not valid java name */
    private static final <R> R m1604foldRightA8wKCXQ(long[] foldRight, R r2, Function2<? super ULong, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r2 = operation.invoke(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(foldRight, lastIndex)), r2);
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRight-yXmHNn8, reason: not valid java name */
    private static final <R> R m1605foldRightyXmHNn8(byte[] foldRight, R r2, Function2<? super UByte, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r2 = operation.invoke(UByte.m898boximpl(UByteArray.m962getw2LRezQ(foldRight, lastIndex)), r2);
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRight-zi1B2BA, reason: not valid java name */
    private static final <R> R m1606foldRightzi1B2BA(int[] foldRight, R r2, Function2<? super UInt, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r2 = operation.invoke(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(foldRight, lastIndex)), r2);
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRight-zww5nb8, reason: not valid java name */
    private static final <R> R m1607foldRightzww5nb8(short[] foldRight, R r2, Function2<? super UShort, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r2 = operation.invoke(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(foldRight, lastIndex)), r2);
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRightIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> R m1608foldRightIndexed3iWJZGE(byte[] foldRightIndexed, R r2, Function3<? super Integer, ? super UByte, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r2 = operation.invoke(Integer.valueOf(lastIndex), UByte.m898boximpl(UByteArray.m962getw2LRezQ(foldRightIndexed, lastIndex)), r2);
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRightIndexed-bzxtMww, reason: not valid java name */
    private static final <R> R m1609foldRightIndexedbzxtMww(short[] foldRightIndexed, R r2, Function3<? super Integer, ? super UShort, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r2 = operation.invoke(Integer.valueOf(lastIndex), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(foldRightIndexed, lastIndex)), r2);
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRightIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> R m1610foldRightIndexedmwnnOCs(long[] foldRightIndexed, R r2, Function3<? super Integer, ? super ULong, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r2 = operation.invoke(Integer.valueOf(lastIndex), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(foldRightIndexed, lastIndex)), r2);
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRightIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> R m1611foldRightIndexedyVwIW0Q(int[] foldRightIndexed, R r2, Function3<? super Integer, ? super UInt, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r2 = operation.invoke(Integer.valueOf(lastIndex), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(foldRightIndexed, lastIndex)), r2);
        }
        return r2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEach-JOV_ifY, reason: not valid java name */
    private static final void m1612forEachJOV_ifY(byte[] forEach, Function1<? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(forEach);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            action.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(forEach, i)));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEach-MShoTSo, reason: not valid java name */
    private static final void m1613forEachMShoTSo(long[] forEach, Function1<? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(forEach);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            action.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(forEach, i)));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEach-jgv0xPQ, reason: not valid java name */
    private static final void m1614forEachjgv0xPQ(int[] forEach, Function1<? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(forEach);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            action.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(forEach, i)));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEach-xTcfx_M, reason: not valid java name */
    private static final void m1615forEachxTcfx_M(short[] forEach, Function1<? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(forEach);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            action.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(forEach, i)));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEachIndexed-ELGow60, reason: not valid java name */
    private static final void m1616forEachIndexedELGow60(byte[] forEachIndexed, Function2<? super Integer, ? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(forEachIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM963getSizeimpl) {
            action.invoke(Integer.valueOf(i2), UByte.m898boximpl(UByteArray.m962getw2LRezQ(forEachIndexed, i)));
            i++;
            i2++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEachIndexed-WyvcNBI, reason: not valid java name */
    private static final void m1617forEachIndexedWyvcNBI(int[] forEachIndexed, Function2<? super Integer, ? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(forEachIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1042getSizeimpl) {
            action.invoke(Integer.valueOf(i2), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(forEachIndexed, i)));
            i++;
            i2++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEachIndexed-s8dVfGU, reason: not valid java name */
    private static final void m1618forEachIndexeds8dVfGU(long[] forEachIndexed, Function2<? super Integer, ? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(forEachIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1121getSizeimpl) {
            action.invoke(Integer.valueOf(i2), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(forEachIndexed, i)));
            i++;
            i2++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEachIndexed-xzaTVY8, reason: not valid java name */
    private static final void m1619forEachIndexedxzaTVY8(short[] forEachIndexed, Function2<? super Integer, ? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(forEachIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1226getSizeimpl) {
            action.invoke(Integer.valueOf(i2), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(forEachIndexed, i)));
            i++;
            i2++;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices--ajY-9A, reason: not valid java name */
    public static final IntRange m1620getIndicesajY9A(@NotNull int[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(indices);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m1621getIndicesajY9A$annotations(int[] iArr) {
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-GBYM_sE, reason: not valid java name */
    public static final IntRange m1622getIndicesGBYM_sE(@NotNull byte[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(indices);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m1623getIndicesGBYM_sE$annotations(byte[] bArr) {
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-QwZRm1k, reason: not valid java name */
    public static final IntRange m1624getIndicesQwZRm1k(@NotNull long[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(indices);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m1625getIndicesQwZRm1k$annotations(long[] jArr) {
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-rL5Bavg, reason: not valid java name */
    public static final IntRange m1626getIndicesrL5Bavg(@NotNull short[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(indices);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m1627getIndicesrL5Bavg$annotations(short[] sArr) {
    }

    /* JADX INFO: renamed from: getLastIndex--ajY-9A, reason: not valid java name */
    public static final int m1628getLastIndexajY9A(@NotNull int[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m1629getLastIndexajY9A$annotations(int[] iArr) {
    }

    /* JADX INFO: renamed from: getLastIndex-GBYM_sE, reason: not valid java name */
    public static final int m1630getLastIndexGBYM_sE(@NotNull byte[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m1631getLastIndexGBYM_sE$annotations(byte[] bArr) {
    }

    /* JADX INFO: renamed from: getLastIndex-QwZRm1k, reason: not valid java name */
    public static final int m1632getLastIndexQwZRm1k(@NotNull long[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m1633getLastIndexQwZRm1k$annotations(long[] jArr) {
    }

    /* JADX INFO: renamed from: getLastIndex-rL5Bavg, reason: not valid java name */
    public static final int m1634getLastIndexrL5Bavg(@NotNull short[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m1635getLastIndexrL5Bavg$annotations(short[] sArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: getOrElse-CVVdw08, reason: not valid java name */
    private static final short m1636getOrElseCVVdw08(short[] getOrElse, int i, Function1<? super Integer, UShort> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i < 0 || i >= UShortArray.m1226getSizeimpl(getOrElse)) ? defaultValue.invoke2(Integer.valueOf(i)).m1217unboximpl() : UShortArray.m1225getMh2AYeg(getOrElse, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: getOrElse-QxvSvLU, reason: not valid java name */
    private static final int m1637getOrElseQxvSvLU(int[] getOrElse, int i, Function1<? super Integer, UInt> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i < 0 || i >= UIntArray.m1042getSizeimpl(getOrElse)) ? defaultValue.invoke2(Integer.valueOf(i)).m1033unboximpl() : UIntArray.m1041getpVg5ArA(getOrElse, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: getOrElse-Xw8i6dc, reason: not valid java name */
    private static final long m1638getOrElseXw8i6dc(long[] getOrElse, int i, Function1<? super Integer, ULong> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i < 0 || i >= ULongArray.m1121getSizeimpl(getOrElse)) ? defaultValue.invoke2(Integer.valueOf(i)).m1112unboximpl() : ULongArray.m1120getsVKNKU(getOrElse, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: getOrElse-cO-VybQ, reason: not valid java name */
    private static final byte m1639getOrElsecOVybQ(byte[] getOrElse, int i, Function1<? super Integer, UByte> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i < 0 || i >= UByteArray.m963getSizeimpl(getOrElse)) ? defaultValue.invoke2(Integer.valueOf(i)).m954unboximpl() : UByteArray.m962getw2LRezQ(getOrElse, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-PpDY95g, reason: not valid java name */
    public static final UByte m1640getOrNullPpDY95g(@NotNull byte[] getOrNull, int i) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i < 0 || i >= UByteArray.m963getSizeimpl(getOrNull)) {
            return null;
        }
        return UByte.m898boximpl(UByteArray.m962getw2LRezQ(getOrNull, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-nggk6HY, reason: not valid java name */
    public static final UShort m1641getOrNullnggk6HY(@NotNull short[] getOrNull, int i) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i < 0 || i >= UShortArray.m1226getSizeimpl(getOrNull)) {
            return null;
        }
        return UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(getOrNull, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-qFRl0hI, reason: not valid java name */
    public static final UInt m1642getOrNullqFRl0hI(@NotNull int[] getOrNull, int i) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i < 0 || i >= UIntArray.m1042getSizeimpl(getOrNull)) {
            return null;
        }
        return UInt.m975boximpl(UIntArray.m1041getpVg5ArA(getOrNull, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-r7IrZao, reason: not valid java name */
    public static final ULong m1643getOrNullr7IrZao(@NotNull long[] getOrNull, int i) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i < 0 || i >= ULongArray.m1121getSizeimpl(getOrNull)) {
            return null;
        }
        return ULong.m1054boximpl(ULongArray.m1120getsVKNKU(getOrNull, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy--_j2Y-Q, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m1644groupBy_j2YQ(long[] groupBy, Function1<? super ULong, ? extends K> keySelector, Function1<? super ULong, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(groupBy);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(groupBy, i);
            K kInvoke2 = keySelector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU));
            List<V> arrayList = linkedHashMap.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke2, arrayList);
            }
            arrayList.add(valueTransform.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-3bBvP4M, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m1645groupBy3bBvP4M(short[] groupBy, Function1<? super UShort, ? extends K> keySelector, Function1<? super UShort, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(groupBy);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(groupBy, i);
            K kInvoke2 = keySelector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg));
            List<V> arrayList = linkedHashMap.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke2, arrayList);
            }
            arrayList.add(valueTransform.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-JOV_ifY, reason: not valid java name */
    private static final <K> Map<K, List<UByte>> m1646groupByJOV_ifY(byte[] groupBy, Function1<? super UByte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(groupBy);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(groupBy, i);
            K kInvoke2 = keySelector.invoke2(UByte.m898boximpl(bM962getw2LRezQ));
            Object arrayList = linkedHashMap.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(UByte.m898boximpl(bM962getw2LRezQ));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-L4rlFek, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m1647groupByL4rlFek(int[] groupBy, Function1<? super UInt, ? extends K> keySelector, Function1<? super UInt, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(groupBy);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(groupBy, i);
            K kInvoke2 = keySelector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA));
            List<V> arrayList = linkedHashMap.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke2, arrayList);
            }
            arrayList.add(valueTransform.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-MShoTSo, reason: not valid java name */
    private static final <K> Map<K, List<ULong>> m1648groupByMShoTSo(long[] groupBy, Function1<? super ULong, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(groupBy);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(groupBy, i);
            K kInvoke2 = keySelector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU));
            Object arrayList = linkedHashMap.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(ULong.m1054boximpl(jM1120getsVKNKU));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-bBsjw1Y, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m1649groupBybBsjw1Y(byte[] groupBy, Function1<? super UByte, ? extends K> keySelector, Function1<? super UByte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(groupBy);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(groupBy, i);
            K kInvoke2 = keySelector.invoke2(UByte.m898boximpl(bM962getw2LRezQ));
            List<V> arrayList = linkedHashMap.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke2, arrayList);
            }
            arrayList.add(valueTransform.invoke2(UByte.m898boximpl(bM962getw2LRezQ)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-jgv0xPQ, reason: not valid java name */
    private static final <K> Map<K, List<UInt>> m1650groupByjgv0xPQ(int[] groupBy, Function1<? super UInt, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(groupBy);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(groupBy, i);
            K kInvoke2 = keySelector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA));
            Object arrayList = linkedHashMap.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(UInt.m975boximpl(iM1041getpVg5ArA));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-xTcfx_M, reason: not valid java name */
    private static final <K> Map<K, List<UShort>> m1651groupByxTcfx_M(short[] groupBy, Function1<? super UShort, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(groupBy);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(groupBy, i);
            K kInvoke2 = keySelector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg));
            Object arrayList = linkedHashMap.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(UShort.m1161boximpl(sM1225getMh2AYeg));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-4D70W2E, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<UInt>>> M m1652groupByTo4D70W2E(int[] groupByTo, M destination, Function1<? super UInt, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(groupByTo);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(groupByTo, i);
            K kInvoke2 = keySelector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA));
            Object arrayList = destination.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(UInt.m975boximpl(iM1041getpVg5ArA));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-H21X9dk, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<UByte>>> M m1653groupByToH21X9dk(byte[] groupByTo, M destination, Function1<? super UByte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(groupByTo);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(groupByTo, i);
            K kInvoke2 = keySelector.invoke2(UByte.m898boximpl(bM962getw2LRezQ));
            Object arrayList = destination.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(UByte.m898boximpl(bM962getw2LRezQ));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-JM6gNCM, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m1654groupByToJM6gNCM(int[] groupByTo, M destination, Function1<? super UInt, ? extends K> keySelector, Function1<? super UInt, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(groupByTo);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(groupByTo, i);
            K kInvoke2 = keySelector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA));
            Object arrayList = destination.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-QxgOkWg, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m1655groupByToQxgOkWg(long[] groupByTo, M destination, Function1<? super ULong, ? extends K> keySelector, Function1<? super ULong, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(groupByTo);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(groupByTo, i);
            K kInvoke2 = keySelector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU));
            Object arrayList = destination.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-X6OPwNk, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<ULong>>> M m1656groupByToX6OPwNk(long[] groupByTo, M destination, Function1<? super ULong, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(groupByTo);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(groupByTo, i);
            K kInvoke2 = keySelector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU));
            Object arrayList = destination.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(ULong.m1054boximpl(jM1120getsVKNKU));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-ciTST-8, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<UShort>>> M m1657groupByTociTST8(short[] groupByTo, M destination, Function1<? super UShort, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(groupByTo);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(groupByTo, i);
            K kInvoke2 = keySelector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg));
            Object arrayList = destination.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(UShort.m1161boximpl(sM1225getMh2AYeg));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-q8RuPII, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m1658groupByToq8RuPII(short[] groupByTo, M destination, Function1<? super UShort, ? extends K> keySelector, Function1<? super UShort, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(groupByTo);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(groupByTo, i);
            K kInvoke2 = keySelector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg));
            Object arrayList = destination.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-qOZmbk8, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m1659groupByToqOZmbk8(byte[] groupByTo, M destination, Function1<? super UByte, ? extends K> keySelector, Function1<? super UByte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(groupByTo);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(groupByTo, i);
            K kInvoke2 = keySelector.invoke2(UByte.m898boximpl(bM962getw2LRezQ));
            Object arrayList = destination.get(kInvoke2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke2, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke2(UByte.m898boximpl(bM962getw2LRezQ)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOf-3uqUaXg, reason: not valid java name */
    private static final int m1660indexOf3uqUaXg(long[] indexOf, long j) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt___ArraysKt.indexOf(indexOf, j);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOf-XzdR7RA, reason: not valid java name */
    private static final int m1661indexOfXzdR7RA(short[] indexOf, short s) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt___ArraysKt.indexOf(indexOf, s);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOf-gMuBH34, reason: not valid java name */
    private static final int m1662indexOfgMuBH34(byte[] indexOf, byte b2) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt___ArraysKt.indexOf(indexOf, b2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOf-uWY9BYg, reason: not valid java name */
    private static final int m1663indexOfuWY9BYg(int[] indexOf, int i) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt___ArraysKt.indexOf(indexOf, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfFirst-JOV_ifY, reason: not valid java name */
    private static final int m1664indexOfFirstJOV_ifY(byte[] indexOfFirst, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i = 0; i < length; i++) {
            if (predicate.invoke2(UByte.m898boximpl(UByte.m904constructorimpl(indexOfFirst[i]))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfFirst-MShoTSo, reason: not valid java name */
    private static final int m1665indexOfFirstMShoTSo(long[] indexOfFirst, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i = 0; i < length; i++) {
            if (predicate.invoke2(ULong.m1054boximpl(ULong.m1060constructorimpl(indexOfFirst[i]))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfFirst-jgv0xPQ, reason: not valid java name */
    private static final int m1666indexOfFirstjgv0xPQ(int[] indexOfFirst, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i = 0; i < length; i++) {
            if (predicate.invoke2(UInt.m975boximpl(UInt.m981constructorimpl(indexOfFirst[i]))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfFirst-xTcfx_M, reason: not valid java name */
    private static final int m1667indexOfFirstxTcfx_M(short[] indexOfFirst, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i = 0; i < length; i++) {
            if (predicate.invoke2(UShort.m1161boximpl(UShort.m1167constructorimpl(indexOfFirst[i]))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfLast-JOV_ifY, reason: not valid java name */
    private static final int m1668indexOfLastJOV_ifY(byte[] indexOfLast, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (predicate.invoke2(UByte.m898boximpl(UByte.m904constructorimpl(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfLast-MShoTSo, reason: not valid java name */
    private static final int m1669indexOfLastMShoTSo(long[] indexOfLast, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (predicate.invoke2(ULong.m1054boximpl(ULong.m1060constructorimpl(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfLast-jgv0xPQ, reason: not valid java name */
    private static final int m1670indexOfLastjgv0xPQ(int[] indexOfLast, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (predicate.invoke2(UInt.m975boximpl(UInt.m981constructorimpl(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfLast-xTcfx_M, reason: not valid java name */
    private static final int m1671indexOfLastxTcfx_M(short[] indexOfLast, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (predicate.invoke2(UShort.m1161boximpl(UShort.m1167constructorimpl(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last--ajY-9A, reason: not valid java name */
    private static final int m1672lastajY9A(int[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return UInt.m981constructorimpl(ArraysKt___ArraysKt.last(last));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-GBYM_sE, reason: not valid java name */
    private static final byte m1673lastGBYM_sE(byte[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return UByte.m904constructorimpl(ArraysKt___ArraysKt.last(last));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-JOV_ifY, reason: not valid java name */
    private static final byte m1674lastJOV_ifY(byte[] last, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(last) - 1;
        if (iM963getSizeimpl >= 0) {
            while (true) {
                int i = iM963getSizeimpl - 1;
                byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(last, iM963getSizeimpl);
                if (predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                    return bM962getw2LRezQ;
                }
                if (i >= 0) {
                    iM963getSizeimpl = i;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-MShoTSo, reason: not valid java name */
    private static final long m1675lastMShoTSo(long[] last, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(last) - 1;
        if (iM1121getSizeimpl >= 0) {
            while (true) {
                int i = iM1121getSizeimpl - 1;
                long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(last, iM1121getSizeimpl);
                if (predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                    return jM1120getsVKNKU;
                }
                if (i >= 0) {
                    iM1121getSizeimpl = i;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-QwZRm1k, reason: not valid java name */
    private static final long m1676lastQwZRm1k(long[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return ULong.m1060constructorimpl(ArraysKt___ArraysKt.last(last));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-jgv0xPQ, reason: not valid java name */
    private static final int m1677lastjgv0xPQ(int[] last, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(last) - 1;
        if (iM1042getSizeimpl >= 0) {
            while (true) {
                int i = iM1042getSizeimpl - 1;
                int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(last, iM1042getSizeimpl);
                if (predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                    return iM1041getpVg5ArA;
                }
                if (i >= 0) {
                    iM1042getSizeimpl = i;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-rL5Bavg, reason: not valid java name */
    private static final short m1678lastrL5Bavg(short[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return UShort.m1167constructorimpl(ArraysKt___ArraysKt.last(last));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-xTcfx_M, reason: not valid java name */
    private static final short m1679lastxTcfx_M(short[] last, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(last) - 1;
        if (iM1226getSizeimpl >= 0) {
            while (true) {
                int i = iM1226getSizeimpl - 1;
                short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(last, iM1226getSizeimpl);
                if (predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                    return sM1225getMh2AYeg;
                }
                if (i >= 0) {
                    iM1226getSizeimpl = i;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastIndexOf-3uqUaXg, reason: not valid java name */
    private static final int m1680lastIndexOf3uqUaXg(long[] lastIndexOf, long j) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.lastIndexOf(lastIndexOf, j);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastIndexOf-XzdR7RA, reason: not valid java name */
    private static final int m1681lastIndexOfXzdR7RA(short[] lastIndexOf, short s) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.lastIndexOf(lastIndexOf, s);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastIndexOf-gMuBH34, reason: not valid java name */
    private static final int m1682lastIndexOfgMuBH34(byte[] lastIndexOf, byte b2) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.lastIndexOf(lastIndexOf, b2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastIndexOf-uWY9BYg, reason: not valid java name */
    private static final int m1683lastIndexOfuWY9BYg(int[] lastIndexOf, int i) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.lastIndexOf(lastIndexOf, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m1684lastOrNullajY9A(@NotNull int[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UIntArray.m1044isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UInt.m975boximpl(UIntArray.m1041getpVg5ArA(lastOrNull, UIntArray.m1042getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m1685lastOrNullGBYM_sE(@NotNull byte[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UByteArray.m965isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UByte.m898boximpl(UByteArray.m962getw2LRezQ(lastOrNull, UByteArray.m963getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastOrNull-JOV_ifY, reason: not valid java name */
    private static final UByte m1686lastOrNullJOV_ifY(byte[] lastOrNull, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(lastOrNull) - 1;
        if (iM963getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i = iM963getSizeimpl - 1;
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(lastOrNull, iM963getSizeimpl);
            if (predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                return UByte.m898boximpl(bM962getw2LRezQ);
            }
            if (i < 0) {
                return null;
            }
            iM963getSizeimpl = i;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastOrNull-MShoTSo, reason: not valid java name */
    private static final ULong m1687lastOrNullMShoTSo(long[] lastOrNull, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(lastOrNull) - 1;
        if (iM1121getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i = iM1121getSizeimpl - 1;
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(lastOrNull, iM1121getSizeimpl);
            if (predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                return ULong.m1054boximpl(jM1120getsVKNKU);
            }
            if (i < 0) {
                return null;
            }
            iM1121getSizeimpl = i;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m1688lastOrNullQwZRm1k(@NotNull long[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (ULongArray.m1123isEmptyimpl(lastOrNull)) {
            return null;
        }
        return ULong.m1054boximpl(ULongArray.m1120getsVKNKU(lastOrNull, ULongArray.m1121getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastOrNull-jgv0xPQ, reason: not valid java name */
    private static final UInt m1689lastOrNulljgv0xPQ(int[] lastOrNull, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(lastOrNull) - 1;
        if (iM1042getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i = iM1042getSizeimpl - 1;
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(lastOrNull, iM1042getSizeimpl);
            if (predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                return UInt.m975boximpl(iM1041getpVg5ArA);
            }
            if (i < 0) {
                return null;
            }
            iM1042getSizeimpl = i;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m1690lastOrNullrL5Bavg(@NotNull short[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UShortArray.m1228isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(lastOrNull, UShortArray.m1226getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastOrNull-xTcfx_M, reason: not valid java name */
    private static final UShort m1691lastOrNullxTcfx_M(short[] lastOrNull, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(lastOrNull) - 1;
        if (iM1226getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i = iM1226getSizeimpl - 1;
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(lastOrNull, iM1226getSizeimpl);
            if (predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                return UShort.m1161boximpl(sM1225getMh2AYeg);
            }
            if (i < 0) {
                return null;
            }
            iM1226getSizeimpl = i;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: map-JOV_ifY, reason: not valid java name */
    private static final <R> List<R> m1692mapJOV_ifY(byte[] map, Function1<? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UByteArray.m963getSizeimpl(map));
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(map);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            arrayList.add(transform.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(map, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: map-MShoTSo, reason: not valid java name */
    private static final <R> List<R> m1693mapMShoTSo(long[] map, Function1<? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(ULongArray.m1121getSizeimpl(map));
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(map);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            arrayList.add(transform.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(map, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: map-jgv0xPQ, reason: not valid java name */
    private static final <R> List<R> m1694mapjgv0xPQ(int[] map, Function1<? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UIntArray.m1042getSizeimpl(map));
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(map);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            arrayList.add(transform.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(map, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: map-xTcfx_M, reason: not valid java name */
    private static final <R> List<R> m1695mapxTcfx_M(short[] map, Function1<? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UShortArray.m1226getSizeimpl(map));
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(map);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            arrayList.add(transform.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(map, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexed-ELGow60, reason: not valid java name */
    private static final <R> List<R> m1696mapIndexedELGow60(byte[] mapIndexed, Function2<? super Integer, ? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UByteArray.m963getSizeimpl(mapIndexed));
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(mapIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM963getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i2), UByte.m898boximpl(UByteArray.m962getw2LRezQ(mapIndexed, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexed-WyvcNBI, reason: not valid java name */
    private static final <R> List<R> m1697mapIndexedWyvcNBI(int[] mapIndexed, Function2<? super Integer, ? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UIntArray.m1042getSizeimpl(mapIndexed));
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(mapIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1042getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i2), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(mapIndexed, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexed-s8dVfGU, reason: not valid java name */
    private static final <R> List<R> m1698mapIndexeds8dVfGU(long[] mapIndexed, Function2<? super Integer, ? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(ULongArray.m1121getSizeimpl(mapIndexed));
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(mapIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1121getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i2), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(mapIndexed, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexed-xzaTVY8, reason: not valid java name */
    private static final <R> List<R> m1699mapIndexedxzaTVY8(short[] mapIndexed, Function2<? super Integer, ? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UShortArray.m1226getSizeimpl(mapIndexed));
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(mapIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1226getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i2), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(mapIndexed, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexedTo--6EtJGI, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1700mapIndexedTo6EtJGI(int[] mapIndexedTo, C destination, Function2<? super Integer, ? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(mapIndexedTo);
        int i = 0;
        int i2 = 0;
        while (i < iM1042getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i2), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(mapIndexedTo, i))));
            i++;
            i2++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1701mapIndexedToQqktQ3k(short[] mapIndexedTo, C destination, Function2<? super Integer, ? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(mapIndexedTo);
        int i = 0;
        int i2 = 0;
        while (i < iM1226getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i2), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(mapIndexedTo, i))));
            i++;
            i2++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1702mapIndexedToeNpIKz8(byte[] mapIndexedTo, C destination, Function2<? super Integer, ? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(mapIndexedTo);
        int i = 0;
        int i2 = 0;
        while (i < iM963getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i2), UByte.m898boximpl(UByteArray.m962getw2LRezQ(mapIndexedTo, i))));
            i++;
            i2++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1703mapIndexedTope2Q0Dw(long[] mapIndexedTo, C destination, Function2<? super Integer, ? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(mapIndexedTo);
        int i = 0;
        int i2 = 0;
        while (i < iM1121getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i2), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(mapIndexedTo, i))));
            i++;
            i2++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapTo-HqK1JgA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1704mapToHqK1JgA(long[] mapTo, C destination, Function1<? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(mapTo);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            destination.add(transform.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(mapTo, i))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapTo-oEOeDjA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1705mapTooEOeDjA(short[] mapTo, C destination, Function1<? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(mapTo);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            destination.add(transform.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(mapTo, i))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapTo-wU5IKMo, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1706mapTowU5IKMo(int[] mapTo, C destination, Function1<? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(mapTo);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            destination.add(transform.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(mapTo, i))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapTo-wzUQCXU, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1707mapTowzUQCXU(byte[] mapTo, C destination, Function1<? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(mapTo);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            destination.add(transform.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(mapTo, i))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: maxByOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UByte m1708maxByOrNullJOV_ifY(byte[] maxByOrNull, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(maxByOrNull)) {
            return null;
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(maxByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return UByte.m898boximpl(bM962getw2LRezQ);
        }
        R rInvoke2 = selector.invoke2(UByte.m898boximpl(bM962getw2LRezQ));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(maxByOrNull, i);
                R rInvoke3 = selector.invoke2(UByte.m898boximpl(bM962getw2LRezQ2));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    bM962getw2LRezQ = bM962getw2LRezQ2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m898boximpl(bM962getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: maxByOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> ULong m1709maxByOrNullMShoTSo(long[] maxByOrNull, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(maxByOrNull)) {
            return null;
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(maxByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return ULong.m1054boximpl(jM1120getsVKNKU);
        }
        R rInvoke2 = selector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(maxByOrNull, i);
                R rInvoke3 = selector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU2));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    jM1120getsVKNKU = jM1120getsVKNKU2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m1054boximpl(jM1120getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: maxByOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UInt m1710maxByOrNulljgv0xPQ(int[] maxByOrNull, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(maxByOrNull)) {
            return null;
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(maxByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return UInt.m975boximpl(iM1041getpVg5ArA);
        }
        R rInvoke2 = selector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(maxByOrNull, i);
                R rInvoke3 = selector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA2));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    iM1041getpVg5ArA = iM1041getpVg5ArA2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m975boximpl(iM1041getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: maxByOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UShort m1711maxByOrNullxTcfx_M(short[] maxByOrNull, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(maxByOrNull)) {
            return null;
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(maxByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return UShort.m1161boximpl(sM1225getMh2AYeg);
        }
        R rInvoke2 = selector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(maxByOrNull, i);
                R rInvoke3 = selector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg2));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    sM1225getMh2AYeg = sM1225getMh2AYeg2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m1161boximpl(sM1225getMh2AYeg);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "maxByOrThrow-U")
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m1713maxByOrThrowU(int[] maxBy, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(maxBy)) {
            throw new NoSuchElementException();
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(maxBy, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return iM1041getpVg5ArA;
        }
        R rInvoke2 = selector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(maxBy, i);
                R rInvoke3 = selector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA2));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    iM1041getpVg5ArA = iM1041getpVg5ArA2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM1041getpVg5ArA;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final double m1716maxOfJOV_ifY(byte[] maxOf, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOf, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOf, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final double m1719maxOfMShoTSo(long[] maxOf, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOf, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOf, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final double m1722maxOfjgv0xPQ(int[] maxOf, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOf, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOf, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final double m1725maxOfxTcfx_M(short[] maxOf, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOf, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOf, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Double m1729maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOfOrNull, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final Double m1732maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOfOrNull, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Double m1735maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOfOrNull, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Double m1738maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOfOrNull, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWith-5NtCtWE, reason: not valid java name */
    private static final <R> R m1740maxOfWith5NtCtWE(long[] maxOfWith, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke2 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOfWith, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWith);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOfWith, i)));
                if (comparator.compare(rInvoke2, rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWith-LTi4i_s, reason: not valid java name */
    private static final <R> R m1741maxOfWithLTi4i_s(byte[] maxOfWith, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke2 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOfWith, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWith);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOfWith, i)));
                if (comparator.compare(rInvoke2, rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWith-l8EHGbQ, reason: not valid java name */
    private static final <R> R m1742maxOfWithl8EHGbQ(short[] maxOfWith, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke2 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOfWith, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWith);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOfWith, i)));
                if (comparator.compare(rInvoke2, rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWith-myNOsp4, reason: not valid java name */
    private static final <R> R m1743maxOfWithmyNOsp4(int[] maxOfWith, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke2 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOfWith, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWith);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOfWith, i)));
                if (comparator.compare(rInvoke2, rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWithOrNull-5NtCtWE, reason: not valid java name */
    private static final <R> R m1744maxOfWithOrNull5NtCtWE(long[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOfWithOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOfWithOrNull, i)));
                if (comparator.compare(rInvoke2, rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWithOrNull-LTi4i_s, reason: not valid java name */
    private static final <R> R m1745maxOfWithOrNullLTi4i_s(byte[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOfWithOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOfWithOrNull, i)));
                if (comparator.compare(rInvoke2, rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWithOrNull-l8EHGbQ, reason: not valid java name */
    private static final <R> R m1746maxOfWithOrNulll8EHGbQ(short[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOfWithOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOfWithOrNull, i)));
                if (comparator.compare(rInvoke2, rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWithOrNull-myNOsp4, reason: not valid java name */
    private static final <R> R m1747maxOfWithOrNullmyNOsp4(int[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOfWithOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOfWithOrNull, i)));
                if (comparator.compare(rInvoke2, rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m1748maxOrNullajY9A(@NotNull int[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UIntArray.m1044isEmptyimpl(maxOrNull)) {
            return null;
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(maxOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(maxOrNull, i);
                if (Integer.compareUnsigned(iM1041getpVg5ArA, iM1041getpVg5ArA2) < 0) {
                    iM1041getpVg5ArA = iM1041getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m975boximpl(iM1041getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m1749maxOrNullGBYM_sE(@NotNull byte[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UByteArray.m965isEmptyimpl(maxOrNull)) {
            return null;
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(maxOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(maxOrNull, i);
                if (Intrinsics.compare(bM962getw2LRezQ & 255, bM962getw2LRezQ2 & 255) < 0) {
                    bM962getw2LRezQ = bM962getw2LRezQ2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m898boximpl(bM962getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m1750maxOrNullQwZRm1k(@NotNull long[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (ULongArray.m1123isEmptyimpl(maxOrNull)) {
            return null;
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(maxOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(maxOrNull, i);
                if (Long.compareUnsigned(jM1120getsVKNKU, jM1120getsVKNKU2) < 0) {
                    jM1120getsVKNKU = jM1120getsVKNKU2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m1054boximpl(jM1120getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m1751maxOrNullrL5Bavg(@NotNull short[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UShortArray.m1228isEmptyimpl(maxOrNull)) {
            return null;
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(maxOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(maxOrNull, i);
                if (Intrinsics.compare(sM1225getMh2AYeg & UShort.MAX_VALUE, 65535 & sM1225getMh2AYeg2) < 0) {
                    sM1225getMh2AYeg = sM1225getMh2AYeg2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m1161boximpl(sM1225getMh2AYeg);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final int m1753maxOrThrowU(@NotNull int[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (UIntArray.m1044isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(max, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(max);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(max, i);
                if (Integer.compareUnsigned(iM1041getpVg5ArA, iM1041getpVg5ArA2) < 0) {
                    iM1041getpVg5ArA = iM1041getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM1041getpVg5ArA;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-XMRcp5o, reason: not valid java name */
    public static final UByte m1756maxWithOrNullXMRcp5o(@NotNull byte[] maxWithOrNull, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m965isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(maxWithOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(maxWithOrNull, i);
                if (comparator.compare(UByte.m898boximpl(bM962getw2LRezQ), UByte.m898boximpl(bM962getw2LRezQ2)) < 0) {
                    bM962getw2LRezQ = bM962getw2LRezQ2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m898boximpl(bM962getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final UInt m1757maxWithOrNullYmdZ_VM(@NotNull int[] maxWithOrNull, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m1044isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(maxWithOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(maxWithOrNull, i);
                if (comparator.compare(UInt.m975boximpl(iM1041getpVg5ArA), UInt.m975boximpl(iM1041getpVg5ArA2)) < 0) {
                    iM1041getpVg5ArA = iM1041getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m975boximpl(iM1041getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-eOHTfZs, reason: not valid java name */
    public static final UShort m1758maxWithOrNulleOHTfZs(@NotNull short[] maxWithOrNull, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m1228isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(maxWithOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(maxWithOrNull, i);
                if (comparator.compare(UShort.m1161boximpl(sM1225getMh2AYeg), UShort.m1161boximpl(sM1225getMh2AYeg2)) < 0) {
                    sM1225getMh2AYeg = sM1225getMh2AYeg2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m1161boximpl(sM1225getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-zrEWJaI, reason: not valid java name */
    public static final ULong m1759maxWithOrNullzrEWJaI(@NotNull long[] maxWithOrNull, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m1123isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(maxWithOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(maxWithOrNull, i);
                if (comparator.compare(ULong.m1054boximpl(jM1120getsVKNKU), ULong.m1054boximpl(jM1120getsVKNKU2)) < 0) {
                    jM1120getsVKNKU = jM1120getsVKNKU2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m1054boximpl(jM1120getsVKNKU);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final int m1761maxWithOrThrowU(@NotNull int[] maxWith, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m1044isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(maxWith, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWith);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(maxWith, i);
                if (comparator.compare(UInt.m975boximpl(iM1041getpVg5ArA), UInt.m975boximpl(iM1041getpVg5ArA2)) < 0) {
                    iM1041getpVg5ArA = iM1041getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM1041getpVg5ArA;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: minByOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UByte m1764minByOrNullJOV_ifY(byte[] minByOrNull, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(minByOrNull)) {
            return null;
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(minByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return UByte.m898boximpl(bM962getw2LRezQ);
        }
        R rInvoke2 = selector.invoke2(UByte.m898boximpl(bM962getw2LRezQ));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(minByOrNull, i);
                R rInvoke3 = selector.invoke2(UByte.m898boximpl(bM962getw2LRezQ2));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    bM962getw2LRezQ = bM962getw2LRezQ2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m898boximpl(bM962getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: minByOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> ULong m1765minByOrNullMShoTSo(long[] minByOrNull, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(minByOrNull)) {
            return null;
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(minByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return ULong.m1054boximpl(jM1120getsVKNKU);
        }
        R rInvoke2 = selector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(minByOrNull, i);
                R rInvoke3 = selector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU2));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    jM1120getsVKNKU = jM1120getsVKNKU2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m1054boximpl(jM1120getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: minByOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UInt m1766minByOrNulljgv0xPQ(int[] minByOrNull, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(minByOrNull)) {
            return null;
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(minByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return UInt.m975boximpl(iM1041getpVg5ArA);
        }
        R rInvoke2 = selector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(minByOrNull, i);
                R rInvoke3 = selector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA2));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    iM1041getpVg5ArA = iM1041getpVg5ArA2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m975boximpl(iM1041getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: minByOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UShort m1767minByOrNullxTcfx_M(short[] minByOrNull, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(minByOrNull)) {
            return null;
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(minByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return UShort.m1161boximpl(sM1225getMh2AYeg);
        }
        R rInvoke2 = selector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(minByOrNull, i);
                R rInvoke3 = selector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg2));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    sM1225getMh2AYeg = sM1225getMh2AYeg2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m1161boximpl(sM1225getMh2AYeg);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "minByOrThrow-U")
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m1769minByOrThrowU(int[] minBy, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(minBy)) {
            throw new NoSuchElementException();
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(minBy, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return iM1041getpVg5ArA;
        }
        R rInvoke2 = selector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(minBy, i);
                R rInvoke3 = selector.invoke2(UInt.m975boximpl(iM1041getpVg5ArA2));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    iM1041getpVg5ArA = iM1041getpVg5ArA2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM1041getpVg5ArA;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final double m1772minOfJOV_ifY(byte[] minOf, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOf, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOf, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final double m1775minOfMShoTSo(long[] minOf, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOf, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOf, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final double m1778minOfjgv0xPQ(int[] minOf, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOf, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOf, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final double m1781minOfxTcfx_M(short[] minOf, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOf, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOf, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Double m1785minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOfOrNull, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final Double m1788minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOfOrNull, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Double m1791minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOfOrNull, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Double m1794minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOfOrNull, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOfOrNull, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWith-5NtCtWE, reason: not valid java name */
    private static final <R> R m1796minOfWith5NtCtWE(long[] minOfWith, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke2 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOfWith, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWith);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOfWith, i)));
                if (comparator.compare(rInvoke2, rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWith-LTi4i_s, reason: not valid java name */
    private static final <R> R m1797minOfWithLTi4i_s(byte[] minOfWith, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke2 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOfWith, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWith);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOfWith, i)));
                if (comparator.compare(rInvoke2, rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWith-l8EHGbQ, reason: not valid java name */
    private static final <R> R m1798minOfWithl8EHGbQ(short[] minOfWith, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke2 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOfWith, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWith);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOfWith, i)));
                if (comparator.compare(rInvoke2, rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWith-myNOsp4, reason: not valid java name */
    private static final <R> R m1799minOfWithmyNOsp4(int[] minOfWith, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke2 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOfWith, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWith);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOfWith, i)));
                if (comparator.compare(rInvoke2, rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWithOrNull-5NtCtWE, reason: not valid java name */
    private static final <R> R m1800minOfWithOrNull5NtCtWE(long[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOfWithOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOfWithOrNull, i)));
                if (comparator.compare(rInvoke2, rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWithOrNull-LTi4i_s, reason: not valid java name */
    private static final <R> R m1801minOfWithOrNullLTi4i_s(byte[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOfWithOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOfWithOrNull, i)));
                if (comparator.compare(rInvoke2, rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWithOrNull-l8EHGbQ, reason: not valid java name */
    private static final <R> R m1802minOfWithOrNulll8EHGbQ(short[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOfWithOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOfWithOrNull, i)));
                if (comparator.compare(rInvoke2, rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWithOrNull-myNOsp4, reason: not valid java name */
    private static final <R> R m1803minOfWithOrNullmyNOsp4(int[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOfWithOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOfWithOrNull, i)));
                if (comparator.compare(rInvoke2, rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m1804minOrNullajY9A(@NotNull int[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UIntArray.m1044isEmptyimpl(minOrNull)) {
            return null;
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(minOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(minOrNull, i);
                if (Integer.compareUnsigned(iM1041getpVg5ArA, iM1041getpVg5ArA2) > 0) {
                    iM1041getpVg5ArA = iM1041getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m975boximpl(iM1041getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m1805minOrNullGBYM_sE(@NotNull byte[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UByteArray.m965isEmptyimpl(minOrNull)) {
            return null;
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(minOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(minOrNull, i);
                if (Intrinsics.compare(bM962getw2LRezQ & 255, bM962getw2LRezQ2 & 255) > 0) {
                    bM962getw2LRezQ = bM962getw2LRezQ2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m898boximpl(bM962getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m1806minOrNullQwZRm1k(@NotNull long[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (ULongArray.m1123isEmptyimpl(minOrNull)) {
            return null;
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(minOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(minOrNull, i);
                if (Long.compareUnsigned(jM1120getsVKNKU, jM1120getsVKNKU2) > 0) {
                    jM1120getsVKNKU = jM1120getsVKNKU2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m1054boximpl(jM1120getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m1807minOrNullrL5Bavg(@NotNull short[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UShortArray.m1228isEmptyimpl(minOrNull)) {
            return null;
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(minOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(minOrNull, i);
                if (Intrinsics.compare(sM1225getMh2AYeg & UShort.MAX_VALUE, 65535 & sM1225getMh2AYeg2) > 0) {
                    sM1225getMh2AYeg = sM1225getMh2AYeg2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m1161boximpl(sM1225getMh2AYeg);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final int m1809minOrThrowU(@NotNull int[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (UIntArray.m1044isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(min, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(min);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(min, i);
                if (Integer.compareUnsigned(iM1041getpVg5ArA, iM1041getpVg5ArA2) > 0) {
                    iM1041getpVg5ArA = iM1041getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM1041getpVg5ArA;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-XMRcp5o, reason: not valid java name */
    public static final UByte m1812minWithOrNullXMRcp5o(@NotNull byte[] minWithOrNull, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m965isEmptyimpl(minWithOrNull)) {
            return null;
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(minWithOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(minWithOrNull, i);
                if (comparator.compare(UByte.m898boximpl(bM962getw2LRezQ), UByte.m898boximpl(bM962getw2LRezQ2)) > 0) {
                    bM962getw2LRezQ = bM962getw2LRezQ2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m898boximpl(bM962getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final UInt m1813minWithOrNullYmdZ_VM(@NotNull int[] minWithOrNull, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m1044isEmptyimpl(minWithOrNull)) {
            return null;
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(minWithOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(minWithOrNull, i);
                if (comparator.compare(UInt.m975boximpl(iM1041getpVg5ArA), UInt.m975boximpl(iM1041getpVg5ArA2)) > 0) {
                    iM1041getpVg5ArA = iM1041getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m975boximpl(iM1041getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-eOHTfZs, reason: not valid java name */
    public static final UShort m1814minWithOrNulleOHTfZs(@NotNull short[] minWithOrNull, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m1228isEmptyimpl(minWithOrNull)) {
            return null;
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(minWithOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(minWithOrNull, i);
                if (comparator.compare(UShort.m1161boximpl(sM1225getMh2AYeg), UShort.m1161boximpl(sM1225getMh2AYeg2)) > 0) {
                    sM1225getMh2AYeg = sM1225getMh2AYeg2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m1161boximpl(sM1225getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-zrEWJaI, reason: not valid java name */
    public static final ULong m1815minWithOrNullzrEWJaI(@NotNull long[] minWithOrNull, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m1123isEmptyimpl(minWithOrNull)) {
            return null;
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(minWithOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minWithOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(minWithOrNull, i);
                if (comparator.compare(ULong.m1054boximpl(jM1120getsVKNKU), ULong.m1054boximpl(jM1120getsVKNKU2)) > 0) {
                    jM1120getsVKNKU = jM1120getsVKNKU2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m1054boximpl(jM1120getsVKNKU);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final int m1817minWithOrThrowU(@NotNull int[] minWith, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m1044isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(minWith, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minWith);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(minWith, i);
                if (comparator.compare(UInt.m975boximpl(iM1041getpVg5ArA), UInt.m975boximpl(iM1041getpVg5ArA2)) > 0) {
                    iM1041getpVg5ArA = iM1041getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM1041getpVg5ArA;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none--ajY-9A, reason: not valid java name */
    private static final boolean m1820noneajY9A(int[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return UIntArray.m1044isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-GBYM_sE, reason: not valid java name */
    private static final boolean m1821noneGBYM_sE(byte[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return UByteArray.m965isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-JOV_ifY, reason: not valid java name */
    private static final boolean m1822noneJOV_ifY(byte[] none, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(none);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            if (predicate.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(none, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-MShoTSo, reason: not valid java name */
    private static final boolean m1823noneMShoTSo(long[] none, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(none);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            if (predicate.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(none, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-QwZRm1k, reason: not valid java name */
    private static final boolean m1824noneQwZRm1k(long[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return ULongArray.m1123isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-jgv0xPQ, reason: not valid java name */
    private static final boolean m1825nonejgv0xPQ(int[] none, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(none);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            if (predicate.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(none, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-rL5Bavg, reason: not valid java name */
    private static final boolean m1826nonerL5Bavg(short[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return UShortArray.m1228isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-xTcfx_M, reason: not valid java name */
    private static final boolean m1827nonexTcfx_M(short[] none, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(none);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            if (predicate.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(none, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEach-JOV_ifY, reason: not valid java name */
    private static final byte[] m1828onEachJOV_ifY(byte[] onEach, Function1<? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(onEach);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            action.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(onEach, i)));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEach-MShoTSo, reason: not valid java name */
    private static final long[] m1829onEachMShoTSo(long[] onEach, Function1<? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(onEach);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            action.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(onEach, i)));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEach-jgv0xPQ, reason: not valid java name */
    private static final int[] m1830onEachjgv0xPQ(int[] onEach, Function1<? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(onEach);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            action.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(onEach, i)));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEach-xTcfx_M, reason: not valid java name */
    private static final short[] m1831onEachxTcfx_M(short[] onEach, Function1<? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(onEach);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            action.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(onEach, i)));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEachIndexed-ELGow60, reason: not valid java name */
    private static final byte[] m1832onEachIndexedELGow60(byte[] onEachIndexed, Function2<? super Integer, ? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(onEachIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM963getSizeimpl) {
            action.invoke(Integer.valueOf(i2), UByte.m898boximpl(UByteArray.m962getw2LRezQ(onEachIndexed, i)));
            i++;
            i2++;
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEachIndexed-WyvcNBI, reason: not valid java name */
    private static final int[] m1833onEachIndexedWyvcNBI(int[] onEachIndexed, Function2<? super Integer, ? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(onEachIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1042getSizeimpl) {
            action.invoke(Integer.valueOf(i2), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(onEachIndexed, i)));
            i++;
            i2++;
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEachIndexed-s8dVfGU, reason: not valid java name */
    private static final long[] m1834onEachIndexeds8dVfGU(long[] onEachIndexed, Function2<? super Integer, ? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(onEachIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1121getSizeimpl) {
            action.invoke(Integer.valueOf(i2), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(onEachIndexed, i)));
            i++;
            i2++;
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEachIndexed-xzaTVY8, reason: not valid java name */
    private static final short[] m1835onEachIndexedxzaTVY8(short[] onEachIndexed, Function2<? super Integer, ? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(onEachIndexed);
        int i = 0;
        int i2 = 0;
        while (i < iM1226getSizeimpl) {
            action.invoke(Integer.valueOf(i2), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(onEachIndexed, i)));
            i++;
            i2++;
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-3uqUaXg, reason: not valid java name */
    private static final long[] m1836plus3uqUaXg(long[] plus, long j) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return ULongArray.m1115constructorimpl(ArraysKt___ArraysJvmKt.plus(plus, j));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-CFIt9YE, reason: not valid java name */
    public static final int[] m1837plusCFIt9YE(@NotNull int[] plus, @NotNull Collection<UInt> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(plus);
        int[] iArrCopyOf = Arrays.copyOf(plus, UIntArray.m1042getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        Iterator<UInt> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[iM1042getSizeimpl] = it.next().m1033unboximpl();
            iM1042getSizeimpl++;
        }
        return UIntArray.m1036constructorimpl(iArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-XzdR7RA, reason: not valid java name */
    private static final short[] m1838plusXzdR7RA(short[] plus, short s) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return UShortArray.m1220constructorimpl(ArraysKt___ArraysJvmKt.plus(plus, s));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-ctEhBpI, reason: not valid java name */
    private static final int[] m1839plusctEhBpI(int[] plus, int[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UIntArray.m1036constructorimpl(ArraysKt___ArraysJvmKt.plus(plus, elements));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-gMuBH34, reason: not valid java name */
    private static final byte[] m1840plusgMuBH34(byte[] plus, byte b2) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return UByteArray.m957constructorimpl(ArraysKt___ArraysJvmKt.plus(plus, b2));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-kdPth3s, reason: not valid java name */
    private static final byte[] m1841pluskdPth3s(byte[] plus, byte[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UByteArray.m957constructorimpl(ArraysKt___ArraysJvmKt.plus(plus, elements));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-kzHmqpY, reason: not valid java name */
    public static final long[] m1842pluskzHmqpY(@NotNull long[] plus, @NotNull Collection<ULong> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(plus);
        long[] jArrCopyOf = Arrays.copyOf(plus, ULongArray.m1121getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        Iterator<ULong> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[iM1121getSizeimpl] = it.next().m1112unboximpl();
            iM1121getSizeimpl++;
        }
        return ULongArray.m1115constructorimpl(jArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-mazbYpA, reason: not valid java name */
    private static final short[] m1843plusmazbYpA(short[] plus, short[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UShortArray.m1220constructorimpl(ArraysKt___ArraysJvmKt.plus(plus, elements));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-ojwP5H8, reason: not valid java name */
    public static final short[] m1844plusojwP5H8(@NotNull short[] plus, @NotNull Collection<UShort> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(plus);
        short[] sArrCopyOf = Arrays.copyOf(plus, UShortArray.m1226getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        Iterator<UShort> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[iM1226getSizeimpl] = it.next().m1217unboximpl();
            iM1226getSizeimpl++;
        }
        return UShortArray.m1220constructorimpl(sArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-uWY9BYg, reason: not valid java name */
    private static final int[] m1845plusuWY9BYg(int[] plus, int i) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return UIntArray.m1036constructorimpl(ArraysKt___ArraysJvmKt.plus(plus, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-us8wMrg, reason: not valid java name */
    private static final long[] m1846plusus8wMrg(long[] plus, long[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ULongArray.m1115constructorimpl(ArraysKt___ArraysJvmKt.plus(plus, elements));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-xo_DsdI, reason: not valid java name */
    public static final byte[] m1847plusxo_DsdI(@NotNull byte[] plus, @NotNull Collection<UByte> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(plus);
        byte[] bArrCopyOf = Arrays.copyOf(plus, UByteArray.m963getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        Iterator<UByte> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[iM963getSizeimpl] = it.next().m954unboximpl();
            iM963getSizeimpl++;
        }
        return UByteArray.m957constructorimpl(bArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: random--ajY-9A, reason: not valid java name */
    private static final int m1848randomajY9A(int[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m1849random2D5oskM(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-2D5oskM, reason: not valid java name */
    public static final int m1849random2D5oskM(@NotNull int[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (UIntArray.m1044isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UIntArray.m1041getpVg5ArA(random, random2.nextInt(UIntArray.m1042getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: random-GBYM_sE, reason: not valid java name */
    private static final byte m1850randomGBYM_sE(byte[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m1853randomoSF2wD8(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-JzugnMA, reason: not valid java name */
    public static final long m1851randomJzugnMA(@NotNull long[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (ULongArray.m1123isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return ULongArray.m1120getsVKNKU(random, random2.nextInt(ULongArray.m1121getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: random-QwZRm1k, reason: not valid java name */
    private static final long m1852randomQwZRm1k(long[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m1851randomJzugnMA(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-oSF2wD8, reason: not valid java name */
    public static final byte m1853randomoSF2wD8(@NotNull byte[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (UByteArray.m965isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UByteArray.m962getw2LRezQ(random, random2.nextInt(UByteArray.m963getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: random-rL5Bavg, reason: not valid java name */
    private static final short m1854randomrL5Bavg(short[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m1855randoms5X_as8(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-s5X_as8, reason: not valid java name */
    public static final short m1855randoms5X_as8(@NotNull short[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (UShortArray.m1228isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UShortArray.m1225getMh2AYeg(random, random2.nextInt(UShortArray.m1226getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: randomOrNull--ajY-9A, reason: not valid java name */
    private static final UInt m1856randomOrNullajY9A(int[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m1857randomOrNull2D5oskM(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: randomOrNull-2D5oskM, reason: not valid java name */
    public static final UInt m1857randomOrNull2D5oskM(@NotNull int[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UIntArray.m1044isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UInt.m975boximpl(UIntArray.m1041getpVg5ArA(randomOrNull, random.nextInt(UIntArray.m1042getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: randomOrNull-GBYM_sE, reason: not valid java name */
    private static final UByte m1858randomOrNullGBYM_sE(byte[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m1861randomOrNulloSF2wD8(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: randomOrNull-JzugnMA, reason: not valid java name */
    public static final ULong m1859randomOrNullJzugnMA(@NotNull long[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (ULongArray.m1123isEmptyimpl(randomOrNull)) {
            return null;
        }
        return ULong.m1054boximpl(ULongArray.m1120getsVKNKU(randomOrNull, random.nextInt(ULongArray.m1121getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: randomOrNull-QwZRm1k, reason: not valid java name */
    private static final ULong m1860randomOrNullQwZRm1k(long[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m1859randomOrNullJzugnMA(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: randomOrNull-oSF2wD8, reason: not valid java name */
    public static final UByte m1861randomOrNulloSF2wD8(@NotNull byte[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UByteArray.m965isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UByte.m898boximpl(UByteArray.m962getw2LRezQ(randomOrNull, random.nextInt(UByteArray.m963getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: randomOrNull-rL5Bavg, reason: not valid java name */
    private static final UShort m1862randomOrNullrL5Bavg(short[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m1863randomOrNulls5X_as8(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: randomOrNull-s5X_as8, reason: not valid java name */
    public static final UShort m1863randomOrNulls5X_as8(@NotNull short[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UShortArray.m1228isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(randomOrNull, random.nextInt(UShortArray.m1226getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduce-ELGow60, reason: not valid java name */
    private static final byte m1864reduceELGow60(byte[] reduce, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m965isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(reduce, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduce);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                bM962getw2LRezQ = operation.invoke(UByte.m898boximpl(bM962getw2LRezQ), UByte.m898boximpl(UByteArray.m962getw2LRezQ(reduce, i))).m954unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return bM962getw2LRezQ;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduce-WyvcNBI, reason: not valid java name */
    private static final int m1865reduceWyvcNBI(int[] reduce, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m1044isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(reduce, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduce);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                iM1041getpVg5ArA = operation.invoke(UInt.m975boximpl(iM1041getpVg5ArA), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(reduce, i))).m1033unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM1041getpVg5ArA;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduce-s8dVfGU, reason: not valid java name */
    private static final long m1866reduces8dVfGU(long[] reduce, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m1123isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(reduce, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduce);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                jM1120getsVKNKU = operation.invoke(ULong.m1054boximpl(jM1120getsVKNKU), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(reduce, i))).m1112unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return jM1120getsVKNKU;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduce-xzaTVY8, reason: not valid java name */
    private static final short m1867reducexzaTVY8(short[] reduce, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m1228isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(reduce, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduce);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sM1225getMh2AYeg = operation.invoke(UShort.m1161boximpl(sM1225getMh2AYeg), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(reduce, i))).m1217unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sM1225getMh2AYeg;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexed-D40WMg8, reason: not valid java name */
    private static final int m1868reduceIndexedD40WMg8(int[] reduceIndexed, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m1044isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(reduceIndexed, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexed);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                iM1041getpVg5ArA = operation.invoke(Integer.valueOf(i), UInt.m975boximpl(iM1041getpVg5ArA), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(reduceIndexed, i))).m1033unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return iM1041getpVg5ArA;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexed-EOyYB1Y, reason: not valid java name */
    private static final byte m1869reduceIndexedEOyYB1Y(byte[] reduceIndexed, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m965isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(reduceIndexed, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexed);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                bM962getw2LRezQ = operation.invoke(Integer.valueOf(i), UByte.m898boximpl(bM962getw2LRezQ), UByte.m898boximpl(UByteArray.m962getw2LRezQ(reduceIndexed, i))).m954unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return bM962getw2LRezQ;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexed-aLgx1Fo, reason: not valid java name */
    private static final short m1870reduceIndexedaLgx1Fo(short[] reduceIndexed, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m1228isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(reduceIndexed, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexed);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sM1225getMh2AYeg = operation.invoke(Integer.valueOf(i), UShort.m1161boximpl(sM1225getMh2AYeg), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(reduceIndexed, i))).m1217unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sM1225getMh2AYeg;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexed-z1zDJgo, reason: not valid java name */
    private static final long m1871reduceIndexedz1zDJgo(long[] reduceIndexed, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m1123isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(reduceIndexed, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexed);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                jM1120getsVKNKU = operation.invoke(Integer.valueOf(i), ULong.m1054boximpl(jM1120getsVKNKU), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(reduceIndexed, i))).m1112unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return jM1120getsVKNKU;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexedOrNull-D40WMg8, reason: not valid java name */
    private static final UInt m1872reduceIndexedOrNullD40WMg8(int[] reduceIndexedOrNull, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m1044isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(reduceIndexedOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexedOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                iM1041getpVg5ArA = operation.invoke(Integer.valueOf(i), UInt.m975boximpl(iM1041getpVg5ArA), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(reduceIndexedOrNull, i))).m1033unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m975boximpl(iM1041getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexedOrNull-EOyYB1Y, reason: not valid java name */
    private static final UByte m1873reduceIndexedOrNullEOyYB1Y(byte[] reduceIndexedOrNull, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m965isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(reduceIndexedOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexedOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                bM962getw2LRezQ = operation.invoke(Integer.valueOf(i), UByte.m898boximpl(bM962getw2LRezQ), UByte.m898boximpl(UByteArray.m962getw2LRezQ(reduceIndexedOrNull, i))).m954unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m898boximpl(bM962getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexedOrNull-aLgx1Fo, reason: not valid java name */
    private static final UShort m1874reduceIndexedOrNullaLgx1Fo(short[] reduceIndexedOrNull, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m1228isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(reduceIndexedOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexedOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sM1225getMh2AYeg = operation.invoke(Integer.valueOf(i), UShort.m1161boximpl(sM1225getMh2AYeg), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(reduceIndexedOrNull, i))).m1217unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m1161boximpl(sM1225getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexedOrNull-z1zDJgo, reason: not valid java name */
    private static final ULong m1875reduceIndexedOrNullz1zDJgo(long[] reduceIndexedOrNull, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m1123isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(reduceIndexedOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexedOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                jM1120getsVKNKU = operation.invoke(Integer.valueOf(i), ULong.m1054boximpl(jM1120getsVKNKU), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(reduceIndexedOrNull, i))).m1112unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m1054boximpl(jM1120getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceOrNull-ELGow60, reason: not valid java name */
    private static final UByte m1876reduceOrNullELGow60(byte[] reduceOrNull, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m965isEmptyimpl(reduceOrNull)) {
            return null;
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(reduceOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                bM962getw2LRezQ = operation.invoke(UByte.m898boximpl(bM962getw2LRezQ), UByte.m898boximpl(UByteArray.m962getw2LRezQ(reduceOrNull, i))).m954unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m898boximpl(bM962getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceOrNull-WyvcNBI, reason: not valid java name */
    private static final UInt m1877reduceOrNullWyvcNBI(int[] reduceOrNull, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m1044isEmptyimpl(reduceOrNull)) {
            return null;
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(reduceOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                iM1041getpVg5ArA = operation.invoke(UInt.m975boximpl(iM1041getpVg5ArA), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(reduceOrNull, i))).m1033unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m975boximpl(iM1041getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceOrNull-s8dVfGU, reason: not valid java name */
    private static final ULong m1878reduceOrNulls8dVfGU(long[] reduceOrNull, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m1123isEmptyimpl(reduceOrNull)) {
            return null;
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(reduceOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                jM1120getsVKNKU = operation.invoke(ULong.m1054boximpl(jM1120getsVKNKU), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(reduceOrNull, i))).m1112unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m1054boximpl(jM1120getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceOrNull-xzaTVY8, reason: not valid java name */
    private static final UShort m1879reduceOrNullxzaTVY8(short[] reduceOrNull, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m1228isEmptyimpl(reduceOrNull)) {
            return null;
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(reduceOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sM1225getMh2AYeg = operation.invoke(UShort.m1161boximpl(sM1225getMh2AYeg), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(reduceOrNull, i))).m1217unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m1161boximpl(sM1225getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRight-ELGow60, reason: not valid java name */
    private static final byte m1880reduceRightELGow60(byte[] reduceRight, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(reduceRight, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            bM962getw2LRezQ = operation.invoke(UByte.m898boximpl(UByteArray.m962getw2LRezQ(reduceRight, i)), UByte.m898boximpl(bM962getw2LRezQ)).m954unboximpl();
        }
        return bM962getw2LRezQ;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRight-WyvcNBI, reason: not valid java name */
    private static final int m1881reduceRightWyvcNBI(int[] reduceRight, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(reduceRight, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            iM1041getpVg5ArA = operation.invoke(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(reduceRight, i)), UInt.m975boximpl(iM1041getpVg5ArA)).m1033unboximpl();
        }
        return iM1041getpVg5ArA;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRight-s8dVfGU, reason: not valid java name */
    private static final long m1882reduceRights8dVfGU(long[] reduceRight, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(reduceRight, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            jM1120getsVKNKU = operation.invoke(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(reduceRight, i)), ULong.m1054boximpl(jM1120getsVKNKU)).m1112unboximpl();
        }
        return jM1120getsVKNKU;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRight-xzaTVY8, reason: not valid java name */
    private static final short m1883reduceRightxzaTVY8(short[] reduceRight, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(reduceRight, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            sM1225getMh2AYeg = operation.invoke(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(reduceRight, i)), UShort.m1161boximpl(sM1225getMh2AYeg)).m1217unboximpl();
        }
        return sM1225getMh2AYeg;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexed-D40WMg8, reason: not valid java name */
    private static final int m1884reduceRightIndexedD40WMg8(int[] reduceRightIndexed, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(reduceRightIndexed, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            iM1041getpVg5ArA = operation.invoke(Integer.valueOf(i), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(reduceRightIndexed, i)), UInt.m975boximpl(iM1041getpVg5ArA)).m1033unboximpl();
        }
        return iM1041getpVg5ArA;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexed-EOyYB1Y, reason: not valid java name */
    private static final byte m1885reduceRightIndexedEOyYB1Y(byte[] reduceRightIndexed, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(reduceRightIndexed, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            bM962getw2LRezQ = operation.invoke(Integer.valueOf(i), UByte.m898boximpl(UByteArray.m962getw2LRezQ(reduceRightIndexed, i)), UByte.m898boximpl(bM962getw2LRezQ)).m954unboximpl();
        }
        return bM962getw2LRezQ;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexed-aLgx1Fo, reason: not valid java name */
    private static final short m1886reduceRightIndexedaLgx1Fo(short[] reduceRightIndexed, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(reduceRightIndexed, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            sM1225getMh2AYeg = operation.invoke(Integer.valueOf(i), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(reduceRightIndexed, i)), UShort.m1161boximpl(sM1225getMh2AYeg)).m1217unboximpl();
        }
        return sM1225getMh2AYeg;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexed-z1zDJgo, reason: not valid java name */
    private static final long m1887reduceRightIndexedz1zDJgo(long[] reduceRightIndexed, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(reduceRightIndexed, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            jM1120getsVKNKU = operation.invoke(Integer.valueOf(i), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(reduceRightIndexed, i)), ULong.m1054boximpl(jM1120getsVKNKU)).m1112unboximpl();
        }
        return jM1120getsVKNKU;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-D40WMg8, reason: not valid java name */
    private static final UInt m1888reduceRightIndexedOrNullD40WMg8(int[] reduceRightIndexedOrNull, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(reduceRightIndexedOrNull, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            iM1041getpVg5ArA = operation.invoke(Integer.valueOf(i), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(reduceRightIndexedOrNull, i)), UInt.m975boximpl(iM1041getpVg5ArA)).m1033unboximpl();
        }
        return UInt.m975boximpl(iM1041getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-EOyYB1Y, reason: not valid java name */
    private static final UByte m1889reduceRightIndexedOrNullEOyYB1Y(byte[] reduceRightIndexedOrNull, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(reduceRightIndexedOrNull, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            bM962getw2LRezQ = operation.invoke(Integer.valueOf(i), UByte.m898boximpl(UByteArray.m962getw2LRezQ(reduceRightIndexedOrNull, i)), UByte.m898boximpl(bM962getw2LRezQ)).m954unboximpl();
        }
        return UByte.m898boximpl(bM962getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-aLgx1Fo, reason: not valid java name */
    private static final UShort m1890reduceRightIndexedOrNullaLgx1Fo(short[] reduceRightIndexedOrNull, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(reduceRightIndexedOrNull, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            sM1225getMh2AYeg = operation.invoke(Integer.valueOf(i), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(reduceRightIndexedOrNull, i)), UShort.m1161boximpl(sM1225getMh2AYeg)).m1217unboximpl();
        }
        return UShort.m1161boximpl(sM1225getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-z1zDJgo, reason: not valid java name */
    private static final ULong m1891reduceRightIndexedOrNullz1zDJgo(long[] reduceRightIndexedOrNull, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(reduceRightIndexedOrNull, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            jM1120getsVKNKU = operation.invoke(Integer.valueOf(i), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(reduceRightIndexedOrNull, i)), ULong.m1054boximpl(jM1120getsVKNKU)).m1112unboximpl();
        }
        return ULong.m1054boximpl(jM1120getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightOrNull-ELGow60, reason: not valid java name */
    private static final UByte m1892reduceRightOrNullELGow60(byte[] reduceRightOrNull, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(reduceRightOrNull, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            bM962getw2LRezQ = operation.invoke(UByte.m898boximpl(UByteArray.m962getw2LRezQ(reduceRightOrNull, i)), UByte.m898boximpl(bM962getw2LRezQ)).m954unboximpl();
        }
        return UByte.m898boximpl(bM962getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightOrNull-WyvcNBI, reason: not valid java name */
    private static final UInt m1893reduceRightOrNullWyvcNBI(int[] reduceRightOrNull, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(reduceRightOrNull, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            iM1041getpVg5ArA = operation.invoke(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(reduceRightOrNull, i)), UInt.m975boximpl(iM1041getpVg5ArA)).m1033unboximpl();
        }
        return UInt.m975boximpl(iM1041getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightOrNull-s8dVfGU, reason: not valid java name */
    private static final ULong m1894reduceRightOrNulls8dVfGU(long[] reduceRightOrNull, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(reduceRightOrNull, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            jM1120getsVKNKU = operation.invoke(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(reduceRightOrNull, i)), ULong.m1054boximpl(jM1120getsVKNKU)).m1112unboximpl();
        }
        return ULong.m1054boximpl(jM1120getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightOrNull-xzaTVY8, reason: not valid java name */
    private static final UShort m1895reduceRightOrNullxzaTVY8(short[] reduceRightOrNull, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(reduceRightOrNull, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            sM1225getMh2AYeg = operation.invoke(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(reduceRightOrNull, i)), UShort.m1161boximpl(sM1225getMh2AYeg)).m1217unboximpl();
        }
        return UShort.m1161boximpl(sM1225getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse--ajY-9A, reason: not valid java name */
    private static final void m1896reverseajY9A(int[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse--nroSd4, reason: not valid java name */
    private static final void m1897reversenroSd4(long[] reverse, int i, int i2) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse-4UcCI2c, reason: not valid java name */
    private static final void m1898reverse4UcCI2c(byte[] reverse, int i, int i2) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse-Aa5vz7o, reason: not valid java name */
    private static final void m1899reverseAa5vz7o(short[] reverse, int i, int i2) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse-GBYM_sE, reason: not valid java name */
    private static final void m1900reverseGBYM_sE(byte[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse-QwZRm1k, reason: not valid java name */
    private static final void m1901reverseQwZRm1k(long[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse-oBK06Vg, reason: not valid java name */
    private static final void m1902reverseoBK06Vg(int[] reverse, int i, int i2) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse-rL5Bavg, reason: not valid java name */
    private static final void m1903reverserL5Bavg(short[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed--ajY-9A, reason: not valid java name */
    public static final List<UInt> m1904reversedajY9A(@NotNull int[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UIntArray.m1044isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<UInt> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UIntArray.m1034boximpl(reversed));
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m1905reversedGBYM_sE(@NotNull byte[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UByteArray.m965isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<UByte> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UByteArray.m955boximpl(reversed));
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m1906reversedQwZRm1k(@NotNull long[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (ULongArray.m1123isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<ULong> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) ULongArray.m1113boximpl(reversed));
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m1907reversedrL5Bavg(@NotNull short[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UShortArray.m1228isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<UShort> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UShortArray.m1218boximpl(reversed));
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reversedArray--ajY-9A, reason: not valid java name */
    private static final int[] m1908reversedArrayajY9A(int[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return UIntArray.m1036constructorimpl(ArraysKt___ArraysKt.reversedArray(reversedArray));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reversedArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m1909reversedArrayGBYM_sE(byte[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return UByteArray.m957constructorimpl(ArraysKt___ArraysKt.reversedArray(reversedArray));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reversedArray-QwZRm1k, reason: not valid java name */
    private static final long[] m1910reversedArrayQwZRm1k(long[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return ULongArray.m1115constructorimpl(ArraysKt___ArraysKt.reversedArray(reversedArray));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reversedArray-rL5Bavg, reason: not valid java name */
    private static final short[] m1911reversedArrayrL5Bavg(short[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return UShortArray.m1220constructorimpl(ArraysKt___ArraysKt.reversedArray(reversedArray));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFold-A8wKCXQ, reason: not valid java name */
    private static final <R> List<R> m1912runningFoldA8wKCXQ(long[] runningFold, R r2, Function2<? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m1123isEmptyimpl(runningFold)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m1121getSizeimpl(runningFold) + 1);
        arrayList.add(r2);
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(runningFold);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            r2 = operation.invoke(r2, ULong.m1054boximpl(ULongArray.m1120getsVKNKU(runningFold, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFold-yXmHNn8, reason: not valid java name */
    private static final <R> List<R> m1913runningFoldyXmHNn8(byte[] runningFold, R r2, Function2<? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m965isEmptyimpl(runningFold)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m963getSizeimpl(runningFold) + 1);
        arrayList.add(r2);
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(runningFold);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            r2 = operation.invoke(r2, UByte.m898boximpl(UByteArray.m962getw2LRezQ(runningFold, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFold-zi1B2BA, reason: not valid java name */
    private static final <R> List<R> m1914runningFoldzi1B2BA(int[] runningFold, R r2, Function2<? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m1044isEmptyimpl(runningFold)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m1042getSizeimpl(runningFold) + 1);
        arrayList.add(r2);
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(runningFold);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            r2 = operation.invoke(r2, UInt.m975boximpl(UIntArray.m1041getpVg5ArA(runningFold, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFold-zww5nb8, reason: not valid java name */
    private static final <R> List<R> m1915runningFoldzww5nb8(short[] runningFold, R r2, Function2<? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m1228isEmptyimpl(runningFold)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m1226getSizeimpl(runningFold) + 1);
        arrayList.add(r2);
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(runningFold);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            r2 = operation.invoke(r2, UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(runningFold, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFoldIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> List<R> m1916runningFoldIndexed3iWJZGE(byte[] runningFoldIndexed, R r2, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m965isEmptyimpl(runningFoldIndexed)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m963getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r2);
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(runningFoldIndexed);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            r2 = operation.invoke(Integer.valueOf(i), r2, UByte.m898boximpl(UByteArray.m962getw2LRezQ(runningFoldIndexed, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFoldIndexed-bzxtMww, reason: not valid java name */
    private static final <R> List<R> m1917runningFoldIndexedbzxtMww(short[] runningFoldIndexed, R r2, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m1228isEmptyimpl(runningFoldIndexed)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m1226getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r2);
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(runningFoldIndexed);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            r2 = operation.invoke(Integer.valueOf(i), r2, UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(runningFoldIndexed, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFoldIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> List<R> m1918runningFoldIndexedmwnnOCs(long[] runningFoldIndexed, R r2, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m1123isEmptyimpl(runningFoldIndexed)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m1121getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r2);
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(runningFoldIndexed);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            r2 = operation.invoke(Integer.valueOf(i), r2, ULong.m1054boximpl(ULongArray.m1120getsVKNKU(runningFoldIndexed, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFoldIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> List<R> m1919runningFoldIndexedyVwIW0Q(int[] runningFoldIndexed, R r2, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m1044isEmptyimpl(runningFoldIndexed)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m1042getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r2);
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(runningFoldIndexed);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            r2 = operation.invoke(Integer.valueOf(i), r2, UInt.m975boximpl(UIntArray.m1041getpVg5ArA(runningFoldIndexed, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduce-ELGow60, reason: not valid java name */
    private static final List<UByte> m1920runningReduceELGow60(byte[] runningReduce, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m965isEmptyimpl(runningReduce)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(runningReduce, 0);
        ArrayList arrayList = new ArrayList(UByteArray.m963getSizeimpl(runningReduce));
        arrayList.add(UByte.m898boximpl(bM962getw2LRezQ));
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(runningReduce);
        for (int i = 1; i < iM963getSizeimpl; i++) {
            bM962getw2LRezQ = operation.invoke(UByte.m898boximpl(bM962getw2LRezQ), UByte.m898boximpl(UByteArray.m962getw2LRezQ(runningReduce, i))).m954unboximpl();
            arrayList.add(UByte.m898boximpl(bM962getw2LRezQ));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduce-WyvcNBI, reason: not valid java name */
    private static final List<UInt> m1921runningReduceWyvcNBI(int[] runningReduce, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m1044isEmptyimpl(runningReduce)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(runningReduce, 0);
        ArrayList arrayList = new ArrayList(UIntArray.m1042getSizeimpl(runningReduce));
        arrayList.add(UInt.m975boximpl(iM1041getpVg5ArA));
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(runningReduce);
        for (int i = 1; i < iM1042getSizeimpl; i++) {
            iM1041getpVg5ArA = operation.invoke(UInt.m975boximpl(iM1041getpVg5ArA), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(runningReduce, i))).m1033unboximpl();
            arrayList.add(UInt.m975boximpl(iM1041getpVg5ArA));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduce-s8dVfGU, reason: not valid java name */
    private static final List<ULong> m1922runningReduces8dVfGU(long[] runningReduce, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m1123isEmptyimpl(runningReduce)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(runningReduce, 0);
        ArrayList arrayList = new ArrayList(ULongArray.m1121getSizeimpl(runningReduce));
        arrayList.add(ULong.m1054boximpl(jM1120getsVKNKU));
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(runningReduce);
        for (int i = 1; i < iM1121getSizeimpl; i++) {
            jM1120getsVKNKU = operation.invoke(ULong.m1054boximpl(jM1120getsVKNKU), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(runningReduce, i))).m1112unboximpl();
            arrayList.add(ULong.m1054boximpl(jM1120getsVKNKU));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduce-xzaTVY8, reason: not valid java name */
    private static final List<UShort> m1923runningReducexzaTVY8(short[] runningReduce, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m1228isEmptyimpl(runningReduce)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(runningReduce, 0);
        ArrayList arrayList = new ArrayList(UShortArray.m1226getSizeimpl(runningReduce));
        arrayList.add(UShort.m1161boximpl(sM1225getMh2AYeg));
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(runningReduce);
        for (int i = 1; i < iM1226getSizeimpl; i++) {
            sM1225getMh2AYeg = operation.invoke(UShort.m1161boximpl(sM1225getMh2AYeg), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(runningReduce, i))).m1217unboximpl();
            arrayList.add(UShort.m1161boximpl(sM1225getMh2AYeg));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduceIndexed-D40WMg8, reason: not valid java name */
    private static final List<UInt> m1924runningReduceIndexedD40WMg8(int[] runningReduceIndexed, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m1044isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(UIntArray.m1042getSizeimpl(runningReduceIndexed));
        arrayList.add(UInt.m975boximpl(iM1041getpVg5ArA));
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(runningReduceIndexed);
        for (int i = 1; i < iM1042getSizeimpl; i++) {
            iM1041getpVg5ArA = operation.invoke(Integer.valueOf(i), UInt.m975boximpl(iM1041getpVg5ArA), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(runningReduceIndexed, i))).m1033unboximpl();
            arrayList.add(UInt.m975boximpl(iM1041getpVg5ArA));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduceIndexed-EOyYB1Y, reason: not valid java name */
    private static final List<UByte> m1925runningReduceIndexedEOyYB1Y(byte[] runningReduceIndexed, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m965isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(UByteArray.m963getSizeimpl(runningReduceIndexed));
        arrayList.add(UByte.m898boximpl(bM962getw2LRezQ));
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(runningReduceIndexed);
        for (int i = 1; i < iM963getSizeimpl; i++) {
            bM962getw2LRezQ = operation.invoke(Integer.valueOf(i), UByte.m898boximpl(bM962getw2LRezQ), UByte.m898boximpl(UByteArray.m962getw2LRezQ(runningReduceIndexed, i))).m954unboximpl();
            arrayList.add(UByte.m898boximpl(bM962getw2LRezQ));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduceIndexed-aLgx1Fo, reason: not valid java name */
    private static final List<UShort> m1926runningReduceIndexedaLgx1Fo(short[] runningReduceIndexed, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m1228isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(UShortArray.m1226getSizeimpl(runningReduceIndexed));
        arrayList.add(UShort.m1161boximpl(sM1225getMh2AYeg));
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(runningReduceIndexed);
        for (int i = 1; i < iM1226getSizeimpl; i++) {
            sM1225getMh2AYeg = operation.invoke(Integer.valueOf(i), UShort.m1161boximpl(sM1225getMh2AYeg), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(runningReduceIndexed, i))).m1217unboximpl();
            arrayList.add(UShort.m1161boximpl(sM1225getMh2AYeg));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduceIndexed-z1zDJgo, reason: not valid java name */
    private static final List<ULong> m1927runningReduceIndexedz1zDJgo(long[] runningReduceIndexed, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m1123isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(ULongArray.m1121getSizeimpl(runningReduceIndexed));
        arrayList.add(ULong.m1054boximpl(jM1120getsVKNKU));
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(runningReduceIndexed);
        for (int i = 1; i < iM1121getSizeimpl; i++) {
            jM1120getsVKNKU = operation.invoke(Integer.valueOf(i), ULong.m1054boximpl(jM1120getsVKNKU), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(runningReduceIndexed, i))).m1112unboximpl();
            arrayList.add(ULong.m1054boximpl(jM1120getsVKNKU));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scan-A8wKCXQ, reason: not valid java name */
    private static final <R> List<R> m1928scanA8wKCXQ(long[] scan, R r2, Function2<? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m1123isEmptyimpl(scan)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m1121getSizeimpl(scan) + 1);
        arrayList.add(r2);
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(scan);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            r2 = operation.invoke(r2, ULong.m1054boximpl(ULongArray.m1120getsVKNKU(scan, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scan-yXmHNn8, reason: not valid java name */
    private static final <R> List<R> m1929scanyXmHNn8(byte[] scan, R r2, Function2<? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m965isEmptyimpl(scan)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m963getSizeimpl(scan) + 1);
        arrayList.add(r2);
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(scan);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            r2 = operation.invoke(r2, UByte.m898boximpl(UByteArray.m962getw2LRezQ(scan, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scan-zi1B2BA, reason: not valid java name */
    private static final <R> List<R> m1930scanzi1B2BA(int[] scan, R r2, Function2<? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m1044isEmptyimpl(scan)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m1042getSizeimpl(scan) + 1);
        arrayList.add(r2);
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(scan);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            r2 = operation.invoke(r2, UInt.m975boximpl(UIntArray.m1041getpVg5ArA(scan, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scan-zww5nb8, reason: not valid java name */
    private static final <R> List<R> m1931scanzww5nb8(short[] scan, R r2, Function2<? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m1228isEmptyimpl(scan)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m1226getSizeimpl(scan) + 1);
        arrayList.add(r2);
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(scan);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            r2 = operation.invoke(r2, UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(scan, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scanIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> List<R> m1932scanIndexed3iWJZGE(byte[] scanIndexed, R r2, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m965isEmptyimpl(scanIndexed)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m963getSizeimpl(scanIndexed) + 1);
        arrayList.add(r2);
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(scanIndexed);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            r2 = operation.invoke(Integer.valueOf(i), r2, UByte.m898boximpl(UByteArray.m962getw2LRezQ(scanIndexed, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scanIndexed-bzxtMww, reason: not valid java name */
    private static final <R> List<R> m1933scanIndexedbzxtMww(short[] scanIndexed, R r2, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m1228isEmptyimpl(scanIndexed)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m1226getSizeimpl(scanIndexed) + 1);
        arrayList.add(r2);
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(scanIndexed);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            r2 = operation.invoke(Integer.valueOf(i), r2, UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(scanIndexed, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scanIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> List<R> m1934scanIndexedmwnnOCs(long[] scanIndexed, R r2, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m1123isEmptyimpl(scanIndexed)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m1121getSizeimpl(scanIndexed) + 1);
        arrayList.add(r2);
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(scanIndexed);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            r2 = operation.invoke(Integer.valueOf(i), r2, ULong.m1054boximpl(ULongArray.m1120getsVKNKU(scanIndexed, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scanIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> List<R> m1935scanIndexedyVwIW0Q(int[] scanIndexed, R r2, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m1044isEmptyimpl(scanIndexed)) {
            return CollectionsKt__CollectionsJVMKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m1042getSizeimpl(scanIndexed) + 1);
        arrayList.add(r2);
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(scanIndexed);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            r2 = operation.invoke(Integer.valueOf(i), r2, UInt.m975boximpl(UIntArray.m1041getpVg5ArA(scanIndexed, i)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle--ajY-9A, reason: not valid java name */
    public static final void m1936shuffleajY9A(@NotNull int[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1937shuffle2D5oskM(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-2D5oskM, reason: not valid java name */
    public static final void m1937shuffle2D5oskM(@NotNull int[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(shuffle, lastIndex);
            UIntArray.m1046setVXSXFK8(shuffle, lastIndex, UIntArray.m1041getpVg5ArA(shuffle, iNextInt));
            UIntArray.m1046setVXSXFK8(shuffle, iNextInt, iM1041getpVg5ArA);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-GBYM_sE, reason: not valid java name */
    public static final void m1938shuffleGBYM_sE(@NotNull byte[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1941shuffleoSF2wD8(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-JzugnMA, reason: not valid java name */
    public static final void m1939shuffleJzugnMA(@NotNull long[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(shuffle, lastIndex);
            ULongArray.m1125setk8EXiF4(shuffle, lastIndex, ULongArray.m1120getsVKNKU(shuffle, iNextInt));
            ULongArray.m1125setk8EXiF4(shuffle, iNextInt, jM1120getsVKNKU);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-QwZRm1k, reason: not valid java name */
    public static final void m1940shuffleQwZRm1k(@NotNull long[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1939shuffleJzugnMA(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-oSF2wD8, reason: not valid java name */
    public static final void m1941shuffleoSF2wD8(@NotNull byte[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(shuffle, lastIndex);
            UByteArray.m967setVurrAj0(shuffle, lastIndex, UByteArray.m962getw2LRezQ(shuffle, iNextInt));
            UByteArray.m967setVurrAj0(shuffle, iNextInt, bM962getw2LRezQ);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-rL5Bavg, reason: not valid java name */
    public static final void m1942shufflerL5Bavg(@NotNull short[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1943shuffles5X_as8(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-s5X_as8, reason: not valid java name */
    public static final void m1943shuffles5X_as8(@NotNull short[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(shuffle, lastIndex);
            UShortArray.m1230set01HTLdE(shuffle, lastIndex, UShortArray.m1225getMh2AYeg(shuffle, iNextInt));
            UShortArray.m1230set01HTLdE(shuffle, iNextInt, sM1225getMh2AYeg);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single--ajY-9A, reason: not valid java name */
    private static final int m1944singleajY9A(int[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return UInt.m981constructorimpl(ArraysKt___ArraysKt.single(single));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-GBYM_sE, reason: not valid java name */
    private static final byte m1945singleGBYM_sE(byte[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return UByte.m904constructorimpl(ArraysKt___ArraysKt.single(single));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-JOV_ifY, reason: not valid java name */
    private static final byte m1946singleJOV_ifY(byte[] single, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(single);
        UByte uByteM898boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(single, i);
            if (predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uByteM898boximpl = UByte.m898boximpl(bM962getw2LRezQ);
                z = true;
            }
        }
        if (z) {
            return uByteM898boximpl.m954unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-MShoTSo, reason: not valid java name */
    private static final long m1947singleMShoTSo(long[] single, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(single);
        ULong uLongM1054boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(single, i);
            if (predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uLongM1054boximpl = ULong.m1054boximpl(jM1120getsVKNKU);
                z = true;
            }
        }
        if (z) {
            return uLongM1054boximpl.m1112unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-QwZRm1k, reason: not valid java name */
    private static final long m1948singleQwZRm1k(long[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return ULong.m1060constructorimpl(ArraysKt___ArraysKt.single(single));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-jgv0xPQ, reason: not valid java name */
    private static final int m1949singlejgv0xPQ(int[] single, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(single);
        UInt uIntM975boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(single, i);
            if (predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uIntM975boximpl = UInt.m975boximpl(iM1041getpVg5ArA);
                z = true;
            }
        }
        if (z) {
            return uIntM975boximpl.m1033unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-rL5Bavg, reason: not valid java name */
    private static final short m1950singlerL5Bavg(short[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return UShort.m1167constructorimpl(ArraysKt___ArraysKt.single(single));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-xTcfx_M, reason: not valid java name */
    private static final short m1951singlexTcfx_M(short[] single, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(single);
        UShort uShortM1161boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(single, i);
            if (predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uShortM1161boximpl = UShort.m1161boximpl(sM1225getMh2AYeg);
                z = true;
            }
        }
        if (z) {
            return uShortM1161boximpl.m1217unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m1952singleOrNullajY9A(@NotNull int[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UIntArray.m1042getSizeimpl(singleOrNull) == 1) {
            return UInt.m975boximpl(UIntArray.m1041getpVg5ArA(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m1953singleOrNullGBYM_sE(@NotNull byte[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UByteArray.m963getSizeimpl(singleOrNull) == 1) {
            return UByte.m898boximpl(UByteArray.m962getw2LRezQ(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: singleOrNull-JOV_ifY, reason: not valid java name */
    private static final UByte m1954singleOrNullJOV_ifY(byte[] singleOrNull, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(singleOrNull);
        UByte uByteM898boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(singleOrNull, i);
            if (predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                if (z) {
                    return null;
                }
                uByteM898boximpl = UByte.m898boximpl(bM962getw2LRezQ);
                z = true;
            }
        }
        if (z) {
            return uByteM898boximpl;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: singleOrNull-MShoTSo, reason: not valid java name */
    private static final ULong m1955singleOrNullMShoTSo(long[] singleOrNull, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(singleOrNull);
        ULong uLongM1054boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(singleOrNull, i);
            if (predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                if (z) {
                    return null;
                }
                uLongM1054boximpl = ULong.m1054boximpl(jM1120getsVKNKU);
                z = true;
            }
        }
        if (z) {
            return uLongM1054boximpl;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m1956singleOrNullQwZRm1k(@NotNull long[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (ULongArray.m1121getSizeimpl(singleOrNull) == 1) {
            return ULong.m1054boximpl(ULongArray.m1120getsVKNKU(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: singleOrNull-jgv0xPQ, reason: not valid java name */
    private static final UInt m1957singleOrNulljgv0xPQ(int[] singleOrNull, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(singleOrNull);
        UInt uIntM975boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(singleOrNull, i);
            if (predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                if (z) {
                    return null;
                }
                uIntM975boximpl = UInt.m975boximpl(iM1041getpVg5ArA);
                z = true;
            }
        }
        if (z) {
            return uIntM975boximpl;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m1958singleOrNullrL5Bavg(@NotNull short[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UShortArray.m1226getSizeimpl(singleOrNull) == 1) {
            return UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: singleOrNull-xTcfx_M, reason: not valid java name */
    private static final UShort m1959singleOrNullxTcfx_M(short[] singleOrNull, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(singleOrNull);
        UShort uShortM1161boximpl = null;
        boolean z = false;
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(singleOrNull, i);
            if (predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                if (z) {
                    return null;
                }
                uShortM1161boximpl = UShort.m1161boximpl(sM1225getMh2AYeg);
                z = true;
            }
        }
        if (z) {
            return uShortM1161boximpl;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-F7u83W8, reason: not valid java name */
    public static final List<ULong> m1960sliceF7u83W8(@NotNull long[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-HwE9HBo, reason: not valid java name */
    public static final List<UInt> m1961sliceHwE9HBo(@NotNull int[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-JGPC0-M, reason: not valid java name */
    public static final List<UShort> m1962sliceJGPC0M(@NotNull short[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-JQknh5Q, reason: not valid java name */
    public static final List<UByte> m1963sliceJQknh5Q(@NotNull byte[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(UByte.m898boximpl(UByteArray.m962getw2LRezQ(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-Q6IL4kU, reason: not valid java name */
    public static final List<UShort> m1964sliceQ6IL4kU(@NotNull short[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m1367asListrL5Bavg(UShortArray.m1220constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-ZRhS8yI, reason: not valid java name */
    public static final List<ULong> m1965sliceZRhS8yI(@NotNull long[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m1366asListQwZRm1k(ULongArray.m1115constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-c0bezYM, reason: not valid java name */
    public static final List<UByte> m1966slicec0bezYM(@NotNull byte[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m1365asListGBYM_sE(UByteArray.m957constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-tAntMlw, reason: not valid java name */
    public static final List<UInt> m1967slicetAntMlw(@NotNull int[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m1364asListajY9A(UIntArray.m1036constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-CFIt9YE, reason: not valid java name */
    public static final int[] m1968sliceArrayCFIt9YE(@NotNull int[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UIntArray.m1036constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, (Collection<Integer>) indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-Q6IL4kU, reason: not valid java name */
    public static final short[] m1969sliceArrayQ6IL4kU(@NotNull short[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UShortArray.m1220constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-ZRhS8yI, reason: not valid java name */
    public static final long[] m1970sliceArrayZRhS8yI(@NotNull long[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return ULongArray.m1115constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-c0bezYM, reason: not valid java name */
    public static final byte[] m1971sliceArrayc0bezYM(@NotNull byte[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UByteArray.m957constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-kzHmqpY, reason: not valid java name */
    public static final long[] m1972sliceArraykzHmqpY(@NotNull long[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return ULongArray.m1115constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, (Collection<Integer>) indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-ojwP5H8, reason: not valid java name */
    public static final short[] m1973sliceArrayojwP5H8(@NotNull short[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UShortArray.m1220constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, (Collection<Integer>) indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-tAntMlw, reason: not valid java name */
    public static final int[] m1974sliceArraytAntMlw(@NotNull int[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UIntArray.m1036constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-xo_DsdI, reason: not valid java name */
    public static final byte[] m1975sliceArrayxo_DsdI(@NotNull byte[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UByteArray.m957constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, (Collection<Integer>) indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort--ajY-9A, reason: not valid java name */
    public static final void m1976sortajY9A(@NotNull int[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UIntArray.m1042getSizeimpl(sort) > 1) {
            UArraySortingKt.m1354sortArrayoBK06Vg(sort, 0, UIntArray.m1042getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort--nroSd4, reason: not valid java name */
    public static final void m1977sortnroSd4(@NotNull long[] sort, int i, int i2) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, ULongArray.m1121getSizeimpl(sort));
        if (i < i2 - 1) {
            UArraySortingKt.m1351sortArraynroSd4(sort, i, i2);
        }
    }

    /* JADX INFO: renamed from: sort--nroSd4$default, reason: not valid java name */
    public static /* synthetic */ void m1978sortnroSd4$default(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = ULongArray.m1121getSizeimpl(jArr);
        }
        m1977sortnroSd4(jArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-4UcCI2c, reason: not valid java name */
    public static final void m1979sort4UcCI2c(@NotNull byte[] sort, int i, int i2) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, UByteArray.m963getSizeimpl(sort));
        if (i < i2 - 1) {
            UArraySortingKt.m1352sortArray4UcCI2c(sort, i, i2);
        }
    }

    /* JADX INFO: renamed from: sort-4UcCI2c$default, reason: not valid java name */
    public static /* synthetic */ void m1980sort4UcCI2c$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UByteArray.m963getSizeimpl(bArr);
        }
        m1979sort4UcCI2c(bArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-Aa5vz7o, reason: not valid java name */
    public static final void m1981sortAa5vz7o(@NotNull short[] sort, int i, int i2) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, UShortArray.m1226getSizeimpl(sort));
        if (i < i2 - 1) {
            UArraySortingKt.m1353sortArrayAa5vz7o(sort, i, i2);
        }
    }

    /* JADX INFO: renamed from: sort-Aa5vz7o$default, reason: not valid java name */
    public static /* synthetic */ void m1982sortAa5vz7o$default(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UShortArray.m1226getSizeimpl(sArr);
        }
        m1981sortAa5vz7o(sArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-GBYM_sE, reason: not valid java name */
    public static final void m1983sortGBYM_sE(@NotNull byte[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UByteArray.m963getSizeimpl(sort) > 1) {
            UArraySortingKt.m1352sortArray4UcCI2c(sort, 0, UByteArray.m963getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-QwZRm1k, reason: not valid java name */
    public static final void m1984sortQwZRm1k(@NotNull long[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (ULongArray.m1121getSizeimpl(sort) > 1) {
            UArraySortingKt.m1351sortArraynroSd4(sort, 0, ULongArray.m1121getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-oBK06Vg, reason: not valid java name */
    public static final void m1985sortoBK06Vg(@NotNull int[] sort, int i, int i2) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, UIntArray.m1042getSizeimpl(sort));
        if (i < i2 - 1) {
            UArraySortingKt.m1354sortArrayoBK06Vg(sort, i, i2);
        }
    }

    /* JADX INFO: renamed from: sort-oBK06Vg$default, reason: not valid java name */
    public static /* synthetic */ void m1986sortoBK06Vg$default(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UIntArray.m1042getSizeimpl(iArr);
        }
        m1985sortoBK06Vg(iArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-rL5Bavg, reason: not valid java name */
    public static final void m1987sortrL5Bavg(@NotNull short[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UShortArray.m1226getSizeimpl(sort) > 1) {
            UArraySortingKt.m1353sortArrayAa5vz7o(sort, 0, UShortArray.m1226getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending--ajY-9A, reason: not valid java name */
    public static final void m1988sortDescendingajY9A(@NotNull int[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UIntArray.m1042getSizeimpl(sortDescending) > 1) {
            m1976sortajY9A(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending--nroSd4, reason: not valid java name */
    public static final void m1989sortDescendingnroSd4(@NotNull long[] sortDescending, int i, int i2) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1977sortnroSd4(sortDescending, i, i2);
        ArraysKt___ArraysKt.reverse(sortDescending, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-4UcCI2c, reason: not valid java name */
    public static final void m1990sortDescending4UcCI2c(@NotNull byte[] sortDescending, int i, int i2) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1979sort4UcCI2c(sortDescending, i, i2);
        ArraysKt___ArraysKt.reverse(sortDescending, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-Aa5vz7o, reason: not valid java name */
    public static final void m1991sortDescendingAa5vz7o(@NotNull short[] sortDescending, int i, int i2) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1981sortAa5vz7o(sortDescending, i, i2);
        ArraysKt___ArraysKt.reverse(sortDescending, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-GBYM_sE, reason: not valid java name */
    public static final void m1992sortDescendingGBYM_sE(@NotNull byte[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UByteArray.m963getSizeimpl(sortDescending) > 1) {
            m1983sortGBYM_sE(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-QwZRm1k, reason: not valid java name */
    public static final void m1993sortDescendingQwZRm1k(@NotNull long[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (ULongArray.m1121getSizeimpl(sortDescending) > 1) {
            m1984sortQwZRm1k(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-oBK06Vg, reason: not valid java name */
    public static final void m1994sortDescendingoBK06Vg(@NotNull int[] sortDescending, int i, int i2) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1985sortoBK06Vg(sortDescending, i, i2);
        ArraysKt___ArraysKt.reverse(sortDescending, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-rL5Bavg, reason: not valid java name */
    public static final void m1995sortDescendingrL5Bavg(@NotNull short[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UShortArray.m1226getSizeimpl(sortDescending) > 1) {
            m1987sortrL5Bavg(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted--ajY-9A, reason: not valid java name */
    public static final List<UInt> m1996sortedajY9A(@NotNull int[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        int[] iArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM1036constructorimpl = UIntArray.m1036constructorimpl(iArrCopyOf);
        m1976sortajY9A(iArrM1036constructorimpl);
        return UArraysKt___UArraysJvmKt.m1364asListajY9A(iArrM1036constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m1997sortedGBYM_sE(@NotNull byte[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        byte[] bArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM957constructorimpl = UByteArray.m957constructorimpl(bArrCopyOf);
        m1983sortGBYM_sE(bArrM957constructorimpl);
        return UArraysKt___UArraysJvmKt.m1365asListGBYM_sE(bArrM957constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m1998sortedQwZRm1k(@NotNull long[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        long[] jArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM1115constructorimpl = ULongArray.m1115constructorimpl(jArrCopyOf);
        m1984sortQwZRm1k(jArrM1115constructorimpl);
        return UArraysKt___UArraysJvmKt.m1366asListQwZRm1k(jArrM1115constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m1999sortedrL5Bavg(@NotNull short[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        short[] sArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM1220constructorimpl = UShortArray.m1220constructorimpl(sArrCopyOf);
        m1987sortrL5Bavg(sArrM1220constructorimpl);
        return UArraysKt___UArraysJvmKt.m1367asListrL5Bavg(sArrM1220constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray--ajY-9A, reason: not valid java name */
    public static final int[] m2000sortedArrayajY9A(@NotNull int[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UIntArray.m1044isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM1036constructorimpl = UIntArray.m1036constructorimpl(iArrCopyOf);
        m1976sortajY9A(iArrM1036constructorimpl);
        return iArrM1036constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray-GBYM_sE, reason: not valid java name */
    public static final byte[] m2001sortedArrayGBYM_sE(@NotNull byte[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UByteArray.m965isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM957constructorimpl = UByteArray.m957constructorimpl(bArrCopyOf);
        m1983sortGBYM_sE(bArrM957constructorimpl);
        return bArrM957constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray-QwZRm1k, reason: not valid java name */
    public static final long[] m2002sortedArrayQwZRm1k(@NotNull long[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (ULongArray.m1123isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM1115constructorimpl = ULongArray.m1115constructorimpl(jArrCopyOf);
        m1984sortQwZRm1k(jArrM1115constructorimpl);
        return jArrM1115constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray-rL5Bavg, reason: not valid java name */
    public static final short[] m2003sortedArrayrL5Bavg(@NotNull short[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UShortArray.m1228isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM1220constructorimpl = UShortArray.m1220constructorimpl(sArrCopyOf);
        m1987sortrL5Bavg(sArrM1220constructorimpl);
        return sArrM1220constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending--ajY-9A, reason: not valid java name */
    public static final int[] m2004sortedArrayDescendingajY9A(@NotNull int[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UIntArray.m1044isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM1036constructorimpl = UIntArray.m1036constructorimpl(iArrCopyOf);
        m1988sortDescendingajY9A(iArrM1036constructorimpl);
        return iArrM1036constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-GBYM_sE, reason: not valid java name */
    public static final byte[] m2005sortedArrayDescendingGBYM_sE(@NotNull byte[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UByteArray.m965isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM957constructorimpl = UByteArray.m957constructorimpl(bArrCopyOf);
        m1992sortDescendingGBYM_sE(bArrM957constructorimpl);
        return bArrM957constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-QwZRm1k, reason: not valid java name */
    public static final long[] m2006sortedArrayDescendingQwZRm1k(@NotNull long[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (ULongArray.m1123isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM1115constructorimpl = ULongArray.m1115constructorimpl(jArrCopyOf);
        m1993sortDescendingQwZRm1k(jArrM1115constructorimpl);
        return jArrM1115constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-rL5Bavg, reason: not valid java name */
    public static final short[] m2007sortedArrayDescendingrL5Bavg(@NotNull short[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UShortArray.m1228isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM1220constructorimpl = UShortArray.m1220constructorimpl(sArrCopyOf);
        m1995sortDescendingrL5Bavg(sArrM1220constructorimpl);
        return sArrM1220constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending--ajY-9A, reason: not valid java name */
    public static final List<UInt> m2008sortedDescendingajY9A(@NotNull int[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        int[] iArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM1036constructorimpl = UIntArray.m1036constructorimpl(iArrCopyOf);
        m1976sortajY9A(iArrM1036constructorimpl);
        return m1904reversedajY9A(iArrM1036constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m2009sortedDescendingGBYM_sE(@NotNull byte[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        byte[] bArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM957constructorimpl = UByteArray.m957constructorimpl(bArrCopyOf);
        m1983sortGBYM_sE(bArrM957constructorimpl);
        return m1905reversedGBYM_sE(bArrM957constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m2010sortedDescendingQwZRm1k(@NotNull long[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        long[] jArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM1115constructorimpl = ULongArray.m1115constructorimpl(jArrCopyOf);
        m1984sortQwZRm1k(jArrM1115constructorimpl);
        return m1906reversedQwZRm1k(jArrM1115constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m2011sortedDescendingrL5Bavg(@NotNull short[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        short[] sArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM1220constructorimpl = UShortArray.m1220constructorimpl(sArrCopyOf);
        m1987sortrL5Bavg(sArrM1220constructorimpl);
        return m1907reversedrL5Bavg(sArrM1220constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: sum--ajY-9A, reason: not valid java name */
    private static final int m2012sumajY9A(int[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        return UInt.m981constructorimpl(ArraysKt___ArraysKt.sum(sum));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: sum-GBYM_sE, reason: not valid java name */
    private static final int m2013sumGBYM_sE(byte[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        int iM981constructorimpl = UInt.m981constructorimpl(0);
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(sum);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + UInt.m981constructorimpl(UByteArray.m962getw2LRezQ(sum, i) & 255));
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: sum-QwZRm1k, reason: not valid java name */
    private static final long m2014sumQwZRm1k(long[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        return ULong.m1060constructorimpl(ArraysKt___ArraysKt.sum(sum));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: sum-rL5Bavg, reason: not valid java name */
    private static final int m2015sumrL5Bavg(short[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        int iM981constructorimpl = UInt.m981constructorimpl(0);
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(sum);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + UInt.m981constructorimpl(UShortArray.m1225getMh2AYeg(sum, i) & UShort.MAX_VALUE));
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumBy-JOV_ifY, reason: not valid java name */
    private static final int m2016sumByJOV_ifY(byte[] sumBy, Function1<? super UByte, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(sumBy);
        int iM981constructorimpl = 0;
        for (int i = 0; i < iM963getSizeimpl; i++) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(sumBy, i))).m1033unboximpl());
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumBy-MShoTSo, reason: not valid java name */
    private static final int m2017sumByMShoTSo(long[] sumBy, Function1<? super ULong, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(sumBy);
        int iM981constructorimpl = 0;
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(sumBy, i))).m1033unboximpl());
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumBy-jgv0xPQ, reason: not valid java name */
    private static final int m2018sumByjgv0xPQ(int[] sumBy, Function1<? super UInt, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(sumBy);
        int iM981constructorimpl = 0;
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(sumBy, i))).m1033unboximpl());
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumBy-xTcfx_M, reason: not valid java name */
    private static final int m2019sumByxTcfx_M(short[] sumBy, Function1<? super UShort, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(sumBy);
        int iM981constructorimpl = 0;
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(sumBy, i))).m1033unboximpl());
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumByDouble-JOV_ifY, reason: not valid java name */
    private static final double m2020sumByDoubleJOV_ifY(byte[] sumByDouble, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM963getSizeimpl; i++) {
            dDoubleValue += selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(sumByDouble, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumByDouble-MShoTSo, reason: not valid java name */
    private static final double m2021sumByDoubleMShoTSo(long[] sumByDouble, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            dDoubleValue += selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(sumByDouble, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumByDouble-jgv0xPQ, reason: not valid java name */
    private static final double m2022sumByDoublejgv0xPQ(int[] sumByDouble, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            dDoubleValue += selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(sumByDouble, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumByDouble-xTcfx_M, reason: not valid java name */
    private static final double m2023sumByDoublexTcfx_M(short[] sumByDouble, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            dDoubleValue += selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(sumByDouble, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(int[] sumOf, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(sumOf);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            dDoubleValue += selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(sumOf, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(int[] sumOf, Function1<? super UInt, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(sumOf);
        int iIntValue = 0;
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            iIntValue += selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(sumOf, i))).intValue();
        }
        return iIntValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(int[] sumOf, Function1<? super UInt, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(sumOf);
        long jLongValue = 0;
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            jLongValue += selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(sumOf, i))).longValue();
        }
        return jLongValue;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull UByte[] uByteArr) {
        Intrinsics.checkNotNullParameter(uByteArr, "<this>");
        int iM981constructorimpl = 0;
        for (UByte uByte : uByteArr) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + UInt.m981constructorimpl(uByte.m954unboximpl() & 255));
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(int[] sumOf, Function1<? super UInt, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM981constructorimpl = UInt.m981constructorimpl(0);
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(sumOf);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(sumOf, i))).m1033unboximpl());
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(int[] sumOf, Function1<? super UInt, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jM1060constructorimpl = ULong.m1060constructorimpl(0L);
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(sumOf);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            jM1060constructorimpl = ULong.m1060constructorimpl(jM1060constructorimpl + selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(sumOf, i))).m1112unboximpl());
        }
        return jM1060constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull UShort[] uShortArr) {
        Intrinsics.checkNotNullParameter(uShortArr, "<this>");
        int iM981constructorimpl = 0;
        for (UShort uShort : uShortArr) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + UInt.m981constructorimpl(uShort.m1217unboximpl() & UShort.MAX_VALUE));
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-PpDY95g, reason: not valid java name */
    public static final List<UByte> m2024takePpDY95g(@NotNull byte[] take, int i) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i >= UByteArray.m963getSizeimpl(take)) {
            return CollectionsKt___CollectionsKt.toList(UByteArray.m955boximpl(take));
        }
        if (i == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(UByte.m898boximpl(UByteArray.m962getw2LRezQ(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i);
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(take);
        int i2 = 0;
        for (int i3 = 0; i3 < iM963getSizeimpl; i3++) {
            arrayList.add(UByte.m898boximpl(UByteArray.m962getw2LRezQ(take, i3)));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-nggk6HY, reason: not valid java name */
    public static final List<UShort> m2025takenggk6HY(@NotNull short[] take, int i) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i >= UShortArray.m1226getSizeimpl(take)) {
            return CollectionsKt___CollectionsKt.toList(UShortArray.m1218boximpl(take));
        }
        if (i == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i);
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(take);
        int i2 = 0;
        for (int i3 = 0; i3 < iM1226getSizeimpl; i3++) {
            arrayList.add(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(take, i3)));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m2026takeqFRl0hI(@NotNull int[] take, int i) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i >= UIntArray.m1042getSizeimpl(take)) {
            return CollectionsKt___CollectionsKt.toList(UIntArray.m1034boximpl(take));
        }
        if (i == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i);
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(take);
        int i2 = 0;
        for (int i3 = 0; i3 < iM1042getSizeimpl; i3++) {
            arrayList.add(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(take, i3)));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-r7IrZao, reason: not valid java name */
    public static final List<ULong> m2027taker7IrZao(@NotNull long[] take, int i) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i >= ULongArray.m1121getSizeimpl(take)) {
            return CollectionsKt___CollectionsKt.toList(ULongArray.m1113boximpl(take));
        }
        if (i == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i);
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(take);
        int i2 = 0;
        for (int i3 = 0; i3 < iM1121getSizeimpl; i3++) {
            arrayList.add(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(take, i3)));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-PpDY95g, reason: not valid java name */
    public static final List<UByte> m2028takeLastPpDY95g(@NotNull byte[] takeLast, int i) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(takeLast);
        if (i >= iM963getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(UByteArray.m955boximpl(takeLast));
        }
        if (i == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(UByte.m898boximpl(UByteArray.m962getw2LRezQ(takeLast, iM963getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = iM963getSizeimpl - i; i2 < iM963getSizeimpl; i2++) {
            arrayList.add(UByte.m898boximpl(UByteArray.m962getw2LRezQ(takeLast, i2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-nggk6HY, reason: not valid java name */
    public static final List<UShort> m2029takeLastnggk6HY(@NotNull short[] takeLast, int i) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(takeLast);
        if (i >= iM1226getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(UShortArray.m1218boximpl(takeLast));
        }
        if (i == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(takeLast, iM1226getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = iM1226getSizeimpl - i; i2 < iM1226getSizeimpl; i2++) {
            arrayList.add(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(takeLast, i2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m2030takeLastqFRl0hI(@NotNull int[] takeLast, int i) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(takeLast);
        if (i >= iM1042getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(UIntArray.m1034boximpl(takeLast));
        }
        if (i == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(takeLast, iM1042getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = iM1042getSizeimpl - i; i2 < iM1042getSizeimpl; i2++) {
            arrayList.add(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(takeLast, i2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-r7IrZao, reason: not valid java name */
    public static final List<ULong> m2031takeLastr7IrZao(@NotNull long[] takeLast, int i) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(takeLast);
        if (i >= iM1121getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(ULongArray.m1113boximpl(takeLast));
        }
        if (i == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(takeLast, iM1121getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = iM1121getSizeimpl - i; i2 < iM1121getSizeimpl; i2++) {
            arrayList.add(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(takeLast, i2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeLastWhile-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m2032takeLastWhileJOV_ifY(byte[] takeLastWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(takeLastWhile, lastIndex))).booleanValue()) {
                return m1500dropPpDY95g(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt___CollectionsKt.toList(UByteArray.m955boximpl(takeLastWhile));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeLastWhile-MShoTSo, reason: not valid java name */
    private static final List<ULong> m2033takeLastWhileMShoTSo(long[] takeLastWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(takeLastWhile, lastIndex))).booleanValue()) {
                return m1503dropr7IrZao(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt___CollectionsKt.toList(ULongArray.m1113boximpl(takeLastWhile));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeLastWhile-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m2034takeLastWhilejgv0xPQ(int[] takeLastWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(takeLastWhile, lastIndex))).booleanValue()) {
                return m1502dropqFRl0hI(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt___CollectionsKt.toList(UIntArray.m1034boximpl(takeLastWhile));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeLastWhile-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m2035takeLastWhilexTcfx_M(short[] takeLastWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(takeLastWhile, lastIndex))).booleanValue()) {
                return m1501dropnggk6HY(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt___CollectionsKt.toList(UShortArray.m1218boximpl(takeLastWhile));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeWhile-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m2036takeWhileJOV_ifY(byte[] takeWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(takeWhile);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(takeWhile, i);
            if (!predicate.invoke2(UByte.m898boximpl(bM962getw2LRezQ)).booleanValue()) {
                break;
            }
            arrayList.add(UByte.m898boximpl(bM962getw2LRezQ));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeWhile-MShoTSo, reason: not valid java name */
    private static final List<ULong> m2037takeWhileMShoTSo(long[] takeWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(takeWhile);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(takeWhile, i);
            if (!predicate.invoke2(ULong.m1054boximpl(jM1120getsVKNKU)).booleanValue()) {
                break;
            }
            arrayList.add(ULong.m1054boximpl(jM1120getsVKNKU));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeWhile-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m2038takeWhilejgv0xPQ(int[] takeWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(takeWhile);
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(takeWhile, i);
            if (!predicate.invoke2(UInt.m975boximpl(iM1041getpVg5ArA)).booleanValue()) {
                break;
            }
            arrayList.add(UInt.m975boximpl(iM1041getpVg5ArA));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeWhile-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m2039takeWhilexTcfx_M(short[] takeWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(takeWhile);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(takeWhile, i);
            if (!predicate.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg)).booleanValue()) {
                break;
            }
            arrayList.add(UShort.m1161boximpl(sM1225getMh2AYeg));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: toByteArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m2040toByteArrayGBYM_sE(byte[] toByteArray) {
        Intrinsics.checkNotNullParameter(toByteArray, "$this$toByteArray");
        byte[] bArrCopyOf = Arrays.copyOf(toByteArray, toByteArray.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: toIntArray--ajY-9A, reason: not valid java name */
    private static final int[] m2041toIntArrayajY9A(int[] toIntArray) {
        Intrinsics.checkNotNullParameter(toIntArray, "$this$toIntArray");
        int[] iArrCopyOf = Arrays.copyOf(toIntArray, toIntArray.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: toLongArray-QwZRm1k, reason: not valid java name */
    private static final long[] m2042toLongArrayQwZRm1k(long[] toLongArray) {
        Intrinsics.checkNotNullParameter(toLongArray, "$this$toLongArray");
        long[] jArrCopyOf = Arrays.copyOf(toLongArray, toLongArray.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: toShortArray-rL5Bavg, reason: not valid java name */
    private static final short[] m2043toShortArrayrL5Bavg(short[] toShortArray) {
        Intrinsics.checkNotNullParameter(toShortArray, "$this$toShortArray");
        short[] sArrCopyOf = Arrays.copyOf(toShortArray, toShortArray.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray--ajY-9A, reason: not valid java name */
    public static final UInt[] m2044toTypedArrayajY9A(@NotNull int[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(toTypedArray);
        UInt[] uIntArr = new UInt[iM1042getSizeimpl];
        for (int i = 0; i < iM1042getSizeimpl; i++) {
            uIntArr[i] = UInt.m975boximpl(UIntArray.m1041getpVg5ArA(toTypedArray, i));
        }
        return uIntArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-GBYM_sE, reason: not valid java name */
    public static final UByte[] m2045toTypedArrayGBYM_sE(@NotNull byte[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(toTypedArray);
        UByte[] uByteArr = new UByte[iM963getSizeimpl];
        for (int i = 0; i < iM963getSizeimpl; i++) {
            uByteArr[i] = UByte.m898boximpl(UByteArray.m962getw2LRezQ(toTypedArray, i));
        }
        return uByteArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-QwZRm1k, reason: not valid java name */
    public static final ULong[] m2046toTypedArrayQwZRm1k(@NotNull long[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(toTypedArray);
        ULong[] uLongArr = new ULong[iM1121getSizeimpl];
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            uLongArr[i] = ULong.m1054boximpl(ULongArray.m1120getsVKNKU(toTypedArray, i));
        }
        return uLongArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-rL5Bavg, reason: not valid java name */
    public static final UShort[] m2047toTypedArrayrL5Bavg(@NotNull short[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(toTypedArray);
        UShort[] uShortArr = new UShort[iM1226getSizeimpl];
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            uShortArr[i] = UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(toTypedArray, i));
        }
        return uShortArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull UByte[] uByteArr) {
        Intrinsics.checkNotNullParameter(uByteArr, "<this>");
        int length = uByteArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = uByteArr[i].m954unboximpl();
        }
        return UByteArray.m957constructorimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull UInt[] uIntArr) {
        Intrinsics.checkNotNullParameter(uIntArr, "<this>");
        int length = uIntArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = uIntArr[i].m1033unboximpl();
        }
        return UIntArray.m1036constructorimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull ULong[] uLongArr) {
        Intrinsics.checkNotNullParameter(uLongArr, "<this>");
        int length = uLongArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = uLongArr[i].m1112unboximpl();
        }
        return ULongArray.m1115constructorimpl(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull UShort[] uShortArr) {
        Intrinsics.checkNotNullParameter(uShortArr, "<this>");
        int length = uShortArr.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = uShortArr[i].m1217unboximpl();
        }
        return UShortArray.m1220constructorimpl(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex--ajY-9A, reason: not valid java name */
    public static final Iterable<IndexedValue<UInt>> m2048withIndexajY9A(@NotNull final int[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new Function0() { // from class: kotlin.collections.unsigned.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UIntArray.m1045iteratorimpl(withIndex);
            }
        });
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex-GBYM_sE, reason: not valid java name */
    public static final Iterable<IndexedValue<UByte>> m2049withIndexGBYM_sE(@NotNull final byte[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new Function0() { // from class: kotlin.collections.unsigned.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UByteArray.m966iteratorimpl(withIndex);
            }
        });
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex-QwZRm1k, reason: not valid java name */
    public static final Iterable<IndexedValue<ULong>> m2050withIndexQwZRm1k(@NotNull final long[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new Function0() { // from class: kotlin.collections.unsigned.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ULongArray.m1124iteratorimpl(withIndex);
            }
        });
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex-rL5Bavg, reason: not valid java name */
    public static final Iterable<IndexedValue<UShort>> m2051withIndexrL5Bavg(@NotNull final short[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new Function0() { // from class: kotlin.collections.unsigned.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UShortArray.m1229iteratorimpl(withIndex);
            }
        });
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-7znnbtw, reason: not valid java name */
    private static final <R, V> List<V> m2052zip7znnbtw(int[] zip, Iterable<? extends R> other, Function2<? super UInt, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), iM1042getSizeimpl));
        int i = 0;
        for (R r2 : other) {
            if (i >= iM1042getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(zip, i)), r2));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-8LME4QE, reason: not valid java name */
    private static final <R, V> List<V> m2053zip8LME4QE(long[] zip, R[] other, Function2<? super ULong, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(ULongArray.m1121getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(transform.invoke(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(zip, i)), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-C-E_24M, reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m2054zipCE_24M(@NotNull int[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UIntArray.m1042getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(zip, i);
            arrayList.add(TuplesKt.to(UInt.m975boximpl(iM1041getpVg5ArA), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-F7u83W8, reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m2055zipF7u83W8(@NotNull long[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), iM1121getSizeimpl));
        int i = 0;
        for (R r2 : other) {
            if (i >= iM1121getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(zip, i)), r2));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-HwE9HBo, reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m2056zipHwE9HBo(@NotNull int[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), iM1042getSizeimpl));
        int i = 0;
        for (R r2 : other) {
            if (i >= iM1042getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(zip, i)), r2));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-JAKpvQM, reason: not valid java name */
    private static final <V> List<V> m2057zipJAKpvQM(byte[] zip, byte[] other, Function2<? super UByte, ? super UByte, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(UByteArray.m963getSizeimpl(zip), UByteArray.m963getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(transform.invoke(UByte.m898boximpl(UByteArray.m962getw2LRezQ(zip, i)), UByte.m898boximpl(UByteArray.m962getw2LRezQ(other, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-JGPC0-M, reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m2058zipJGPC0M(@NotNull short[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), iM1226getSizeimpl));
        int i = 0;
        for (R r2 : other) {
            if (i >= iM1226getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(zip, i)), r2));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-JQknh5Q, reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m2059zipJQknh5Q(@NotNull byte[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), iM963getSizeimpl));
        int i = 0;
        for (R r2 : other) {
            if (i >= iM963getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UByte.m898boximpl(UByteArray.m962getw2LRezQ(zip, i)), r2));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-L83TJbI, reason: not valid java name */
    private static final <V> List<V> m2060zipL83TJbI(int[] zip, int[] other, Function2<? super UInt, ? super UInt, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(UIntArray.m1042getSizeimpl(zip), UIntArray.m1042getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(transform.invoke(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(zip, i)), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(other, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-LuipOMY, reason: not valid java name */
    private static final <R, V> List<V> m2061zipLuipOMY(byte[] zip, R[] other, Function2<? super UByte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(UByteArray.m963getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(transform.invoke(UByte.m898boximpl(UByteArray.m962getw2LRezQ(zip, i)), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-PabeH-Q, reason: not valid java name */
    private static final <V> List<V> m2062zipPabeHQ(long[] zip, long[] other, Function2<? super ULong, ? super ULong, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(ULongArray.m1121getSizeimpl(zip), ULongArray.m1121getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(transform.invoke(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(zip, i)), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(other, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-TUPTUsU, reason: not valid java name */
    private static final <R, V> List<V> m2063zipTUPTUsU(long[] zip, Iterable<? extends R> other, Function2<? super ULong, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), iM1121getSizeimpl));
        int i = 0;
        for (R r2 : other) {
            if (i >= iM1121getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(zip, i)), r2));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-UCnP4_w, reason: not valid java name */
    private static final <R, V> List<V> m2064zipUCnP4_w(byte[] zip, Iterable<? extends R> other, Function2<? super UByte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), iM963getSizeimpl));
        int i = 0;
        for (R r2 : other) {
            if (i >= iM963getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(UByte.m898boximpl(UByteArray.m962getw2LRezQ(zip, i)), r2));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-ZjwqOic, reason: not valid java name */
    private static final <R, V> List<V> m2065zipZjwqOic(int[] zip, R[] other, Function2<? super UInt, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(UIntArray.m1042getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(transform.invoke(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(zip, i)), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-ctEhBpI, reason: not valid java name */
    public static final List<Pair<UInt, UInt>> m2066zipctEhBpI(@NotNull int[] zip, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UIntArray.m1042getSizeimpl(zip), UIntArray.m1042getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(TuplesKt.to(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(zip, i)), UInt.m975boximpl(UIntArray.m1041getpVg5ArA(other, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-ePBmRWY, reason: not valid java name */
    private static final <R, V> List<V> m2067zipePBmRWY(short[] zip, R[] other, Function2<? super UShort, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(UShortArray.m1226getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(transform.invoke(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(zip, i)), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-f7H3mmw, reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m2068zipf7H3mmw(@NotNull long[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(ULongArray.m1121getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(zip, i);
            arrayList.add(TuplesKt.to(ULong.m1054boximpl(jM1120getsVKNKU), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-gVVukQo, reason: not valid java name */
    private static final <V> List<V> m2069zipgVVukQo(short[] zip, short[] other, Function2<? super UShort, ? super UShort, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(UShortArray.m1226getSizeimpl(zip), UShortArray.m1226getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(transform.invoke(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(zip, i)), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(other, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-kBb4a-s, reason: not valid java name */
    private static final <R, V> List<V> m2070zipkBb4as(short[] zip, Iterable<? extends R> other, Function2<? super UShort, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), iM1226getSizeimpl));
        int i = 0;
        for (R r2 : other) {
            if (i >= iM1226getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(zip, i)), r2));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-kdPth3s, reason: not valid java name */
    public static final List<Pair<UByte, UByte>> m2071zipkdPth3s(@NotNull byte[] zip, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UByteArray.m963getSizeimpl(zip), UByteArray.m963getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(TuplesKt.to(UByte.m898boximpl(UByteArray.m962getw2LRezQ(zip, i)), UByte.m898boximpl(UByteArray.m962getw2LRezQ(other, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-mazbYpA, reason: not valid java name */
    public static final List<Pair<UShort, UShort>> m2072zipmazbYpA(@NotNull short[] zip, @NotNull short[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UShortArray.m1226getSizeimpl(zip), UShortArray.m1226getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(TuplesKt.to(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(zip, i)), UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(other, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-nl983wc, reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m2073zipnl983wc(@NotNull byte[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UByteArray.m963getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(zip, i);
            arrayList.add(TuplesKt.to(UByte.m898boximpl(bM962getw2LRezQ), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-uaTIQ5s, reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m2074zipuaTIQ5s(@NotNull short[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UShortArray.m1226getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(zip, i);
            arrayList.add(TuplesKt.to(UShort.m1161boximpl(sM1225getMh2AYeg), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-us8wMrg, reason: not valid java name */
    public static final List<Pair<ULong, ULong>> m2075zipus8wMrg(@NotNull long[] zip, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(ULongArray.m1121getSizeimpl(zip), ULongArray.m1121getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(TuplesKt.to(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(zip, i)), ULong.m1054boximpl(ULongArray.m1120getsVKNKU(other, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] toUByteArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return UByteArray.m957constructorimpl(bArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] toUIntArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return UIntArray.m1036constructorimpl(iArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] toULongArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return ULongArray.m1115constructorimpl(jArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] toUShortArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return UShortArray.m1220constructorimpl(sArrCopyOf);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(long[] sumOf, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(sumOf);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            dDoubleValue += selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(sumOf, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(long[] sumOf, Function1<? super ULong, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(sumOf);
        int iIntValue = 0;
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            iIntValue += selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(sumOf, i))).intValue();
        }
        return iIntValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(long[] sumOf, Function1<? super ULong, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(sumOf);
        long jLongValue = 0;
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            jLongValue += selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(sumOf, i))).longValue();
        }
        return jLongValue;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(long[] sumOf, Function1<? super ULong, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM981constructorimpl = UInt.m981constructorimpl(0);
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(sumOf);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(sumOf, i))).m1033unboximpl());
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(long[] sumOf, Function1<? super ULong, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jM1060constructorimpl = ULong.m1060constructorimpl(0L);
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(sumOf);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            jM1060constructorimpl = ULong.m1060constructorimpl(jM1060constructorimpl + selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(sumOf, i))).m1112unboximpl());
        }
        return jM1060constructorimpl;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(byte[] sumOf, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(sumOf);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM963getSizeimpl; i++) {
            dDoubleValue += selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(sumOf, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(byte[] sumOf, Function1<? super UByte, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(sumOf);
        int iIntValue = 0;
        for (int i = 0; i < iM963getSizeimpl; i++) {
            iIntValue += selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(sumOf, i))).intValue();
        }
        return iIntValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(byte[] sumOf, Function1<? super UByte, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(sumOf);
        long jLongValue = 0;
        for (int i = 0; i < iM963getSizeimpl; i++) {
            jLongValue += selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(sumOf, i))).longValue();
        }
        return jLongValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final float m1717maxOfJOV_ifY(byte[] maxOf, Function1<? super UByte, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m965isEmptyimpl(maxOf)) {
            float fFloatValue = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOf, 0))).floatValue();
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOf, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final float m1720maxOfMShoTSo(long[] maxOf, Function1<? super ULong, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m1123isEmptyimpl(maxOf)) {
            float fFloatValue = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOf, 0))).floatValue();
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOf, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final float m1723maxOfjgv0xPQ(int[] maxOf, Function1<? super UInt, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m1044isEmptyimpl(maxOf)) {
            float fFloatValue = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOf, 0))).floatValue();
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOf, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final float m1726maxOfxTcfx_M(short[] maxOf, Function1<? super UShort, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m1228isEmptyimpl(maxOf)) {
            float fFloatValue = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOf, 0))).floatValue();
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOf, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Float m1730maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super UByte, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOfOrNull, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final Float m1733maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super ULong, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOfOrNull, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Float m1736maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super UInt, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOfOrNull, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Float m1739maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super UShort, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOfOrNull, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final long m1754maxOrThrowU(@NotNull long[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!ULongArray.m1123isEmptyimpl(max)) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(max, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(max);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(max, i);
                    if (Long.compareUnsigned(jM1120getsVKNKU, jM1120getsVKNKU2) < 0) {
                        jM1120getsVKNKU = jM1120getsVKNKU2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jM1120getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final long m1762maxWithOrThrowU(@NotNull long[] maxWith, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!ULongArray.m1123isEmptyimpl(maxWith)) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(maxWith, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWith);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(maxWith, i);
                    if (comparator.compare(ULong.m1054boximpl(jM1120getsVKNKU), ULong.m1054boximpl(jM1120getsVKNKU2)) < 0) {
                        jM1120getsVKNKU = jM1120getsVKNKU2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jM1120getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final float m1773minOfJOV_ifY(byte[] minOf, Function1<? super UByte, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m965isEmptyimpl(minOf)) {
            float fFloatValue = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOf, 0))).floatValue();
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOf, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final float m1776minOfMShoTSo(long[] minOf, Function1<? super ULong, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m1123isEmptyimpl(minOf)) {
            float fFloatValue = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOf, 0))).floatValue();
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOf, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final float m1779minOfjgv0xPQ(int[] minOf, Function1<? super UInt, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m1044isEmptyimpl(minOf)) {
            float fFloatValue = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOf, 0))).floatValue();
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOf, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final float m1782minOfxTcfx_M(short[] minOf, Function1<? super UShort, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m1228isEmptyimpl(minOf)) {
            float fFloatValue = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOf, 0))).floatValue();
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOf, i))).floatValue());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Float m1786minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super UByte, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOfOrNull, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final Float m1789minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super ULong, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOfOrNull, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Float m1792minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super UInt, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOfOrNull, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Float m1795minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super UShort, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOfOrNull, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOfOrNull, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final long m1810minOrThrowU(@NotNull long[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!ULongArray.m1123isEmptyimpl(min)) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(min, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(min);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(min, i);
                    if (Long.compareUnsigned(jM1120getsVKNKU, jM1120getsVKNKU2) > 0) {
                        jM1120getsVKNKU = jM1120getsVKNKU2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jM1120getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final long m1818minWithOrThrowU(@NotNull long[] minWith, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!ULongArray.m1123isEmptyimpl(minWith)) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(minWith, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minWith);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(minWith, i);
                    if (comparator.compare(ULong.m1054boximpl(jM1120getsVKNKU), ULong.m1054boximpl(jM1120getsVKNKU2)) > 0) {
                        jM1120getsVKNKU = jM1120getsVKNKU2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jM1120getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(short[] sumOf, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(sumOf);
        double dDoubleValue = 0.0d;
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            dDoubleValue += selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(sumOf, i))).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(short[] sumOf, Function1<? super UShort, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(sumOf);
        int iIntValue = 0;
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            iIntValue += selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(sumOf, i))).intValue();
        }
        return iIntValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(short[] sumOf, Function1<? super UShort, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(sumOf);
        long jLongValue = 0;
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            jLongValue += selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(sumOf, i))).longValue();
        }
        return jLongValue;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(byte[] sumOf, Function1<? super UByte, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM981constructorimpl = UInt.m981constructorimpl(0);
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(sumOf);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(sumOf, i))).m1033unboximpl());
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(byte[] sumOf, Function1<? super UByte, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jM1060constructorimpl = ULong.m1060constructorimpl(0L);
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(sumOf);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            jM1060constructorimpl = ULong.m1060constructorimpl(jM1060constructorimpl + selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(sumOf, i))).m1112unboximpl());
        }
        return jM1060constructorimpl;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "maxByOrThrow-U")
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m1714maxByOrThrowU(long[] maxBy, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m1123isEmptyimpl(maxBy)) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(maxBy, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
            if (lastIndex == 0) {
                return jM1120getsVKNKU;
            }
            R rInvoke2 = selector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(maxBy, i);
                    R rInvoke3 = selector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU2));
                    if (rInvoke2.compareTo(rInvoke3) < 0) {
                        jM1120getsVKNKU = jM1120getsVKNKU2;
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jM1120getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "minByOrThrow-U")
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m1770minByOrThrowU(long[] minBy, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m1123isEmptyimpl(minBy)) {
            long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(minBy, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
            if (lastIndex == 0) {
                return jM1120getsVKNKU;
            }
            R rInvoke2 = selector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(minBy, i);
                    R rInvoke3 = selector.invoke2(ULong.m1054boximpl(jM1120getsVKNKU2));
                    if (rInvoke2.compareTo(rInvoke3) > 0) {
                        jM1120getsVKNKU = jM1120getsVKNKU2;
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return jM1120getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(short[] sumOf, Function1<? super UShort, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM981constructorimpl = UInt.m981constructorimpl(0);
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(sumOf);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(sumOf, i))).m1033unboximpl());
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(short[] sumOf, Function1<? super UShort, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jM1060constructorimpl = ULong.m1060constructorimpl(0L);
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(sumOf);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            jM1060constructorimpl = ULong.m1060constructorimpl(jM1060constructorimpl + selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(sumOf, i))).m1112unboximpl());
        }
        return jM1060constructorimpl;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1718maxOfJOV_ifY(byte[] maxOf, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m965isEmptyimpl(maxOf)) {
            R rInvoke2 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOf, 0)));
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke3 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOf, i)));
                    if (rInvoke2.compareTo(rInvoke3) < 0) {
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke2;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1721maxOfMShoTSo(long[] maxOf, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m1123isEmptyimpl(maxOf)) {
            R rInvoke2 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOf, 0)));
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke3 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOf, i)));
                    if (rInvoke2.compareTo(rInvoke3) < 0) {
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke2;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1724maxOfjgv0xPQ(int[] maxOf, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m1044isEmptyimpl(maxOf)) {
            R rInvoke2 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOf, 0)));
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke3 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOf, i)));
                    if (rInvoke2.compareTo(rInvoke3) < 0) {
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke2;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1727maxOfxTcfx_M(short[] maxOf, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m1228isEmptyimpl(maxOf)) {
            R rInvoke2 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOf, 0)));
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke3 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOf, i)));
                    if (rInvoke2.compareTo(rInvoke3) < 0) {
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke2;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1728maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOfOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(maxOfOrNull, i)));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1731maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOfOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(maxOfOrNull, i)));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1734maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOfOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(maxOfOrNull, i)));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1737maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOfOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(maxOfOrNull, i)));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final byte m1752maxOrThrowU(@NotNull byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!UByteArray.m965isEmptyimpl(max)) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(max, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(max);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(max, i);
                    if (Intrinsics.compare(bM962getw2LRezQ & 255, bM962getw2LRezQ2 & 255) < 0) {
                        bM962getw2LRezQ = bM962getw2LRezQ2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bM962getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final byte m1760maxWithOrThrowU(@NotNull byte[] maxWith, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UByteArray.m965isEmptyimpl(maxWith)) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(maxWith, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWith);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(maxWith, i);
                    if (comparator.compare(UByte.m898boximpl(bM962getw2LRezQ), UByte.m898boximpl(bM962getw2LRezQ2)) < 0) {
                        bM962getw2LRezQ = bM962getw2LRezQ2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bM962getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1774minOfJOV_ifY(byte[] minOf, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m965isEmptyimpl(minOf)) {
            R rInvoke2 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOf, 0)));
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke3 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOf, i)));
                    if (rInvoke2.compareTo(rInvoke3) > 0) {
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke2;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1777minOfMShoTSo(long[] minOf, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m1123isEmptyimpl(minOf)) {
            R rInvoke2 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOf, 0)));
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke3 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOf, i)));
                    if (rInvoke2.compareTo(rInvoke3) > 0) {
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke2;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1780minOfjgv0xPQ(int[] minOf, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m1044isEmptyimpl(minOf)) {
            R rInvoke2 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOf, 0)));
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke3 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOf, i)));
                    if (rInvoke2.compareTo(rInvoke3) > 0) {
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke2;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1783minOfxTcfx_M(short[] minOf, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m1228isEmptyimpl(minOf)) {
            R rInvoke2 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOf, 0)));
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke3 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOf, i)));
                    if (rInvoke2.compareTo(rInvoke3) > 0) {
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return rInvoke2;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1784minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m965isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOfOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UByte.m898boximpl(UByteArray.m962getw2LRezQ(minOfOrNull, i)));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1787minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m1123isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOfOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(ULong.m1054boximpl(ULongArray.m1120getsVKNKU(minOfOrNull, i)));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1790minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m1044isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOfOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UInt.m975boximpl(UIntArray.m1041getpVg5ArA(minOfOrNull, i)));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1793minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m1228isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R rInvoke2 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOfOrNull, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke3 = selector.invoke2(UShort.m1161boximpl(UShortArray.m1225getMh2AYeg(minOfOrNull, i)));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke2;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final byte m1808minOrThrowU(@NotNull byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!UByteArray.m965isEmptyimpl(min)) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(min, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(min);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(min, i);
                    if (Intrinsics.compare(bM962getw2LRezQ & 255, bM962getw2LRezQ2 & 255) > 0) {
                        bM962getw2LRezQ = bM962getw2LRezQ2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bM962getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final byte m1816minWithOrThrowU(@NotNull byte[] minWith, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UByteArray.m965isEmptyimpl(minWith)) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(minWith, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minWith);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(minWith, i);
                    if (comparator.compare(UByte.m898boximpl(bM962getw2LRezQ), UByte.m898boximpl(bM962getw2LRezQ2)) > 0) {
                        bM962getw2LRezQ = bM962getw2LRezQ2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bM962getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull UInt[] uIntArr) {
        Intrinsics.checkNotNullParameter(uIntArr, "<this>");
        int iM981constructorimpl = 0;
        for (UInt uInt : uIntArr) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + uInt.m1033unboximpl());
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull ULong[] uLongArr) {
        Intrinsics.checkNotNullParameter(uLongArr, "<this>");
        long jM1060constructorimpl = 0;
        for (ULong uLong : uLongArr) {
            jM1060constructorimpl = ULong.m1060constructorimpl(jM1060constructorimpl + uLong.m1112unboximpl());
        }
        return jM1060constructorimpl;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "maxByOrThrow-U")
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m1712maxByOrThrowU(byte[] maxBy, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m965isEmptyimpl(maxBy)) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(maxBy, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
            if (lastIndex == 0) {
                return bM962getw2LRezQ;
            }
            R rInvoke2 = selector.invoke2(UByte.m898boximpl(bM962getw2LRezQ));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(maxBy, i);
                    R rInvoke3 = selector.invoke2(UByte.m898boximpl(bM962getw2LRezQ2));
                    if (rInvoke2.compareTo(rInvoke3) < 0) {
                        bM962getw2LRezQ = bM962getw2LRezQ2;
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bM962getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "minByOrThrow-U")
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m1768minByOrThrowU(byte[] minBy, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m965isEmptyimpl(minBy)) {
            byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(minBy, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
            if (lastIndex == 0) {
                return bM962getw2LRezQ;
            }
            R rInvoke2 = selector.invoke2(UByte.m898boximpl(bM962getw2LRezQ));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(minBy, i);
                    R rInvoke3 = selector.invoke2(UByte.m898boximpl(bM962getw2LRezQ2));
                    if (rInvoke2.compareTo(rInvoke3) > 0) {
                        bM962getw2LRezQ = bM962getw2LRezQ2;
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return bM962getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final short m1755maxOrThrowU(@NotNull short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!UShortArray.m1228isEmptyimpl(max)) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(max, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(max);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(max, i);
                    if (Intrinsics.compare(sM1225getMh2AYeg & UShort.MAX_VALUE, 65535 & sM1225getMh2AYeg2) < 0) {
                        sM1225getMh2AYeg = sM1225getMh2AYeg2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sM1225getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final short m1763maxWithOrThrowU(@NotNull short[] maxWith, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UShortArray.m1228isEmptyimpl(maxWith)) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(maxWith, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWith);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(maxWith, i);
                    if (comparator.compare(UShort.m1161boximpl(sM1225getMh2AYeg), UShort.m1161boximpl(sM1225getMh2AYeg2)) < 0) {
                        sM1225getMh2AYeg = sM1225getMh2AYeg2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sM1225getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final short m1811minOrThrowU(@NotNull short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!UShortArray.m1228isEmptyimpl(min)) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(min, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(min);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(min, i);
                    if (Intrinsics.compare(sM1225getMh2AYeg & UShort.MAX_VALUE, 65535 & sM1225getMh2AYeg2) > 0) {
                        sM1225getMh2AYeg = sM1225getMh2AYeg2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sM1225getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final short m1819minWithOrThrowU(@NotNull short[] minWith, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UShortArray.m1228isEmptyimpl(minWith)) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(minWith, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minWith);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(minWith, i);
                    if (comparator.compare(UShort.m1161boximpl(sM1225getMh2AYeg), UShort.m1161boximpl(sM1225getMh2AYeg2)) > 0) {
                        sM1225getMh2AYeg = sM1225getMh2AYeg2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sM1225getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "maxByOrThrow-U")
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m1715maxByOrThrowU(short[] maxBy, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m1228isEmptyimpl(maxBy)) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(maxBy, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
            if (lastIndex == 0) {
                return sM1225getMh2AYeg;
            }
            R rInvoke2 = selector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(maxBy, i);
                    R rInvoke3 = selector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg2));
                    if (rInvoke2.compareTo(rInvoke3) < 0) {
                        sM1225getMh2AYeg = sM1225getMh2AYeg2;
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sM1225getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "minByOrThrow-U")
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m1771minByOrThrowU(short[] minBy, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m1228isEmptyimpl(minBy)) {
            short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(minBy, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
            if (lastIndex == 0) {
                return sM1225getMh2AYeg;
            }
            R rInvoke2 = selector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(minBy, i);
                    R rInvoke3 = selector.invoke2(UShort.m1161boximpl(sM1225getMh2AYeg2));
                    if (rInvoke2.compareTo(rInvoke3) > 0) {
                        sM1225getMh2AYeg = sM1225getMh2AYeg2;
                        rInvoke2 = rInvoke3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return sM1225getMh2AYeg;
        }
        throw new NoSuchElementException();
    }
}
