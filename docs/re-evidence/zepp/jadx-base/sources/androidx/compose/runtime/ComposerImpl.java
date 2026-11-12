package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.watch.notification.TransportUri;
import com.squareup.picasso.u;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import com.xiaomi.infra.galaxy.fds.bean.QuotaApply;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001:\u0004È\u0002É\u0002B¡\u0001\u0012\n\u0010Q\u001a\u0006\u0012\u0002\b\u00030N\u0012\b\u0010Ò\u0001\u001a\u00030´\u0001\u0012\b\u0010Õ\u0001\u001a\u00030Ô\u0001\u0012\u000f\u0010Ù\u0001\u001a\n\u0012\u0005\u0012\u00030Ø\u00010×\u0001\u0012[\u0010Ü\u0001\u001aV\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110R¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(S\u0012\u0013\u0012\u00110T¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\u00020Mj\u0002`V0Û\u0001\u0012\b\u0010ß\u0001\u001a\u00030Þ\u0001¢\u0006\u0006\bÆ\u0002\u0010Ç\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J(\u0010\u0011\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f0\rj\u0002`\u0010H\u0002Jx\u0010\u0014\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f0\rj\u0002`\u00102&\u0010\u0012\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f0\rj\u0002`\u00102&\u0010\u0013\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f0\rj\u0002`\u0010H\u0002JK\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2&\u0010\u0016\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f0\rj\u0002`\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0002J,\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010\"\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u001aH\u0002J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010'\u001a\u00020\u0002H\u0002J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0002J\u0018\u0010,\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0002J(\u00100\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002J\u0010\u00101\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0002J\u0018\u00103\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002J\b\u00104\u001a\u00020\u0002H\u0002J \u00108\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0002J\u0018\u0010:\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0002J \u0010<\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002J\u0014\u0010>\u001a\u00020\u0006*\u00020=2\u0006\u0010*\u001a\u00020\u0006H\u0002J\b\u0010?\u001a\u00020\u0002H\u0002J\b\u0010@\u001a\u00020\u0002H\u0002J@\u0010H\u001a\u00020\u00022\u001a\u0010D\u001a\u0016\u0012\u0004\u0012\u00020B\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010C0A2\u0013\u0010G\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010E¢\u0006\u0002\bFH\u0002¢\u0006\u0004\bH\u0010IJ\u0016\u0010J\u001a\u0004\u0018\u00010\t*\u00020=2\u0006\u0010(\u001a\u00020\u0006H\u0002J\b\u0010K\u001a\u00020\u0002H\u0002J\b\u0010L\u001a\u00020\u0002H\u0002J]\u0010X\u001a\u00020\u00022S\u0010W\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110R¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(S\u0012\u0013\u0012\u00110T¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\u00020Mj\u0002`VH\u0002J]\u0010Y\u001a\u00020\u00022S\u0010W\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110R¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(S\u0012\u0013\u0012\u00110T¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\u00020Mj\u0002`VH\u0002J]\u0010Z\u001a\u00020\u00022S\u0010W\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110R¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(S\u0012\u0013\u0012\u00110T¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\u00020Mj\u0002`VH\u0002Jg\u0010\\\u001a\u00020\u00022\b\b\u0002\u0010[\u001a\u00020\u001a2S\u0010W\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110R¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(S\u0012\u0013\u0012\u00110T¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\u00020Mj\u0002`VH\u0002J\b\u0010]\u001a\u00020\u0002H\u0002J\u001f\u0010`\u001a\u00020\u00022\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0^H\u0002¢\u0006\u0004\b`\u0010aJ\b\u0010`\u001a\u00020\u0002H\u0002J\u0012\u0010c\u001a\u00020\u00022\b\u0010b\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010d\u001a\u00020\u0002H\u0002J\u0012\u0010e\u001a\u00020\u00022\b\b\u0002\u0010[\u001a\u00020\u001aH\u0002J\u0010\u0010h\u001a\u00020\u00022\u0006\u0010g\u001a\u00020fH\u0002J]\u0010i\u001a\u00020\u00022S\u0010W\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110R¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(S\u0012\u0013\u0012\u00110T¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\u00020Mj\u0002`VH\u0002J]\u0010j\u001a\u00020\u00022S\u0010W\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110R¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(S\u0012\u0013\u0012\u00110T¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\u00020Mj\u0002`VH\u0002J\b\u0010k\u001a\u00020\u0002H\u0002J\b\u0010l\u001a\u00020\u0002H\u0002J\u0010\u0010n\u001a\u00020\u00022\u0006\u0010m\u001a\u00020\u0006H\u0002J\b\u0010o\u001a\u00020\u0002H\u0002J\b\u0010p\u001a\u00020\u0002H\u0002J\b\u0010q\u001a\u00020\u0002H\u0002J\b\u0010r\u001a\u00020\u0002H\u0002J\b\u0010s\u001a\u00020\u0002H\u0002J\u0018\u0010u\u001a\u00020\u00022\u0006\u0010t\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002J \u0010x\u001a\u00020\u00022\u0006\u0010v\u001a\u00020\u00062\u0006\u0010w\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002J\b\u0010y\u001a\u00020\u0002H\u0002J$\u0010{\u001a\u00020\u00022\u0006\u0010z\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010}\u001a\u00020\u00022\u0006\u0010|\u001a\u00020\u0006H\u0002J$\u0010~\u001a\u00020\u00022\u0006\u0010z\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u007f\u001a\u00020\u00022\u0006\u0010z\u001a\u00020\u0006H\u0002J\u0011\u0010\u0080\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\t\u0010\u0081\u0001\u001a\u00020\u0002H\u0017J\t\u0010\u0082\u0001\u001a\u00020\u0002H\u0017J\t\u0010\u0083\u0001\u001a\u00020\u0002H\u0017J\u001b\u0010\u0084\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017J\t\u0010\u0085\u0001\u001a\u00020\u0002H\u0017J\t\u0010\u0086\u0001\u001a\u00020\u0002H\u0017J\u0012\u0010\u0089\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\t\u0010\u008a\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u008b\u0001\u001a\u00020\u0002H\u0016J\u001e\u0010\u008d\u0001\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00152\r\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0016J\t\u0010\u008e\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u008f\u0001\u001a\u00020\u0002H\u0016J\u001b\u0010\u0090\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\t\u0010\u0091\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u0092\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u0093\u0001\u001a\u00020\u0002H\u0016JJ\u0010\u0099\u0001\u001a\u00020\u0002\"\u0005\b\u0000\u0010\u0094\u0001\"\u0004\b\u0001\u0010\u00152\u0007\u0010\u0095\u0001\u001a\u00028\u00002 \u0010\u0098\u0001\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0096\u0001¢\u0006\u0003\b\u0097\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001f\u0010\u009d\u0001\u001a\u00020\t2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\tH\u0017J\u000b\u0010\u009e\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0014\u0010\u009f\u0001\u001a\u00020\u001a2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\tH\u0017J\u0013\u0010\u009f\u0001\u001a\u00020\u001a2\b\u0010\u0095\u0001\u001a\u00030 \u0001H\u0017J\u0013\u0010\u009f\u0001\u001a\u00020\u001a2\b\u0010\u0095\u0001\u001a\u00030¡\u0001H\u0017J\u0013\u0010\u009f\u0001\u001a\u00020\u001a2\b\u0010\u0095\u0001\u001a\u00030¢\u0001H\u0017J\u0012\u0010\u009f\u0001\u001a\u00020\u001a2\u0007\u0010\u0095\u0001\u001a\u00020\u001aH\u0017J\u0013\u0010\u009f\u0001\u001a\u00020\u001a2\b\u0010\u0095\u0001\u001a\u00030£\u0001H\u0017J\u0013\u0010\u009f\u0001\u001a\u00020\u001a2\b\u0010\u0095\u0001\u001a\u00030¤\u0001H\u0017J\u0013\u0010\u009f\u0001\u001a\u00020\u001a2\b\u0010\u0095\u0001\u001a\u00030¥\u0001H\u0017J\u0012\u0010\u009f\u0001\u001a\u00020\u001a2\u0007\u0010\u0095\u0001\u001a\u00020\u0006H\u0017J4\u0010§\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0007\u0010¦\u0001\u001a\u00020\u001a2\r\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0087\bø\u0001\u0000¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0014\u0010©\u0001\u001a\u00020\u00022\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0014\u0010ª\u0001\u001a\u00020\u00022\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0018\u0010¬\u0001\u001a\u00020\u00022\r\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020EH\u0016J(\u0010¯\u0001\u001a\u00020\u00022\u0014\u0010®\u0001\u001a\u000f\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030\u00ad\u00010^H\u0017¢\u0006\u0006\b¯\u0001\u0010°\u0001J\t\u0010±\u0001\u001a\u00020\u0002H\u0017J&\u0010²\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0017¢\u0006\u0006\b²\u0001\u0010³\u0001J\n\u0010µ\u0001\u001a\u00030´\u0001H\u0016J%\u0010¹\u0001\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020B2\t\u0010¶\u0001\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\b·\u0001\u0010¸\u0001J\t\u0010º\u0001\u001a\u00020\u0002H\u0017J\t\u0010»\u0001\u001a\u00020\u0002H\u0017J\u0011\u0010¼\u0001\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\f\u0010¾\u0001\u001a\u0005\u0018\u00010½\u0001H\u0017J\u0013\u0010À\u0001\u001a\u00020\u00022\b\u0010À\u0001\u001a\u00030¿\u0001H\u0017J\u001b\u0010Á\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010À\u0001\u001a\u00030¿\u0001H\u0017J\t\u0010Â\u0001\u001a\u00020\u0002H\u0017J@\u0010Ä\u0001\u001a\u00020\u00022\u001a\u0010D\u001a\u0016\u0012\u0004\u0012\u00020B\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010C0A2\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00020\u00020E¢\u0006\u0002\bFH\u0000¢\u0006\u0005\bÃ\u0001\u0010IJ!\u0010Ç\u0001\u001a\u00020\u00022\r\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020EH\u0000¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J.\u0010Ê\u0001\u001a\u00020\u001a2\u001a\u0010D\u001a\u0016\u0012\u0004\u0012\u00020B\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010C0AH\u0000¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u000b\u0010Ë\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u0010Ì\u0001\u001a\u00020\u00022\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010Î\u0001\u001a\u00020\u00022\u0007\u0010\u0016\u001a\u00030Í\u0001H\u0016R#\u0010Q\u001a\u0006\u0012\u0002\b\u00030N8\u0016@\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bQ\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u001a\u0010Ò\u0001\u001a\u00030´\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u001a\u0010Õ\u0001\u001a\u00030Ô\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R!\u0010Ù\u0001\u001a\n\u0012\u0005\u0012\u00030Ø\u00010×\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001Rm\u0010Ü\u0001\u001aV\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110R¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(S\u0012\u0013\u0012\u00110T¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\u00020Mj\u0002`V0Û\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\"\u0010ß\u0001\u001a\u00030Þ\u00018\u0016@\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001R\"\u0010ä\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010 0ã\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u001b\u0010æ\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0017\u0010t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bt\u0010è\u0001R\u001a\u0010ê\u0001\u001a\u00030é\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u0019\u0010ì\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010è\u0001R\u001a\u0010í\u0001\u001a\u00030é\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010ë\u0001R\u001c\u0010ï\u0001\u001a\u0005\u0018\u00010î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R;\u0010ó\u0001\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010ñ\u0001j\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010õ\u0001R\u0019\u0010ö\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010õ\u0001R!\u0010ø\u0001\u001a\n\u0012\u0005\u0012\u00030÷\u00010Û\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010Ý\u0001R\u001a\u0010ù\u0001\u001a\u00030é\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bù\u0001\u0010ë\u0001R9\u0010ú\u0001\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f0\rj\u0002`\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001Rw\u0010ü\u0001\u001a`\u0012\u0004\u0012\u00020\u0006\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f0\rj\u0002`\u00100ñ\u0001j/\u0012\u0004\u0012\u00020\u0006\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f0\rj\u0002`\u0010`ò\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ô\u0001R\u0019\u0010ý\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010õ\u0001R\u001a\u0010þ\u0001\u001a\u00030é\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010ë\u0001R\u0019\u0010ÿ\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010õ\u0001R\u0019\u0010\u0080\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010è\u0001R\u0019\u0010\u0081\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010è\u0001R\u001a\u0010\u0083\u0002\u001a\u00030\u0082\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u0084\u0002R \u0010\u0085\u0002\u001a\t\u0012\u0004\u0012\u00020B0ã\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0002\u0010å\u0001R*\u0010\u0087\u0002\u001a\u00020\u001a2\u0007\u0010\u0086\u0002\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0087\u0002\u0010õ\u0001\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002R*\u0010\u008a\u0002\u001a\u00020\u001a2\u0007\u0010\u0086\u0002\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u008a\u0002\u0010õ\u0001\u001a\u0006\b\u008b\u0002\u0010\u0089\u0002R\u0019\u0010\u008c\u0002\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\"\u0010\u008e\u0002\u001a\u00030Ô\u00018\u0000@\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008e\u0002\u0010Ö\u0001\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R\u0019\u0010\u0091\u0002\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0019\u0010\u0093\u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010õ\u0001R\u0019\u0010\u0094\u0002\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0095\u0002Rm\u0010\u0096\u0002\u001aV\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110R¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(S\u0012\u0013\u0012\u00110T¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\u00020Mj\u0002`V0Û\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0002\u0010Ý\u0001R0\u0010$\u001a\u00020\u001a2\u0007\u0010\u0086\u0002\u001a\u00020\u001a8\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0005\b$\u0010õ\u0001\u0012\u0006\b\u0098\u0002\u0010\u0088\u0001\u001a\u0006\b\u0097\u0002\u0010\u0089\u0002R2\u0010\u0099\u0002\u001a\u00020\u00062\u0007\u0010\u0086\u0002\u001a\u00020\u00068\u0016@RX\u0097\u000e¢\u0006\u0018\n\u0006\b\u0099\u0002\u0010è\u0001\u0012\u0006\b\u009c\u0002\u0010\u0088\u0001\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0019\u0010\u009d\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010è\u0001R\"\u0010\u009e\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0002\u0010å\u0001R\u0019\u0010\u009f\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010è\u0001R\u0019\u0010 \u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0002\u0010õ\u0001R\u001a\u0010¡\u0002\u001a\u00030é\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010ë\u0001Rm\u0010¢\u0002\u001aV\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110R¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(S\u0012\u0013\u0012\u00110T¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\u00020Mj\u0002`V0ã\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0002\u0010å\u0001R\u0019\u0010£\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0002\u0010è\u0001R\u0019\u0010¤\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010è\u0001R\u0019\u0010¥\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010è\u0001R\u0019\u0010¦\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0002\u0010è\u0001R\u001e\u0010b\u001a\u0004\u0018\u00010\t*\u00020=8B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b§\u0002\u0010¨\u0002R\u0019\u0010ª\u0002\u001a\u00020\u001a8@@\u0000X\u0080\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010\u0089\u0002R\u0019\u0010¬\u0002\u001a\u00020\u001a8@@\u0000X\u0080\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010\u0089\u0002R\u001a\u0010°\u0002\u001a\u00030\u00ad\u00028V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\b®\u0002\u0010¯\u0002R!\u0010³\u0002\u001a\u00020\u001a8V@\u0017X\u0097\u0004¢\u0006\u0010\u0012\u0006\b²\u0002\u0010\u0088\u0001\u001a\u0006\b±\u0002\u0010\u0089\u0002R!\u0010¶\u0002\u001a\u00020\u001a8V@\u0017X\u0097\u0004¢\u0006\u0010\u0012\u0006\bµ\u0002\u0010\u0088\u0001\u001a\u0006\b´\u0002\u0010\u0089\u0002R\"\u0010»\u0002\u001a\u00030·\u00028V@\u0017X\u0097\u0004¢\u0006\u0010\u0012\u0006\bº\u0002\u0010\u0088\u0001\u001a\u0006\b¸\u0002\u0010¹\u0002R\u0019\u0010½\u0002\u001a\u00020\u00068@@\u0000X\u0080\u0004¢\u0006\b\u001a\u0006\b¼\u0002\u0010\u009b\u0002R\u001b\u0010À\u0002\u001a\u0004\u0018\u00010B8@@\u0000X\u0080\u0004¢\u0006\b\u001a\u0006\b¾\u0002\u0010¿\u0002R\u0016\u0010Â\u0002\u001a\u00020\u001a8F@\u0006¢\u0006\b\u001a\u0006\bÁ\u0002\u0010\u0089\u0002R\u001c\u0010Å\u0002\u001a\u0005\u0018\u00010Í\u00018V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010Ä\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Ê\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "", "startRoot", "endRoot", "abortRoot", "", "key", "startGroup", "", "dataKey", "endGroup", "skipGroup", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalScope", "parentScope", "currentProviders", "updateProviderMapGroup", ExifInterface.GPS_DIRECTION_TRUE, "scope", "resolveCompositionLocal", "(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)Ljava/lang/Object;", "ensureWriter", "", "isNode", "data", "startReaderGroup", "objectKey", "start", "Landroidx/compose/runtime/Pending;", "newPending", "enterGroup", "expectedNodeCount", "inserting", "exitGroup", "end", "recomposeToGroupEnd", "index", "insertedGroupVirtualIndex", "group", "newCount", "updateNodeCountOverrides", "groupLocation", "recomposeGroup", "recomposeIndex", "nodeIndexOf", "updatedNodeCount", "count", "updateNodeCount", "clearUpdatedNodeCounts", "oldGroup", "newGroup", "commonRoot", "recordUpsAndDowns", "nearestCommonRoot", "doRecordDownsFor", "recomposeKey", "compoundKeyOf", "Landroidx/compose/runtime/SlotReader;", "groupCompoundKeyPart", "skipReaderToGroupEnd", "addRecomposeScope", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "invalidationsRequested", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "doCompose", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Lkotlin/jvm/functions/Function2;)V", "nodeAt", "validateNodeExpected", "validateNodeNotExpected", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Lkotlin/ParameterName;", "name", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Landroidx/compose/runtime/Change;", "change", "record", "recordApplierOperation", "recordSlotEditingOperation", "forParent", "recordSlotTableOperation", "realizeUps", "", "nodes", "realizeDowns", "([Ljava/lang/Object;)V", "node", "recordDown", "recordUp", "realizeOperationLocation", "Landroidx/compose/runtime/Anchor;", XmPlayerService.TYPE_RANK_ANCHOR, "recordInsert", "recordFixup", "recordInsertUpFixup", "registerInsertUpFixup", "recordDelete", "location", "recordReaderMoving", "recordSlotEditing", "recordEndGroup", "recordEndRoot", "finalizeCompose", "cleanUpCompose", "nodeIndex", "recordRemoveNode", "from", "to", "recordMoveNode", "realizeMovement", "groupKey", "updateCompoundKeyWhenWeEnterGroup", "keyHash", "updateCompoundKeyWhenWeEnterGroupKeyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "startReplaceableGroup", "endReplaceableGroup", "startDefaults", "endDefaults", "startMovableGroup", "endMovableGroup", "collectParameterInformation", "dispose$runtime_release", "()V", "dispose", "startNode", "startReusableNode", "factory", "createNode", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "V", "value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "left", "right", "joinKey", "nextSlot", u.q, "", "", "", "", "", "", "invalid", "cache", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "updateValue", "updateCachedValue", "effect", "recordSideEffect", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", GetWatermarkAPI.KEY_NAME_CONSUME, "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionContext;", "buildContext", DefaultSettingsSpiCall.n, "tryImminentInvalidation$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "tryImminentInvalidation", "skipCurrentGroup", "skipToGroupEnd", "startRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "", "sourceInformation", "sourceInformationMarkerStart", "sourceInformationMarkerEnd", "composeContent$runtime_release", "composeContent", "prepareCompose$runtime_release", "(Lkotlin/jvm/functions/Function0;)V", "prepareCompose", "recompose$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;)Z", "recompose", "rememberedValue", "updateRememberedValue", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Ljava/util/Set;", "", "changes", "Ljava/util/List;", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Stack;", "pendingStack", "Landroidx/compose/runtime/Stack;", QuotaApply.PENDING_PREFIX, "Landroidx/compose/runtime/Pending;", LogUtil.I, "Landroidx/compose/runtime/IntStack;", "nodeIndexStack", "Landroidx/compose/runtime/IntStack;", "groupNodeCount", "groupNodeCountStack", "", "nodeCountOverrides", "[I", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nodeCountVirtualOverrides", "Ljava/util/HashMap;", "Z", "nodeExpected", "Landroidx/compose/runtime/Invalidation;", "invalidations", "entersStack", "parentProvider", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "providerUpdates", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "invalidateStack", "<set-?>", "isComposing", "isComposing$runtime_release", "()Z", "isDisposed", "isDisposed$runtime_release", "reader", "Landroidx/compose/runtime/SlotReader;", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "writer", "Landroidx/compose/runtime/SlotWriter;", "hasProvider", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "getInserting", "getInserting$annotations", "compoundKeyHash", "getCompoundKeyHash", "()I", "getCompoundKeyHash$annotations", "pendingUps", "downNodes", "writersReaderDelta", "startedGroup", "startedGroups", "insertUpFixups", "previousRemove", "previousMoveFrom", "previousMoveTo", "previousCount", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "getAreChildrenComposing$runtime_release", "areChildrenComposing", "getHasPendingChanges$runtime_release", "hasPendingChanges", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping", "getSkipping$annotations", "skipping", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData$annotations", "compositionData", "getChangeCount$runtime_release", "changeCount", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "getHasInvalidations", "hasInvalidations", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Ljava/util/List;Landroidx/compose/runtime/ControlledComposition;)V", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 5, 1})
public final class ComposerImpl implements Composer {

    @NotNull
    private final Set<RememberObserver> abandonSet;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;
    private int childrenComposing;
    private boolean collectParameterInformation;

    @NotNull
    private final ControlledComposition composition;
    private int compoundKeyHash;

    @NotNull
    private Stack<Object> downNodes;
    private int groupNodeCount;
    private boolean hasProvider;

    @NotNull
    private Anchor insertAnchor;

    @NotNull
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> insertFixups;

    @NotNull
    private final SlotTable insertTable;

    @NotNull
    private final Stack<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> insertUpFixups;
    private boolean inserting;
    private boolean isComposing;
    private boolean isDisposed;

    @Nullable
    private int[] nodeCountOverrides;

    @Nullable
    private HashMap<Integer, Integer> nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;

    @NotNull
    private final CompositionContext parentContext;

    @Nullable
    private Pending pending;
    private int pendingUps;
    private int previousCount;
    private int previousMoveFrom;
    private int previousMoveTo;
    private int previousRemove;
    private boolean providersInvalid;

    @NotNull
    private SlotReader reader;
    private boolean reusing;

    @NotNull
    private final SlotTable slotTable;
    private boolean startedGroup;

    @NotNull
    private final IntStack startedGroups;

    @NotNull
    private SlotWriter writer;
    private int writersReaderDelta;

    @NotNull
    private final Stack<Pending> pendingStack = new Stack<>();

    @NotNull
    private IntStack nodeIndexStack = new IntStack();

    @NotNull
    private IntStack groupNodeCountStack = new IntStack();

    @NotNull
    private final List<Invalidation> invalidations = new ArrayList();

    @NotNull
    private final IntStack entersStack = new IntStack();

    @NotNull
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentProvider = ExtensionsKt.persistentHashMapOf();

    @NotNull
    private final HashMap<Integer, PersistentMap<CompositionLocal<Object>, State<Object>>> providerUpdates = new HashMap<>();

    @NotNull
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;

    @NotNull
    private Snapshot snapshot = SnapshotKt.currentSnapshot();

    @NotNull
    private final Stack<RecomposeScopeImpl> invalidateStack = new Stack<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u001d\u0010\b\u001a\u00060\u0006R\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/RememberObserver;", "", "onRemembered", "onAbandoned", "onForgotten", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "<init>", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
    public static final class CompositionContextHolder implements RememberObserver {

        @NotNull
        private final CompositionContextImpl ref;

        public CompositionContextHolder(@NotNull CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        @NotNull
        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\bR\u0010SJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0010\u0010\u000eJ*\u0010\u0017\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0002\b\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010&\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\"0\u001fj\u0002`#H\u0010¢\u0006\u0004\b$\u0010%J.\u0010'\u001a\u00020\u00022&\u0010\u001b\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\"0\u001fj\u0002`#J\u001d\u0010-\u001a\u00020\u00022\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0010¢\u0006\u0004\b+\u0010,J\u000f\u00100\u001a\u00020\u0002H\u0010¢\u0006\u0004\b.\u0010/J\u000f\u00102\u001a\u00020\u0002H\u0010¢\u0006\u0004\b1\u0010/R\u001c\u00104\u001a\u0002038\u0010@\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u00109\u001a\u0002088\u0010@\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R0\u0010=\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010,R\u001f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0(8\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@Rk\u0010J\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\"0\u001fj\u0002`#2&\u0010E\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\"0\u001fj\u0002`#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\b&\u0010%\"\u0004\bH\u0010IR\u0016\u0010N\u001a\u00020K8P@\u0010X\u0090\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001c\u0010Q\u001a\u00020K8P@\u0010X\u0090\u0004¢\u0006\f\u0012\u0004\bP\u0010/\u001a\u0004\bO\u0010M¨\u0006T"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "", "dispose", "Landroidx/compose/runtime/Composer;", g.c, "registerComposer$runtime_release", "(Landroidx/compose/runtime/Composer;)V", "registerComposer", "unregisterComposer$runtime_release", "unregisterComposer", "Landroidx/compose/runtime/ControlledComposition;", "composition", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "invalidate$runtime_release", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalScope$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "getCompositionLocalScope", "updateCompositionLocalScope", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "startComposing$runtime_release", "()V", "startComposing", "doneComposing$runtime_release", "doneComposing", "", "compoundHashKey", LogUtil.I, "getCompoundHashKey$runtime_release", "()I", "", "collectingParameterInformation", "Z", "getCollectingParameterInformation$runtime_release", "()Z", "inspectionTables", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "Landroidx/compose/runtime/ComposerImpl;", "composers", "getComposers", "<set-?>", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "setCompositionLocalScope", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "compositionLocalScope", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext$runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "getRecomposeCoroutineContext$runtime_release$annotations", "recomposeCoroutineContext", "<init>", "(Landroidx/compose/runtime/ComposerImpl;IZ)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;

        @NotNull
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        /* JADX INFO: renamed from: compositionLocalScope$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState compositionLocalScope = SnapshotStateKt.mutableStateOf$default(ExtensionsKt.persistentHashMapOf(), null, 2, null);
        private final int compoundHashKey;

        @Nullable
        private Set<Set<CompositionData>> inspectionTables;

        public CompositionContextImpl(int i, boolean z) {
            this.compoundHashKey = i;
            this.collectingParameterInformation = z;
        }

        private final PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope() {
            return (PersistentMap) this.compositionLocalScope.getValue();
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        private final void setCompositionLocalScope(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
            this.compositionLocalScope.setValue(persistentMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
            ComposerImpl.this.parentContext.composeInitial$runtime_release(composition, content);
        }

        public final void dispose() {
            if (!this.composers.isEmpty()) {
                Set<Set<CompositionData>> set = this.inspectionTables;
                if (set != null) {
                    for (ComposerImpl composerImpl : getComposers()) {
                        Iterator<Set<CompositionData>> it2 = set.iterator();
                        while (it2.hasNext()) {
                            it2.next().remove(composerImpl.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl.this.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCollectingParameterInformation$runtime_release, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @NotNull
        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCompoundHashKey$runtime_release, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        /* JADX INFO: renamed from: getEffectCoroutineContext$runtime_release */
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Nullable
        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(@NotNull ControlledComposition composition) {
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
            Set<Set<CompositionData>> hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet<>();
                setInspectionTables(hashSet);
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(@NotNull Composer composer) {
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(@NotNull ControlledComposition composition) {
            ComposerImpl.this.parentContext.registerComposition$runtime_release(composition);
        }

        public final void setInspectionTables(@Nullable Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(@NotNull Composer composer) {
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    ((Set) it2.next()).remove(((ComposerImpl) composer).slotTable);
                }
            }
            Set<ComposerImpl> set2 = this.composers;
            Objects.requireNonNull(set2, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            TypeIntrinsics.asMutableCollection(set2).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(@NotNull ControlledComposition composition) {
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(composition);
        }

        public final void updateCompositionLocalScope(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> scope) {
            setCompositionLocalScope(scope);
        }
    }

    public ComposerImpl(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext, @NotNull SlotTable slotTable, @NotNull Set<RememberObserver> set, @NotNull List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list, @NotNull ControlledComposition controlledComposition) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = list;
        this.composition = controlledComposition;
        SlotReader slotReaderOpenReader = slotTable.openReader();
        slotReaderOpenReader.close();
        Unit unit = Unit.INSTANCE;
        this.reader = slotReaderOpenReader;
        SlotTable slotTable2 = new SlotTable();
        this.insertTable = slotTable2;
        SlotWriter slotWriterOpenWriter = slotTable2.openWriter();
        slotWriterOpenWriter.close();
        this.writer = slotWriterOpenWriter;
        SlotReader slotReaderOpenReader2 = slotTable2.openReader();
        try {
            Anchor anchor = slotReaderOpenReader2.anchor(0);
            slotReaderOpenReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new ArrayList();
            this.downNodes = new Stack<>();
            this.startedGroups = new IntStack();
            this.insertUpFixups = new Stack<>();
            this.previousRemove = -1;
            this.previousMoveFrom = -1;
            this.previousMoveTo = -1;
        } catch (Throwable th) {
            slotReaderOpenReader2.close();
            throw th;
        }
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.reader.close();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.isComposing = false;
    }

    private final void addRecomposeScope() {
        if (getInserting()) {
            RecomposeScopeImpl recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) getComposition());
            this.invalidateStack.push(recomposeScopeImpl);
            updateValue(recomposeScopeImpl);
            recomposeScopeImpl.start(this.snapshot.getId());
            return;
        }
        Invalidation invalidationRemoveLocation = ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
        Object next = this.reader.next();
        Objects.requireNonNull(next, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) next;
        recomposeScopeImpl2.setRequiresRecompose(invalidationRemoveLocation != null);
        this.invalidateStack.push(recomposeScopeImpl2);
        recomposeScopeImpl2.start(this.snapshot.getId());
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.writersReaderDelta = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.startedGroup = false;
        this.startedGroups.clear();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int compoundKeyOf(int group, int recomposeGroup, int recomposeKey) {
        return group == recomposeGroup ? recomposeKey : Integer.rotateLeft(compoundKeyOf(this.reader.parent(group), recomposeGroup, recomposeKey), 3) ^ groupCompoundKeyPart(this.reader, group);
    }

    private final PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope() {
        if (getInserting() && this.hasProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && Intrinsics.areEqual(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object objGroupAux = this.writer.groupAux(parent);
                    Objects.requireNonNull(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    return (PersistentMap) objGroupAux;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.slotTable.getGroupsSize() > 0) {
            int parent2 = this.reader.getParent();
            while (parent2 > 0) {
                if (this.reader.groupKey(parent2) == 202 && Intrinsics.areEqual(this.reader.groupObjectKey(parent2), ComposerKt.getCompositionLocalMap())) {
                    PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap = this.providerUpdates.get(Integer.valueOf(parent2));
                    if (persistentMap != null) {
                        return persistentMap;
                    }
                    Object objGroupAux2 = this.reader.groupAux(parent2);
                    Objects.requireNonNull(objGroupAux2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    return (PersistentMap) objGroupAux2;
                }
                parent2 = this.reader.parent(parent2);
            }
        }
        return this.parentProvider;
    }

    private final void doCompose(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, final Function2<? super Composer, ? super Integer, Unit> content) {
        if (!(!this.isComposing)) {
            ComposerKt.composeRuntimeError("Reentrant composition is not supported".toString());
            throw new KotlinNothingValueException();
        }
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:recompose");
        try {
            this.snapshot = SnapshotKt.currentSnapshot();
            int size = invalidationsRequested.getSize();
            if (size > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object obj = invalidationsRequested.getKeys()[i];
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    }
                    IdentityArraySet identityArraySet = (IdentityArraySet) invalidationsRequested.getValues()[i];
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    Anchor anchor = recomposeScopeImpl.getAnchor();
                    Integer numValueOf = anchor == null ? null : Integer.valueOf(anchor.getLocation());
                    if (numValueOf == null) {
                        Trace.INSTANCE.endSection(objBeginSection);
                        return;
                    }
                    this.invalidations.add(new Invalidation(recomposeScopeImpl, numValueOf.intValue(), identityArraySet));
                    if (i2 >= size) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            List<Invalidation> list = this.invalidations;
            if (list.size() > 1) {
                kotlin.collections.g.sortWith(list, new Comparator() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$lambda-24$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((Invalidation) t).getLocation()), Integer.valueOf(((Invalidation) t2).getLocation()));
                    }
                });
            }
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                startRoot();
                SnapshotStateKt.observeDerivedStateRecalculations(new Function1<State<?>, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(State<?> state) {
                        invoke2(state);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull State<?> state) {
                        this.this$0.childrenComposing++;
                    }
                }, new Function1<State<?>, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(State<?> state) {
                        invoke2(state);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull State<?> state) {
                        this.this$0.childrenComposing--;
                    }
                }, new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit getA() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (content == null) {
                            this.skipCurrentGroup();
                            return;
                        }
                        this.startGroup(200, ComposerKt.getInvocation());
                        ComposerKt.invokeComposable(this, content);
                        this.endGroup();
                    }
                });
                endRoot();
                this.isComposing = false;
                this.invalidations.clear();
                this.providerUpdates.clear();
                Unit unit = Unit.INSTANCE;
                Trace.INSTANCE.endSection(objBeginSection);
            } catch (Throwable th) {
                this.isComposing = false;
                this.invalidations.clear();
                this.providerUpdates.clear();
                abortRoot();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th2;
        }
    }

    private final void doRecordDownsFor(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        doRecordDownsFor(this.reader.parent(group), nearestCommonRoot);
        if (this.reader.isNode(group)) {
            recordDown(nodeAt(this.reader, group));
        }
    }

    private final void end(boolean isNode) {
        if (getInserting()) {
            int parent = this.writer.getParent();
            updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(parent), this.writer.groupObjectKey(parent), this.writer.groupAux(parent));
        } else {
            int parent2 = this.reader.getParent();
            updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(parent2), this.reader.groupObjectKey(parent2), this.reader.groupAux(parent2));
        }
        int i = this.groupNodeCount;
        Pending pending = this.pending;
        int i2 = 0;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set setFastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i3 = 0;
            int i4 = 0;
            int iUpdatedNodeCountOf = 0;
            while (i3 < size2) {
                KeyInfo keyInfo = keyInfos.get(i3);
                if (setFastToSet.contains(keyInfo)) {
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i4 < size) {
                            KeyInfo keyInfo2 = used.get(i4);
                            if (keyInfo2 != keyInfo) {
                                int iNodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (iNodePositionOf != iUpdatedNodeCountOf) {
                                    int iUpdatedNodeCountOf2 = pending.updatedNodeCountOf(keyInfo2);
                                    recordMoveNode(pending.getStartIndex() + iNodePositionOf, iUpdatedNodeCountOf + pending.getStartIndex(), iUpdatedNodeCountOf2);
                                    pending.registerMoveNode(iNodePositionOf, iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                                }
                            } else {
                                i3++;
                            }
                            i4++;
                            iUpdatedNodeCountOf += pending.updatedNodeCountOf(keyInfo2);
                            used = used;
                        }
                    }
                    i2 = 0;
                } else {
                    recordRemoveNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), i2);
                    recordReaderMoving(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                }
                i3++;
                i2 = 0;
            }
            realizeMovement();
            if (keyInfos.size() > 0) {
                recordReaderMoving(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i5 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            recordRemoveNode(i5, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (isNode) {
                registerInsertUpFixup();
                i = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int iInsertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(iInsertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(iInsertedGroupVirtualIndex, i);
                }
            }
        } else {
            if (isNode) {
                recordUp();
            }
            recordEndGroup();
            int parent4 = this.reader.getParent();
            if (i != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i);
            }
            if (isNode) {
                i = 1;
            }
            this.reader.endGroup();
            realizeMovement();
        }
        exitGroup(i, inserting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        recordEndRoot();
        finalizeCompose();
        this.reader.close();
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterOpenWriter = this.insertTable.openWriter();
            this.writer = slotWriterOpenWriter;
            slotWriterOpenWriter.skipToGroupEnd();
            this.hasProvider = false;
        }
    }

    private final void enterGroup(boolean isNode, Pending newPending) {
        this.pendingStack.push(this.pending);
        this.pending = newPending;
        this.nodeIndexStack.push(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int expectedNodeCount, boolean inserting) {
        Pending pendingPop = this.pendingStack.pop();
        if (pendingPop != null && !inserting) {
            pendingPop.setGroupIndex(pendingPop.getGroupIndex() + 1);
        }
        this.pending = pendingPop;
        this.nodeIndex = this.nodeIndexStack.pop() + expectedNodeCount;
        this.groupNodeCount = this.groupNodeCountStack.pop() + expectedNodeCount;
    }

    private final void finalizeCompose() {
        realizeUps();
        if (!this.pendingStack.isEmpty()) {
            ComposerKt.composeRuntimeError("Start/end imbalance".toString());
            throw new KotlinNothingValueException();
        }
        if (this.startedGroups.isEmpty()) {
            cleanUpCompose();
        } else {
            ComposerKt.composeRuntimeError("Missed recording an endGroup()".toString());
            throw new KotlinNothingValueException();
        }
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompositionData$annotations() {
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i) {
        Object objGroupAux;
        if (slotReader.hasObjectKey(i)) {
            Object objGroupObjectKey = slotReader.groupObjectKey(i);
            if (objGroupObjectKey == null) {
                return 0;
            }
            return objGroupObjectKey.hashCode();
        }
        int iGroupKey = slotReader.groupKey(i);
        if (iGroupKey == 207 && (objGroupAux = slotReader.groupAux(i)) != null && !Intrinsics.areEqual(objGroupAux, Composer.INSTANCE.getEmpty())) {
            iGroupKey = objGroupAux.hashCode();
        }
        return iGroupKey;
    }

    private final int insertedGroupVirtualIndex(int index) {
        return (-2) - index;
    }

    private final Object nodeAt(SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    private final int nodeIndexOf(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iParent = this.reader.parent(group);
        while (iParent != recomposeGroup && !this.reader.isNode(iParent)) {
            iParent = this.reader.parent(iParent);
        }
        if (this.reader.isNode(iParent)) {
            recomposeIndex = 0;
        }
        if (iParent == group) {
            return recomposeIndex;
        }
        int iUpdatedNodeCount = (updatedNodeCount(iParent) - this.reader.nodeCount(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iUpdatedNodeCount && iParent != groupLocation) {
            iParent++;
            while (iParent < groupLocation) {
                int iGroupSize = this.reader.groupSize(iParent) + iParent;
                if (groupLocation >= iGroupSize) {
                    recomposeIndex += updatedNodeCount(iParent);
                    iParent = iGroupSize;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final void realizeDowns(final Object[] nodes) {
        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeDowns.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                int length = nodes.length - 1;
                if (length < 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    applier.down(nodes[i]);
                    if (i2 > length) {
                        return;
                    } else {
                        i = i2;
                    }
                }
            }
        });
    }

    private final void realizeMovement() {
        final int i = this.previousCount;
        this.previousCount = 0;
        if (i > 0) {
            final int i2 = this.previousRemove;
            if (i2 >= 0) {
                this.previousRemove = -1;
                recordApplierOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeMovement.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        invoke2(applier, slotWriter, rememberManager);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                        applier.remove(i2, i);
                    }
                });
                return;
            }
            final int i3 = this.previousMoveFrom;
            this.previousMoveFrom = -1;
            final int i4 = this.previousMoveTo;
            this.previousMoveTo = -1;
            recordApplierOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeMovement.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    applier.move(i3, i4, i);
                }
            });
        }
    }

    private final void realizeOperationLocation(boolean forParent) {
        int parent = forParent ? this.reader.getParent() : this.reader.getCurrentGroup();
        final int i = parent - this.writersReaderDelta;
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Tried to seek backward".toString());
        }
        if (i > 0) {
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeOperationLocation.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    slotWriter.advanceBy(i);
                }
            });
            this.writersReaderDelta = parent;
        }
    }

    public static /* synthetic */ void realizeOperationLocation$default(ComposerImpl composerImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.realizeOperationLocation(z);
    }

    private final void realizeUps() {
        final int i = this.pendingUps;
        if (i > 0) {
            this.pendingUps = 0;
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeUps.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    int i2 = i;
                    for (int i3 = 0; i3 < i2; i3++) {
                        applier.up();
                    }
                }
            });
        }
    }

    private final void recomposeToGroupEnd() {
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iGroupSize = this.reader.groupSize(parent) + parent;
        int i = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i2 = this.groupNodeCount;
        Invalidation invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        boolean z2 = false;
        int i3 = parent;
        while (invalidationFirstInRange != null) {
            int location = invalidationFirstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (invalidationFirstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i3, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(currentGroup), parent, compoundKeyHash);
                invalidationFirstInRange.getScope().compose(this);
                this.reader.restoreParent(parent);
                i3 = currentGroup;
                z2 = true;
            } else {
                this.invalidateStack.push(invalidationFirstInRange.getScope());
                invalidationFirstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        }
        if (z2) {
            recordUpsAndDowns(i3, parent, parent);
            this.reader.skipToGroupEnd();
            int iUpdatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i + iUpdatedNodeCount;
            this.groupNodeCount = i2 + iUpdatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z;
    }

    private final void record(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        this.changes.add(change);
    }

    private final void recordApplierOperation(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        realizeUps();
        realizeDowns();
        record(change);
    }

    private final void recordDelete() {
        recordSlotEditingOperation(ComposerKt.removeCurrentGroupInstance);
        this.writersReaderDelta += this.reader.getGroupSize();
    }

    private final void recordDown(Object node) {
        this.downNodes.push(node);
    }

    private final void recordEndGroup() {
        int parent = this.reader.getParent();
        if (!(this.startedGroups.peekOr(-1) <= parent)) {
            ComposerKt.composeRuntimeError("Missed recording an endGroup".toString());
            throw new KotlinNothingValueException();
        }
        if (this.startedGroups.peekOr(-1) == parent) {
            this.startedGroups.pop();
            recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, null);
        }
    }

    private final void recordEndRoot() {
        if (this.startedGroup) {
            recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, null);
            this.startedGroup = false;
        }
    }

    private final void recordFixup(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        this.insertFixups.add(change);
    }

    private final void recordInsert(final Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            final SlotTable slotTable = this.insertTable;
            recordSlotEditingOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.recordInsert.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    slotWriter.beginInsert();
                    SlotTable slotTable2 = slotTable;
                    slotWriter.moveFrom(slotTable2, anchor.toIndexFor(slotTable2));
                    slotWriter.endInsert();
                }
            });
            return;
        }
        final List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.insertFixups);
        this.insertFixups.clear();
        realizeUps();
        realizeDowns();
        final SlotTable slotTable2 = this.insertTable;
        recordSlotEditingOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.recordInsert.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                SlotTable slotTable3 = slotTable2;
                List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list = mutableList;
                SlotWriter slotWriterOpenWriter = slotTable3.openWriter();
                int i = 0;
                try {
                    int size = list.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i2 = i + 1;
                            list.get(i).invoke(applier, slotWriterOpenWriter, rememberManager);
                            if (i2 > size) {
                                break;
                            } else {
                                i = i2;
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    slotWriterOpenWriter.close();
                    slotWriter.beginInsert();
                    SlotTable slotTable4 = slotTable2;
                    slotWriter.moveFrom(slotTable4, anchor.toIndexFor(slotTable4));
                    slotWriter.endInsert();
                } catch (Throwable th) {
                    slotWriterOpenWriter.close();
                    throw th;
                }
            }
        });
    }

    private final void recordInsertUpFixup(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        this.insertUpFixups.push(change);
    }

    private final void recordMoveNode(int from, int to, int count) {
        if (count > 0) {
            int i = this.previousCount;
            if (i > 0 && this.previousMoveFrom == from - i && this.previousMoveTo == to - i) {
                this.previousCount = i + count;
                return;
            }
            realizeMovement();
            this.previousMoveFrom = from;
            this.previousMoveTo = to;
            this.previousCount = count;
        }
    }

    private final void recordReaderMoving(int location) {
        this.writersReaderDelta = location - (this.reader.getCurrentGroup() - this.writersReaderDelta);
    }

    private final void recordRemoveNode(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                ComposerKt.composeRuntimeError(Intrinsics.stringPlus("Invalid remove index ", Integer.valueOf(nodeIndex)).toString());
                throw new KotlinNothingValueException();
            }
            if (this.previousRemove == nodeIndex) {
                this.previousCount += count;
                return;
            }
            realizeMovement();
            this.previousRemove = nodeIndex;
            this.previousCount = count;
        }
    }

    private final void recordSlotEditing() {
        SlotReader slotReader;
        int parent;
        if (this.slotTable.isEmpty() || this.startedGroups.peekOr(-1) == (parent = (slotReader = this.reader).getParent())) {
            return;
        }
        if (!this.startedGroup) {
            recordSlotTableOperation$default(this, false, ComposerKt.startRootGroup, 1, null);
            this.startedGroup = true;
        }
        final Anchor anchor = slotReader.anchor(parent);
        this.startedGroups.push(parent);
        recordSlotTableOperation$default(this, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.recordSlotEditing.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                slotWriter.ensureStarted(anchor);
            }
        }, 1, null);
    }

    private final void recordSlotEditingOperation(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
        record(change);
    }

    private final void recordSlotTableOperation(boolean forParent, Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        realizeOperationLocation(forParent);
        record(change);
    }

    public static /* synthetic */ void recordSlotTableOperation$default(ComposerImpl composerImpl, boolean z, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.recordSlotTableOperation(z, function3);
    }

    private final void recordUp() {
        if (this.downNodes.isNotEmpty()) {
            this.downNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    private final void recordUpsAndDowns(int oldGroup, int newGroup, int commonRoot) {
        SlotReader slotReader = this.reader;
        int iNearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != iNearestCommonRootOf) {
            if (slotReader.isNode(oldGroup)) {
                recordUp();
            }
            oldGroup = slotReader.parent(oldGroup);
        }
        doRecordDownsFor(newGroup, iNearestCommonRootOf);
    }

    private final void registerInsertUpFixup() {
        this.insertFixups.add(this.insertUpFixups.pop());
    }

    private final <T> T resolveCompositionLocal(CompositionLocal<T> key, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> scope) {
        return ComposerKt.contains(scope, key) ? (T) ComposerKt.getValueOf(scope, key) : key.getDefaultValueHolder$runtime_release().getValue();
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    private final void start(int key, Object objectKey, boolean isNode, Object data) {
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(key, objectKey, data);
        Pending pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (isNode) {
                this.writer.startNode(Composer.INSTANCE.getEmpty());
            } else if (data != null) {
                SlotWriter slotWriter = this.writer;
                if (objectKey == null) {
                    objectKey = Composer.INSTANCE.getEmpty();
                }
                slotWriter.startData(key, objectKey, data);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (objectKey == null) {
                    objectKey = Composer.INSTANCE.getEmpty();
                }
                slotWriter2.startGroup(key, objectKey);
            }
            Pending pending2 = this.pending;
            if (pending2 != null) {
                KeyInfo keyInfo = new KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo);
            }
            enterGroup(isNode, null);
            return;
        }
        if (this.pending == null) {
            if (this.reader.getGroupKey() == key && Intrinsics.areEqual(objectKey, this.reader.getGroupObjectKey())) {
                startReaderGroup(isNode, data);
            } else {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        Pending pending3 = this.pending;
        if (pending3 != null) {
            KeyInfo next = pending3.getNext(key, objectKey);
            if (next != null) {
                pending3.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                int iSlotPositionOf = pending3.slotPositionOf(next);
                final int groupIndex = iSlotPositionOf - pending3.getGroupIndex();
                pending3.registerMoveSlot(iSlotPositionOf, pending3.getGroupIndex());
                recordReaderMoving(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    recordSlotEditingOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.start.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter3, RememberManager rememberManager) {
                            invoke2(applier, slotWriter3, rememberManager);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter3, @NotNull RememberManager rememberManager) {
                            slotWriter3.moveGroup(groupIndex);
                        }
                    });
                }
                startReaderGroup(isNode, data);
            } else {
                this.reader.beginEmpty();
                this.inserting = true;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (isNode) {
                    this.writer.startNode(Composer.INSTANCE.getEmpty());
                } else if (data != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (objectKey == null) {
                        objectKey = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter3.startData(key, objectKey, data);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (objectKey == null) {
                        objectKey = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter4.startGroup(key, objectKey);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo2);
                pending = new Pending(new ArrayList(), isNode ? 0 : this.nodeIndex);
            }
        }
        enterGroup(isNode, pending);
    }

    private final void startGroup(int key) {
        start(key, null, false, null);
    }

    private final void startReaderGroup(boolean isNode, final Object data) {
        if (isNode) {
            this.reader.startNode();
            return;
        }
        if (data != null && this.reader.getGroupAux() != data) {
            recordSlotTableOperation$default(this, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.startReaderGroup.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    slotWriter.updateAux(data);
                }
            }, 1, null);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = changed(this.parentProvider);
        this.collectParameterInformation = this.parentContext.getCollectingParameterInformation();
        Set<CompositionData> set = (Set) resolveCompositionLocal(InspectionTablesKt.getLocalInspectionTables(), this.parentProvider);
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey());
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int groupKey, Object dataKey, Object data) {
        if (dataKey != null) {
            if (dataKey instanceof Enum) {
                updateCompoundKeyWhenWeEnterGroupKeyHash(((Enum) dataKey).ordinal());
                return;
            } else {
                updateCompoundKeyWhenWeEnterGroupKeyHash(dataKey.hashCode());
                return;
            }
        }
        if (data == null || groupKey != 207 || Intrinsics.areEqual(data, Composer.INSTANCE.getEmpty())) {
            updateCompoundKeyWhenWeEnterGroupKeyHash(groupKey);
        } else {
            updateCompoundKeyWhenWeEnterGroupKeyHash(data.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int keyHash) {
        this.compoundKeyHash = keyHash ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int groupKey, Object dataKey, Object data) {
        if (dataKey != null) {
            if (dataKey instanceof Enum) {
                updateCompoundKeyWhenWeExitGroupKeyHash(((Enum) dataKey).ordinal());
                return;
            } else {
                updateCompoundKeyWhenWeExitGroupKeyHash(dataKey.hashCode());
                return;
            }
        }
        if (data == null || groupKey != 207 || Intrinsics.areEqual(data, Composer.INSTANCE.getEmpty())) {
            updateCompoundKeyWhenWeExitGroupKeyHash(groupKey);
        } else {
            updateCompoundKeyWhenWeExitGroupKeyHash(data.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int groupKey) {
        this.compoundKeyHash = Integer.rotateRight(groupKey ^ getCompoundKeyHash(), 3);
    }

    private final void updateNodeCount(int group, int count) {
        if (updatedNodeCount(group) != count) {
            if (group < 0) {
                HashMap<Integer, Integer> map = this.nodeCountVirtualOverrides;
                if (map == null) {
                    map = new HashMap<>();
                    this.nodeCountVirtualOverrides = map;
                }
                map.put(Integer.valueOf(group), Integer.valueOf(count));
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                ArraysKt___ArraysJvmKt.fill$default(iArr, -1, 0, 0, 6, (Object) null);
                this.nodeCountOverrides = iArr;
            }
            iArr[group] = count;
        }
    }

    private final void updateNodeCountOverrides(int group, int newCount) {
        int iUpdatedNodeCount = updatedNodeCount(group);
        if (iUpdatedNodeCount != newCount) {
            int i = newCount - iUpdatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (group != -1) {
                int iUpdatedNodeCount2 = updatedNodeCount(group) + i;
                updateNodeCount(group, iUpdatedNodeCount2);
                if (size >= 0) {
                    int i2 = size;
                    while (true) {
                        int i3 = i2 - 1;
                        Pending pendingPeek = this.pendingStack.peek(i2);
                        if (pendingPeek != null && pendingPeek.updateNodeCount(group, iUpdatedNodeCount2)) {
                            size = i2 - 1;
                            break;
                        } else if (i3 < 0) {
                            break;
                        } else {
                            i2 = i3;
                        }
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.isNode(group)) {
                    return;
                } else {
                    group = this.reader.parent(group);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PersistentMap<CompositionLocal<Object>, State<Object>> updateProviderMapGroup(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentScope, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> currentProviders) {
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = parentScope.builder();
        builder.putAll(currentProviders);
        PersistentMap persistentMapBuild = builder.build();
        startGroup(204, ComposerKt.getProviderMaps());
        changed(persistentMapBuild);
        changed(currentProviders);
        endGroup();
        return persistentMapBuild;
    }

    private final int updatedNodeCount(int group) {
        int i;
        Integer num;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i = iArr[group]) < 0) ? this.reader.nodeCount(group) : i;
        }
        HashMap<Integer, Integer> map = this.nodeCountVirtualOverrides;
        if (map == null || (num = map.get(Integer.valueOf(group))) == null) {
            return 0;
        }
        return num.intValue();
    }

    private final void validateNodeExpected() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void validateNodeNotExpected() {
        if (!this.nodeExpected) {
            return;
        }
        ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(final V value, @NotNull final Function2<? super T, ? super V, Unit> block) {
        Function3<Applier<?>, SlotWriter, RememberManager, Unit> function3 = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$apply$operation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@org.jetbrains.annotations.NotNull androidx.compose.runtime.Applier<?> r1, @org.jetbrains.annotations.NotNull androidx.compose.runtime.SlotWriter r2, @org.jetbrains.annotations.NotNull androidx.compose.runtime.RememberManager r3) {
                /*
                    r0 = this;
                    kotlin.jvm.functions.Function2<T, V, kotlin.Unit> r2 = r1
                    java.lang.Object r1 = r1.getCurrent()
                    V r3 = r2
                    r2.invoke(r1, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl$apply$operation$1.invoke2(androidx.compose.runtime.Applier, androidx.compose.runtime.SlotWriter, androidx.compose.runtime.RememberManager):void");
            }
        };
        if (getInserting()) {
            recordFixup(function3);
        } else {
            recordApplierOperation(function3);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionContext buildContext() {
        startGroup(206, ComposerKt.getReference());
        Object objNextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = objNextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) objNextSlot : null;
        if (compositionContextHolder == null) {
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(getCompoundKeyHash(), this.collectParameterInformation));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean invalid, @NotNull Function0<? extends T> block) {
        T t = (T) nextSlot();
        if (t != Composer.INSTANCE.getEmpty() && !invalid) {
            return t;
        }
        T a = block.getA();
        updateValue(a);
        return a;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(@Nullable Object value) {
        if (Intrinsics.areEqual(nextSlot(), value)) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void collectParameterInformation() {
        this.collectParameterInformation = true;
    }

    public final void composeContent$runtime_release(@NotNull IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        if (this.changes.isEmpty()) {
            doCompose(invalidationsRequested, content);
        } else {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(@NotNull CompositionLocal<T> key) {
        return (T) resolveCompositionLocal(key, currentCompositionLocalScope());
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(@NotNull final Function0<? extends T> factory) {
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeRuntimeError("createNode() can only be called when inserting".toString());
            throw new KotlinNothingValueException();
        }
        final int iPeek = this.nodeIndexStack.peek();
        SlotWriter slotWriter = this.writer;
        final Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        recordFixup(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.createNode.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter2, RememberManager rememberManager) {
                invoke2(applier, slotWriter2, rememberManager);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter2, @NotNull RememberManager rememberManager) {
                Object a = factory.getA();
                slotWriter2.updateNode(anchor, a);
                applier.insertTopDown(iPeek, a);
                applier.down(a);
            }
        });
        recordInsertUpFixup(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.createNode.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter2, RememberManager rememberManager) {
                invoke2(applier, slotWriter2, rememberManager);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter2, @NotNull RememberManager rememberManager) {
                Object objNode = slotWriter2.node(anchor);
                applier.up();
                applier.insertBottomUp(iPeek, objNode);
            }
        });
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    public final void dispose$runtime_release() {
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            this.invalidateStack.clear();
            this.invalidations.clear();
            this.changes.clear();
            getApplier().clear();
            this.isDisposed = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.INSTANCE.endSection(objBeginSection);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @Nullable
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        final Function1<Composition, Unit> function1End;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImplPop = this.invalidateStack.isNotEmpty() ? this.invalidateStack.pop() : null;
        if (recomposeScopeImplPop != null) {
            recomposeScopeImplPop.setRequiresRecompose(false);
        }
        if (recomposeScopeImplPop != null && (function1End = recomposeScopeImplPop.end(this.snapshot.getId())) != null) {
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$endRestartGroup$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    function1End.invoke(this.getComposition());
                }
            });
        }
        if (recomposeScopeImplPop != null && !recomposeScopeImplPop.getSkipped$runtime_release() && (recomposeScopeImplPop.getUsed() || this.collectParameterInformation)) {
            if (recomposeScopeImplPop.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImplPop.setAnchor(anchor);
            }
            recomposeScopeImplPop.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImplPop;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CoroutineContext getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.size();
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Nullable
    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (!this.providersInvalid) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if (!(currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid())) {
                return false;
            }
        }
        return true;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return !this.changes.isEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: getInsertTable$runtime_release, reason: from getter */
    public final SlotTable getInsertTable() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        if (!getInserting() && !this.reusing && !this.providersInvalid) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if ((currentRecomposeScope$runtime_release == null || currentRecomposeScope$runtime_release.getRequiresRecompose()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: isComposing$runtime_release, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    /* JADX INFO: renamed from: isDisposed$runtime_release, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Object joinKey(@Nullable Object left, @Nullable Object right) {
        Object key = ComposerKt.getKey(this.reader.getGroupObjectKey(), left, right);
        return key == null ? new JoinedKey(left, right) : key;
    }

    @PublishedApi
    @Nullable
    public final Object nextSlot() {
        if (!getInserting()) {
            return this.reusing ? Composer.INSTANCE.getEmpty() : this.reader.next();
        }
        validateNodeNotExpected();
        return Composer.INSTANCE.getEmpty();
    }

    public final void prepareCompose$runtime_release(@NotNull Function0<Unit> block) {
        if (!(!this.isComposing)) {
            ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported".toString());
            throw new KotlinNothingValueException();
        }
        this.isComposing = true;
        try {
            block.getA();
        } finally {
            this.isComposing = false;
        }
    }

    public final boolean recompose$runtime_release(@NotNull IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
        if (!invalidationsRequested.isNotEmpty() && !(!this.invalidations.isEmpty())) {
            return false;
        }
        doCompose(invalidationsRequested, null);
        return !this.changes.isEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(@NotNull final Function0<Unit> effect) {
        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.recordSideEffect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                rememberManager.sideEffect(effect);
            }
        });
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(@NotNull RecomposeScope scope) {
        RecomposeScopeImpl recomposeScopeImpl = scope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public Object rememberedValue() {
        return nextSlot();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw new KotlinNothingValueException();
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            currentRecomposeScope$runtime_release.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(@NotNull String sourceInformation) {
        if (getInserting()) {
            this.writer.insertAux(sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int key, @NotNull String sourceInformation) {
        start(key, null, false, sourceInformation);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        start(0, null, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int key, @Nullable Object dataKey) {
        start(key, dataKey, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        int i = 126;
        if (getInserting() || (!this.reusing ? this.reader.getGroupKey() != 126 : this.reader.getGroupKey() != 125)) {
            i = 125;
        }
        start(i, null, true, null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(@NotNull final ProvidedValue<?>[] values) {
        PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapUpdateProviderMapGroup;
        boolean z;
        final PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        startGroup(203, ComposerKt.getProviderValues());
        PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap = (PersistentMap) ComposerKt.invokeComposableForResult(this, new Function2<Composer, Integer, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>>>() { // from class: androidx.compose.runtime.ComposerImpl$startProviders$currentProviders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }

            @Composable
            @NotNull
            public final PersistentMap<CompositionLocal<Object>, State<Object>> invoke(@Nullable Composer composer, int i) {
                composer.startReplaceableGroup(2083456794);
                PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapCompositionLocalMapOf = ComposerKt.compositionLocalMapOf(values, persistentMapCurrentCompositionLocalScope, composer, 8);
                composer.endReplaceableGroup();
                return persistentMapCompositionLocalMapOf;
            }
        });
        endGroup();
        if (!getInserting()) {
            Object objGroupGet = this.reader.groupGet(0);
            Objects.requireNonNull(objGroupGet, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap2 = (PersistentMap) objGroupGet;
            Object objGroupGet2 = this.reader.groupGet(1);
            Objects.requireNonNull(objGroupGet2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            PersistentMap persistentMap3 = (PersistentMap) objGroupGet2;
            if (getSkipping() && Intrinsics.areEqual(persistentMap3, persistentMap)) {
                skipGroup();
                persistentMapUpdateProviderMapGroup = persistentMap2;
            } else {
                persistentMapUpdateProviderMapGroup = updateProviderMapGroup(persistentMapCurrentCompositionLocalScope, persistentMap);
                z = !Intrinsics.areEqual(persistentMapUpdateProviderMapGroup, persistentMap2);
            }
            if (z && !getInserting()) {
                this.providerUpdates.put(Integer.valueOf(this.reader.getCurrentGroup()), persistentMapUpdateProviderMapGroup);
            }
            this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
            this.providersInvalid = z;
            start(202, ComposerKt.getCompositionLocalMap(), false, persistentMapUpdateProviderMapGroup);
        }
        persistentMapUpdateProviderMapGroup = updateProviderMapGroup(persistentMapCurrentCompositionLocalScope, persistentMap);
        this.hasProvider = true;
        z = false;
        if (z) {
            this.providerUpdates.put(Integer.valueOf(this.reader.getCurrentGroup()), persistentMapUpdateProviderMapGroup);
        }
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z;
        start(202, ComposerKt.getCompositionLocalMap(), false, persistentMapUpdateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int key) {
        start(key, null, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Composer startRestartGroup(int key) {
        start(key, null, false, null);
        addRecomposeScope();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int key, @Nullable Object dataKey) {
        if (this.reader.getGroupKey() == key && !Intrinsics.areEqual(this.reader.getGroupAux(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        start(key, null, false, dataKey);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        start(125, null, true, null);
        this.nodeExpected = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.slotTable);
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, scope, instance);
        return true;
    }

    @PublishedApi
    public final void updateCachedValue(@Nullable Object value) {
        if (getInserting() && (value instanceof RememberObserver)) {
            this.abandonSet.add(value);
        }
        updateValue(value);
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(@Nullable Object value) {
        updateValue(value);
    }

    @PublishedApi
    public final void updateValue(@Nullable final Object value) {
        if (!getInserting()) {
            final int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
            recordSlotTableOperation(true, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.updateValue.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    RecomposeScopeImpl recomposeScopeImpl;
                    CompositionImpl composition;
                    if (value instanceof RememberObserver) {
                        this.abandonSet.add(value);
                        rememberManager.remembering((RememberObserver) value);
                    }
                    Object obj = slotWriter.set(groupSlotIndex, value);
                    if (obj instanceof RememberObserver) {
                        rememberManager.forgetting((RememberObserver) obj);
                    } else {
                        if (!(obj instanceof RecomposeScopeImpl) || (composition = (recomposeScopeImpl = (RecomposeScopeImpl) obj).getComposition()) == null) {
                            return;
                        }
                        recomposeScopeImpl.setComposition(null);
                        composition.setPendingInvalidScopes$runtime_release(true);
                    }
                }
            });
        } else {
            this.writer.update(value);
            if (value instanceof RememberObserver) {
                record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.updateValue.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        invoke2(applier, slotWriter, rememberManager);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                        rememberManager.remembering((RememberObserver) value);
                    }
                });
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (!getInserting()) {
            recordDown(getNode(this.reader));
        } else {
            ComposerKt.composeRuntimeError("useNode() called while inserting".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void realizeDowns() {
        if (this.downNodes.isNotEmpty()) {
            realizeDowns(this.downNodes.toArray());
            this.downNodes.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startGroup(int key, Object dataKey) {
        start(key, dataKey, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Character) && value == ((Character) objNextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Byte) && value == ((Number) objNextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Short) && value == ((Number) objNextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && value == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float value) {
        Object objNextSlot = nextSlot();
        if (objNextSlot instanceof Float) {
            if (value == ((Number) objNextSlot).floatValue()) {
                return false;
            }
        }
        updateValue(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && value == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double value) {
        Object objNextSlot = nextSlot();
        if (objNextSlot instanceof Double) {
            if (value == ((Number) objNextSlot).doubleValue()) {
                return false;
            }
        }
        updateValue(Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && value == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(value));
        return true;
    }
}
