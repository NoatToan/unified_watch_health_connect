package com.xiaomi.fitness.watch.face.export.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0012\n\u0002\b<\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 ½\u00012\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002:\u0002½\u0001B¹\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0010\u0012\u001c\b\u0002\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u001e\u0018\u0001`\u0018\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u0012\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0018\u0012\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\"\u0018\u0001`\u0018\u0012\b\b\u0002\u0010#\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0004\b$\u0010(J\u0015\u0010\u009b\u0001\u001a\u00020\u00102\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0000H\u0096\u0002J\u001b\u0010\u009d\u0001\u001a\u00030\u009e\u00012\u0006\u0010&\u001a\u00020'2\u0007\u0010\u009f\u0001\u001a\u00020\u0010H\u0016J\t\u0010 \u0001\u001a\u00020\u0010H\u0016J\n\u0010¡\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\rHÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013HÆ\u0003¢\u0006\u0002\u0010EJ\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0007HÆ\u0003J#\u0010¯\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u0018HÆ\u0003¢\u0006\u0002\u0010KJ\n\u0010°\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0010HÆ\u0003J#\u0010²\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u001e\u0018\u0001`\u0018HÆ\u0003¢\u0006\u0002\u0010KJ\n\u0010³\u0001\u001a\u00020\u0007HÆ\u0003J#\u0010´\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0018HÆ\u0003¢\u0006\u0002\u0010KJ#\u0010µ\u0001\u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\"\u0018\u0001`\u0018HÆ\u0003¢\u0006\u0002\u0010KJ\n\u0010¶\u0001\u001a\u00020\u0010HÆ\u0003JÊ\u0002\u0010·\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\u001c\b\u0002\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u001e\u0018\u0001`\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00072\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00182\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\"\u0018\u0001`\u00182\b\b\u0002\u0010#\u001a\u00020\u0010HÆ\u0001¢\u0006\u0003\u0010¸\u0001J\u0016\u0010¹\u0001\u001a\u00020\u00072\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010º\u0001HÖ\u0003J\n\u0010»\u0001\u001a\u00020\u0010HÖ\u0001J\n\u0010¼\u0001\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010/\"\u0004\b0\u00101R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010*\"\u0004\b?\u0010,R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010*\"\u0004\bC\u0010,R\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\n\n\u0002\u0010F\u001a\u0004\bD\u0010ER\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bI\u0010/R0\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010N\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010A\"\u0004\bP\u0010QR\u0011\u0010\u001c\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bR\u0010AR0\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u001e\u0018\u0001`\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010N\u001a\u0004\bS\u0010K\"\u0004\bT\u0010MR\u001a\u0010\u001f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010/\"\u0004\bV\u00101R0\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010N\u001a\u0004\bW\u0010K\"\u0004\bX\u0010MR0\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\"\u0018\u0001`\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010N\u001a\u0004\bY\u0010K\"\u0004\bZ\u0010MR\u0011\u0010#\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b[\u0010AR\u001a\u0010\\\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010*\"\u0004\b^\u0010,R\u0014\u0010_\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R(\u0010b\u001a\u0004\u0018\u00010a2\b\u0010`\u001a\u0004\u0018\u00010a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001c\u0010g\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010*\"\u0004\bi\u0010,R\u001a\u0010j\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010/\"\u0004\bl\u00101R\u001c\u0010m\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010*\"\u0004\bo\u0010,R\u001a\u0010p\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010A\"\u0004\br\u0010QR\u001c\u0010s\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010*\"\u0004\bu\u0010,R\u001c\u0010v\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010*\"\u0004\bx\u0010,R\u001c\u0010y\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010*\"\u0004\b{\u0010,R\u001a\u0010|\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010A\"\u0004\b~\u0010QR\u001c\u0010\u007f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010A\"\u0005\b\u0081\u0001\u0010QR\u001d\u0010\u0082\u0001\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010/\"\u0005\b\u0083\u0001\u00101R\u001d\u0010\u0084\u0001\u001a\u00020\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010A\"\u0005\b\u0086\u0001\u0010QR\u001d\u0010\u0087\u0001\u001a\u00020\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010A\"\u0005\b\u0089\u0001\u0010QR\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010*\"\u0005\b\u008c\u0001\u0010,R\u0013\u0010\u008d\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010/R\u0013\u0010\u008e\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010*R\u0013\u0010\u0090\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010*R\u0013\u0010\u0092\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010/R\u001d\u0010\u0093\u0001\u001a\u00020\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010A\"\u0005\b\u0095\u0001\u0010QR\u001d\u0010\u0096\u0001\u001a\u00020\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010A\"\u0005\b\u0098\u0001\u0010QR\u0013\u0010\u0099\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010/¨\u0006¾\u0001"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "Landroid/os/Parcelable;", "", "id", "", "name", "isCurrent", "", "canRemove", "canEdit", "canEditByConfig", "style", CommonConstants.KEY_VERSION_CODE, "", "backgroundColor", "supportImageFormat", "", "backgroundImage", "backgroundImageList", "", "dataList", "", "supportImageGroup", "imageGroupList", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "Ljava/util/ArrayList;", "supportMaxCount", "styleColorIndex", "slotItems", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceSlotItem;", "onTrial", "textList", "literalBeanList", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;", "supportVideoFormat", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;JLjava/lang/String;ILjava/lang/String;[Ljava/lang/String;[IZLjava/util/ArrayList;IILjava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;I)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "()Z", "setCurrent", "(Z)V", "getCanRemove", "setCanRemove", "getCanEdit", "setCanEdit", "getCanEditByConfig", "setCanEditByConfig", "getStyle", "setStyle", "getVersionCode", "()J", "setVersionCode", "(J)V", "getBackgroundColor", "setBackgroundColor", "getSupportImageFormat", "()I", "getBackgroundImage", "setBackgroundImage", "getBackgroundImageList", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getDataList", "()[I", "getSupportImageGroup", "getImageGroupList", "()Ljava/util/ArrayList;", "setImageGroupList", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "getSupportMaxCount", "setSupportMaxCount", "(I)V", "getStyleColorIndex", "getSlotItems", "setSlotItems", "getOnTrial", "setOnTrial", "getTextList", "setTextList", "getLiteralBeanList", "setLiteralBeanList", "getSupportVideoFormat", "templateId", "getTemplateId", "setTemplateId", "icon", "value", "", "foregroundColor", "getForegroundColor", "()[B", "setForegroundColor", "([B)V", "spiritColor", "getSpiritColor", "setSpiritColor", "hasSpiritColor", "getHasSpiritColor", "setHasSpiritColor", "publish_name", "getPublish_name", "setPublish_name", "type", "getType", "setType", "fileMd5", "getFileMd5", "setFileMd5", "styleUrl", "getStyleUrl", "setStyleUrl", "bottom_background", "getBottom_background", "setBottom_background", "album_picture_type", "getAlbum_picture_type", "setAlbum_picture_type", "faceType", "getFaceType", "setFaceType", "isPortraitFace", "setPortraitFace", "bgImg", "getBgImg", "setBgImg", "tabId", "getTabId", "setTabId", "tabName", "getTabName", "setTabName", "isPhotoFace", "packageName", "getPackageName", "className", "getClassName", "isLocalTestFace", "purchase_type", "getPurchase_type", "setPurchase_type", "purchase_status", "getPurchase_status", "setPurchase_status", "alreadyPurchased", "getAlreadyPurchased", "compareTo", "other", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;JLjava/lang/String;ILjava/lang/String;[Ljava/lang/String;[IZLjava/util/ArrayList;IILjava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;I)Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "equals", "", "hashCode", "toString", "CREATOR", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWatchFace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFace.kt\ncom/xiaomi/fitness/watch/face/export/data/WatchFace\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,264:1\n739#2,9:265\n37#3:274\n36#3,3:275\n*S KotlinDebug\n*F\n+ 1 WatchFace.kt\ncom/xiaomi/fitness/watch/face/export/data/WatchFace\n*L\n75#1:265,9\n75#1:274\n75#1:275,3\n*E\n"})
public final /* data */ class WatchFace implements Parcelable, Comparable<WatchFace> {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int album_picture_type;

    @Nullable
    private String backgroundColor;

    @Nullable
    private String backgroundImage;

    @NotNull
    private final String[] backgroundImageList;
    private int bgImg;

    @Nullable
    private String bottom_background;
    private boolean canEdit;
    private boolean canEditByConfig;
    private boolean canRemove;

    @Nullable
    private final int[] dataList;
    private int faceType;

    @Nullable
    private String fileMd5;

    @Nullable
    private byte[] foregroundColor;
    private boolean hasSpiritColor;

    @JvmField
    @Nullable
    public String icon;

    @NotNull
    private String id;

    @Nullable
    private ArrayList<FaceEditPhotoBean> imageGroupList;
    private boolean isCurrent;
    private boolean isPortraitFace;

    @Nullable
    private ArrayList<FaceEditLiteralBean> literalBeanList;

    @NotNull
    private String name;
    private boolean onTrial;

    @Nullable
    private String publish_name;
    private int purchase_status;
    private int purchase_type;

    @Nullable
    private ArrayList<WatchFaceSlotItem> slotItems;

    @Nullable
    private String spiritColor;

    @Nullable
    private String style;
    private final int styleColorIndex;

    @Nullable
    private String styleUrl;
    private final int supportImageFormat;
    private final boolean supportImageGroup;
    private int supportMaxCount;
    private final int supportVideoFormat;
    private int tabId;

    @Nullable
    private String tabName;

    @NotNull
    private String templateId;

    @Nullable
    private ArrayList<String> textList;
    private int type;
    private long versionCode;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.export.data.WatchFace$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/WatchFace$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<WatchFace> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public WatchFace createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatchFace(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public WatchFace[] newArray(int size) {
            return new WatchFace[size];
        }
    }

    public WatchFace(@NotNull String id, @NotNull String name, boolean z, boolean z2, boolean z3, boolean z4, @Nullable String str, long j, @Nullable String str2, int i, @Nullable String str3, @NotNull String[] backgroundImageList, @Nullable int[] iArr, boolean z5, @Nullable ArrayList<FaceEditPhotoBean> arrayList, int i2, int i3, @Nullable ArrayList<WatchFaceSlotItem> arrayList2, boolean z6, @Nullable ArrayList<String> arrayList3, @Nullable ArrayList<FaceEditLiteralBean> arrayList4, int i4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(backgroundImageList, "backgroundImageList");
        this.id = id;
        this.name = name;
        this.isCurrent = z;
        this.canRemove = z2;
        this.canEdit = z3;
        this.canEditByConfig = z4;
        this.style = str;
        this.versionCode = j;
        this.backgroundColor = str2;
        this.supportImageFormat = i;
        this.backgroundImage = str3;
        this.backgroundImageList = backgroundImageList;
        this.dataList = iArr;
        this.supportImageGroup = z5;
        this.imageGroupList = arrayList;
        this.supportMaxCount = i2;
        this.styleColorIndex = i3;
        this.slotItems = arrayList2;
        this.onTrial = z6;
        this.textList = arrayList3;
        this.literalBeanList = arrayList4;
        this.supportVideoFormat = i4;
        this.templateId = "";
        this.purchase_type = 22;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getSupportImageFormat() {
        return this.supportImageFormat;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String[] getBackgroundImageList() {
        return this.backgroundImageList;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int[] getDataList() {
        return this.dataList;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getSupportImageGroup() {
        return this.supportImageGroup;
    }

    @Nullable
    public final ArrayList<FaceEditPhotoBean> component15() {
        return this.imageGroupList;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getSupportMaxCount() {
        return this.supportMaxCount;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getStyleColorIndex() {
        return this.styleColorIndex;
    }

    @Nullable
    public final ArrayList<WatchFaceSlotItem> component18() {
        return this.slotItems;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getOnTrial() {
        return this.onTrial;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final ArrayList<String> component20() {
        return this.textList;
    }

    @Nullable
    public final ArrayList<FaceEditLiteralBean> component21() {
        return this.literalBeanList;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getSupportVideoFormat() {
        return this.supportVideoFormat;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCanRemove() {
        return this.canRemove;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCanEdit() {
        return this.canEdit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCanEditByConfig() {
        return this.canEditByConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getVersionCode() {
        return this.versionCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final WatchFace copy(@NotNull String id, @NotNull String name, boolean isCurrent, boolean canRemove, boolean canEdit, boolean canEditByConfig, @Nullable String style, long versionCode, @Nullable String backgroundColor, int supportImageFormat, @Nullable String backgroundImage, @NotNull String[] backgroundImageList, @Nullable int[] dataList, boolean supportImageGroup, @Nullable ArrayList<FaceEditPhotoBean> imageGroupList, int supportMaxCount, int styleColorIndex, @Nullable ArrayList<WatchFaceSlotItem> slotItems, boolean onTrial, @Nullable ArrayList<String> textList, @Nullable ArrayList<FaceEditLiteralBean> literalBeanList, int supportVideoFormat) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(backgroundImageList, "backgroundImageList");
        return new WatchFace(id, name, isCurrent, canRemove, canEdit, canEditByConfig, style, versionCode, backgroundColor, supportImageFormat, backgroundImage, backgroundImageList, dataList, supportImageGroup, imageGroupList, supportMaxCount, styleColorIndex, slotItems, onTrial, textList, literalBeanList, supportVideoFormat);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchFace)) {
            return false;
        }
        WatchFace watchFace = (WatchFace) other;
        return Intrinsics.areEqual(this.id, watchFace.id) && Intrinsics.areEqual(this.name, watchFace.name) && this.isCurrent == watchFace.isCurrent && this.canRemove == watchFace.canRemove && this.canEdit == watchFace.canEdit && this.canEditByConfig == watchFace.canEditByConfig && Intrinsics.areEqual(this.style, watchFace.style) && this.versionCode == watchFace.versionCode && Intrinsics.areEqual(this.backgroundColor, watchFace.backgroundColor) && this.supportImageFormat == watchFace.supportImageFormat && Intrinsics.areEqual(this.backgroundImage, watchFace.backgroundImage) && Intrinsics.areEqual(this.backgroundImageList, watchFace.backgroundImageList) && Intrinsics.areEqual(this.dataList, watchFace.dataList) && this.supportImageGroup == watchFace.supportImageGroup && Intrinsics.areEqual(this.imageGroupList, watchFace.imageGroupList) && this.supportMaxCount == watchFace.supportMaxCount && this.styleColorIndex == watchFace.styleColorIndex && Intrinsics.areEqual(this.slotItems, watchFace.slotItems) && this.onTrial == watchFace.onTrial && Intrinsics.areEqual(this.textList, watchFace.textList) && Intrinsics.areEqual(this.literalBeanList, watchFace.literalBeanList) && this.supportVideoFormat == watchFace.supportVideoFormat;
    }

    public final int getAlbum_picture_type() {
        return this.album_picture_type;
    }

    public final boolean getAlreadyPurchased() {
        return this.purchase_type == 21 && this.purchase_status == 1;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    public final String[] getBackgroundImageList() {
        return this.backgroundImageList;
    }

    public final int getBgImg() {
        return this.bgImg;
    }

    @Nullable
    public final String getBottom_background() {
        return this.bottom_background;
    }

    public final boolean getCanEdit() {
        return this.canEdit;
    }

    public final boolean getCanEditByConfig() {
        return this.canEditByConfig;
    }

    public final boolean getCanRemove() {
        return this.canRemove;
    }

    @NotNull
    public final String getClassName() {
        List listEmptyList;
        List<String> listSplit = new Regex("/").split(this.id, 0);
        if (!listSplit.isEmpty()) {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    break;
                }
                if (listIterator.previous().length() != 0) {
                    listEmptyList = CollectionsKt___CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            break;
        }
        String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
        if (strArr.length != 2) {
            return strArr[0];
        }
        String str = strArr[1];
        String strSubstring = str.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, '.', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Nullable
    public final int[] getDataList() {
        return this.dataList;
    }

    public final int getFaceType() {
        return this.faceType;
    }

    @Nullable
    public final String getFileMd5() {
        return this.fileMd5;
    }

    @Nullable
    public final byte[] getForegroundColor() {
        return this.foregroundColor;
    }

    public final boolean getHasSpiritColor() {
        return this.hasSpiritColor;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final ArrayList<FaceEditPhotoBean> getImageGroupList() {
        return this.imageGroupList;
    }

    @Nullable
    public final ArrayList<FaceEditLiteralBean> getLiteralBeanList() {
        return this.literalBeanList;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getOnTrial() {
        return this.onTrial;
    }

    @NotNull
    public final String getPackageName() {
        return (String) StringsKt__StringsKt.split$default((CharSequence) this.id, new String[]{"/"}, false, 0, 6, (Object) null).get(0);
    }

    @Nullable
    public final String getPublish_name() {
        return this.publish_name;
    }

    public final int getPurchase_status() {
        return this.purchase_status;
    }

    public final int getPurchase_type() {
        return this.purchase_type;
    }

    @Nullable
    public final ArrayList<WatchFaceSlotItem> getSlotItems() {
        return this.slotItems;
    }

    @Nullable
    public final String getSpiritColor() {
        return this.spiritColor;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    public final int getStyleColorIndex() {
        return this.styleColorIndex;
    }

    @Nullable
    public final String getStyleUrl() {
        return this.styleUrl;
    }

    public final int getSupportImageFormat() {
        return this.supportImageFormat;
    }

    public final boolean getSupportImageGroup() {
        return this.supportImageGroup;
    }

    public final int getSupportMaxCount() {
        return this.supportMaxCount;
    }

    public final int getSupportVideoFormat() {
        return this.supportVideoFormat;
    }

    public final int getTabId() {
        return this.tabId;
    }

    @Nullable
    public final String getTabName() {
        return this.tabName;
    }

    @NotNull
    public final String getTemplateId() {
        return this.templateId;
    }

    @Nullable
    public final ArrayList<String> getTextList() {
        return this.textList;
    }

    public final int getType() {
        return this.type;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isCurrent)) * 31) + Boolean.hashCode(this.canRemove)) * 31) + Boolean.hashCode(this.canEdit)) * 31) + Boolean.hashCode(this.canEditByConfig)) * 31;
        String str = this.style;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.versionCode)) * 31;
        String str2 = this.backgroundColor;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.supportImageFormat)) * 31;
        String str3 = this.backgroundImage;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Arrays.hashCode(this.backgroundImageList)) * 31;
        int[] iArr = this.dataList;
        int iHashCode5 = (((iHashCode4 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31) + Boolean.hashCode(this.supportImageGroup)) * 31;
        ArrayList<FaceEditPhotoBean> arrayList = this.imageGroupList;
        int iHashCode6 = (((((iHashCode5 + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + Integer.hashCode(this.supportMaxCount)) * 31) + Integer.hashCode(this.styleColorIndex)) * 31;
        ArrayList<WatchFaceSlotItem> arrayList2 = this.slotItems;
        int iHashCode7 = (((iHashCode6 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31) + Boolean.hashCode(this.onTrial)) * 31;
        ArrayList<String> arrayList3 = this.textList;
        int iHashCode8 = (iHashCode7 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        ArrayList<FaceEditLiteralBean> arrayList4 = this.literalBeanList;
        return ((iHashCode8 + (arrayList4 != null ? arrayList4.hashCode() : 0)) * 31) + Integer.hashCode(this.supportVideoFormat);
    }

    public final boolean isCurrent() {
        return this.isCurrent;
    }

    public final boolean isLocalTestFace() {
        return StringsKt__StringsJVMKt.startsWith(this.id, "L", true);
    }

    public final boolean isPhotoFace() {
        return !TextUtils.isEmpty(this.id) && Intrinsics.areEqual("com.xiaomi.wear.watchface.album", getPackageName());
    }

    /* JADX INFO: renamed from: isPortraitFace, reason: from getter */
    public final boolean getIsPortraitFace() {
        return this.isPortraitFace;
    }

    public final void setAlbum_picture_type(int i) {
        this.album_picture_type = i;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    public final void setBackgroundImage(@Nullable String str) {
        this.backgroundImage = str;
    }

    public final void setBgImg(int i) {
        this.bgImg = i;
    }

    public final void setBottom_background(@Nullable String str) {
        this.bottom_background = str;
    }

    public final void setCanEdit(boolean z) {
        this.canEdit = z;
    }

    public final void setCanEditByConfig(boolean z) {
        this.canEditByConfig = z;
    }

    public final void setCanRemove(boolean z) {
        this.canRemove = z;
    }

    public final void setCurrent(boolean z) {
        this.isCurrent = z;
    }

    public final void setFaceType(int i) {
        this.faceType = i;
    }

    public final void setFileMd5(@Nullable String str) {
        this.fileMd5 = str;
    }

    public final void setForegroundColor(@Nullable byte[] bArr) {
        this.foregroundColor = bArr;
        if (bArr == null || bArr.length != 4) {
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bArr[1])}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String str2 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bArr[2])}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String str3 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bArr[3])}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        String str4 = PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + str + str2 + str3;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = str4.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        this.spiritColor = upperCase;
    }

    public final void setHasSpiritColor(boolean z) {
        this.hasSpiritColor = z;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setImageGroupList(@Nullable ArrayList<FaceEditPhotoBean> arrayList) {
        this.imageGroupList = arrayList;
    }

    public final void setLiteralBeanList(@Nullable ArrayList<FaceEditLiteralBean> arrayList) {
        this.literalBeanList = arrayList;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setOnTrial(boolean z) {
        this.onTrial = z;
    }

    public final void setPortraitFace(boolean z) {
        this.isPortraitFace = z;
    }

    public final void setPublish_name(@Nullable String str) {
        this.publish_name = str;
    }

    public final void setPurchase_status(int i) {
        this.purchase_status = i;
    }

    public final void setPurchase_type(int i) {
        this.purchase_type = i;
    }

    public final void setSlotItems(@Nullable ArrayList<WatchFaceSlotItem> arrayList) {
        this.slotItems = arrayList;
    }

    public final void setSpiritColor(@Nullable String str) {
        this.spiritColor = str;
    }

    public final void setStyle(@Nullable String str) {
        this.style = str;
    }

    public final void setStyleUrl(@Nullable String str) {
        this.styleUrl = str;
    }

    public final void setSupportMaxCount(int i) {
        this.supportMaxCount = i;
    }

    public final void setTabId(int i) {
        this.tabId = i;
    }

    public final void setTabName(@Nullable String str) {
        this.tabName = str;
    }

    public final void setTemplateId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.templateId = str;
    }

    public final void setTextList(@Nullable ArrayList<String> arrayList) {
        this.textList = arrayList;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setVersionCode(long j) {
        this.versionCode = j;
    }

    @NotNull
    public String toString() {
        return "WatchFace(id=" + this.id + ", name=" + this.name + ", isCurrent=" + this.isCurrent + ", canRemove=" + this.canRemove + ", canEdit=" + this.canEdit + ", canEditByConfig=" + this.canEditByConfig + ", style=" + this.style + ", versionCode=" + this.versionCode + ", backgroundColor=" + this.backgroundColor + ", supportImageFormat=" + this.supportImageFormat + ", backgroundImage=" + this.backgroundImage + ", backgroundImageList=" + Arrays.toString(this.backgroundImageList) + ", dataList=" + Arrays.toString(this.dataList) + ", supportImageGroup=" + this.supportImageGroup + ", imageGroupList=" + this.imageGroupList + ", supportMaxCount=" + this.supportMaxCount + ", styleColorIndex=" + this.styleColorIndex + ", slotItems=" + this.slotItems + ", onTrial=" + this.onTrial + ", textList=" + this.textList + ", literalBeanList=" + this.literalBeanList + ", supportVideoFormat=" + this.supportVideoFormat + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeByte(this.isCurrent ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.canRemove ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.canEdit ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.canEditByConfig ? (byte) 1 : (byte) 0);
        parcel.writeString(this.style);
        parcel.writeLong(this.versionCode);
        parcel.writeString(this.backgroundColor);
        parcel.writeInt(this.supportImageFormat);
        parcel.writeString(this.backgroundImage);
        parcel.writeStringArray(this.backgroundImageList);
        parcel.writeIntArray(this.dataList);
        parcel.writeByte(this.supportImageGroup ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.imageGroupList);
        parcel.writeInt(this.supportMaxCount);
        parcel.writeInt(this.styleColorIndex);
        parcel.writeTypedList(this.slotItems);
        parcel.writeByte(this.onTrial ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.textList);
        parcel.writeTypedList(this.literalBeanList);
        parcel.writeString(this.templateId);
        parcel.writeString(this.icon);
        parcel.writeString(this.spiritColor);
        parcel.writeByte(this.hasSpiritColor ? (byte) 1 : (byte) 0);
        parcel.writeString(this.publish_name);
        parcel.writeInt(this.type);
        parcel.writeString(this.fileMd5);
        parcel.writeString(this.styleUrl);
        parcel.writeString(this.bottom_background);
        parcel.writeInt(this.album_picture_type);
        parcel.writeInt(this.faceType);
        parcel.writeByte(this.isPortraitFace ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.bgImg);
        parcel.writeInt(this.tabId);
        parcel.writeString(this.tabName);
    }

    @Override // java.lang.Comparable
    public int compareTo(@Nullable WatchFace other) {
        return this.isCurrent ? -1 : 0;
    }

    public /* synthetic */ WatchFace(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, long j, String str4, int i, String str5, String[] strArr, int[] iArr, boolean z5, ArrayList arrayList, int i2, int i3, ArrayList arrayList2, boolean z6, ArrayList arrayList3, ArrayList arrayList4, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, z2, (i5 & 16) != 0 ? false : z3, (i5 & 32) != 0 ? false : z4, (i5 & 64) != 0 ? null : str3, (i5 & 128) != 0 ? 0L : j, (i5 & 256) != 0 ? null : str4, (i5 & 512) != 0 ? 0 : i, (i5 & 1024) != 0 ? null : str5, (i5 & 2048) != 0 ? new String[0] : strArr, (i5 & 4096) != 0 ? null : iArr, (i5 & 8192) != 0 ? false : z5, (i5 & 16384) != 0 ? null : arrayList, (32768 & i5) != 0 ? 8 : i2, (65536 & i5) != 0 ? 0 : i3, (131072 & i5) != 0 ? null : arrayList2, (262144 & i5) != 0 ? false : z6, (524288 & i5) != 0 ? null : arrayList3, (1048576 & i5) != 0 ? null : arrayList4, (i5 & 2097152) != 0 ? 0 : i4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WatchFace(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        String str = string == null ? "" : string;
        String string2 = parcel.readString();
        String str2 = string2 == null ? "" : string2;
        boolean z = parcel.readByte() != 0;
        boolean z2 = parcel.readByte() != 0;
        boolean z3 = parcel.readByte() != 0;
        boolean z4 = parcel.readByte() != 0;
        String string3 = parcel.readString();
        long j = parcel.readLong();
        String string4 = parcel.readString();
        int i = parcel.readInt();
        String string5 = parcel.readString();
        String[] strArrCreateStringArray = parcel.createStringArray();
        this(str, str2, z, z2, z3, z4, string3, j, string4, i, string5, strArrCreateStringArray == null ? new String[0] : strArrCreateStringArray, parcel.createIntArray(), parcel.readByte() != 0, parcel.createTypedArrayList(FaceEditPhotoBean.INSTANCE), parcel.readInt(), parcel.readInt(), parcel.createTypedArrayList(WatchFaceSlotItem.INSTANCE), parcel.readByte() != 0, parcel.createStringArrayList(), parcel.createTypedArrayList(FaceEditLiteralBean.INSTANCE), 0, 2097152, null);
        String string6 = parcel.readString();
        this.templateId = string6 == null ? this.id : string6;
        this.icon = parcel.readString();
        this.spiritColor = parcel.readString();
        this.hasSpiritColor = parcel.readByte() != 0;
        this.publish_name = parcel.readString();
        this.type = parcel.readInt();
        this.fileMd5 = parcel.readString();
        this.styleUrl = parcel.readString();
        this.bottom_background = parcel.readString();
        this.album_picture_type = parcel.readInt();
        this.faceType = parcel.readInt();
        this.isPortraitFace = parcel.readByte() != 0;
        this.bgImg = parcel.readInt();
        this.tabId = parcel.readInt();
        this.tabName = parcel.readString();
    }
}
