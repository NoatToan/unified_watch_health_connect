package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.discovery.jsbridge.function.content.NavigateContent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.upnp.RootDescription;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0080\u0001\u0010\t\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042.\u0010\b\u001a*\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000\u001a@\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001aG\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ak\u0010\u0014\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042\u0012\u0010\u0012\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\u00102&\u0010\u0013\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0007\u001a \u0010 \u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007\u001a\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0016H\u0007\u001a\u0014\u0010%\u001a\u00020\u0007*\u00020\"2\u0006\u0010$\u001a\u00020#H\u0000\u001aP\u0010,\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010)j\b\u0012\u0004\u0012\u00028\u0001`*0(j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010)j\b\u0012\u0004\u0012\u00028\u0001`*`+\"\u0004\b\u0000\u0010&\"\u0004\b\u0001\u0010'H\u0002\u001aa\u0010.\u001a\u00020\f\"\u0004\b\u0000\u0010&\"\u0004\b\u0001\u0010'*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010)0(j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010)j\b\u0012\u0004\u0012\u00028\u0001`*`+2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010-\u001a\u00028\u0001H\u0002¢\u0006\u0004\b.\u0010/\u001ac\u00100\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010&\"\u0004\b\u0001\u0010'*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010)0(j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010)j\b\u0012\u0004\u0012\u00028\u0001`*`+2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010-\u001a\u00028\u0001H\u0002¢\u0006\u0004\b0\u00101\u001a[\u00102\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010&\"\u0004\b\u0001\u0010'*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010)0(j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010)j\b\u0012\u0004\u0012\u00028\u0001`*`+2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b2\u00103\u001a(\u00106\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\u00022\b\u00105\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\u001a\u0010:\u001a\u00020\u001f*\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020\u001fH\u0002\u001a,\u0010>\u001a\u00020\u0007*\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010\u0002H\u0002\u001a$\u0010A\u001a\u0004\u0018\u000108*\b\u0012\u0004\u0012\u000208072\u0006\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\u001fH\u0002\u001a\u001c\u0010B\u001a\u0004\u0018\u000108*\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020\u001fH\u0002\u001a\"\u0010C\u001a\u00020\u0007*\b\u0012\u0004\u0012\u000208072\u0006\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\u001fH\u0002\u001a\f\u0010D\u001a\u00020\u001f*\u00020\fH\u0002\u001a\f\u0010E\u001a\u00020\f*\u00020\u001fH\u0002\u001a*\u0010H\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00162\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00020\u00070\u0018¢\u0006\u0002\bFH\u0000¢\u0006\u0004\bH\u0010I\u001a0\u0010J\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u001c\u001a\u00020\u00162\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0002\bFH\u0000¢\u0006\u0004\bJ\u0010K\u001a\u001c\u0010O\u001a\u00020\u001f*\u00020L2\u0006\u0010M\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u001fH\u0002\u001a$\u0010S\u001a\u00020\u001f*\u00020L2\u0006\u0010P\u001a\u00020\u001f2\u0006\u0010Q\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020\u001fH\u0002\u001a\"\u0010U\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\f2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0080\bø\u0001\u0000\u001a\u0010\u0010U\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\fH\u0000\u001a\u0010\u0010X\u001a\u00020W2\u0006\u0010V\u001a\u00020\u001dH\u0000\"c\u0010`\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030Z¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(]\u0012\u0013\u0012\u00110\"¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(^\u0012\u0013\u0012\u00110#¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00070Yj\u0002`_8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010a\"c\u0010b\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030Z¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(]\u0012\u0013\u0012\u00110\"¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(^\u0012\u0013\u0012\u00110#¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00070Yj\u0002`_8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010a\"c\u0010c\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030Z¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(]\u0012\u0013\u0012\u00110\"¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(^\u0012\u0013\u0012\u00110#¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00070Yj\u0002`_8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010a\"\u0016\u0010d\u001a\u00020\u001f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010e\"\u0016\u0010f\u001a\u00020\u001f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010e\"\u0016\u0010g\u001a\u00020\u001f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bg\u0010e\"\u001c\u0010h\u001a\u00020\u001f8\u0000@\u0001X\u0081T¢\u0006\f\n\u0004\bh\u0010e\u0012\u0004\bi\u0010j\"\"\u0010k\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\bk\u0010l\u0012\u0004\bo\u0010j\u001a\u0004\bm\u0010n\"\u001c\u0010p\u001a\u00020\u001f8\u0000@\u0001X\u0081T¢\u0006\f\n\u0004\bp\u0010e\u0012\u0004\bq\u0010j\"\"\u0010r\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\br\u0010l\u0012\u0004\bt\u0010j\u001a\u0004\bs\u0010n\"\u001c\u0010u\u001a\u00020\u001f8\u0000@\u0001X\u0081T¢\u0006\f\n\u0004\bu\u0010e\u0012\u0004\bv\u0010j\"\"\u0010w\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\bw\u0010l\u0012\u0004\by\u0010j\u001a\u0004\bx\u0010n\"\u001c\u0010z\u001a\u00020\u001f8\u0000@\u0001X\u0081T¢\u0006\f\n\u0004\bz\u0010e\u0012\u0004\b{\u0010j\"\"\u0010|\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b|\u0010l\u0012\u0004\b~\u0010j\u001a\u0004\b}\u0010n\"\u001d\u0010\u007f\u001a\u00020\u001f8\u0000@\u0001X\u0081T¢\u0006\r\n\u0004\b\u007f\u0010e\u0012\u0005\b\u0080\u0001\u0010j\"&\u0010\u0081\u0001\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010l\u0012\u0005\b\u0083\u0001\u0010j\u001a\u0005\b\u0082\u0001\u0010n\"\u001f\u0010\u0084\u0001\u001a\u00020\u001f8\u0000@\u0001X\u0081T¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010e\u0012\u0005\b\u0085\u0001\u0010j\"&\u0010\u0086\u0001\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010l\u0012\u0005\b\u0088\u0001\u0010j\u001a\u0005\b\u0087\u0001\u0010n\"\u001f\u0010\u0089\u0001\u001a\u00020\u001f8\u0000@\u0001X\u0081T¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010e\u0012\u0005\b\u008a\u0001\u0010j\"\u001e\u0010\u008e\u0001\u001a\u00020\u0002*\u00030\u008b\u00018B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001*\u009f\u0001\b\u0000\u0010\u008f\u0001\"K\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030Z¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(]\u0012\u0013\u0012\u00110\"¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(^\u0012\u0013\u0012\u00110#¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00070Y2K\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030Z¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(]\u0012\u0013\u0012\u00110\"¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(^\u0012\u0013\u0012\u00110#¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00070Y*E\b\u0000\u0010\u0090\u0001\"\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0091\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "Lkotlin/Function1;", "", "", "mutator", "mutate", ExifInterface.GPS_DIRECTION_TRUE, "key", "", SearchCriteria.CONTAINS, "getValueOf", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "parentScope", "compositionLocalMapOf", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/Composer;", "invalid", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "cache", "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", g.c, "", "sourceInformation", "", "sourceInformationMarkerStart", "sourceInformationMarkerEnd", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "removeCurrentGroup", "K", "V", "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "multiMap", "value", DataItem.HTTP_METHOD_PUT, "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "remove", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Unit;", "pop", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "left", "right", "getKey", "", "Landroidx/compose/runtime/Invalidation;", "location", "findLocation", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", DefaultSettingsSpiCall.n, "insertIfMissing", "start", "end", "firstInRange", "removeLocation", "removeRange", "asInt", "asBool", "Landroidx/compose/runtime/Composable;", "composable", "invokeComposable", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)V", "invokeComposableForResult", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotReader;", "index", RootDescription.ROOT_ELEMENT, "distanceFrom", "a", "b", NavigateContent.TOPIC_COMMON_TYPE, "nearestCommonRootOf", "lazyMessage", "runtimeCheck", "message", "", "composeRuntimeError", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Lkotlin/ParameterName;", "name", "applier", "slots", "Landroidx/compose/runtime/Change;", "removeCurrentGroupInstance", "Lkotlin/jvm/functions/Function3;", "endGroupInstance", "startRootGroup", "rootKey", LogUtil.I, "nodeKey", "nodeKeyReplace", "invocationKey", "getInvocationKey$annotations", "()V", "invocation", "Ljava/lang/Object;", "getInvocation", "()Ljava/lang/Object;", "getInvocation$annotations", "providerKey", "getProviderKey$annotations", "provider", "getProvider", "getProvider$annotations", "compositionLocalMapKey", "getCompositionLocalMapKey$annotations", "compositionLocalMap", "getCompositionLocalMap", "getCompositionLocalMap$annotations", "providerValuesKey", "getProviderValuesKey$annotations", "providerValues", "getProviderValues", "getProviderValues$annotations", "providerMapsKey", "getProviderMapsKey$annotations", "providerMaps", "getProviderMaps", "getProviderMaps$annotations", "referenceKey", "getReferenceKey$annotations", "reference", "getReference", "getReference$annotations", "reuseKey", "getReuseKey$annotations", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "joinedKey", "Change", "CompositionLocalMap", "runtime_release"}, k = 2, mv = {1, 5, 1})
public final class ComposerKt {
    public static final int compositionLocalMapKey = 202;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    private static final int nodeKeyReplace = 126;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;

    @NotNull
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> removeCurrentGroupInstance = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$removeCurrentGroupInstance$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            invoke2(applier, slotWriter, rememberManager);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    };

    @NotNull
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> endGroupInstance = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$endGroupInstance$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            invoke2(applier, slotWriter, rememberManager);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.endGroup();
        }
    };

    @NotNull
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> startRootGroup = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$startRootGroup$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            invoke2(applier, slotWriter, rememberManager);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.ensureStarted(0);
        }
    };

    @NotNull
    private static final Object invocation = new OpaqueKey("provider");

    @NotNull
    private static final Object provider = new OpaqueKey("provider");

    @NotNull
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");

    @NotNull
    private static final Object providerValues = new OpaqueKey("providerValues");

    @NotNull
    private static final Object providerMaps = new OpaqueKey("providers");

    @NotNull
    private static final Object reference = new OpaqueKey("reference");

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }

    @ComposeCompilerApi
    public static final <T> T cache(@NotNull Composer composer, boolean z, @NotNull Function0<? extends T> function0) {
        T t = (T) composer.rememberedValue();
        if (!z && t != Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T tInvoke = function0.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    @NotNull
    public static final Void composeRuntimeError(@NotNull String str) {
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocalMapOf(ProvidedValue<?>[] providedValueArr, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, Composer composer, int i) {
        composer.startReplaceableGroup(680852469);
        PersistentMap.Builder builder = ExtensionsKt.persistentHashMapOf().builder();
        int length = providedValueArr.length;
        int i2 = 0;
        while (i2 < length) {
            ProvidedValue<?> providedValue = providedValueArr[i2];
            i2++;
            if (providedValue.getCanOverride() || !contains(persistentMap, providedValue.getCompositionLocal())) {
                composer.startReplaceableGroup(1447931884);
                builder.put(providedValue.getCompositionLocal(), providedValue.getCompositionLocal().provided$runtime_release(providedValue.getValue(), composer, 72));
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1447932088);
                composer.endReplaceableGroup();
            }
        }
        PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapBuild = builder.build();
        composer.endReplaceableGroup();
        return persistentMapBuild;
    }

    public static final <T> boolean contains(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, @NotNull CompositionLocal<T> compositionLocal) {
        return persistentMap.containsKey(compositionLocal);
    }

    private static final int distanceFrom(SlotReader slotReader, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = slotReader.parent(i);
            i3++;
        }
        return i3;
    }

    private static final int findLocation(List<Invalidation> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iCompare = Intrinsics.compare(list.get(i3).getLocation(), i);
            if (iCompare < 0) {
                i2 = i3 + 1;
            } else {
                if (iCompare <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i, int i2) {
        int iFindLocation = findLocation(list, i);
        if (iFindLocation < 0) {
            iFindLocation = -(iFindLocation + 1);
        }
        if (iFindLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(iFindLocation);
        if (invalidation.getLocation() < i2) {
            return invalidation;
        }
        return null;
    }

    @NotNull
    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    @PublishedApi
    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    @NotNull
    public static final Object getInvocation() {
        return invocation;
    }

    @PublishedApi
    public static /* synthetic */ void getInvocation$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if ((!Intrinsics.areEqual(joinedKey.getLeft(), obj2) || !Intrinsics.areEqual(joinedKey.getRight(), obj3)) && (obj = getKey(joinedKey.getLeft(), obj2, obj3)) == null) {
            obj = getKey(joinedKey.getRight(), obj2, obj3);
        }
        return obj;
    }

    @NotNull
    public static final Object getProvider() {
        return provider;
    }

    @PublishedApi
    public static /* synthetic */ void getProvider$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderKey$annotations() {
    }

    @NotNull
    public static final Object getProviderMaps() {
        return providerMaps;
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    @NotNull
    public static final Object getProviderValues() {
        return providerValues;
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValues$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    @NotNull
    public static final Object getReference() {
        return reference;
    }

    @PublishedApi
    public static /* synthetic */ void getReference$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReuseKey$annotations() {
    }

    public static final <T> T getValueOf(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, @NotNull CompositionLocal<T> compositionLocal) {
        State<? extends Object> state = persistentMap.get(compositionLocal);
        if (state == null) {
            return null;
        }
        return (T) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List<Invalidation> list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iFindLocation = findLocation(list, i);
        IdentityArraySet identityArraySet = null;
        if (iFindLocation < 0) {
            int i2 = -(iFindLocation + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i2, new Invalidation(recomposeScopeImpl, i, identityArraySet));
            return;
        }
        if (obj == null) {
            list.get(iFindLocation).setInstances(null);
            return;
        }
        IdentityArraySet<Object> instances = list.get(iFindLocation).getInstances();
        if (instances == null) {
            return;
        }
        instances.add(obj);
    }

    public static final void invokeComposable(@NotNull Composer composer, @NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
        function2.invoke(composer, 1);
    }

    public static final <T> T invokeComposableForResult(@NotNull Composer composer, @NotNull Function2<? super Composer, ? super Integer, ? extends T> function2) {
        return function2.invoke(composer, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> multiMap() {
        return new HashMap<>();
    }

    @NotNull
    public static final PersistentMap<CompositionLocal<Object>, State<Object>> mutate(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, @NotNull Function1<? super Map<CompositionLocal<Object>, State<Object>>, Unit> function1) {
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = persistentMap.builder();
        function1.invoke(builder);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i == i3 || i2 == i3) {
            return i3;
        }
        if (slotReader.parent(i) == i2) {
            return i2;
        }
        if (slotReader.parent(i2) == i) {
            return i;
        }
        if (slotReader.parent(i) == slotReader.parent(i2)) {
            return slotReader.parent(i);
        }
        int iDistanceFrom = distanceFrom(slotReader, i, i3);
        int iDistanceFrom2 = distanceFrom(slotReader, i2, i3);
        int i4 = iDistanceFrom - iDistanceFrom2;
        for (int i5 = 0; i5 < i4; i5++) {
            i = slotReader.parent(i);
        }
        int i6 = iDistanceFrom2 - iDistanceFrom;
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = slotReader.parent(i2);
        }
        while (i != i2) {
            i = slotReader.parent(i);
            i2 = slotReader.parent(i2);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V pop(HashMap<K, LinkedHashSet<V>> map, K k) {
        V v;
        LinkedHashSet<V> linkedHashSet = map.get(k);
        if (linkedHashSet == null || (v = (V) CollectionsKt.firstOrNull(linkedHashSet)) == null) {
            return null;
        }
        remove(map, k, v);
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean put(HashMap<K, LinkedHashSet<V>> map, K k, V v) {
        LinkedHashSet<V> linkedHashSet = map.get(k);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            map.put(k, linkedHashSet);
        }
        return linkedHashSet.add(v);
    }

    private static final <K, V> Unit remove(HashMap<K, LinkedHashSet<V>> map, K k, V v) {
        LinkedHashSet<V> linkedHashSet = map.get(k);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v);
        if (linkedHashSet.isEmpty()) {
            map.remove(k);
        }
        return Unit.INSTANCE;
    }

    public static final void removeCurrentGroup(@NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
        RecomposeScopeImpl recomposeScopeImpl;
        CompositionImpl composition;
        Iterator<Object> itGroupSlots = slotWriter.groupSlots();
        while (itGroupSlots.hasNext()) {
            Object next = itGroupSlots.next();
            if (next instanceof RememberObserver) {
                rememberManager.forgetting((RememberObserver) next);
            } else if ((next instanceof RecomposeScopeImpl) && (composition = (recomposeScopeImpl = (RecomposeScopeImpl) next).getComposition()) != null) {
                composition.setPendingInvalidScopes$runtime_release(true);
                recomposeScopeImpl.setComposition(null);
            }
        }
        slotWriter.removeGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i) {
        int iFindLocation = findLocation(list, i);
        if (iFindLocation >= 0) {
            return list.remove(iFindLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i, int i2) {
        int iFindLocation = findLocation(list, i);
        if (iFindLocation < 0) {
            iFindLocation = -(iFindLocation + 1);
        }
        while (iFindLocation < list.size() && list.get(iFindLocation).getLocation() < i2) {
            list.remove(iFindLocation);
        }
    }

    public static final void runtimeCheck(boolean z, @NotNull Function0<? extends Object> function0) {
        if (z) {
            return;
        }
        composeRuntimeError(function0.invoke().toString());
        throw new KotlinNothingValueException();
    }

    @ComposeCompilerApi
    public static final void sourceInformation(@NotNull Composer composer, @NotNull String str) {
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(@NotNull Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(@NotNull Composer composer, int i, @NotNull String str) {
        composer.sourceInformationMarkerStart(i, str);
    }

    public static final void runtimeCheck(boolean z) {
        if (z) {
            return;
        }
        composeRuntimeError("Check failed".toString());
        throw new KotlinNothingValueException();
    }
}
