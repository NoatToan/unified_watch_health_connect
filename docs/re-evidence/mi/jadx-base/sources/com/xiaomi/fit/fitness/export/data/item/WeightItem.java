package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.persist.db.internal.WeightRecordDaoKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0003\b±\u0001\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0011J\t\u0010»\u0001\u001a\u00020\u0003H\u0016J\u0012\u0010¼\u0001\u001a\u00030½\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u000e\u0010¾\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0019J\n\u0010¿\u0001\u001a\u00030À\u0001H\u0016J \u0010Á\u0001\u001a\u00030À\u00012\n\u0010Â\u0001\u001a\u0005\u0018\u00010Ã\u00012\b\u0010Ä\u0001\u001a\u00030À\u0001H\u0002J\n\u0010Å\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0005HÆ\u0003J\u0011\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0011\u0010È\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0011\u0010É\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0011\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0011\u0010Ë\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010$J\u0011\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0011\u0010Í\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0011\u0010Î\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0084\u0001\u0010Ï\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0003\u0010Ð\u0001J\u0017\u0010Ñ\u0001\u001a\u00030Ò\u00012\n\u0010Ó\u0001\u001a\u0005\u0018\u00010Ô\u0001HÖ\u0003J\n\u0010Õ\u0001\u001a\u00020\u000bHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\"\u0010.\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\"\u00101\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\"\u00104\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001bR\"\u00107\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\u001bR\"\u0010:\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR\"\u0010=\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010\u001bR\"\u0010@\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bA\u0010\u0019\"\u0004\bB\u0010\u001bR\"\u0010C\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u0010\u001bR\"\u0010F\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bG\u0010\u0019\"\u0004\bH\u0010\u001bR\"\u0010I\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bJ\u0010\u0019\"\u0004\bK\u0010\u001bR\"\u0010L\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bM\u0010\u0019\"\u0004\bN\u0010\u001bR\"\u0010O\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\bP\u0010$\"\u0004\bQ\u0010&R\"\u0010R\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\bS\u0010$\"\u0004\bT\u0010&R\"\u0010U\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\bV\u0010$\"\u0004\bW\u0010&R\"\u0010X\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\bY\u0010$\"\u0004\bZ\u0010&R\"\u0010[\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b\\\u0010$\"\u0004\b]\u0010&R\"\u0010^\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b_\u0010$\"\u0004\b`\u0010&R\"\u0010a\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\bb\u0010$\"\u0004\bc\u0010&R\"\u0010d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\be\u0010$\"\u0004\bf\u0010&R\"\u0010g\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bh\u0010\u0019\"\u0004\bi\u0010\u001bR\"\u0010j\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bk\u0010\u0019\"\u0004\bl\u0010\u001bR\"\u0010m\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bn\u0010\u0019\"\u0004\bo\u0010\u001bR\"\u0010p\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bq\u0010\u0019\"\u0004\br\u0010\u001bR\"\u0010s\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bt\u0010\u0019\"\u0004\bu\u0010\u001bR\"\u0010v\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\bw\u0010$\"\u0004\bx\u0010&R\"\u0010y\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\bz\u0010$\"\u0004\b{\u0010&R\"\u0010|\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b}\u0010$\"\u0004\b~\u0010&R$\u0010\u007f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b\u0080\u0001\u0010$\"\u0005\b\u0081\u0001\u0010&R%\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b\u0083\u0001\u0010$\"\u0005\b\u0084\u0001\u0010&R%\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b\u0086\u0001\u0010$\"\u0005\b\u0087\u0001\u0010&R%\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b\u0089\u0001\u0010$\"\u0005\b\u008a\u0001\u0010&R%\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b\u008c\u0001\u0010$\"\u0005\b\u008d\u0001\u0010&R%\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b\u008f\u0001\u0010$\"\u0005\b\u0090\u0001\u0010&R%\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b\u0092\u0001\u0010$\"\u0005\b\u0093\u0001\u0010&R%\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010\u001c\u001a\u0005\b\u0095\u0001\u0010\u0019\"\u0005\b\u0096\u0001\u0010\u001bR%\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b\u0098\u0001\u0010$\"\u0005\b\u0099\u0001\u0010&R%\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b\u009b\u0001\u0010$\"\u0005\b\u009c\u0001\u0010&R%\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b\u009e\u0001\u0010$\"\u0005\b\u009f\u0001\u0010&R%\u0010 \u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b¡\u0001\u0010$\"\u0005\b¢\u0001\u0010&R%\u0010£\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010\u001c\u001a\u0005\b¤\u0001\u0010\u0019\"\u0005\b¥\u0001\u0010\u001bR%\u0010¦\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b§\u0001\u0010$\"\u0005\b¨\u0001\u0010&R%\u0010©\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010\u001c\u001a\u0005\bª\u0001\u0010\u0019\"\u0005\b«\u0001\u0010\u001bR%\u0010¬\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010\u001c\u001a\u0005\b\u00ad\u0001\u0010\u0019\"\u0005\b®\u0001\u0010\u001bR%\u0010¯\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010\u001c\u001a\u0005\b°\u0001\u0010\u0019\"\u0005\b±\u0001\u0010\u001bR%\u0010²\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010\u001c\u001a\u0005\b³\u0001\u0010\u0019\"\u0005\b´\u0001\u0010\u001bR%\u0010µ\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010\u001c\u001a\u0005\b¶\u0001\u0010\u0019\"\u0005\b·\u0001\u0010\u001bR%\u0010¸\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010'\u001a\u0005\b¹\u0001\u0010$\"\u0005\bº\u0001\u0010&¨\u0006Ö\u0001"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "weight", "", "bmi", WeightRecordDaoKt.COL_BODY_FAT_RATE, WeightRecordDaoKt.COL_MOISTURE_RATE, "boneSaltMass", WeightRecordDaoKt.COL_BASAL_METABOLISM, "", "muscleRate", WeightRecordDaoKt.COL_PROTEIN_RATE, WeightRecordDaoKt.COL_VISCERAL_FAT, "<init>", "(JFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "(JFLjava/lang/Float;)V", "getTime", "()J", "setTime", "(J)V", "getWeight", "()F", "getBmi", "()Ljava/lang/Float;", "setBmi", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getBodyFatRate", "setBodyFatRate", "getMoistureRate", "setMoistureRate", "getBoneSaltMass", "setBoneSaltMass", "getBasalMetabolism", "()Ljava/lang/Integer;", "setBasalMetabolism", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMuscleRate", "setMuscleRate", "getProteinRate", "setProteinRate", "getVisceralFat", "setVisceralFat", "bodyMoistureMass", "getBodyMoistureMass", "setBodyMoistureMass", "proteinMass", "getProteinMass", "setProteinMass", "fatMass", "getFatMass", "setFatMass", WeightRecordDaoKt.COL_MUSCLE_RATE, "getMuscleMass", "setMuscleMass", "boneSaltRate", "getBoneSaltRate", "setBoneSaltRate", "limbsSkeletalMuscleIndex", "getLimbsSkeletalMuscleIndex", "setLimbsSkeletalMuscleIndex", "leftUpperLimbMuscleMass", "getLeftUpperLimbMuscleMass", "setLeftUpperLimbMuscleMass", "rightUpperLimbMuscleMass", "getRightUpperLimbMuscleMass", "setRightUpperLimbMuscleMass", "trunkMuscleMass", "getTrunkMuscleMass", "setTrunkMuscleMass", "leftLowerLimbMuscleMass", "getLeftLowerLimbMuscleMass", "setLeftLowerLimbMuscleMass", "rightLowerLimbMuscleMass", "getRightLowerLimbMuscleMass", "setRightLowerLimbMuscleMass", "upperLimbMuscleBalance", "getUpperLimbMuscleBalance", "setUpperLimbMuscleBalance", "lowerLimbMuscleBalance", "getLowerLimbMuscleBalance", "setLowerLimbMuscleBalance", "limbsMuscleBalance", "getLimbsMuscleBalance", "setLimbsMuscleBalance", "leftUpperLimbMuscleLevel", "getLeftUpperLimbMuscleLevel", "setLeftUpperLimbMuscleLevel", "rightUpperLimbMuscleLevel", "getRightUpperLimbMuscleLevel", "setRightUpperLimbMuscleLevel", "trunkMuscleLevel", "getTrunkMuscleLevel", "setTrunkMuscleLevel", "leftLowerLimbMuscleLevel", "getLeftLowerLimbMuscleLevel", "setLeftLowerLimbMuscleLevel", "rightLowerLimbMuscleLevel", "getRightLowerLimbMuscleLevel", "setRightLowerLimbMuscleLevel", "leftUpperLimbFatMass", "getLeftUpperLimbFatMass", "setLeftUpperLimbFatMass", "rightUpperLimbFatMass", "getRightUpperLimbFatMass", "setRightUpperLimbFatMass", "trunkFatMass", "getTrunkFatMass", "setTrunkFatMass", "leftLowerLimbFatMass", "getLeftLowerLimbFatMass", "setLeftLowerLimbFatMass", "rightLowerLimbFatMass", "getRightLowerLimbFatMass", "setRightLowerLimbFatMass", "upperLimbFatBalance", "getUpperLimbFatBalance", "setUpperLimbFatBalance", "lowerLimbFatBalance", "getLowerLimbFatBalance", "setLowerLimbFatBalance", "limbsFatBalance", "getLimbsFatBalance", "setLimbsFatBalance", "leftUpperLimbFatLevel", "getLeftUpperLimbFatLevel", "setLeftUpperLimbFatLevel", "rightUpperLimbFatLevel", "getRightUpperLimbFatLevel", "setRightUpperLimbFatLevel", "trunkFatLevel", "getTrunkFatLevel", "setTrunkFatLevel", "leftLowerLimbFatLevel", "getLeftLowerLimbFatLevel", "setLeftLowerLimbFatLevel", "rightLowerLimbFatLevel", "getRightLowerLimbFatLevel", "setRightLowerLimbFatLevel", "somatotype", "getSomatotype", "setSomatotype", "bodyShape", "getBodyShape", "setBodyShape", "whr", "getWhr", "setWhr", "bmp", "getBmp", "setBmp", "bodyScore", "getBodyScore", "setBodyScore", "bodyAge", "getBodyAge", "setBodyAge", "standardWeight", "getStandardWeight", "setStandardWeight", "standardWeightV2", "getStandardWeightV2", "setStandardWeightV2", "recommendedCaloriesIntake", "getRecommendedCaloriesIntake", "setRecommendedCaloriesIntake", "weightControl", "getWeightControl", "setWeightControl", "muscleControl", "getMuscleControl", "setMuscleControl", "fatControl", "getFatControl", "setFatControl", "skeletalMuscleMass", "getSkeletalMuscleMass", "setSkeletalMuscleMass", "fatFreeBody", "getFatFreeBody", "setFatFreeBody", "scoreStandardType", "getScoreStandardType", "setScoreStandardType", "getTimestamp", "setTimestamp", "", "getRealStandardWeight", "toString", "", "getCompositionString", "composition", "", "name", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(JFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeightItem extends DailyRecordItem {

    @SerializedName("basal_metabolism")
    @Nullable
    private Integer basalMetabolism;

    @SerializedName("bmi")
    @Nullable
    private Float bmi;

    @SerializedName("bpm")
    @Nullable
    private Integer bmp;

    @SerializedName("body_age")
    @Nullable
    private Integer bodyAge;

    @SerializedName("body_fat_rate")
    @Nullable
    private Float bodyFatRate;

    @SerializedName("body_moisture_mass")
    @Nullable
    private Float bodyMoistureMass;

    @SerializedName("body_score")
    @Nullable
    private Integer bodyScore;

    @SerializedName("body_shape")
    @Nullable
    private Integer bodyShape;

    @SerializedName("bone_mass")
    @Nullable
    private Float boneSaltMass;

    @SerializedName("bone_rate")
    @Nullable
    private Float boneSaltRate;

    @SerializedName("fat_control")
    @Nullable
    private Float fatControl;

    @SerializedName("fat_free_body")
    @Nullable
    private Float fatFreeBody;

    @SerializedName("fat_mass")
    @Nullable
    private Float fatMass;

    @SerializedName("left_lower_limb_fat_rank")
    @Nullable
    private Integer leftLowerLimbFatLevel;

    @SerializedName("left_lower_limb_fat_mass")
    @Nullable
    private Float leftLowerLimbFatMass;

    @SerializedName("left_lower_limb_muscle_rank")
    @Nullable
    private Integer leftLowerLimbMuscleLevel;

    @SerializedName("left_lower_limb_muscle_mass")
    @Nullable
    private Float leftLowerLimbMuscleMass;

    @SerializedName("left_upper_limb_fat_rank")
    @Nullable
    private Integer leftUpperLimbFatLevel;

    @SerializedName("left_upper_limb_fat_mass")
    @Nullable
    private Float leftUpperLimbFatMass;

    @SerializedName("left_upper_limb_muscle_rank")
    @Nullable
    private Integer leftUpperLimbMuscleLevel;

    @SerializedName("left_upper_limb_muscle_mass")
    @Nullable
    private Float leftUpperLimbMuscleMass;

    @SerializedName("limbs_fat_balance")
    @Nullable
    private Integer limbsFatBalance;

    @SerializedName("limbs_muscle_balance")
    @Nullable
    private Integer limbsMuscleBalance;

    @SerializedName("limbs_skeletal_muscle_index")
    @Nullable
    private Float limbsSkeletalMuscleIndex;

    @SerializedName("lower_limb_fat_balance")
    @Nullable
    private Integer lowerLimbFatBalance;

    @SerializedName("lower_limb_muscle_balance")
    @Nullable
    private Integer lowerLimbMuscleBalance;

    @SerializedName("moisture_rate")
    @Nullable
    private Float moistureRate;

    @SerializedName("muscle_control")
    @Nullable
    private Float muscleControl;

    @SerializedName("muscle_mass")
    @Nullable
    private Float muscleMass;

    @SerializedName("muscle_rate")
    @Nullable
    private Float muscleRate;

    @SerializedName("protein_mass")
    @Nullable
    private Float proteinMass;

    @SerializedName("protein_rate")
    @Nullable
    private Float proteinRate;

    @SerializedName("recommended_calories_intake")
    @Nullable
    private Integer recommendedCaloriesIntake;

    @SerializedName("right_lower_limb_fat_rank")
    @Nullable
    private Integer rightLowerLimbFatLevel;

    @SerializedName("right_lower_limb_fat_mass")
    @Nullable
    private Float rightLowerLimbFatMass;

    @SerializedName("right_lower_limb_muscle_rank")
    @Nullable
    private Integer rightLowerLimbMuscleLevel;

    @SerializedName("right_lower_limb_muscle_mass")
    @Nullable
    private Float rightLowerLimbMuscleMass;

    @SerializedName("right_upper_limb_fat_rank")
    @Nullable
    private Integer rightUpperLimbFatLevel;

    @SerializedName("right_upper_limb_fat_mass")
    @Nullable
    private Float rightUpperLimbFatMass;

    @SerializedName("right_upper_limb_muscle_rank")
    @Nullable
    private Integer rightUpperLimbMuscleLevel;

    @SerializedName("right_upper_limb_muscle_mass")
    @Nullable
    private Float rightUpperLimbMuscleMass;

    @SerializedName("score_standard_type")
    @Nullable
    private Integer scoreStandardType;

    @SerializedName("skeletal_muscle_mass")
    @Nullable
    private Float skeletalMuscleMass;

    @SerializedName("somatotype")
    @Nullable
    private Integer somatotype;

    @SerializedName("standard_weight")
    @Nullable
    private Integer standardWeight;

    @SerializedName("standard_weight_v2")
    @Nullable
    private Float standardWeightV2;

    @SerializedName("time")
    private long time;

    @SerializedName("trunk_fat_rank")
    @Nullable
    private Integer trunkFatLevel;

    @SerializedName("trunk_fat_mass")
    @Nullable
    private Float trunkFatMass;

    @SerializedName("trunk_muscle_rank")
    @Nullable
    private Integer trunkMuscleLevel;

    @SerializedName("trunk_muscle_mass")
    @Nullable
    private Float trunkMuscleMass;

    @SerializedName("upper_limb_fat_balance")
    @Nullable
    private Integer upperLimbFatBalance;

    @SerializedName("upper_limb_muscle_balance")
    @Nullable
    private Integer upperLimbMuscleBalance;

    @SerializedName("visceral_fat")
    @Nullable
    private Float visceralFat;

    @SerializedName("weight")
    private final float weight;

    @SerializedName("weight_control")
    @Nullable
    private Float weightControl;

    @SerializedName("whr")
    @Nullable
    private Float whr;

    public /* synthetic */ WeightItem(long j, float f, Float f2, Float f3, Float f4, Float f5, Integer num, Float f6, Float f7, Float f8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : f3, (i & 16) != 0 ? null : f4, (i & 32) != 0 ? null : f5, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : f6, (i & 256) != 0 ? null : f7, (i & 512) != 0 ? null : f8);
    }

    private final String getCompositionString(Number composition, String name) {
        if (composition == null) {
            return "";
        }
        return ", " + name + "=" + composition;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Float getVisceralFat() {
        return this.visceralFat;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getBmi() {
        return this.bmi;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getBodyFatRate() {
        return this.bodyFatRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getMoistureRate() {
        return this.moistureRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Float getBoneSaltMass() {
        return this.boneSaltMass;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getBasalMetabolism() {
        return this.basalMetabolism;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Float getMuscleRate() {
        return this.muscleRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Float getProteinRate() {
        return this.proteinRate;
    }

    @NotNull
    public final WeightItem copy(long time, float weight, @Nullable Float bmi, @Nullable Float bodyFatRate, @Nullable Float moistureRate, @Nullable Float boneSaltMass, @Nullable Integer basalMetabolism, @Nullable Float muscleRate, @Nullable Float proteinRate, @Nullable Float visceralFat) {
        return new WeightItem(time, weight, bmi, bodyFatRate, moistureRate, boneSaltMass, basalMetabolism, muscleRate, proteinRate, visceralFat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightItem)) {
            return false;
        }
        WeightItem weightItem = (WeightItem) other;
        return this.time == weightItem.time && Float.compare(this.weight, weightItem.weight) == 0 && Intrinsics.areEqual((Object) this.bmi, (Object) weightItem.bmi) && Intrinsics.areEqual((Object) this.bodyFatRate, (Object) weightItem.bodyFatRate) && Intrinsics.areEqual((Object) this.moistureRate, (Object) weightItem.moistureRate) && Intrinsics.areEqual((Object) this.boneSaltMass, (Object) weightItem.boneSaltMass) && Intrinsics.areEqual(this.basalMetabolism, weightItem.basalMetabolism) && Intrinsics.areEqual((Object) this.muscleRate, (Object) weightItem.muscleRate) && Intrinsics.areEqual((Object) this.proteinRate, (Object) weightItem.proteinRate) && Intrinsics.areEqual((Object) this.visceralFat, (Object) weightItem.visceralFat);
    }

    @Nullable
    public final Integer getBasalMetabolism() {
        return this.basalMetabolism;
    }

    @Nullable
    public final Float getBmi() {
        return this.bmi;
    }

    @Nullable
    public final Integer getBmp() {
        return this.bmp;
    }

    @Nullable
    public final Integer getBodyAge() {
        return this.bodyAge;
    }

    @Nullable
    public final Float getBodyFatRate() {
        return this.bodyFatRate;
    }

    @Nullable
    public final Float getBodyMoistureMass() {
        return this.bodyMoistureMass;
    }

    @Nullable
    public final Integer getBodyScore() {
        return this.bodyScore;
    }

    @Nullable
    public final Integer getBodyShape() {
        return this.bodyShape;
    }

    @Nullable
    public final Float getBoneSaltMass() {
        return this.boneSaltMass;
    }

    @Nullable
    public final Float getBoneSaltRate() {
        return this.boneSaltRate;
    }

    @Nullable
    public final Float getFatControl() {
        return this.fatControl;
    }

    @Nullable
    public final Float getFatFreeBody() {
        return this.fatFreeBody;
    }

    @Nullable
    public final Float getFatMass() {
        return this.fatMass;
    }

    @Nullable
    public final Integer getLeftLowerLimbFatLevel() {
        return this.leftLowerLimbFatLevel;
    }

    @Nullable
    public final Float getLeftLowerLimbFatMass() {
        return this.leftLowerLimbFatMass;
    }

    @Nullable
    public final Integer getLeftLowerLimbMuscleLevel() {
        return this.leftLowerLimbMuscleLevel;
    }

    @Nullable
    public final Float getLeftLowerLimbMuscleMass() {
        return this.leftLowerLimbMuscleMass;
    }

    @Nullable
    public final Integer getLeftUpperLimbFatLevel() {
        return this.leftUpperLimbFatLevel;
    }

    @Nullable
    public final Float getLeftUpperLimbFatMass() {
        return this.leftUpperLimbFatMass;
    }

    @Nullable
    public final Integer getLeftUpperLimbMuscleLevel() {
        return this.leftUpperLimbMuscleLevel;
    }

    @Nullable
    public final Float getLeftUpperLimbMuscleMass() {
        return this.leftUpperLimbMuscleMass;
    }

    @Nullable
    public final Integer getLimbsFatBalance() {
        return this.limbsFatBalance;
    }

    @Nullable
    public final Integer getLimbsMuscleBalance() {
        return this.limbsMuscleBalance;
    }

    @Nullable
    public final Float getLimbsSkeletalMuscleIndex() {
        return this.limbsSkeletalMuscleIndex;
    }

    @Nullable
    public final Integer getLowerLimbFatBalance() {
        return this.lowerLimbFatBalance;
    }

    @Nullable
    public final Integer getLowerLimbMuscleBalance() {
        return this.lowerLimbMuscleBalance;
    }

    @Nullable
    public final Float getMoistureRate() {
        return this.moistureRate;
    }

    @Nullable
    public final Float getMuscleControl() {
        return this.muscleControl;
    }

    @Nullable
    public final Float getMuscleMass() {
        return this.muscleMass;
    }

    @Nullable
    public final Float getMuscleRate() {
        return this.muscleRate;
    }

    @Nullable
    public final Float getProteinMass() {
        return this.proteinMass;
    }

    @Nullable
    public final Float getProteinRate() {
        return this.proteinRate;
    }

    @Nullable
    public final Float getRealStandardWeight() {
        Float f = this.standardWeightV2;
        if ((f != null ? f.floatValue() : 0.0f) > 0.0f) {
            return this.standardWeightV2;
        }
        Integer num = this.standardWeight;
        if (num != null) {
            return Float.valueOf(num.intValue());
        }
        return null;
    }

    @Nullable
    public final Integer getRecommendedCaloriesIntake() {
        return this.recommendedCaloriesIntake;
    }

    @Nullable
    public final Integer getRightLowerLimbFatLevel() {
        return this.rightLowerLimbFatLevel;
    }

    @Nullable
    public final Float getRightLowerLimbFatMass() {
        return this.rightLowerLimbFatMass;
    }

    @Nullable
    public final Integer getRightLowerLimbMuscleLevel() {
        return this.rightLowerLimbMuscleLevel;
    }

    @Nullable
    public final Float getRightLowerLimbMuscleMass() {
        return this.rightLowerLimbMuscleMass;
    }

    @Nullable
    public final Integer getRightUpperLimbFatLevel() {
        return this.rightUpperLimbFatLevel;
    }

    @Nullable
    public final Float getRightUpperLimbFatMass() {
        return this.rightUpperLimbFatMass;
    }

    @Nullable
    public final Integer getRightUpperLimbMuscleLevel() {
        return this.rightUpperLimbMuscleLevel;
    }

    @Nullable
    public final Float getRightUpperLimbMuscleMass() {
        return this.rightUpperLimbMuscleMass;
    }

    @Nullable
    public final Integer getScoreStandardType() {
        return this.scoreStandardType;
    }

    @Nullable
    public final Float getSkeletalMuscleMass() {
        return this.skeletalMuscleMass;
    }

    @Nullable
    public final Integer getSomatotype() {
        return this.somatotype;
    }

    @Nullable
    public final Integer getStandardWeight() {
        return this.standardWeight;
    }

    @Nullable
    public final Float getStandardWeightV2() {
        return this.standardWeightV2;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    @Nullable
    public final Integer getTrunkFatLevel() {
        return this.trunkFatLevel;
    }

    @Nullable
    public final Float getTrunkFatMass() {
        return this.trunkFatMass;
    }

    @Nullable
    public final Integer getTrunkMuscleLevel() {
        return this.trunkMuscleLevel;
    }

    @Nullable
    public final Float getTrunkMuscleMass() {
        return this.trunkMuscleMass;
    }

    @Nullable
    public final Integer getUpperLimbFatBalance() {
        return this.upperLimbFatBalance;
    }

    @Nullable
    public final Integer getUpperLimbMuscleBalance() {
        return this.upperLimbMuscleBalance;
    }

    @Nullable
    public final Float getVisceralFat() {
        return this.visceralFat;
    }

    public final float getWeight() {
        return this.weight;
    }

    @Nullable
    public final Float getWeightControl() {
        return this.weightControl;
    }

    @Nullable
    public final Float getWhr() {
        return this.whr;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.time) * 31) + Float.hashCode(this.weight)) * 31;
        Float f = this.bmi;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.bodyFatRate;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.moistureRate;
        int iHashCode4 = (iHashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.boneSaltMass;
        int iHashCode5 = (iHashCode4 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num = this.basalMetabolism;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Float f5 = this.muscleRate;
        int iHashCode7 = (iHashCode6 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.proteinRate;
        int iHashCode8 = (iHashCode7 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.visceralFat;
        return iHashCode8 + (f7 != null ? f7.hashCode() : 0);
    }

    public final void setBasalMetabolism(@Nullable Integer num) {
        this.basalMetabolism = num;
    }

    public final void setBmi(@Nullable Float f) {
        this.bmi = f;
    }

    public final void setBmp(@Nullable Integer num) {
        this.bmp = num;
    }

    public final void setBodyAge(@Nullable Integer num) {
        this.bodyAge = num;
    }

    public final void setBodyFatRate(@Nullable Float f) {
        this.bodyFatRate = f;
    }

    public final void setBodyMoistureMass(@Nullable Float f) {
        this.bodyMoistureMass = f;
    }

    public final void setBodyScore(@Nullable Integer num) {
        this.bodyScore = num;
    }

    public final void setBodyShape(@Nullable Integer num) {
        this.bodyShape = num;
    }

    public final void setBoneSaltMass(@Nullable Float f) {
        this.boneSaltMass = f;
    }

    public final void setBoneSaltRate(@Nullable Float f) {
        this.boneSaltRate = f;
    }

    public final void setFatControl(@Nullable Float f) {
        this.fatControl = f;
    }

    public final void setFatFreeBody(@Nullable Float f) {
        this.fatFreeBody = f;
    }

    public final void setFatMass(@Nullable Float f) {
        this.fatMass = f;
    }

    public final void setLeftLowerLimbFatLevel(@Nullable Integer num) {
        this.leftLowerLimbFatLevel = num;
    }

    public final void setLeftLowerLimbFatMass(@Nullable Float f) {
        this.leftLowerLimbFatMass = f;
    }

    public final void setLeftLowerLimbMuscleLevel(@Nullable Integer num) {
        this.leftLowerLimbMuscleLevel = num;
    }

    public final void setLeftLowerLimbMuscleMass(@Nullable Float f) {
        this.leftLowerLimbMuscleMass = f;
    }

    public final void setLeftUpperLimbFatLevel(@Nullable Integer num) {
        this.leftUpperLimbFatLevel = num;
    }

    public final void setLeftUpperLimbFatMass(@Nullable Float f) {
        this.leftUpperLimbFatMass = f;
    }

    public final void setLeftUpperLimbMuscleLevel(@Nullable Integer num) {
        this.leftUpperLimbMuscleLevel = num;
    }

    public final void setLeftUpperLimbMuscleMass(@Nullable Float f) {
        this.leftUpperLimbMuscleMass = f;
    }

    public final void setLimbsFatBalance(@Nullable Integer num) {
        this.limbsFatBalance = num;
    }

    public final void setLimbsMuscleBalance(@Nullable Integer num) {
        this.limbsMuscleBalance = num;
    }

    public final void setLimbsSkeletalMuscleIndex(@Nullable Float f) {
        this.limbsSkeletalMuscleIndex = f;
    }

    public final void setLowerLimbFatBalance(@Nullable Integer num) {
        this.lowerLimbFatBalance = num;
    }

    public final void setLowerLimbMuscleBalance(@Nullable Integer num) {
        this.lowerLimbMuscleBalance = num;
    }

    public final void setMoistureRate(@Nullable Float f) {
        this.moistureRate = f;
    }

    public final void setMuscleControl(@Nullable Float f) {
        this.muscleControl = f;
    }

    public final void setMuscleMass(@Nullable Float f) {
        this.muscleMass = f;
    }

    public final void setMuscleRate(@Nullable Float f) {
        this.muscleRate = f;
    }

    public final void setProteinMass(@Nullable Float f) {
        this.proteinMass = f;
    }

    public final void setProteinRate(@Nullable Float f) {
        this.proteinRate = f;
    }

    public final void setRecommendedCaloriesIntake(@Nullable Integer num) {
        this.recommendedCaloriesIntake = num;
    }

    public final void setRightLowerLimbFatLevel(@Nullable Integer num) {
        this.rightLowerLimbFatLevel = num;
    }

    public final void setRightLowerLimbFatMass(@Nullable Float f) {
        this.rightLowerLimbFatMass = f;
    }

    public final void setRightLowerLimbMuscleLevel(@Nullable Integer num) {
        this.rightLowerLimbMuscleLevel = num;
    }

    public final void setRightLowerLimbMuscleMass(@Nullable Float f) {
        this.rightLowerLimbMuscleMass = f;
    }

    public final void setRightUpperLimbFatLevel(@Nullable Integer num) {
        this.rightUpperLimbFatLevel = num;
    }

    public final void setRightUpperLimbFatMass(@Nullable Float f) {
        this.rightUpperLimbFatMass = f;
    }

    public final void setRightUpperLimbMuscleLevel(@Nullable Integer num) {
        this.rightUpperLimbMuscleLevel = num;
    }

    public final void setRightUpperLimbMuscleMass(@Nullable Float f) {
        this.rightUpperLimbMuscleMass = f;
    }

    public final void setScoreStandardType(@Nullable Integer num) {
        this.scoreStandardType = num;
    }

    public final void setSkeletalMuscleMass(@Nullable Float f) {
        this.skeletalMuscleMass = f;
    }

    public final void setSomatotype(@Nullable Integer num) {
        this.somatotype = num;
    }

    public final void setStandardWeight(@Nullable Integer num) {
        this.standardWeight = num;
    }

    public final void setStandardWeightV2(@Nullable Float f) {
        this.standardWeightV2 = f;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    public final void setTrunkFatLevel(@Nullable Integer num) {
        this.trunkFatLevel = num;
    }

    public final void setTrunkFatMass(@Nullable Float f) {
        this.trunkFatMass = f;
    }

    public final void setTrunkMuscleLevel(@Nullable Integer num) {
        this.trunkMuscleLevel = num;
    }

    public final void setTrunkMuscleMass(@Nullable Float f) {
        this.trunkMuscleMass = f;
    }

    public final void setUpperLimbFatBalance(@Nullable Integer num) {
        this.upperLimbFatBalance = num;
    }

    public final void setUpperLimbMuscleBalance(@Nullable Integer num) {
        this.upperLimbMuscleBalance = num;
    }

    public final void setVisceralFat(@Nullable Float f) {
        this.visceralFat = f;
    }

    public final void setWeightControl(@Nullable Float f) {
        this.weightControl = f;
    }

    public final void setWhr(@Nullable Float f) {
        this.whr = f;
    }

    @NotNull
    public String toString() {
        return "WeightItem(time=" + this.time + ", sid=" + getSid() + getCompositionString(Float.valueOf(this.weight), "weight") + getCompositionString(this.bmi, "bmi") + getCompositionString(this.bodyFatRate, WeightRecordDaoKt.COL_BODY_FAT_RATE) + getCompositionString(this.moistureRate, WeightRecordDaoKt.COL_MOISTURE_RATE) + getCompositionString(this.boneSaltMass, "boneSaltMass") + getCompositionString(this.boneSaltRate, "boneSaltRate") + getCompositionString(this.basalMetabolism, WeightRecordDaoKt.COL_BASAL_METABOLISM) + getCompositionString(this.muscleRate, "muscleRate") + getCompositionString(this.proteinRate, WeightRecordDaoKt.COL_PROTEIN_RATE) + getCompositionString(this.visceralFat, WeightRecordDaoKt.COL_VISCERAL_FAT) + getCompositionString(this.bodyMoistureMass, "bodyMoistureMass") + getCompositionString(this.proteinMass, "proteinMass") + getCompositionString(this.fatMass, "fatMass") + getCompositionString(this.muscleMass, WeightRecordDaoKt.COL_MUSCLE_RATE) + getCompositionString(this.limbsSkeletalMuscleIndex, "limbsSkeletalMuscleIndex") + getCompositionString(this.leftUpperLimbMuscleMass, "leftUpperLimbMuscleMass") + getCompositionString(this.rightUpperLimbMuscleMass, "rightUpperLimbMuscleMass") + getCompositionString(this.trunkMuscleMass, "trunkMuscleMass") + getCompositionString(this.leftLowerLimbMuscleMass, "leftLowerLimbMuscleMass") + getCompositionString(this.rightLowerLimbMuscleMass, "rightLowerLimbMuscleMass") + getCompositionString(this.upperLimbMuscleBalance, "upperLimbMuscleBalance") + getCompositionString(this.lowerLimbMuscleBalance, "lowerLimbMuscleBalance") + getCompositionString(this.limbsMuscleBalance, "limbsMuscleBalance") + getCompositionString(this.leftUpperLimbFatMass, "leftUpperLimbFatMass") + getCompositionString(this.rightUpperLimbFatMass, "rightUpperLimbFatMass") + getCompositionString(this.trunkFatMass, "trunkFatMass") + getCompositionString(this.leftLowerLimbFatMass, "leftLowerLimbFatMass") + getCompositionString(this.rightLowerLimbFatMass, "rightLowerLimbFatMass") + getCompositionString(this.upperLimbFatBalance, "upperLimbFatBalance") + getCompositionString(this.lowerLimbFatBalance, "lowerLimbFatBalance") + getCompositionString(this.limbsFatBalance, "limbsFatBalance") + getCompositionString(this.leftUpperLimbMuscleLevel, "leftUpperLimbMuscleLevel") + getCompositionString(this.rightUpperLimbMuscleLevel, "rightUpperLimbMuscleLevel") + getCompositionString(this.trunkMuscleLevel, "trunkMuscleLevel") + getCompositionString(this.leftLowerLimbMuscleLevel, "leftLowerLimbMuscleLevel") + getCompositionString(this.rightLowerLimbMuscleLevel, "rightLowerLimbMuscleLevel") + getCompositionString(this.leftUpperLimbFatLevel, "leftUpperLimbFatLevel") + getCompositionString(this.rightUpperLimbFatLevel, "rightUpperLimbFatLevel") + getCompositionString(this.trunkFatLevel, "trunkFatLevel") + getCompositionString(this.leftLowerLimbFatLevel, "leftLowerLimbFatLevel") + getCompositionString(this.rightLowerLimbFatLevel, "rightLowerLimbFatLevel") + getCompositionString(this.somatotype, "somatotype") + getCompositionString(this.bodyShape, "bodyShape") + getCompositionString(this.whr, "whr") + getCompositionString(this.bmp, "bmp") + getCompositionString(this.bodyScore, "bodyScore") + getCompositionString(this.bodyAge, "bodyAge") + getCompositionString(this.standardWeight, "standardWeight") + getCompositionString(this.standardWeightV2, "standardWeightV2") + getCompositionString(this.recommendedCaloriesIntake, "recommendedCaloriesIntake") + getCompositionString(this.weightControl, "weightControl") + getCompositionString(this.muscleControl, "muscleControl") + getCompositionString(this.fatControl, "fatControl") + getCompositionString(this.fatFreeBody, "fatFreeBody") + getCompositionString(this.skeletalMuscleMass, "skeletalMuscleMass") + getCompositionString(this.scoreStandardType, "scoreStandardType") + ")";
    }

    public WeightItem(long j, float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, @Nullable Float f5, @Nullable Integer num, @Nullable Float f6, @Nullable Float f7, @Nullable Float f8) {
        super(null);
        this.time = j;
        this.weight = f;
        this.bmi = f2;
        this.bodyFatRate = f3;
        this.moistureRate = f4;
        this.boneSaltMass = f5;
        this.basalMetabolism = num;
        this.muscleRate = f6;
        this.proteinRate = f7;
        this.visceralFat = f8;
    }

    public WeightItem(long j, float f, @Nullable Float f2) {
        this(j, f, f2, null, null, null, null, null, null, null);
    }
}
