package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003stuB!\b\u0001\u0012\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f\u0012\u0006\u0010g\u001a\u00020\b¢\u0006\u0004\bq\u0010rJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u0006\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u000bJ\u001c\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u001c\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0017\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086\bJ\u0017\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bJ\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u000e\u0010\u0010J\u001c\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J+\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J+\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J\u0006\u0010\u0018\u001a\u00020\nJ\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u0007J\u0014\u0010\u001a\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u0010\u001a\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010\u001a\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010\u001c\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\bJ\r\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J2\u0010\u001f\u001a\u00028\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001f\u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\"\u0010 J4\u0010\"\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\"\u0010!JU\u0010*\u001a\u00028\u0001\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00012'\u0010)\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b*\u0010+Jj\u0010-\u001a\u00028\u0001\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00012<\u0010)\u001a8\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b-\u0010.JU\u0010/\u001a\u00028\u0001\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00012'\u0010)\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u00010%H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b/\u0010+Jj\u00100\u001a\u00028\u0001\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00012<\u0010)\u001a8\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u00010,H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b0\u0010.J+\u00102\u001a\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J1\u00103\u001a\u00020\n2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0%H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J+\u00104\u001a\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J1\u00105\u001a\u00020\n2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0%H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u00106\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\n¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b8\u00109J+\u0010:\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J+\u0010;\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010<\u001a\u00020\u0005J\u0006\u0010=\u001a\u00020\u0005J\r\u0010>\u001a\u00028\u0000¢\u0006\u0004\b>\u0010 J2\u0010>\u001a\u00028\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b>\u0010!J\u0015\u0010?\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b?\u00109J\u0012\u0010@\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b@\u0010 J4\u0010@\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b@\u0010!J@\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0006\b\u0001\u0010#\u0018\u00012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bB\u0010CJU\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0006\b\u0001\u0010#\u0018\u00012'\u0010A\u001a#\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bD\u0010EJP\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010#\u0018\u00012)\u0010A\u001a%\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010%H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J;\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010#\u0018\u00012\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u0010H\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bJ\u0010IJ\u0015\u0010K\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\bK\u0010\u0007J\u0014\u0010L\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u0010L\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010L\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0015\u0010M\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bM\u00107J\u0016\u0010P\u001a\u00020\n2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bJ\u0014\u0010Q\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J \u0010R\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bR\u0010SJ\u001e\u0010W\u001a\u00020\n2\u0016\u0010V\u001a\u0012\u0012\u0004\u0012\u00028\u00000Tj\b\u0012\u0004\u0012\u00028\u0000`UJ+\u0010Y\u001a\u00020\b2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010[\u001a\u00020ZH\u0001R0\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\\\u0010]\u0012\u0004\bb\u0010c\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001e\u0010d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR$\u0010g\u001a\u00020\b2\u0006\u0010f\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020\b8Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\bk\u0010jR\u0014\u0010p\u001a\u00020m8Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\bn\u0010o\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006v"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "element", "", TransportUri.ACTION_ADD, "(Ljava/lang/Object;)Z", "", "index", "", "(ILjava/lang/Object;)V", "", MessengerShareContentUtility.ELEMENTS, "addAll", "", "([Ljava/lang/Object;)Z", "", "Lkotlin/Function1;", "predicate", "any", "reversedAny", "", "asMutableList", "clear", SearchCriteria.CONTAINS, "containsAll", "other", "contentEquals", "capacity", "ensureCapacity", StatEvent.TP_FIRST, "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "R", "initial", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", TransportUri.ACTION_BLOCK, "forEach", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "transform", SportAnalytics.ParamValue.MapButtonType.MAP, "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "mapNotNull", "plusAssign", "(Ljava/lang/Object;)V", "minusAssign", "remove", "removeAll", "removeAt", "start", "end", "removeRange", "retainAll", WatchFaceArrivingEvent.CMD_SET, "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "sortWith", "selector", "sumBy", "", "throwNoSuchElementException", "content", "[Ljava/lang/Object;", "getContent", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "getContent$annotations", "()V", "list", "Ljava/util/List;", "<set-?>", "size", LogUtil.I, "getSize", "()I", "getLastIndex", "lastIndex", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "<init>", "([Ljava/lang/Object;I)V", "MutableVectorList", "SubList", "VectorListIterator", "runtime_release"}, k = 1, mv = {1, 5, 1})
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;

    @NotNull
    private T[] content;

    @Nullable
    private List<T> list;
    private int size;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010$¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", ExifInterface.GPS_DIRECTION_TRUE, "", "element", "", SearchCriteria.CONTAINS, "(Ljava/lang/Object;)Z", "", MessengerShareContentUtility.ELEMENTS, "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", TransportUri.ACTION_ADD, "", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "removeAt", "retainAll", WatchFaceArrivingEvent.CMD_SET, "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "Landroidx/compose/runtime/collection/MutableVector;", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "getSize", "()I", "size", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
    public static final class MutableVectorList<T> implements List<T>, KMutableList {

        @NotNull
        private final MutableVector<T> vector;

        public MutableVectorList(@NotNull MutableVector<T> mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.vector.add(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
            return this.vector.addAll(index, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.contains(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            return this.vector.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int index) {
            return this.vector.getContent()[index];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.indexOf(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.lastIndexOf(element);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            return this.vector.removeAll(elements);
        }

        public T removeAt(int index) {
            return this.vector.removeAt(index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            return this.vector.retainAll(elements);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            return this.vector.set(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int fromIndex, int toIndex) {
            return new SubList(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.vector.add(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            return this.vector.addAll(elements);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.remove(element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0015\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010&\u001a\u00020\n\u0012\u0006\u0010(\u001a\u00020\n¢\u0006\u0004\b,\u0010-J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010+\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", ExifInterface.GPS_DIRECTION_TRUE, "", "element", "", SearchCriteria.CONTAINS, "(Ljava/lang/Object;)Z", "", MessengerShareContentUtility.ELEMENTS, "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", TransportUri.ACTION_ADD, "", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "removeAt", "retainAll", WatchFaceArrivingEvent.CMD_SET, "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "list", "Ljava/util/List;", "start", LogUtil.I, "end", "getSize", "()I", "size", "<init>", "(Ljava/util/List;II)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
    public static final class SubList<T> implements List<T>, KMutableList {
        private int end;

        @NotNull
        private final List<T> list;
        private final int start;

        public SubList(@NotNull List<T> list, int i, int i2) {
            this.list = list;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i = this.end;
            this.end = i + 1;
            list.add(i, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
            this.list.addAll(index + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    int i3 = i - 1;
                    this.list.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i = i3;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i = this.start;
            int i2 = this.end;
            if (i >= i2) {
                return false;
            }
            while (true) {
                int i3 = i + 1;
                if (Intrinsics.areEqual(this.list.get(i), element)) {
                    return true;
                }
                if (i3 >= i2) {
                    return false;
                }
                i = i3;
            }
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Iterator<T> it2 = elements.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int index) {
            return this.list.get(index + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i = this.start;
            int i2 = this.end;
            if (i >= i2) {
                return -1;
            }
            while (true) {
                int i3 = i + 1;
                if (Intrinsics.areEqual(this.list.get(i), element)) {
                    return i - this.start;
                }
                if (i3 >= i2) {
                    return -1;
                }
                i = i3;
            }
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 > i) {
                return -1;
            }
            while (true) {
                int i3 = i - 1;
                if (Intrinsics.areEqual(this.list.get(i), element)) {
                    return i - this.start;
                }
                if (i == i2) {
                    return -1;
                }
                i = i3;
            }
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            int i = this.end;
            Iterator<T> it2 = elements.iterator();
            while (it2.hasNext()) {
                remove(it2.next());
            }
            return i != this.end;
        }

        public T removeAt(int index) {
            T tRemove = this.list.remove(index + this.start);
            this.end--;
            return tRemove;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            int i = this.end;
            int i2 = i - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    int i4 = i2 - 1;
                    if (!elements.contains(this.list.get(i2))) {
                        this.list.remove(i2);
                        this.end--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2 = i4;
                }
            }
            return i != this.end;
        }

        @Override // java.util.List
        public T set(int index, T element) {
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int fromIndex, int toIndex) {
            return new SubList(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i = this.start;
            int i2 = this.end;
            if (i >= i2) {
                return false;
            }
            while (true) {
                int i3 = i + 1;
                if (Intrinsics.areEqual(this.list.get(i), element)) {
                    this.list.remove(i);
                    this.end--;
                    return true;
                }
                if (i3 >= i2) {
                    return false;
                }
                i = i3;
            }
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "remove", "hasPrevious", "", "nextIndex", "previous", "previousIndex", "element", TransportUri.ACTION_ADD, "(Ljava/lang/Object;)V", WatchFaceArrivingEvent.CMD_SET, "", "list", "Ljava/util/List;", "index", LogUtil.I, "<init>", "(Ljava/util/List;I)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
    public static final class VectorListIterator<T> implements ListIterator<T>, KMutableListIterator {
        private int index;

        @NotNull
        private final List<T> list;

        public VectorListIterator(@NotNull List<T> list, int i) {
            this.list = list;
            this.index = i;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i = this.index;
            this.index = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.index - 1;
            this.index = i;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.index - 1;
            this.index = i;
            this.list.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.index, element);
        }
    }

    @PublishedApi
    public MutableVector(@NotNull T[] tArr, int i) {
        this.content = tArr;
        this.size = i;
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean add(T element) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i = this.size;
        tArr[i] = element;
        this.size = i + 1;
        return true;
    }

    public final boolean addAll(int index, @NotNull List<? extends T> elements) {
        int i = 0;
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + elements.size());
        T[] tArr = this.content;
        if (index != this.size) {
            ArraysKt.copyInto(tArr, tArr, elements.size() + index, index, this.size);
        }
        int size = elements.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                tArr[index + i] = elements.get(i);
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        this.size += elements.size();
        return true;
    }

    public final boolean any(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            while (!predicate.invoke(content[i]).booleanValue()) {
                i++;
                if (i >= size) {
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        T[] tArr = this.content;
        int size = getSize() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                tArr[size] = null;
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        this.size = 0;
    }

    public final boolean contains(T element) {
        int size = getSize() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (Intrinsics.areEqual(getContent()[i], element)) {
                    return true;
                }
                if (i != size) {
                    i = i2;
                }
            }
        }
        return false;
    }

    public final boolean containsAll(@NotNull List<? extends T> elements) {
        int size = elements.size() - 1;
        if (size < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!contains(elements.get(i))) {
                return false;
            }
            if (i2 > size) {
                return true;
            }
            i = i2;
        }
    }

    public final boolean contentEquals(@NotNull MutableVector<T> other) {
        if (other.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!Intrinsics.areEqual(other.getContent()[i], getContent()[i])) {
                    return false;
                }
                if (i != size) {
                    i = i2;
                }
            }
        }
        return true;
    }

    public final void ensureCapacity(int capacity) {
        T[] tArr = this.content;
        if (tArr.length < capacity) {
            this.content = (T[]) Arrays.copyOf(tArr, Math.max(capacity, tArr.length * 2));
        }
    }

    public final T first() {
        if (isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return getContent()[0];
    }

    @Nullable
    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R fold(R initial, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        int size = getSize();
        if (size > 0) {
            int i = 0;
            T[] content = getContent();
            do {
                initial = operation.invoke(initial, content[i]);
                i++;
            } while (i < size);
        }
        return initial;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldIndexed(R initial, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        int size = getSize();
        if (size > 0) {
            int i = 0;
            T[] content = getContent();
            do {
                initial = operation.invoke(Integer.valueOf(i), initial, content[i]);
                i++;
            } while (i < size);
        }
        return initial;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRight(R initial, @NotNull Function2<? super T, ? super R, ? extends R> operation) {
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                initial = operation.invoke(content[i], initial);
                i--;
            } while (i >= 0);
        }
        return initial;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRightIndexed(R initial, @NotNull Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                initial = operation.invoke(Integer.valueOf(i), content[i], initial);
                i--;
            } while (i >= 0);
        }
        return initial;
    }

    public final void forEach(@NotNull Function1<? super T, Unit> block) {
        int size = getSize();
        if (size > 0) {
            int i = 0;
            T[] content = getContent();
            do {
                block.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachIndexed(@NotNull Function2<? super Integer, ? super T, Unit> block) {
        int size = getSize();
        if (size > 0) {
            int i = 0;
            T[] content = getContent();
            do {
                block.invoke(Integer.valueOf(i), content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachReversed(@NotNull Function1<? super T, Unit> block) {
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                block.invoke(content[i]);
                i--;
            } while (i >= 0);
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2<? super Integer, ? super T, Unit> block) {
        if (getSize() > 0) {
            int size = getSize() - 1;
            T[] content = getContent();
            do {
                block.invoke(Integer.valueOf(size), content[size]);
                size--;
            } while (size >= 0);
        }
    }

    public final T get(int index) {
        return getContent()[index];
    }

    @NotNull
    public final T[] getContent() {
        return this.content;
    }

    @NotNull
    public final IntRange getIndices() {
        return new IntRange(0, getSize() - 1);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T element) {
        int i = this.size;
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        T[] tArr = this.content;
        while (!Intrinsics.areEqual(element, tArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    public final int indexOfFirst(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size <= 0) {
            return -1;
        }
        int i = 0;
        T[] content = getContent();
        while (!predicate.invoke(content[i]).booleanValue()) {
            i++;
            if (i >= size) {
                return -1;
            }
        }
        return i;
    }

    public final int indexOfLast(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size <= 0) {
            return -1;
        }
        int i = size - 1;
        T[] content = getContent();
        while (!predicate.invoke(content[i]).booleanValue()) {
            i--;
            if (i < 0) {
                return -1;
            }
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size != 0;
    }

    public final T last() {
        if (isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return getContent()[getSize() - 1];
    }

    public final int lastIndexOf(T element) {
        int i = this.size;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        T[] tArr = this.content;
        while (!Intrinsics.areEqual(element, tArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    @Nullable
    public final T lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[getSize() - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] map(Function1<? super T, ? extends R> transform) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = transform.invoke(getContent()[i]);
        }
        return rArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] mapIndexed(Function2<? super Integer, ? super T, ? extends R> transform) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = transform.invoke(Integer.valueOf(i), getContent()[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(Function2<? super Integer, ? super T, ? extends R> transform) {
        int size = getSize();
        int i = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                R rInvoke = transform.invoke(Integer.valueOf(i), content[i]);
                if (rInvoke != null) {
                    objArr[i2] = rInvoke;
                    i2++;
                }
                i++;
            } while (i < size);
            i = i2;
        }
        return new MutableVector<>(objArr, i);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(Function1<? super T, ? extends R> transform) {
        int size = getSize();
        int i = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                R rInvoke = transform.invoke(content[i]);
                if (rInvoke != null) {
                    objArr[i2] = rInvoke;
                    i2++;
                }
                i++;
            } while (i < size);
            i = i2;
        }
        return new MutableVector<>(objArr, i);
    }

    public final void minusAssign(T element) {
        remove(element);
    }

    public final void plusAssign(T element) {
        add(element);
    }

    public final boolean remove(T element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@NotNull List<? extends T> elements) {
        int i = this.size;
        int size = elements.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                remove(elements.get(i2));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        return i != this.size;
    }

    public final T removeAt(int index) {
        T[] tArr = this.content;
        T t = tArr[index];
        if (index != getSize() - 1) {
            ArraysKt.copyInto(tArr, tArr, index, index + 1, this.size);
        }
        int i = this.size - 1;
        this.size = i;
        tArr[i] = null;
        return t;
    }

    public final void removeRange(int start, int end) {
        if (end > start) {
            int i = this.size;
            if (end < i) {
                T[] tArr = this.content;
                ArraysKt.copyInto(tArr, tArr, start, end, i);
            }
            int i2 = this.size - (end - start);
            int size = getSize() - 1;
            if (i2 <= size) {
                int i3 = i2;
                while (true) {
                    int i4 = i3 + 1;
                    this.content[i3] = null;
                    if (i3 == size) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            this.size = i2;
        }
    }

    public final boolean retainAll(@NotNull Collection<? extends T> elements) {
        int i = this.size;
        int size = getSize() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                if (!elements.contains(getContent()[size])) {
                    removeAt(size);
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
        }
        return i != this.size;
    }

    public final boolean reversedAny(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size <= 0) {
            return false;
        }
        int i = size - 1;
        T[] content = getContent();
        while (!predicate.invoke(content[i]).booleanValue()) {
            i--;
            if (i < 0) {
                return false;
            }
        }
        return true;
    }

    public final T set(int index, T element) {
        T[] tArr = this.content;
        T t = tArr[index];
        tArr[index] = element;
        return t;
    }

    public final void setContent(@NotNull T[] tArr) {
        this.content = tArr;
    }

    public final void sortWith(@NotNull Comparator<T> comparator) {
        ArraysKt___ArraysJvmKt.sortWith(this.content, comparator, 0, this.size);
    }

    public final int sumBy(@NotNull Function1<? super T, Integer> selector) {
        int size = getSize();
        int iIntValue = 0;
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                iIntValue += selector.invoke(content[i]).intValue();
                i++;
            } while (i < size);
        }
        return iIntValue;
    }

    @PublishedApi
    @NotNull
    public final Void throwNoSuchElementException() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    public final boolean containsAll(@NotNull Collection<? extends T> elements) {
        Iterator<T> it2 = elements.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final T firstOrNull(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        int i = 0;
        T[] content = getContent();
        do {
            T t = content[i];
            if (predicate.invoke(t).booleanValue()) {
                return t;
            }
            i++;
        } while (i < size);
        return null;
    }

    public final void add(int index, T element) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i = this.size;
        if (index != i) {
            ArraysKt.copyInto(tArr, tArr, index + 1, index, i);
        }
        tArr[index] = element;
        this.size++;
    }

    public final T first(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size > 0) {
            int i = 0;
            T[] content = getContent();
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i++;
            } while (i < size);
        }
        throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    @Nullable
    public final T lastOrNull(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        int i = size - 1;
        T[] content = getContent();
        do {
            T t = content[i];
            if (predicate.invoke(t).booleanValue()) {
                return t;
            }
            i--;
        } while (i >= 0);
        return null;
    }

    public final boolean containsAll(@NotNull MutableVector<T> elements) {
        IntRange intRange = new IntRange(0, elements.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (true) {
                int i = first + 1;
                if (!contains(elements.getContent()[first])) {
                    return false;
                }
                if (first != last) {
                    first = i;
                }
            }
        }
        return true;
    }

    public final T last(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i--;
            } while (i >= 0);
        }
        throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    public final boolean removeAll(@NotNull MutableVector<T> elements) {
        int i = this.size;
        int size = elements.getSize() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                remove(elements.getContent()[i2]);
                if (i2 == size) {
                    break;
                }
                i2 = i3;
            }
        }
        return i != this.size;
    }

    public final boolean removeAll(@NotNull Collection<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i = this.size;
        Iterator<T> it2 = elements.iterator();
        while (it2.hasNext()) {
            remove(it2.next());
        }
        return i != this.size;
    }

    public final boolean addAll(int index, @NotNull MutableVector<T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + elements.size);
        T[] tArr = this.content;
        int i = this.size;
        if (index != i) {
            ArraysKt.copyInto(tArr, tArr, elements.size + index, index, i);
        }
        ArraysKt.copyInto(elements.content, tArr, index, 0, elements.size);
        this.size += elements.size;
        return true;
    }

    public final boolean addAll(@NotNull List<? extends T> elements) {
        return addAll(getSize(), (List) elements);
    }

    public final boolean addAll(@NotNull MutableVector<T> elements) {
        return addAll(getSize(), elements);
    }

    public final boolean addAll(@NotNull T[] elements) {
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this.size + elements.length);
        ArraysKt___ArraysJvmKt.copyInto$default(elements, this.content, this.size, 0, 0, 12, (Object) null);
        return true;
    }

    public final boolean addAll(int index, @NotNull Collection<? extends T> elements) {
        int i = 0;
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + elements.size());
        T[] tArr = this.content;
        if (index != this.size) {
            ArraysKt.copyInto(tArr, tArr, elements.size() + index, index, this.size);
        }
        for (T t : elements) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            tArr[i + index] = t;
            i = i2;
        }
        this.size += elements.size();
        return true;
    }

    public final boolean addAll(@NotNull Collection<? extends T> elements) {
        return addAll(this.size, elements);
    }
}
