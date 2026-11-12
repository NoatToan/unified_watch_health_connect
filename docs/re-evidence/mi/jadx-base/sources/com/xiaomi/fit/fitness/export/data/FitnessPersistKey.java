package com.xiaomi.fit.fitness.export.data;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0003\bÛ\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010à\u0001\u001a\u0005\u0018\u00010á\u00012\b\u0010â\u0001\u001a\u00030ã\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u008c\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u008d\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u008e\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0091\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0095\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0096\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0097\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0098\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0099\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u009a\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u009b\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u009c\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u009d\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u009e\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u009f\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010 \u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¡\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¢\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010£\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¤\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¥\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¦\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010§\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¨\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010©\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010ª\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010«\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¬\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u00ad\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010®\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¯\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010°\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010±\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010²\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010³\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010´\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010µ\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¶\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010·\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¸\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¹\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010º\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010»\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¼\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010½\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¾\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¿\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010À\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Á\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Â\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ã\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ä\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Å\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Æ\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ç\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010È\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010É\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ê\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ë\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ì\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Í\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Î\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ï\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ð\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ñ\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ò\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ó\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ô\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Õ\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ö\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010×\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ø\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ù\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ú\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Û\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ü\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Ý\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010Þ\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010ß\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006ä\u0001"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/FitnessPersistKey;", "", "<init>", "()V", "Unknown", "", "Steps", "MHStrength", "Calories", "Hr", "Energy", "Stress", "Spo2", "Rainbow", "BloodSugar", "LightValue", "BodyMomentum", "AbnormalFib", "ValidStand", "ManualHr", "AbnormalHr", "AbnormalHrHigh", "AbnormalHrLow", "RestHr", "ReportMaxHr", "ReportMinHr", "ReportMaxSpo2", "ReportMinSpo2", "ManualStress", "ManualSpo2", "AbnormalSpo2", "AbnormalStress", "AllDaySleep", "NightSleep", "DaytimeSleep", "Weight", "BloodPressure", "BloodPressureMedical", "WomenHealthStatus", "WomenHealthSymptoms", "Vo2Max", "Pai", "Headset", "Noise", "ActiveStage", "TrainingLoad", "RunningIndicator", "ManualTemperature", "Vitality", "GradePrediction", "EcgMedical", "ManualBloodSugar", "PhysicalStatus", "LactateThreshold", "TemperatureTrend", "TemperatureCharacter", "OutdoorRunning", "OutdoorWalking", "IndoorRunning", "Climbing", "CrossHiking", "OutdoorRiding", "IndoorRiding", "FreeTraining", "SwimmingPool", "SwimmingOpen", "EllipticalTrainer", "Yoga", "RowingMachine", "RopeSkipping", "OutdoorHiking", "HighIntervalTraining", "Triathlon", "SailBoat", "PaddleBoard", "WaterPolo", "WaterSports", "WaterSkiing", "Kayaking", "KayakRafting", "Boating", "MotorBoat", "FinSwimming", "Diving", "ArtisticSwimming", "Snorkeling", "KiteSurfing", "IndoorSurfing", "DragonBoats", "FreeDiving", "RecreationalScubaDiving", "InstrumentDiving", "RockClimbing", "SkateBoard", "RollerSkating", "Parkour", "BeachBuggy", "Paragliding", "BikeMotocross", "HeelToToeWalk", "ClimbingMachine", "ClimbingStairs", "Stepper", "CoreTraining", "FlexibilityTraining", "Pilates", "Gymnastics", "Stretch", "StrengthTraining", "CrossTraining", "Aerobics", "PhysicalTraining", "WallBall", "DumbbellTraining", "BarbellTraining", "WeightLifting", "DeadLift", "BobbyJump", "SitUps", "FunctionalTraining", "UpperLimbTraining", "LowerLimbTraining", "WaistAbdomenTraining", "BackTraining", "Spinning", "Stroller", "StepTraining", "HighBar", "ParallelBars", "GroupGymnastics", "KickBoxing", "BattleRope", "MixedAerobic", "IndoorWalk", "IndoorFit", "AbdwheelTraining", "SquareDance", "BellyDance", "Ballet", "StreetDance", "Zumba", "NationalDance", "Jazz", "LatinDance", "HipHopDance", "PoleDance", "BreakDance", "BallRoomDance", "ModernDance", "Dance", "Boxing", "Wrestling", "MartialArts", "TaiChi", "MuayThai", "Judo", "Taekwondo", "Karate", "FreeSparring", "Kendo", "Fencing", "JuJitSu", "Football", "Basketball", "Volleyball", "Baseball", "Softball", "Rugby", "Hockey", "PingPong", "Badminton", "Tennis", "Cricket", "Handball", "Bowling", "Squash", "Billiards", "Shuttlecock", "BeachFootball", "BeachVolleyball", "SepakTakraw", "Golf", "TableFootBall", "IndoorFootBall", "SandBag", "BocceVolo", "JaiBall", "DoorKick", "DodgeBall", "ShuffleBall", "OutdoorSkating", "Curling", "SnowSports", "SnowMobile", "Puck", "SnowCar", "Sled", "IndoorSkating", "SnowBoard", "ParallelSkiing", "CrossCountrySkiing", "Archery", "Darts", "HorseRiding", "TugOfWar", "HulaHoop", "FlyAKite", "Fishing", "Frisbee", "KickShuttleCock", "Swing", "SomatosensoryGame", "JustDance", "E_Sports", "InternationalChess", "Checkers", "Go", "Bridge", "BoardGame", "IndoorRockClimbing", "OutdoorRockClimbing", "Equestrian", "Athletics", "CarRacing", "getSportReportKey", "Lcom/xiaomi/fit/fitness/export/data/SportReportKey;", DailyRecordKey.sportType, "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessPersistKey {

    @NotNull
    private static final String AbdwheelTraining = "abdwheel_training";

    @NotNull
    public static final String AbnormalFib = "abnormal_heart_beat";

    @NotNull
    public static final String AbnormalHr = "abnormal_heart_rate";

    @NotNull
    public static final String AbnormalHrHigh = "high_heart_rate";

    @NotNull
    public static final String AbnormalHrLow = "low_heart_rate";

    @NotNull
    public static final String AbnormalSpo2 = "low_spo2";

    @NotNull
    public static final String AbnormalStress = "high_stress";

    @NotNull
    public static final String ActiveStage = "dynamic";

    @NotNull
    private static final String Aerobics = "aerobics";

    @NotNull
    public static final String AllDaySleep = "sleep";

    @NotNull
    private static final String Archery = "archery";

    @NotNull
    private static final String ArtisticSwimming = "fancy_swimming";

    @NotNull
    private static final String Athletics = "track_and_field";

    @NotNull
    private static final String BackTraining = "back_training";

    @NotNull
    private static final String Badminton = "badminton";

    @NotNull
    private static final String BallRoomDance = "ballroom_dance";

    @NotNull
    private static final String Ballet = "ballet";

    @NotNull
    private static final String BarbellTraining = "barbell_training";

    @NotNull
    private static final String Baseball = "baseball";

    @NotNull
    private static final String Basketball = "basketball";

    @NotNull
    private static final String BattleRope = "battle_rope";

    @NotNull
    private static final String BeachBuggy = "atv";

    @NotNull
    private static final String BeachFootball = "beach_football";

    @NotNull
    private static final String BeachVolleyball = "beach_volleyball";

    @NotNull
    private static final String BellyDance = "belly_dance";

    @NotNull
    private static final String BikeMotocross = "bmx";

    @NotNull
    private static final String Billiards = "billiards";

    @NotNull
    public static final String BloodPressure = "blood_pressure";

    @NotNull
    public static final String BloodPressureMedical = "mc_blood_pressure";

    @NotNull
    public static final String BloodSugar = "blood_sugar";

    @NotNull
    private static final String BoardGame = "board_game";

    @NotNull
    private static final String Boating = "rowing";

    @NotNull
    private static final String BobbyJump = "bobby_jump";

    @NotNull
    private static final String BocceVolo = "bocci";

    @NotNull
    public static final String BodyMomentum = "body_momentum";

    @NotNull
    private static final String Bowling = "bowling";

    @NotNull
    private static final String Boxing = "boxing";

    @NotNull
    private static final String BreakDance = "break_dance";

    @NotNull
    private static final String Bridge = "bridge";

    @NotNull
    public static final String Calories = "calories";

    @NotNull
    private static final String CarRacing = "racing_car";

    @NotNull
    private static final String Checkers = "draughts";

    @NotNull
    private static final String Climbing = "climbing";

    @NotNull
    private static final String ClimbingMachine = "climbing_machine";

    @NotNull
    private static final String ClimbingStairs = "climb_stairs";

    @NotNull
    private static final String CoreTraining = "core_training";

    @NotNull
    private static final String Cricket = "cricket";

    @NotNull
    private static final String CrossCountrySkiing = "backcountry_skiing";

    @NotNull
    private static final String CrossHiking = "cross_hiking";

    @NotNull
    private static final String CrossTraining = "cross_fit";

    @NotNull
    private static final String Curling = "curling";

    @NotNull
    private static final String Dance = "dance";

    @NotNull
    private static final String Darts = "darts";

    @NotNull
    public static final String DaytimeSleep = "watch_daytime_sleep";

    @NotNull
    private static final String DeadLift = "dead_lift";

    @NotNull
    private static final String Diving = "driving";

    @NotNull
    private static final String DodgeBall = "dodgeball";

    @NotNull
    private static final String DoorKick = "gateball";

    @NotNull
    private static final String DragonBoats = "dragon_boat";

    @NotNull
    private static final String DumbbellTraining = "dumbbell_training";

    @NotNull
    private static final String E_Sports = "e_sports";

    @NotNull
    public static final String EcgMedical = "mc_ecg";

    @NotNull
    private static final String EllipticalTrainer = "elliptical_trainer";

    @NotNull
    public static final String Energy = "energy";

    @NotNull
    private static final String Equestrian = "equestrian";

    @NotNull
    private static final String Fencing = "fencing";

    @NotNull
    private static final String FinSwimming = "web_swimming";

    @NotNull
    private static final String Fishing = "fishing";

    @NotNull
    private static final String FlexibilityTraining = "flexibility_training";

    @NotNull
    private static final String FlyAKite = "fly_kite";

    @NotNull
    private static final String Football = "football";

    @NotNull
    private static final String FreeDiving = "freediving";

    @NotNull
    private static final String FreeSparring = "free_sparring";

    @NotNull
    private static final String FreeTraining = "free_training";

    @NotNull
    private static final String Frisbee = "frisbee";

    @NotNull
    private static final String FunctionalTraining = "functional_training";

    @NotNull
    private static final String Go = "go";

    @NotNull
    private static final String Golf = "golf";

    @NotNull
    public static final String GradePrediction = "grade_prediction";

    @NotNull
    private static final String GroupGymnastics = "group_callisthenics";

    @NotNull
    private static final String Gymnastics = "gymnastics";

    @NotNull
    private static final String Handball = "handball";

    @NotNull
    public static final String Headset = "headset";

    @NotNull
    private static final String HeelToToeWalk = "race_walking";

    @NotNull
    private static final String HighBar = "high_bar";

    @NotNull
    private static final String HighIntervalTraining = "high_interval_training";

    @NotNull
    private static final String HipHopDance = "hip_hop_dance";

    @NotNull
    private static final String Hockey = "hockey";

    @NotNull
    private static final String HorseRiding = "horse_riding";

    @NotNull
    public static final String Hr = "heart_rate";

    @NotNull
    private static final String HulaHoop = "hula_hoop";

    @NotNull
    public static final FitnessPersistKey INSTANCE = new FitnessPersistKey();

    @NotNull
    private static final String IndoorFit = "indoor_fitness";

    @NotNull
    private static final String IndoorFootBall = "futsal";

    @NotNull
    private static final String IndoorRiding = "indoor_riding";

    @NotNull
    private static final String IndoorRockClimbing = "indoor_rock_climbing";

    @NotNull
    private static final String IndoorRunning = "indoor_running";

    @NotNull
    private static final String IndoorSkating = "indoor_skating";

    @NotNull
    private static final String IndoorSurfing = "indoor_surfing";

    @NotNull
    private static final String IndoorWalk = "indoor_walking";

    @NotNull
    private static final String InstrumentDiving = "instrument_diving";

    @NotNull
    private static final String InternationalChess = "chess";

    @NotNull
    private static final String JaiBall = "pelota";

    @NotNull
    private static final String Jazz = "jazz";

    @NotNull
    private static final String JuJitSu = "jiujitsu";

    @NotNull
    private static final String Judo = "judo";

    @NotNull
    private static final String JustDance = "switch_just_dance";

    @NotNull
    private static final String Karate = "karate";

    @NotNull
    private static final String KayakRafting = "kayak_rafting";

    @NotNull
    private static final String Kayaking = "canoeing";

    @NotNull
    private static final String Kendo = "swordswanship";

    @NotNull
    private static final String KickBoxing = "kickboxing";

    @NotNull
    private static final String KickShuttleCock = "shuttlecock_kicking";

    @NotNull
    private static final String KiteSurfing = "kite_surfing";

    @NotNull
    public static final String LactateThreshold = "lactate_threshold";

    @NotNull
    private static final String LatinDance = "latin_dance";

    @NotNull
    public static final String LightValue = "light_sensitivity_value";

    @NotNull
    private static final String LowerLimbTraining = "lower_limb_training";

    @NotNull
    public static final String MHStrength = "intensity";

    @NotNull
    public static final String ManualBloodSugar = "single_blood_sugar";

    @NotNull
    public static final String ManualHr = "single_heart_rate";

    @NotNull
    public static final String ManualSpo2 = "single_spo2";

    @NotNull
    public static final String ManualStress = "single_stress";

    @NotNull
    public static final String ManualTemperature = "single_temperature";

    @NotNull
    private static final String MartialArts = "martial_arts";

    @NotNull
    private static final String MixedAerobic = "mixed_aerobics";

    @NotNull
    private static final String ModernDance = "modern_dance";

    @NotNull
    private static final String MotorBoat = "motorboat";

    @NotNull
    private static final String MuayThai = "muay_thai";

    @NotNull
    private static final String NationalDance = "national_dance";

    @NotNull
    public static final String NightSleep = "watch_night_sleep";

    @NotNull
    public static final String Noise = "noise";

    @NotNull
    private static final String OutdoorHiking = "outdoor_hiking";

    @NotNull
    private static final String OutdoorRiding = "outdoor_riding";

    @NotNull
    private static final String OutdoorRockClimbing = "outdoor_rock_climbing";

    @NotNull
    private static final String OutdoorRunning = "outdoor_running";

    @NotNull
    private static final String OutdoorSkating = "outdoor_skating";

    @NotNull
    private static final String OutdoorWalking = "outdoor_walking";

    @NotNull
    private static final String PaddleBoard = "paddle_board";

    @NotNull
    public static final String Pai = "pai";

    @NotNull
    private static final String Paragliding = "paraglider";

    @NotNull
    private static final String ParallelBars = "parallel_bars";

    @NotNull
    private static final String ParallelSkiing = "parallel_skiing";

    @NotNull
    private static final String Parkour = "parkour";

    @NotNull
    public static final String PhysicalStatus = "physical_fitness_status";

    @NotNull
    private static final String PhysicalTraining = "physical_training";

    @NotNull
    private static final String Pilates = "pilates";

    @NotNull
    private static final String PingPong = "pingpong";

    @NotNull
    private static final String PoleDance = "pole_dance";

    @NotNull
    private static final String Puck = "puck";

    @NotNull
    public static final String Rainbow = "goal";

    @NotNull
    private static final String RecreationalScubaDiving = "recreational_scuba_diving";

    @NotNull
    public static final String ReportMaxHr = "max_heart_rate";

    @NotNull
    public static final String ReportMaxSpo2 = "max_spo2";

    @NotNull
    public static final String ReportMinHr = "min_heart_rate";

    @NotNull
    public static final String ReportMinSpo2 = "min_spo2";

    @NotNull
    public static final String RestHr = "resting_heart_rate";

    @NotNull
    private static final String RockClimbing = "rock_climbing";

    @NotNull
    private static final String RollerSkating = "roller_skating";

    @NotNull
    private static final String RopeSkipping = "rope_skipping";

    @NotNull
    private static final String RowingMachine = "rowing_machine";

    @NotNull
    private static final String Rugby = "rugby";

    @NotNull
    public static final String RunningIndicator = "running_ability_index";

    @NotNull
    private static final String SailBoat = "sailboat";

    @NotNull
    private static final String SandBag = "footbag";

    @NotNull
    private static final String SepakTakraw = "sepak_takraw";

    @NotNull
    private static final String ShuffleBall = "shuffle_board";

    @NotNull
    private static final String Shuttlecock = "shuttlecock";

    @NotNull
    private static final String SitUps = "sit_ups";

    @NotNull
    private static final String SkateBoard = "skate";

    @NotNull
    private static final String Sled = "sled";

    @NotNull
    private static final String Snorkeling = "snorkeling";

    @NotNull
    private static final String SnowBoard = "snowboarding";

    @NotNull
    private static final String SnowCar = "snow_car";

    @NotNull
    private static final String SnowMobile = "snowmobile";

    @NotNull
    private static final String SnowSports = "snow_sports";

    @NotNull
    private static final String Softball = "softball";

    @NotNull
    private static final String SomatosensoryGame = "motion_sensing_game";

    @NotNull
    private static final String Spinning = "spinning";

    @NotNull
    public static final String Spo2 = "spo2";

    @NotNull
    private static final String SquareDance = "square_dance";

    @NotNull
    private static final String Squash = "squash";

    @NotNull
    private static final String StepTraining = "step_training";

    @NotNull
    private static final String Stepper = "stepper";

    @NotNull
    public static final String Steps = "steps";

    @NotNull
    private static final String StreetDance = "street_dance";

    @NotNull
    private static final String StrengthTraining = "strength_training";

    @NotNull
    public static final String Stress = "stress";

    @NotNull
    private static final String Stretch = "stretch";

    @NotNull
    private static final String Stroller = "walking_machine";

    @NotNull
    private static final String SwimmingOpen = "open_swimming";

    @NotNull
    private static final String SwimmingPool = "pool_swimming";

    @NotNull
    private static final String Swing = "swing";

    @NotNull
    private static final String TableFootBall = "foosball";

    @NotNull
    private static final String Taekwondo = "taekwondo";

    @NotNull
    private static final String TaiChi = "taichi";

    @NotNull
    public static final String TemperatureCharacter = "temperature_characteristic";

    @NotNull
    public static final String TemperatureTrend = "temperature_trend";

    @NotNull
    private static final String Tennis = "tennis";

    @NotNull
    public static final String TrainingLoad = "training_load";

    @NotNull
    private static final String Triathlon = "triathlon";

    @NotNull
    private static final String TugOfWar = "tug_of_war";

    @NotNull
    public static final String Unknown = "unknown";

    @NotNull
    private static final String UpperLimbTraining = "upper_limb_training";

    @NotNull
    public static final String ValidStand = "valid_stand";

    @NotNull
    public static final String Vitality = "vitality";

    @NotNull
    public static final String Vo2Max = "vo2_max";

    @NotNull
    private static final String Volleyball = "volleyball";

    @NotNull
    private static final String WaistAbdomenTraining = "waist_training";

    @NotNull
    private static final String WallBall = "wall_ball";

    @NotNull
    private static final String WaterPolo = "water_polo";

    @NotNull
    private static final String WaterSkiing = "surfing";

    @NotNull
    private static final String WaterSports = "aquatic_sport";

    @NotNull
    public static final String Weight = "weight";

    @NotNull
    private static final String WeightLifting = "weight_lifting";

    @NotNull
    public static final String WomenHealthStatus = "menstruation";

    @NotNull
    public static final String WomenHealthSymptoms = "menstrual_symptoms";

    @NotNull
    private static final String Wrestling = "wrestling";

    @NotNull
    private static final String Yoga = "yoga";

    @NotNull
    private static final String Zumba = "zumba";

    private FitnessPersistKey() {
    }

    @Nullable
    public final SportReportKey getSportReportKey(int sportType) {
        if (sportType == 19) {
            return new SportReportKey("basketball", "basketball");
        }
        if (sportType == 20) {
            return new SportReportKey("golf", "golf");
        }
        switch (sportType) {
            case 1:
                return new SportReportKey(OutdoorRunning, "running");
            case 2:
                return new SportReportKey(OutdoorWalking, "walking");
            case 3:
                return new SportReportKey(IndoorRunning, "running");
            case 4:
                return new SportReportKey("climbing", "climbing");
            case 5:
                return new SportReportKey("cross_hiking", "cross_hiking");
            case 6:
                return new SportReportKey("outdoor_riding", "outdoor_riding");
            case 7:
                return new SportReportKey("indoor_riding", "indoor_riding");
            case 8:
                return new SportReportKey("free_training", "free_training");
            case 9:
                return new SportReportKey(SwimmingPool, "swimming");
            case 10:
                return new SportReportKey(SwimmingOpen, "swimming");
            case 11:
                return new SportReportKey("elliptical_trainer", "elliptical_trainer");
            case 12:
                return new SportReportKey("yoga", "yoga");
            case 13:
                return new SportReportKey("rowing_machine", "rowing_machine");
            case 14:
                return new SportReportKey("rope_skipping", "rope_skipping");
            case 15:
                return new SportReportKey("outdoor_hiking", "outdoor_hiking");
            case 16:
                return new SportReportKey("high_interval_training", "high_interval_training");
            case 17:
                return new SportReportKey("triathlon", "triathlon");
            default:
                switch (sportType) {
                    case 100:
                        return new SportReportKey("sailboat", "sailboat");
                    case 101:
                        return new SportReportKey("paddle_board", "paddle_board");
                    case 102:
                        return new SportReportKey("water_polo", "water_polo");
                    case 103:
                        return new SportReportKey("aquatic_sport", "aquatic_sport");
                    case 104:
                        return new SportReportKey("surfing", "surfing");
                    case 105:
                        return new SportReportKey("canoeing", "canoeing");
                    case 106:
                        return new SportReportKey("kayak_rafting", "kayak_rafting");
                    case 107:
                        return new SportReportKey("rowing", "rowing");
                    case 108:
                        return new SportReportKey("motorboat", "motorboat");
                    case 109:
                        return new SportReportKey("web_swimming", "web_swimming");
                    case 110:
                        return new SportReportKey("driving", "driving");
                    case 111:
                        return new SportReportKey(ArtisticSwimming, "swimming");
                    case 112:
                        return new SportReportKey("snorkeling", "snorkeling");
                    case 113:
                        return new SportReportKey("kite_surfing", "kite_surfing");
                    case 114:
                        return new SportReportKey("indoor_surfing", "indoor_surfing");
                    case 115:
                        return new SportReportKey("dragon_boat", "dragon_boat");
                    case 116:
                        return new SportReportKey(FreeDiving, "diving");
                    case 117:
                        return new SportReportKey(RecreationalScubaDiving, "diving");
                    case 118:
                        return new SportReportKey(InstrumentDiving, "diving");
                    default:
                        switch (sportType) {
                            case 200:
                                return new SportReportKey("rock_climbing", "rock_climbing");
                            case 201:
                                return new SportReportKey("skate", "skate");
                            case 202:
                                return new SportReportKey("roller_skating", "roller_skating");
                            case 203:
                                return new SportReportKey("parkour", "parkour");
                            case 204:
                                return new SportReportKey("atv", "atv");
                            case 205:
                                return new SportReportKey("paraglider", "paraglider");
                            case 206:
                                return new SportReportKey("bmx", "bmx");
                            case 207:
                                return new SportReportKey("race_walking", "race_walking");
                            default:
                                switch (sportType) {
                                    case 300:
                                        return new SportReportKey("climbing_machine", "climbing_machine");
                                    case 301:
                                        return new SportReportKey("climb_stairs", "climb_stairs");
                                    case 302:
                                        return new SportReportKey("stepper", "stepper");
                                    case 303:
                                        return new SportReportKey("core_training", "core_training");
                                    case 304:
                                        return new SportReportKey("flexibility_training", "flexibility_training");
                                    case 305:
                                        return new SportReportKey("pilates", "pilates");
                                    case 306:
                                        return new SportReportKey("gymnastics", "gymnastics");
                                    case 307:
                                        return new SportReportKey("stretch", "stretch");
                                    case 308:
                                        return new SportReportKey("strength_training", "strength_training");
                                    case 309:
                                        return new SportReportKey("cross_fit", "cross_fit");
                                    case 310:
                                        return new SportReportKey("aerobics", "aerobics");
                                    case 311:
                                        return new SportReportKey("physical_training", "physical_training");
                                    case 312:
                                        return new SportReportKey("wall_ball", "wall_ball");
                                    case 313:
                                        return new SportReportKey("dumbbell_training", "dumbbell_training");
                                    case 314:
                                        return new SportReportKey("barbell_training", "barbell_training");
                                    case 315:
                                        return new SportReportKey("weight_lifting", "weight_lifting");
                                    case 316:
                                        return new SportReportKey("dead_lift", "dead_lift");
                                    case 317:
                                        return new SportReportKey("bobby_jump", "bobby_jump");
                                    case 318:
                                        return new SportReportKey("sit_ups", "sit_ups");
                                    case 319:
                                        return new SportReportKey("functional_training", "functional_training");
                                    case 320:
                                        return new SportReportKey("upper_limb_training", "upper_limb_training");
                                    case 321:
                                        return new SportReportKey("lower_limb_training", "lower_limb_training");
                                    case 322:
                                        return new SportReportKey("waist_training", "waist_training");
                                    case 323:
                                        return new SportReportKey("back_training", "back_training");
                                    case 324:
                                        return new SportReportKey("spinning", "spinning");
                                    case 325:
                                        return new SportReportKey("walking_machine", "walking_machine");
                                    case 326:
                                        return new SportReportKey("step_training", "step_training");
                                    case 327:
                                        return new SportReportKey("high_bar", "high_bar");
                                    case 328:
                                        return new SportReportKey("parallel_bars", "parallel_bars");
                                    case 329:
                                        return new SportReportKey("group_callisthenics", "group_callisthenics");
                                    case 330:
                                        return new SportReportKey("kickboxing", "kickboxing");
                                    case 331:
                                        return new SportReportKey("battle_rope", "battle_rope");
                                    case 332:
                                        return new SportReportKey("mixed_aerobics", "mixed_aerobics");
                                    case 333:
                                        return new SportReportKey(IndoorWalk, "walking");
                                    case 334:
                                        return new SportReportKey("abdwheel_training", "abdwheel_training");
                                    case 900:
                                        return new SportReportKey("chess", "chess");
                                    case 901:
                                        return new SportReportKey("draughts", "draughts");
                                    case 902:
                                        return new SportReportKey("go", "go");
                                    case 903:
                                        return new SportReportKey("bridge", "bridge");
                                    case 904:
                                        return new SportReportKey("board_game", "board_game");
                                    case 1000:
                                        return new SportReportKey(IndoorRockClimbing, "extreme_rock_climbing");
                                    case 1001:
                                        return new SportReportKey(OutdoorRockClimbing, "extreme_rock_climbing");
                                    case 10000:
                                        return new SportReportKey("equestrian", "equestrian");
                                    case 10001:
                                        return new SportReportKey("track_and_field", "track_and_field");
                                    case 10002:
                                        return new SportReportKey("racing_car", "racing_car");
                                    default:
                                        switch (sportType) {
                                            case 399:
                                                return new SportReportKey("indoor_fitness", "indoor_fitness");
                                            case 400:
                                                return new SportReportKey("square_dance", "square_dance");
                                            case 401:
                                                return new SportReportKey("belly_dance", "belly_dance");
                                            case 402:
                                                return new SportReportKey("ballet", "ballet");
                                            case 403:
                                                return new SportReportKey("street_dance", "street_dance");
                                            case 404:
                                                return new SportReportKey("zumba", "zumba");
                                            case 405:
                                                return new SportReportKey("national_dance", "national_dance");
                                            case 406:
                                                return new SportReportKey("jazz", "jazz");
                                            case 407:
                                                return new SportReportKey("latin_dance", "latin_dance");
                                            case 408:
                                                return new SportReportKey("hip_hop_dance", "hip_hop_dance");
                                            case 409:
                                                return new SportReportKey("pole_dance", "pole_dance");
                                            case 410:
                                                return new SportReportKey("break_dance", "break_dance");
                                            case 411:
                                                return new SportReportKey("ballroom_dance", "ballroom_dance");
                                            case 412:
                                                return new SportReportKey("modern_dance", "modern_dance");
                                            default:
                                                switch (sportType) {
                                                    case 499:
                                                        return new SportReportKey("dance", "dance");
                                                    case 500:
                                                        return new SportReportKey("boxing", "boxing");
                                                    case 501:
                                                        return new SportReportKey("wrestling", "wrestling");
                                                    case 502:
                                                        return new SportReportKey("martial_arts", "martial_arts");
                                                    case 503:
                                                        return new SportReportKey("taichi", "taichi");
                                                    case 504:
                                                        return new SportReportKey("muay_thai", "muay_thai");
                                                    case 505:
                                                        return new SportReportKey("judo", "judo");
                                                    case 506:
                                                        return new SportReportKey("taekwondo", "taekwondo");
                                                    case 507:
                                                        return new SportReportKey("karate", "karate");
                                                    case 508:
                                                        return new SportReportKey("free_sparring", "free_sparring");
                                                    case 509:
                                                        return new SportReportKey("swordswanship", "swordswanship");
                                                    case 510:
                                                        return new SportReportKey("fencing", "fencing");
                                                    case 511:
                                                        return new SportReportKey("jiujitsu", "jiujitsu");
                                                    default:
                                                        switch (sportType) {
                                                            case 600:
                                                                return new SportReportKey("football", "football");
                                                            case 601:
                                                                return new SportReportKey("basketball", "basketball");
                                                            case 602:
                                                                return new SportReportKey("volleyball", "volleyball");
                                                            case 603:
                                                                return new SportReportKey("baseball", "baseball");
                                                            case 604:
                                                                return new SportReportKey("softball", "softball");
                                                            case 605:
                                                                return new SportReportKey("rugby", "rugby");
                                                            case 606:
                                                                return new SportReportKey("hockey", "hockey");
                                                            case 607:
                                                                return new SportReportKey("pingpong", "pingpong");
                                                            case 608:
                                                                return new SportReportKey("badminton", "badminton");
                                                            case 609:
                                                                return new SportReportKey("tennis", "tennis");
                                                            case 610:
                                                                return new SportReportKey("cricket", "cricket");
                                                            case 611:
                                                                return new SportReportKey("handball", "handball");
                                                            case 612:
                                                                return new SportReportKey("bowling", "bowling");
                                                            case 613:
                                                                return new SportReportKey("squash", "squash");
                                                            case 614:
                                                                return new SportReportKey("billiards", "billiards");
                                                            case 615:
                                                                return new SportReportKey("shuttlecock", "shuttlecock");
                                                            case 616:
                                                                return new SportReportKey("beach_football", "beach_football");
                                                            case 617:
                                                                return new SportReportKey("beach_volleyball", "beach_volleyball");
                                                            case 618:
                                                                return new SportReportKey("sepak_takraw", "sepak_takraw");
                                                            case 619:
                                                                return new SportReportKey("golf", "golf");
                                                            case 620:
                                                                return new SportReportKey("foosball", "foosball");
                                                            case 621:
                                                                return new SportReportKey("futsal", "futsal");
                                                            case 622:
                                                                return new SportReportKey("footbag", "footbag");
                                                            case 623:
                                                                return new SportReportKey("bocci", "bocci");
                                                            case 624:
                                                                return new SportReportKey("pelota", "pelota");
                                                            case 625:
                                                                return new SportReportKey("gateball", "gateball");
                                                            case 626:
                                                                return new SportReportKey("dodgeball", "dodgeball");
                                                            case 627:
                                                                return new SportReportKey("shuffle_board", "shuffle_board");
                                                            default:
                                                                switch (sportType) {
                                                                    case 700:
                                                                        return new SportReportKey("outdoor_skating", "outdoor_skating");
                                                                    case 701:
                                                                        return new SportReportKey("curling", "curling");
                                                                    case 702:
                                                                        return new SportReportKey("snow_sports", "snow_sports");
                                                                    case 703:
                                                                        return new SportReportKey("snowmobile", "snowmobile");
                                                                    case 704:
                                                                        return new SportReportKey("puck", "puck");
                                                                    case 705:
                                                                        return new SportReportKey("snow_car", "snow_car");
                                                                    case 706:
                                                                        return new SportReportKey("sled", "sled");
                                                                    case 707:
                                                                        return new SportReportKey("indoor_skating", "indoor_skating");
                                                                    case 708:
                                                                        return new SportReportKey("snowboarding", "snowboarding");
                                                                    case 709:
                                                                        return new SportReportKey("parallel_skiing", "parallel_skiing");
                                                                    case 710:
                                                                        return new SportReportKey("backcountry_skiing", "backcountry_skiing");
                                                                    default:
                                                                        switch (sportType) {
                                                                            case 800:
                                                                                return new SportReportKey("archery", "archery");
                                                                            case 801:
                                                                                return new SportReportKey("darts", "darts");
                                                                            case 802:
                                                                                return new SportReportKey("horse_riding", "horse_riding");
                                                                            case 803:
                                                                                return new SportReportKey("tug_of_war", "tug_of_war");
                                                                            case 804:
                                                                                return new SportReportKey("hula_hoop", "hula_hoop");
                                                                            case 805:
                                                                                return new SportReportKey("fly_kite", "fly_kite");
                                                                            case 806:
                                                                                return new SportReportKey("fishing", "fishing");
                                                                            case 807:
                                                                                return new SportReportKey("frisbee", "frisbee");
                                                                            case 808:
                                                                                return new SportReportKey("shuttlecock_kicking", "shuttlecock_kicking");
                                                                            case 809:
                                                                                return new SportReportKey("swing", "swing");
                                                                            case 810:
                                                                                return new SportReportKey("motion_sensing_game", "motion_sensing_game");
                                                                            case 811:
                                                                                return new SportReportKey("e_sports", "e_sports");
                                                                            case 812:
                                                                                return new SportReportKey("switch_just_dance", "switch_just_dance");
                                                                            default:
                                                                                return null;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
