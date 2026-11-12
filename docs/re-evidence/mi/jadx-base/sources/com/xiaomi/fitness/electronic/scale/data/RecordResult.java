package com.xiaomi.fitness.electronic.scale.data;

import com.miui.circulate.device.api.Column;
import com.xiaomi.fit.fitness.persist.db.internal.WeightRecordDaoKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b)\n\u0002\u0010\u000e\n\u0002\bT\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÇ\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\t\u0012\u0006\u0010%\u001a\u00020\t\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020 \u0012\u0006\u0010(\u001a\u00020 \u0012\u0006\u0010)\u001a\u00020 \u0012\u0006\u0010*\u001a\u00020 \u0012\u0006\u0010+\u001a\u00020 \u0012\u0006\u0010,\u001a\u00020 \u0012\u0006\u0010-\u001a\u00020 \u0012\u0006\u0010.\u001a\u00020 \u0012\u0006\u0010/\u001a\u00020 \u0012\u0006\u00100\u001a\u00020 \u0012\u0006\u00101\u001a\u00020 \u0012\u0006\u00102\u001a\u00020 \u0012\u0006\u00103\u001a\u00020\"\u0012\u0006\u00104\u001a\u00020\"\u0012\u0006\u00105\u001a\u00020\"\u0012\u0006\u00106\u001a\u00020\"\u0012\u0006\u00107\u001a\u00020\"\u0012\u0006\u00108\u001a\u00020\"\u0012\u0006\u00109\u001a\u00020\t\u0012\u0006\u0010:\u001a\u00020\t\u0012\u0006\u0010;\u001a\u00020\t\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u0010?\u001a\u00020\u0003\u0012\u0006\u0010@\u001a\u00020\u0003\u0012\u0006\u0010A\u001a\u00020\u0003\u0012\u0006\u0010B\u001a\u00020\u0003\u0012\u0006\u0010C\u001a\u00020\u0003\u0012\u0006\u0010D\u001a\u00020\u0003\u0012\u0006\u0010E\u001a\u00020\u0003\u0012\u0006\u0010F\u001a\u00020\u0003\u0012\u0006\u0010G\u001a\u00020\u0003\u0012\u0006\u0010H\u001a\u00020\u0003\u0012\u0006\u0010I\u001a\u00020\u0005\u0012\u0006\u0010J\u001a\u00020\u0005\u0012\u0006\u0010K\u001a\u00020L\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010N\u001a\u00020\u0003\u0012\u0006\u0010O\u001a\u00020L¢\u0006\u0004\bP\u0010QJ\b\u0010 \u0001\u001a\u00030¡\u0001J\b\u0010¢\u0001\u001a\u00030¡\u0001J\n\u0010£\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010§\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010©\u0001\u001a\u00020\tHÆ\u0003J\n\u0010ª\u0001\u001a\u00020\tHÆ\u0003J\n\u0010«\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¬\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\tHÆ\u0003J\n\u0010®\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¯\u0001\u001a\u00020\tHÆ\u0003J\n\u0010°\u0001\u001a\u00020\tHÆ\u0003J\n\u0010±\u0001\u001a\u00020\tHÆ\u0003J\n\u0010²\u0001\u001a\u00020\tHÆ\u0003J\n\u0010³\u0001\u001a\u00020\tHÆ\u0003J\n\u0010´\u0001\u001a\u00020\tHÆ\u0003J\n\u0010µ\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¶\u0001\u001a\u00020\tHÆ\u0003J\n\u0010·\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¸\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¹\u0001\u001a\u00020\tHÆ\u0003J\n\u0010º\u0001\u001a\u00020\tHÆ\u0003J\n\u0010»\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¼\u0001\u001a\u00020\tHÆ\u0003J\n\u0010½\u0001\u001a\u00020 HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\"HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\"HÆ\u0003J\n\u0010À\u0001\u001a\u00020\tHÆ\u0003J\n\u0010Á\u0001\u001a\u00020\tHÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020 HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020 HÆ\u0003J\n\u0010Å\u0001\u001a\u00020 HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020 HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020 HÆ\u0003J\n\u0010È\u0001\u001a\u00020 HÆ\u0003J\n\u0010É\u0001\u001a\u00020 HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020 HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020 HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020 HÆ\u0003J\n\u0010Í\u0001\u001a\u00020 HÆ\u0003J\n\u0010Î\u0001\u001a\u00020 HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\"HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\"HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\"HÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\"HÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\"HÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\"HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\tHÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\tHÆ\u0003J\n\u0010×\u0001\u001a\u00020\tHÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010á\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ä\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010å\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010æ\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010ç\u0001\u001a\u00020LHÆ\u0003J\n\u0010è\u0001\u001a\u00020LHÆ\u0003J\n\u0010é\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ê\u0001\u001a\u00020LHÆ\u0003JÚ\u0005\u0010ë\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020 2\b\b\u0002\u0010(\u001a\u00020 2\b\b\u0002\u0010)\u001a\u00020 2\b\b\u0002\u0010*\u001a\u00020 2\b\b\u0002\u0010+\u001a\u00020 2\b\b\u0002\u0010,\u001a\u00020 2\b\b\u0002\u0010-\u001a\u00020 2\b\b\u0002\u0010.\u001a\u00020 2\b\b\u0002\u0010/\u001a\u00020 2\b\b\u0002\u00100\u001a\u00020 2\b\b\u0002\u00101\u001a\u00020 2\b\b\u0002\u00102\u001a\u00020 2\b\b\u0002\u00103\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"2\b\b\u0002\u00105\u001a\u00020\"2\b\b\u0002\u00106\u001a\u00020\"2\b\b\u0002\u00107\u001a\u00020\"2\b\b\u0002\u00108\u001a\u00020\"2\b\b\u0002\u00109\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\t2\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00032\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020\u00032\b\b\u0002\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u00032\b\b\u0002\u0010G\u001a\u00020\u00032\b\b\u0002\u0010H\u001a\u00020\u00032\b\b\u0002\u0010I\u001a\u00020\u00052\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020L2\b\b\u0002\u0010N\u001a\u00020\u00032\b\b\u0002\u0010O\u001a\u00020LHÆ\u0001J\u0016\u0010ì\u0001\u001a\u00030í\u00012\t\u0010î\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010ï\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010ð\u0001\u001a\u00020LHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u0010UR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bW\u0010UR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010SR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b[\u0010YR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010YR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b]\u0010YR\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b^\u0010YR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b_\u0010YR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b`\u0010YR\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\ba\u0010YR\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bb\u0010YR\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bc\u0010YR\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bd\u0010YR\u0011\u0010\u0015\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\be\u0010YR\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bf\u0010YR\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bg\u0010YR\u0011\u0010\u0018\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bh\u0010YR\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bi\u0010YR\u0011\u0010\u001a\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bj\u0010YR\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bk\u0010YR\u0011\u0010\u001c\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bl\u0010YR\u0011\u0010\u001d\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bm\u0010YR\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bn\u0010YR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0011\u0010#\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bs\u0010rR\u0011\u0010$\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bt\u0010YR\u0011\u0010%\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bu\u0010YR\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010SR\u0011\u0010'\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bw\u0010pR\u0011\u0010(\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bx\u0010pR\u0011\u0010)\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\by\u0010pR\u0011\u0010*\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bz\u0010pR\u0011\u0010+\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b{\u0010pR\u0011\u0010,\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b|\u0010pR\u0011\u0010-\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b}\u0010pR\u0011\u0010.\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b~\u0010pR\u0011\u0010/\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010pR\u0012\u00100\u001a\u00020 ¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010pR\u0012\u00101\u001a\u00020 ¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010pR\u0012\u00102\u001a\u00020 ¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010pR\u0012\u00103\u001a\u00020\"¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010rR\u0012\u00104\u001a\u00020\"¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010rR\u0012\u00105\u001a\u00020\"¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010rR\u0012\u00106\u001a\u00020\"¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010rR\u0012\u00107\u001a\u00020\"¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010rR\u0012\u00108\u001a\u00020\"¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010rR\u0012\u00109\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010YR\u0012\u0010:\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010YR\u0012\u0010;\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010YR\u0012\u0010<\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010SR\u0012\u0010=\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010SR\u0012\u0010>\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010SR\u0012\u0010?\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010SR\u0012\u0010@\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010SR\u0012\u0010A\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010SR\u0012\u0010B\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010SR\u0012\u0010C\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010SR\u0012\u0010D\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010SR\u0012\u0010E\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010SR\u0012\u0010F\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010SR\u0012\u0010G\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010SR\u0012\u0010H\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010SR\u0012\u0010I\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010UR\u0012\u0010J\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010UR\u0013\u0010K\u001a\u00020L¢\u0006\n\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0013\u0010M\u001a\u00020L¢\u0006\n\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009c\u0001R\u0012\u0010N\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010SR\u0013\u0010O\u001a\u00020L¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010\u009c\u0001¨\u0006ñ\u0001"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/data/RecordResult;", "", "id", "", "deviceId", "", "userId", Column.ACCOUNT_ID, "weight", "", "heartRate", WeightRecordDaoKt.COL_BODY_FAT_RATE, "bmi", WeightRecordDaoKt.COL_MUSCLE_RATE, WeightRecordDaoKt.COL_BONE_MASS, "bodyMoistureMass", WeightRecordDaoKt.COL_MOISTURE_RATE, "proteinMass", "fatMass", "limbsSkeletalMuscleIndex", "leftUpperLimbMuscleMass", "rightUpperLimbMuscleMass", "leftLowerLimbMuscleMass", "rightLowerLimbMuscleMass", "trunkMuscleMass", "leftUpperLimbFatMass", "rightUpperLimbFatMass", "leftLowerLimbFatMass", "rightLowerLimbFatMass", "trunkFatMass", WeightRecordDaoKt.COL_BASAL_METABOLISM, WeightRecordDaoKt.COL_VISCERAL_FAT, "", "bodyAge", "", "bodyScore", "standardWeight", "whr", "recommendedCaloriesIntake", "leftUpperLimbMuscleMassLevel", "rightUpperLimbMuscleMassLevel", "leftLowerLimbMuscleMassLevel", "rightLowerLimbMuscleMassLevel", "trunkMuscleMassLevel", "leftUpperLimbFatMassLevel", "rightUpperLimbFatMassLevel", "leftLowerLimbFatMassLevel", "rightLowerLimbFatMassLevel", "trunkFatMassLevel", "somatotype", "bodyShape", "upperLimbMuscleBalance", "lowerLimbMuscleBalance", "limbsMuscleBalance", "upperLimbFatBalance", "lowerLimbFatBalance", "limbsFatBalance", "weightControl", "muscleControl", "fatControl", "lfz12", "lfz13", "lfz14", "lfz23", "lfz24", "lfz34", "hfz12", "hfz13", "hfz14", "hfz23", "hfz24", "hfz34", "dataVersion", "createTime", "updateTime", "sn", "", "model", "fromSource", "data", "<init>", "(IJJJFIFFFFFFFFFFFFFFFFFFFFSBBFFISSSSSSSSSSSSBBBBBBFFFIIIIIIIIIIIIIJJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getId", "()I", "getDeviceId", "()J", "getUserId", "getAccountId", "getWeight", "()F", "getHeartRate", "getBodyFatRate", "getBmi", "getMuscleMass", "getBoneMass", "getBodyMoistureMass", "getMoistureRate", "getProteinMass", "getFatMass", "getLimbsSkeletalMuscleIndex", "getLeftUpperLimbMuscleMass", "getRightUpperLimbMuscleMass", "getLeftLowerLimbMuscleMass", "getRightLowerLimbMuscleMass", "getTrunkMuscleMass", "getLeftUpperLimbFatMass", "getRightUpperLimbFatMass", "getLeftLowerLimbFatMass", "getRightLowerLimbFatMass", "getTrunkFatMass", "getBasalMetabolism", "getVisceralFat", "()S", "getBodyAge", "()B", "getBodyScore", "getStandardWeight", "getWhr", "getRecommendedCaloriesIntake", "getLeftUpperLimbMuscleMassLevel", "getRightUpperLimbMuscleMassLevel", "getLeftLowerLimbMuscleMassLevel", "getRightLowerLimbMuscleMassLevel", "getTrunkMuscleMassLevel", "getLeftUpperLimbFatMassLevel", "getRightUpperLimbFatMassLevel", "getLeftLowerLimbFatMassLevel", "getRightLowerLimbFatMassLevel", "getTrunkFatMassLevel", "getSomatotype", "getBodyShape", "getUpperLimbMuscleBalance", "getLowerLimbMuscleBalance", "getLimbsMuscleBalance", "getUpperLimbFatBalance", "getLowerLimbFatBalance", "getLimbsFatBalance", "getWeightControl", "getMuscleControl", "getFatControl", "getLfz12", "getLfz13", "getLfz14", "getLfz23", "getLfz24", "getLfz34", "getHfz12", "getHfz13", "getHfz14", "getHfz23", "getHfz24", "getHfz34", "getDataVersion", "getCreateTime", "getUpdateTime", "getSn", "()Ljava/lang/String;", "getModel", "getFromSource", "getData", "changeRecordToWeight", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "changeRecordToWeightCommon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "component71", "component72", "copy", "equals", "", "other", "hashCode", "toString", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecordResult {
    private final long accountId;
    private final float basalMetabolism;
    private final float bmi;
    private final byte bodyAge;
    private final float bodyFatRate;
    private final float bodyMoistureMass;
    private final byte bodyScore;
    private final short bodyShape;
    private final float boneMass;
    private final long createTime;

    @NotNull
    private final String data;
    private final int dataVersion;
    private final long deviceId;
    private final float fatControl;
    private final float fatMass;
    private final int fromSource;
    private final int heartRate;
    private final int hfz12;
    private final int hfz13;
    private final int hfz14;
    private final int hfz23;
    private final int hfz24;
    private final int hfz34;
    private final int id;
    private final float leftLowerLimbFatMass;
    private final short leftLowerLimbFatMassLevel;
    private final float leftLowerLimbMuscleMass;
    private final short leftLowerLimbMuscleMassLevel;
    private final float leftUpperLimbFatMass;
    private final short leftUpperLimbFatMassLevel;
    private final float leftUpperLimbMuscleMass;
    private final short leftUpperLimbMuscleMassLevel;
    private final int lfz12;
    private final int lfz13;
    private final int lfz14;
    private final int lfz23;
    private final int lfz24;
    private final int lfz34;
    private final byte limbsFatBalance;
    private final byte limbsMuscleBalance;
    private final float limbsSkeletalMuscleIndex;
    private final byte lowerLimbFatBalance;
    private final byte lowerLimbMuscleBalance;

    @NotNull
    private final String model;
    private final float moistureRate;
    private final float muscleControl;
    private final float muscleMass;
    private final float proteinMass;
    private final int recommendedCaloriesIntake;
    private final float rightLowerLimbFatMass;
    private final short rightLowerLimbFatMassLevel;
    private final float rightLowerLimbMuscleMass;
    private final short rightLowerLimbMuscleMassLevel;
    private final float rightUpperLimbFatMass;
    private final short rightUpperLimbFatMassLevel;
    private final float rightUpperLimbMuscleMass;
    private final short rightUpperLimbMuscleMassLevel;

    @NotNull
    private final String sn;
    private final short somatotype;
    private final float standardWeight;
    private final float trunkFatMass;
    private final short trunkFatMassLevel;
    private final float trunkMuscleMass;
    private final short trunkMuscleMassLevel;
    private final long updateTime;
    private final byte upperLimbFatBalance;
    private final byte upperLimbMuscleBalance;
    private final long userId;
    private final short visceralFat;
    private final float weight;
    private final float weightControl;
    private final float whr;

    public RecordResult(int i, long j, long j2, long j3, float f, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, short s, byte b2, byte b3, float f22, float f23, int i3, short s2, short s3, short s4, short s5, short s6, short s7, short s8, short s9, short s10, short s11, short s12, short s13, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, float f24, float f25, float f26, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j4, long j5, @NotNull String sn, @NotNull String model, int i17, @NotNull String data) {
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = i;
        this.deviceId = j;
        this.userId = j2;
        this.accountId = j3;
        this.weight = f;
        this.heartRate = i2;
        this.bodyFatRate = f2;
        this.bmi = f3;
        this.muscleMass = f4;
        this.boneMass = f5;
        this.bodyMoistureMass = f6;
        this.moistureRate = f7;
        this.proteinMass = f8;
        this.fatMass = f9;
        this.limbsSkeletalMuscleIndex = f10;
        this.leftUpperLimbMuscleMass = f11;
        this.rightUpperLimbMuscleMass = f12;
        this.leftLowerLimbMuscleMass = f13;
        this.rightLowerLimbMuscleMass = f14;
        this.trunkMuscleMass = f15;
        this.leftUpperLimbFatMass = f16;
        this.rightUpperLimbFatMass = f17;
        this.leftLowerLimbFatMass = f18;
        this.rightLowerLimbFatMass = f19;
        this.trunkFatMass = f20;
        this.basalMetabolism = f21;
        this.visceralFat = s;
        this.bodyAge = b2;
        this.bodyScore = b3;
        this.standardWeight = f22;
        this.whr = f23;
        this.recommendedCaloriesIntake = i3;
        this.leftUpperLimbMuscleMassLevel = s2;
        this.rightUpperLimbMuscleMassLevel = s3;
        this.leftLowerLimbMuscleMassLevel = s4;
        this.rightLowerLimbMuscleMassLevel = s5;
        this.trunkMuscleMassLevel = s6;
        this.leftUpperLimbFatMassLevel = s7;
        this.rightUpperLimbFatMassLevel = s8;
        this.leftLowerLimbFatMassLevel = s9;
        this.rightLowerLimbFatMassLevel = s10;
        this.trunkFatMassLevel = s11;
        this.somatotype = s12;
        this.bodyShape = s13;
        this.upperLimbMuscleBalance = b4;
        this.lowerLimbMuscleBalance = b5;
        this.limbsMuscleBalance = b6;
        this.upperLimbFatBalance = b7;
        this.lowerLimbFatBalance = b8;
        this.limbsFatBalance = b9;
        this.weightControl = f24;
        this.muscleControl = f25;
        this.fatControl = f26;
        this.lfz12 = i4;
        this.lfz13 = i5;
        this.lfz14 = i6;
        this.lfz23 = i7;
        this.lfz24 = i8;
        this.lfz34 = i9;
        this.hfz12 = i10;
        this.hfz13 = i11;
        this.hfz14 = i12;
        this.hfz23 = i13;
        this.hfz24 = i14;
        this.hfz34 = i15;
        this.dataVersion = i16;
        this.createTime = j4;
        this.updateTime = j5;
        this.sn = sn;
        this.model = model;
        this.fromSource = i17;
        this.data = data;
    }

    @NotNull
    public final WeightResult changeRecordToWeight() {
        return new WeightResult(this.dataVersion, String.valueOf(this.userId), this.weight, this.heartRate, this.bodyFatRate, this.bmi, this.muscleMass, this.boneMass, this.bodyMoistureMass, this.moistureRate, this.proteinMass, this.fatMass, this.limbsSkeletalMuscleIndex, this.leftUpperLimbMuscleMass, this.rightUpperLimbMuscleMass, this.leftLowerLimbMuscleMass, this.rightLowerLimbMuscleMass, this.trunkMuscleMass, this.leftUpperLimbFatMass, this.rightUpperLimbFatMass, this.leftLowerLimbFatMass, this.rightLowerLimbFatMass, this.trunkFatMass, this.basalMetabolism, this.visceralFat, this.bodyAge, this.bodyScore, this.standardWeight, this.whr, this.recommendedCaloriesIntake, this.leftUpperLimbMuscleMassLevel, this.rightUpperLimbMuscleMassLevel, this.leftLowerLimbMuscleMassLevel, this.rightLowerLimbMuscleMassLevel, this.trunkMuscleMassLevel, this.leftUpperLimbFatMassLevel, this.rightUpperLimbFatMassLevel, this.leftLowerLimbFatMassLevel, this.rightLowerLimbFatMassLevel, this.trunkFatMassLevel, this.somatotype, this.bodyShape, this.upperLimbMuscleBalance, this.lowerLimbMuscleBalance, this.limbsMuscleBalance, this.upperLimbFatBalance, this.lowerLimbFatBalance, this.limbsFatBalance, this.weightControl, this.muscleControl, this.fatControl, this.lfz12, this.lfz13, this.lfz14, this.lfz23, this.lfz24, this.lfz34, this.hfz12, this.hfz13, this.hfz14, this.hfz23, this.hfz24, this.hfz34, String.valueOf(this.accountId), this.sn, this.createTime);
    }

    @NotNull
    public final WeightResult changeRecordToWeightCommon() {
        return new WeightResult(this.dataVersion, String.valueOf(this.userId), (float) new JSONObject(this.data).optDouble("weight", 0.0d), this.heartRate, this.bodyFatRate, this.bmi, this.muscleMass, this.boneMass, this.bodyMoistureMass, this.moistureRate, this.proteinMass, this.fatMass, this.limbsSkeletalMuscleIndex, this.leftUpperLimbMuscleMass, this.rightUpperLimbMuscleMass, this.leftLowerLimbMuscleMass, this.rightLowerLimbMuscleMass, this.trunkMuscleMass, this.leftUpperLimbFatMass, this.rightUpperLimbFatMass, this.leftLowerLimbFatMass, this.rightLowerLimbFatMass, this.trunkFatMass, this.basalMetabolism, this.visceralFat, this.bodyAge, this.bodyScore, this.standardWeight, this.whr, this.recommendedCaloriesIntake, this.leftUpperLimbMuscleMassLevel, this.rightUpperLimbMuscleMassLevel, this.leftLowerLimbMuscleMassLevel, this.rightLowerLimbMuscleMassLevel, this.trunkMuscleMassLevel, this.leftUpperLimbFatMassLevel, this.rightUpperLimbFatMassLevel, this.leftLowerLimbFatMassLevel, this.rightLowerLimbFatMassLevel, this.trunkFatMassLevel, this.somatotype, this.bodyShape, this.upperLimbMuscleBalance, this.lowerLimbMuscleBalance, this.limbsMuscleBalance, this.upperLimbFatBalance, this.lowerLimbFatBalance, this.limbsFatBalance, this.weightControl, this.muscleControl, this.fatControl, this.lfz12, this.lfz13, this.lfz14, this.lfz23, this.lfz24, this.lfz34, this.hfz12, this.hfz13, this.hfz14, this.hfz23, this.hfz24, this.hfz34, String.valueOf(this.accountId), this.sn, this.createTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getBoneMass() {
        return this.boneMass;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getBodyMoistureMass() {
        return this.bodyMoistureMass;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getMoistureRate() {
        return this.moistureRate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getProteinMass() {
        return this.proteinMass;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final float getFatMass() {
        return this.fatMass;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final float getLimbsSkeletalMuscleIndex() {
        return this.limbsSkeletalMuscleIndex;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getLeftUpperLimbMuscleMass() {
        return this.leftUpperLimbMuscleMass;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final float getRightUpperLimbMuscleMass() {
        return this.rightUpperLimbMuscleMass;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final float getLeftLowerLimbMuscleMass() {
        return this.leftLowerLimbMuscleMass;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final float getRightLowerLimbMuscleMass() {
        return this.rightLowerLimbMuscleMass;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final float getTrunkMuscleMass() {
        return this.trunkMuscleMass;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final float getLeftUpperLimbFatMass() {
        return this.leftUpperLimbFatMass;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final float getRightUpperLimbFatMass() {
        return this.rightUpperLimbFatMass;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final float getLeftLowerLimbFatMass() {
        return this.leftLowerLimbFatMass;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final float getRightLowerLimbFatMass() {
        return this.rightLowerLimbFatMass;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final float getTrunkFatMass() {
        return this.trunkFatMass;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final float getBasalMetabolism() {
        return this.basalMetabolism;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final short getVisceralFat() {
        return this.visceralFat;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final byte getBodyAge() {
        return this.bodyAge;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final byte getBodyScore() {
        return this.bodyScore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final float getStandardWeight() {
        return this.standardWeight;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final float getWhr() {
        return this.whr;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final int getRecommendedCaloriesIntake() {
        return this.recommendedCaloriesIntake;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final short getLeftUpperLimbMuscleMassLevel() {
        return this.leftUpperLimbMuscleMassLevel;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final short getRightUpperLimbMuscleMassLevel() {
        return this.rightUpperLimbMuscleMassLevel;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final short getLeftLowerLimbMuscleMassLevel() {
        return this.leftLowerLimbMuscleMassLevel;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final short getRightLowerLimbMuscleMassLevel() {
        return this.rightLowerLimbMuscleMassLevel;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final short getTrunkMuscleMassLevel() {
        return this.trunkMuscleMassLevel;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final short getLeftUpperLimbFatMassLevel() {
        return this.leftUpperLimbFatMassLevel;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final short getRightUpperLimbFatMassLevel() {
        return this.rightUpperLimbFatMassLevel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final short getLeftLowerLimbFatMassLevel() {
        return this.leftLowerLimbFatMassLevel;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final short getRightLowerLimbFatMassLevel() {
        return this.rightLowerLimbFatMassLevel;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final short getTrunkFatMassLevel() {
        return this.trunkFatMassLevel;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final short getSomatotype() {
        return this.somatotype;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final short getBodyShape() {
        return this.bodyShape;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final byte getUpperLimbMuscleBalance() {
        return this.upperLimbMuscleBalance;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final byte getLowerLimbMuscleBalance() {
        return this.lowerLimbMuscleBalance;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final byte getLimbsMuscleBalance() {
        return this.limbsMuscleBalance;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final byte getUpperLimbFatBalance() {
        return this.upperLimbFatBalance;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final byte getLowerLimbFatBalance() {
        return this.lowerLimbFatBalance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final byte getLimbsFatBalance() {
        return this.limbsFatBalance;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final float getWeightControl() {
        return this.weightControl;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final float getMuscleControl() {
        return this.muscleControl;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final float getFatControl() {
        return this.fatControl;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final int getLfz12() {
        return this.lfz12;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final int getLfz13() {
        return this.lfz13;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final int getLfz14() {
        return this.lfz14;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final int getLfz23() {
        return this.lfz23;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final int getLfz24() {
        return this.lfz24;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final int getLfz34() {
        return this.lfz34;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final int getHfz12() {
        return this.hfz12;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final int getHfz13() {
        return this.hfz13;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final int getHfz14() {
        return this.hfz14;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final int getHfz23() {
        return this.hfz23;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final int getHfz24() {
        return this.hfz24;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final int getHfz34() {
        return this.hfz34;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final int getDataVersion() {
        return this.dataVersion;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component68, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component69, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getBodyFatRate() {
        return this.bodyFatRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component70, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component71, reason: from getter */
    public final int getFromSource() {
        return this.fromSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component72, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getBmi() {
        return this.bmi;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getMuscleMass() {
        return this.muscleMass;
    }

    @NotNull
    public final RecordResult copy(int id, long deviceId, long userId, long accountId, float weight, int heartRate, float bodyFatRate, float bmi, float muscleMass, float boneMass, float bodyMoistureMass, float moistureRate, float proteinMass, float fatMass, float limbsSkeletalMuscleIndex, float leftUpperLimbMuscleMass, float rightUpperLimbMuscleMass, float leftLowerLimbMuscleMass, float rightLowerLimbMuscleMass, float trunkMuscleMass, float leftUpperLimbFatMass, float rightUpperLimbFatMass, float leftLowerLimbFatMass, float rightLowerLimbFatMass, float trunkFatMass, float basalMetabolism, short visceralFat, byte bodyAge, byte bodyScore, float standardWeight, float whr, int recommendedCaloriesIntake, short leftUpperLimbMuscleMassLevel, short rightUpperLimbMuscleMassLevel, short leftLowerLimbMuscleMassLevel, short rightLowerLimbMuscleMassLevel, short trunkMuscleMassLevel, short leftUpperLimbFatMassLevel, short rightUpperLimbFatMassLevel, short leftLowerLimbFatMassLevel, short rightLowerLimbFatMassLevel, short trunkFatMassLevel, short somatotype, short bodyShape, byte upperLimbMuscleBalance, byte lowerLimbMuscleBalance, byte limbsMuscleBalance, byte upperLimbFatBalance, byte lowerLimbFatBalance, byte limbsFatBalance, float weightControl, float muscleControl, float fatControl, int lfz12, int lfz13, int lfz14, int lfz23, int lfz24, int lfz34, int hfz12, int hfz13, int hfz14, int hfz23, int hfz24, int hfz34, int dataVersion, long createTime, long updateTime, @NotNull String sn, @NotNull String model, int fromSource, @NotNull String data) {
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(data, "data");
        return new RecordResult(id, deviceId, userId, accountId, weight, heartRate, bodyFatRate, bmi, muscleMass, boneMass, bodyMoistureMass, moistureRate, proteinMass, fatMass, limbsSkeletalMuscleIndex, leftUpperLimbMuscleMass, rightUpperLimbMuscleMass, leftLowerLimbMuscleMass, rightLowerLimbMuscleMass, trunkMuscleMass, leftUpperLimbFatMass, rightUpperLimbFatMass, leftLowerLimbFatMass, rightLowerLimbFatMass, trunkFatMass, basalMetabolism, visceralFat, bodyAge, bodyScore, standardWeight, whr, recommendedCaloriesIntake, leftUpperLimbMuscleMassLevel, rightUpperLimbMuscleMassLevel, leftLowerLimbMuscleMassLevel, rightLowerLimbMuscleMassLevel, trunkMuscleMassLevel, leftUpperLimbFatMassLevel, rightUpperLimbFatMassLevel, leftLowerLimbFatMassLevel, rightLowerLimbFatMassLevel, trunkFatMassLevel, somatotype, bodyShape, upperLimbMuscleBalance, lowerLimbMuscleBalance, limbsMuscleBalance, upperLimbFatBalance, lowerLimbFatBalance, limbsFatBalance, weightControl, muscleControl, fatControl, lfz12, lfz13, lfz14, lfz23, lfz24, lfz34, hfz12, hfz13, hfz14, hfz23, hfz24, hfz34, dataVersion, createTime, updateTime, sn, model, fromSource, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordResult)) {
            return false;
        }
        RecordResult recordResult = (RecordResult) other;
        return this.id == recordResult.id && this.deviceId == recordResult.deviceId && this.userId == recordResult.userId && this.accountId == recordResult.accountId && Float.compare(this.weight, recordResult.weight) == 0 && this.heartRate == recordResult.heartRate && Float.compare(this.bodyFatRate, recordResult.bodyFatRate) == 0 && Float.compare(this.bmi, recordResult.bmi) == 0 && Float.compare(this.muscleMass, recordResult.muscleMass) == 0 && Float.compare(this.boneMass, recordResult.boneMass) == 0 && Float.compare(this.bodyMoistureMass, recordResult.bodyMoistureMass) == 0 && Float.compare(this.moistureRate, recordResult.moistureRate) == 0 && Float.compare(this.proteinMass, recordResult.proteinMass) == 0 && Float.compare(this.fatMass, recordResult.fatMass) == 0 && Float.compare(this.limbsSkeletalMuscleIndex, recordResult.limbsSkeletalMuscleIndex) == 0 && Float.compare(this.leftUpperLimbMuscleMass, recordResult.leftUpperLimbMuscleMass) == 0 && Float.compare(this.rightUpperLimbMuscleMass, recordResult.rightUpperLimbMuscleMass) == 0 && Float.compare(this.leftLowerLimbMuscleMass, recordResult.leftLowerLimbMuscleMass) == 0 && Float.compare(this.rightLowerLimbMuscleMass, recordResult.rightLowerLimbMuscleMass) == 0 && Float.compare(this.trunkMuscleMass, recordResult.trunkMuscleMass) == 0 && Float.compare(this.leftUpperLimbFatMass, recordResult.leftUpperLimbFatMass) == 0 && Float.compare(this.rightUpperLimbFatMass, recordResult.rightUpperLimbFatMass) == 0 && Float.compare(this.leftLowerLimbFatMass, recordResult.leftLowerLimbFatMass) == 0 && Float.compare(this.rightLowerLimbFatMass, recordResult.rightLowerLimbFatMass) == 0 && Float.compare(this.trunkFatMass, recordResult.trunkFatMass) == 0 && Float.compare(this.basalMetabolism, recordResult.basalMetabolism) == 0 && this.visceralFat == recordResult.visceralFat && this.bodyAge == recordResult.bodyAge && this.bodyScore == recordResult.bodyScore && Float.compare(this.standardWeight, recordResult.standardWeight) == 0 && Float.compare(this.whr, recordResult.whr) == 0 && this.recommendedCaloriesIntake == recordResult.recommendedCaloriesIntake && this.leftUpperLimbMuscleMassLevel == recordResult.leftUpperLimbMuscleMassLevel && this.rightUpperLimbMuscleMassLevel == recordResult.rightUpperLimbMuscleMassLevel && this.leftLowerLimbMuscleMassLevel == recordResult.leftLowerLimbMuscleMassLevel && this.rightLowerLimbMuscleMassLevel == recordResult.rightLowerLimbMuscleMassLevel && this.trunkMuscleMassLevel == recordResult.trunkMuscleMassLevel && this.leftUpperLimbFatMassLevel == recordResult.leftUpperLimbFatMassLevel && this.rightUpperLimbFatMassLevel == recordResult.rightUpperLimbFatMassLevel && this.leftLowerLimbFatMassLevel == recordResult.leftLowerLimbFatMassLevel && this.rightLowerLimbFatMassLevel == recordResult.rightLowerLimbFatMassLevel && this.trunkFatMassLevel == recordResult.trunkFatMassLevel && this.somatotype == recordResult.somatotype && this.bodyShape == recordResult.bodyShape && this.upperLimbMuscleBalance == recordResult.upperLimbMuscleBalance && this.lowerLimbMuscleBalance == recordResult.lowerLimbMuscleBalance && this.limbsMuscleBalance == recordResult.limbsMuscleBalance && this.upperLimbFatBalance == recordResult.upperLimbFatBalance && this.lowerLimbFatBalance == recordResult.lowerLimbFatBalance && this.limbsFatBalance == recordResult.limbsFatBalance && Float.compare(this.weightControl, recordResult.weightControl) == 0 && Float.compare(this.muscleControl, recordResult.muscleControl) == 0 && Float.compare(this.fatControl, recordResult.fatControl) == 0 && this.lfz12 == recordResult.lfz12 && this.lfz13 == recordResult.lfz13 && this.lfz14 == recordResult.lfz14 && this.lfz23 == recordResult.lfz23 && this.lfz24 == recordResult.lfz24 && this.lfz34 == recordResult.lfz34 && this.hfz12 == recordResult.hfz12 && this.hfz13 == recordResult.hfz13 && this.hfz14 == recordResult.hfz14 && this.hfz23 == recordResult.hfz23 && this.hfz24 == recordResult.hfz24 && this.hfz34 == recordResult.hfz34 && this.dataVersion == recordResult.dataVersion && this.createTime == recordResult.createTime && this.updateTime == recordResult.updateTime && Intrinsics.areEqual(this.sn, recordResult.sn) && Intrinsics.areEqual(this.model, recordResult.model) && this.fromSource == recordResult.fromSource && Intrinsics.areEqual(this.data, recordResult.data);
    }

    public final long getAccountId() {
        return this.accountId;
    }

    public final float getBasalMetabolism() {
        return this.basalMetabolism;
    }

    public final float getBmi() {
        return this.bmi;
    }

    public final byte getBodyAge() {
        return this.bodyAge;
    }

    public final float getBodyFatRate() {
        return this.bodyFatRate;
    }

    public final float getBodyMoistureMass() {
        return this.bodyMoistureMass;
    }

    public final byte getBodyScore() {
        return this.bodyScore;
    }

    public final short getBodyShape() {
        return this.bodyShape;
    }

    public final float getBoneMass() {
        return this.boneMass;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public final int getDataVersion() {
        return this.dataVersion;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final float getFatControl() {
        return this.fatControl;
    }

    public final float getFatMass() {
        return this.fatMass;
    }

    public final int getFromSource() {
        return this.fromSource;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getHfz12() {
        return this.hfz12;
    }

    public final int getHfz13() {
        return this.hfz13;
    }

    public final int getHfz14() {
        return this.hfz14;
    }

    public final int getHfz23() {
        return this.hfz23;
    }

    public final int getHfz24() {
        return this.hfz24;
    }

    public final int getHfz34() {
        return this.hfz34;
    }

    public final int getId() {
        return this.id;
    }

    public final float getLeftLowerLimbFatMass() {
        return this.leftLowerLimbFatMass;
    }

    public final short getLeftLowerLimbFatMassLevel() {
        return this.leftLowerLimbFatMassLevel;
    }

    public final float getLeftLowerLimbMuscleMass() {
        return this.leftLowerLimbMuscleMass;
    }

    public final short getLeftLowerLimbMuscleMassLevel() {
        return this.leftLowerLimbMuscleMassLevel;
    }

    public final float getLeftUpperLimbFatMass() {
        return this.leftUpperLimbFatMass;
    }

    public final short getLeftUpperLimbFatMassLevel() {
        return this.leftUpperLimbFatMassLevel;
    }

    public final float getLeftUpperLimbMuscleMass() {
        return this.leftUpperLimbMuscleMass;
    }

    public final short getLeftUpperLimbMuscleMassLevel() {
        return this.leftUpperLimbMuscleMassLevel;
    }

    public final int getLfz12() {
        return this.lfz12;
    }

    public final int getLfz13() {
        return this.lfz13;
    }

    public final int getLfz14() {
        return this.lfz14;
    }

    public final int getLfz23() {
        return this.lfz23;
    }

    public final int getLfz24() {
        return this.lfz24;
    }

    public final int getLfz34() {
        return this.lfz34;
    }

    public final byte getLimbsFatBalance() {
        return this.limbsFatBalance;
    }

    public final byte getLimbsMuscleBalance() {
        return this.limbsMuscleBalance;
    }

    public final float getLimbsSkeletalMuscleIndex() {
        return this.limbsSkeletalMuscleIndex;
    }

    public final byte getLowerLimbFatBalance() {
        return this.lowerLimbFatBalance;
    }

    public final byte getLowerLimbMuscleBalance() {
        return this.lowerLimbMuscleBalance;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public final float getMoistureRate() {
        return this.moistureRate;
    }

    public final float getMuscleControl() {
        return this.muscleControl;
    }

    public final float getMuscleMass() {
        return this.muscleMass;
    }

    public final float getProteinMass() {
        return this.proteinMass;
    }

    public final int getRecommendedCaloriesIntake() {
        return this.recommendedCaloriesIntake;
    }

    public final float getRightLowerLimbFatMass() {
        return this.rightLowerLimbFatMass;
    }

    public final short getRightLowerLimbFatMassLevel() {
        return this.rightLowerLimbFatMassLevel;
    }

    public final float getRightLowerLimbMuscleMass() {
        return this.rightLowerLimbMuscleMass;
    }

    public final short getRightLowerLimbMuscleMassLevel() {
        return this.rightLowerLimbMuscleMassLevel;
    }

    public final float getRightUpperLimbFatMass() {
        return this.rightUpperLimbFatMass;
    }

    public final short getRightUpperLimbFatMassLevel() {
        return this.rightUpperLimbFatMassLevel;
    }

    public final float getRightUpperLimbMuscleMass() {
        return this.rightUpperLimbMuscleMass;
    }

    public final short getRightUpperLimbMuscleMassLevel() {
        return this.rightUpperLimbMuscleMassLevel;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public final short getSomatotype() {
        return this.somatotype;
    }

    public final float getStandardWeight() {
        return this.standardWeight;
    }

    public final float getTrunkFatMass() {
        return this.trunkFatMass;
    }

    public final short getTrunkFatMassLevel() {
        return this.trunkFatMassLevel;
    }

    public final float getTrunkMuscleMass() {
        return this.trunkMuscleMass;
    }

    public final short getTrunkMuscleMassLevel() {
        return this.trunkMuscleMassLevel;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final byte getUpperLimbFatBalance() {
        return this.upperLimbFatBalance;
    }

    public final byte getUpperLimbMuscleBalance() {
        return this.upperLimbMuscleBalance;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final short getVisceralFat() {
        return this.visceralFat;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final float getWeightControl() {
        return this.weightControl;
    }

    public final float getWhr() {
        return this.whr;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + Long.hashCode(this.deviceId)) * 31) + Long.hashCode(this.userId)) * 31) + Long.hashCode(this.accountId)) * 31) + Float.hashCode(this.weight)) * 31) + Integer.hashCode(this.heartRate)) * 31) + Float.hashCode(this.bodyFatRate)) * 31) + Float.hashCode(this.bmi)) * 31) + Float.hashCode(this.muscleMass)) * 31) + Float.hashCode(this.boneMass)) * 31) + Float.hashCode(this.bodyMoistureMass)) * 31) + Float.hashCode(this.moistureRate)) * 31) + Float.hashCode(this.proteinMass)) * 31) + Float.hashCode(this.fatMass)) * 31) + Float.hashCode(this.limbsSkeletalMuscleIndex)) * 31) + Float.hashCode(this.leftUpperLimbMuscleMass)) * 31) + Float.hashCode(this.rightUpperLimbMuscleMass)) * 31) + Float.hashCode(this.leftLowerLimbMuscleMass)) * 31) + Float.hashCode(this.rightLowerLimbMuscleMass)) * 31) + Float.hashCode(this.trunkMuscleMass)) * 31) + Float.hashCode(this.leftUpperLimbFatMass)) * 31) + Float.hashCode(this.rightUpperLimbFatMass)) * 31) + Float.hashCode(this.leftLowerLimbFatMass)) * 31) + Float.hashCode(this.rightLowerLimbFatMass)) * 31) + Float.hashCode(this.trunkFatMass)) * 31) + Float.hashCode(this.basalMetabolism)) * 31) + Short.hashCode(this.visceralFat)) * 31) + Byte.hashCode(this.bodyAge)) * 31) + Byte.hashCode(this.bodyScore)) * 31) + Float.hashCode(this.standardWeight)) * 31) + Float.hashCode(this.whr)) * 31) + Integer.hashCode(this.recommendedCaloriesIntake)) * 31) + Short.hashCode(this.leftUpperLimbMuscleMassLevel)) * 31) + Short.hashCode(this.rightUpperLimbMuscleMassLevel)) * 31) + Short.hashCode(this.leftLowerLimbMuscleMassLevel)) * 31) + Short.hashCode(this.rightLowerLimbMuscleMassLevel)) * 31) + Short.hashCode(this.trunkMuscleMassLevel)) * 31) + Short.hashCode(this.leftUpperLimbFatMassLevel)) * 31) + Short.hashCode(this.rightUpperLimbFatMassLevel)) * 31) + Short.hashCode(this.leftLowerLimbFatMassLevel)) * 31) + Short.hashCode(this.rightLowerLimbFatMassLevel)) * 31) + Short.hashCode(this.trunkFatMassLevel)) * 31) + Short.hashCode(this.somatotype)) * 31) + Short.hashCode(this.bodyShape)) * 31) + Byte.hashCode(this.upperLimbMuscleBalance)) * 31) + Byte.hashCode(this.lowerLimbMuscleBalance)) * 31) + Byte.hashCode(this.limbsMuscleBalance)) * 31) + Byte.hashCode(this.upperLimbFatBalance)) * 31) + Byte.hashCode(this.lowerLimbFatBalance)) * 31) + Byte.hashCode(this.limbsFatBalance)) * 31) + Float.hashCode(this.weightControl)) * 31) + Float.hashCode(this.muscleControl)) * 31) + Float.hashCode(this.fatControl)) * 31) + Integer.hashCode(this.lfz12)) * 31) + Integer.hashCode(this.lfz13)) * 31) + Integer.hashCode(this.lfz14)) * 31) + Integer.hashCode(this.lfz23)) * 31) + Integer.hashCode(this.lfz24)) * 31) + Integer.hashCode(this.lfz34)) * 31) + Integer.hashCode(this.hfz12)) * 31) + Integer.hashCode(this.hfz13)) * 31) + Integer.hashCode(this.hfz14)) * 31) + Integer.hashCode(this.hfz23)) * 31) + Integer.hashCode(this.hfz24)) * 31) + Integer.hashCode(this.hfz34)) * 31) + Integer.hashCode(this.dataVersion)) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.updateTime)) * 31) + this.sn.hashCode()) * 31) + this.model.hashCode()) * 31) + Integer.hashCode(this.fromSource)) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        int i = this.id;
        long j = this.deviceId;
        long j2 = this.userId;
        long j3 = this.accountId;
        float f = this.weight;
        int i2 = this.heartRate;
        float f2 = this.bodyFatRate;
        float f3 = this.bmi;
        float f4 = this.muscleMass;
        float f5 = this.boneMass;
        float f6 = this.bodyMoistureMass;
        float f7 = this.moistureRate;
        float f8 = this.proteinMass;
        float f9 = this.fatMass;
        float f10 = this.limbsSkeletalMuscleIndex;
        float f11 = this.leftUpperLimbMuscleMass;
        float f12 = this.rightUpperLimbMuscleMass;
        float f13 = this.leftLowerLimbMuscleMass;
        float f14 = this.rightLowerLimbMuscleMass;
        float f15 = this.trunkMuscleMass;
        float f16 = this.leftUpperLimbFatMass;
        float f17 = this.rightUpperLimbFatMass;
        float f18 = this.leftLowerLimbFatMass;
        float f19 = this.rightLowerLimbFatMass;
        float f20 = this.trunkFatMass;
        float f21 = this.basalMetabolism;
        short s = this.visceralFat;
        byte b2 = this.bodyAge;
        byte b3 = this.bodyScore;
        float f22 = this.standardWeight;
        float f23 = this.whr;
        int i3 = this.recommendedCaloriesIntake;
        short s2 = this.leftUpperLimbMuscleMassLevel;
        short s3 = this.rightUpperLimbMuscleMassLevel;
        short s4 = this.leftLowerLimbMuscleMassLevel;
        short s5 = this.rightLowerLimbMuscleMassLevel;
        short s6 = this.trunkMuscleMassLevel;
        short s7 = this.leftUpperLimbFatMassLevel;
        short s8 = this.rightUpperLimbFatMassLevel;
        short s9 = this.leftLowerLimbFatMassLevel;
        short s10 = this.rightLowerLimbFatMassLevel;
        short s11 = this.trunkFatMassLevel;
        short s12 = this.somatotype;
        short s13 = this.bodyShape;
        byte b4 = this.upperLimbMuscleBalance;
        byte b5 = this.lowerLimbMuscleBalance;
        byte b6 = this.limbsMuscleBalance;
        byte b7 = this.upperLimbFatBalance;
        byte b8 = this.lowerLimbFatBalance;
        byte b9 = this.limbsFatBalance;
        return "RecordResult(id=" + i + ", deviceId=" + j + ", userId=" + j2 + ", accountId=" + j3 + ", weight=" + f + ", heartRate=" + i2 + ", bodyFatRate=" + f2 + ", bmi=" + f3 + ", muscleMass=" + f4 + ", boneMass=" + f5 + ", bodyMoistureMass=" + f6 + ", moistureRate=" + f7 + ", proteinMass=" + f8 + ", fatMass=" + f9 + ", limbsSkeletalMuscleIndex=" + f10 + ", leftUpperLimbMuscleMass=" + f11 + ", rightUpperLimbMuscleMass=" + f12 + ", leftLowerLimbMuscleMass=" + f13 + ", rightLowerLimbMuscleMass=" + f14 + ", trunkMuscleMass=" + f15 + ", leftUpperLimbFatMass=" + f16 + ", rightUpperLimbFatMass=" + f17 + ", leftLowerLimbFatMass=" + f18 + ", rightLowerLimbFatMass=" + f19 + ", trunkFatMass=" + f20 + ", basalMetabolism=" + f21 + ", visceralFat=" + ((int) s) + ", bodyAge=" + ((int) b2) + ", bodyScore=" + ((int) b3) + ", standardWeight=" + f22 + ", whr=" + f23 + ", recommendedCaloriesIntake=" + i3 + ", leftUpperLimbMuscleMassLevel=" + ((int) s2) + ", rightUpperLimbMuscleMassLevel=" + ((int) s3) + ", leftLowerLimbMuscleMassLevel=" + ((int) s4) + ", rightLowerLimbMuscleMassLevel=" + ((int) s5) + ", trunkMuscleMassLevel=" + ((int) s6) + ", leftUpperLimbFatMassLevel=" + ((int) s7) + ", rightUpperLimbFatMassLevel=" + ((int) s8) + ", leftLowerLimbFatMassLevel=" + ((int) s9) + ", rightLowerLimbFatMassLevel=" + ((int) s10) + ", trunkFatMassLevel=" + ((int) s11) + ", somatotype=" + ((int) s12) + ", bodyShape=" + ((int) s13) + ", upperLimbMuscleBalance=" + ((int) b4) + ", lowerLimbMuscleBalance=" + ((int) b5) + ", limbsMuscleBalance=" + ((int) b6) + ", upperLimbFatBalance=" + ((int) b7) + ", lowerLimbFatBalance=" + ((int) b8) + ", limbsFatBalance=" + ((int) b9) + ", weightControl=" + this.weightControl + ", muscleControl=" + this.muscleControl + ", fatControl=" + this.fatControl + ", lfz12=" + this.lfz12 + ", lfz13=" + this.lfz13 + ", lfz14=" + this.lfz14 + ", lfz23=" + this.lfz23 + ", lfz24=" + this.lfz24 + ", lfz34=" + this.lfz34 + ", hfz12=" + this.hfz12 + ", hfz13=" + this.hfz13 + ", hfz14=" + this.hfz14 + ", hfz23=" + this.hfz23 + ", hfz24=" + this.hfz24 + ", hfz34=" + this.hfz34 + ", dataVersion=" + this.dataVersion + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", sn=" + this.sn + ", model=" + this.model + ", fromSource=" + this.fromSource + ", data=" + this.data + ")";
    }
}
