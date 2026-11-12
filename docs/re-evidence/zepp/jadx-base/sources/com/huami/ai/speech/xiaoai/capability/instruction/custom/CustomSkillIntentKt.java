package com.huami.ai.speech.xiaoai.capability.instruction.custom;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0002\u0010\u000e\n\u0003\b\u0089\u0001\"\u0016\u0010\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0016\u0010\u0006\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0016\u0010\u0007\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0016\u0010\b\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0016\u0010\t\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0016\u0010\n\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000b\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0016\u0010\f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0016\u0010\r\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0002\"\u0016\u0010\u000e\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0002\"\u0016\u0010\u000f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0002\"\u0016\u0010\u0010\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0002\"\u0016\u0010\u0011\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0002\"\u0016\u0010\u0012\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0002\"\u0016\u0010\u0013\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0002\"\u0016\u0010\u0014\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0002\"\u0016\u0010\u0015\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0002\"\u0016\u0010\u0016\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0002\"\u0016\u0010\u0017\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0002\"\u0016\u0010\u0018\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0002\"\u0016\u0010\u0019\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0002\"\u0016\u0010\u001a\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0002\"\u0016\u0010\u001b\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0002\"\u0016\u0010\u001c\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0002\"\u0016\u0010\u001d\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0002\"\u0016\u0010\u001e\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0002\"\u0016\u0010\u001f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0002\"\u0016\u0010 \u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0002\"\u0016\u0010!\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u0002\"\u0016\u0010\"\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u0002\"\u0016\u0010#\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u0002\"\u0016\u0010$\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u0002\"\u0016\u0010%\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u0002\"\u0016\u0010&\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u0002\"\u0016\u0010'\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u0002\"\u0016\u0010(\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u0002\"\u0016\u0010)\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010\u0002\"\u0016\u0010*\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\u0002\"\u0016\u0010+\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\u0002\"\u0016\u0010,\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010\u0002\"\u0016\u0010-\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010\u0002\"\u0016\u0010.\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010\u0002\"\u0016\u0010/\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010\u0002\"\u0016\u00100\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\u0002\"\u0016\u00101\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010\u0002\"\u0016\u00102\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010\u0002\"\u0016\u00103\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010\u0002\"\u0016\u00104\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010\u0002\"\u0016\u00105\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010\u0002\"\u0016\u00106\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010\u0002\"\u0016\u00107\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010\u0002\"\u0016\u00108\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u0010\u0002\"\u0016\u00109\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010\u0002\"\u0016\u0010:\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010\u0002\"\u0016\u0010;\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u0010\u0002\"\u0016\u0010<\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010\u0002\"\u0016\u0010=\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u0010\u0002\"\u0016\u0010>\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010\u0002\"\u0016\u0010?\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u0010\u0002\"\u0016\u0010@\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010\u0002\"\u0016\u0010A\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010\u0002\"\u0016\u0010B\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010\u0002\"\u0016\u0010C\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010\u0002\"\u0016\u0010D\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u0010\u0002\"\u0016\u0010E\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010\u0002\"\u0016\u0010F\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010\u0002\"\u0016\u0010G\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010\u0002\"\u0016\u0010H\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010\u0002\"\u0016\u0010I\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010\u0002\"\u0016\u0010J\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bJ\u0010\u0002\"\u0016\u0010K\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bK\u0010\u0002\"\u0016\u0010L\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bL\u0010\u0002\"\u0016\u0010M\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bM\u0010\u0002\"\u0016\u0010N\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010\u0002\"\u0016\u0010O\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bO\u0010\u0002\"\u0016\u0010P\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bP\u0010\u0002\"\u0016\u0010Q\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bQ\u0010\u0002\"\u0016\u0010R\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bR\u0010\u0002\"\u0016\u0010S\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bS\u0010\u0002\"\u0016\u0010T\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bT\u0010\u0002\"\u0016\u0010U\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bU\u0010\u0002\"\u0016\u0010V\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bV\u0010\u0002\"\u0016\u0010W\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bW\u0010\u0002\"\u0016\u0010X\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bX\u0010\u0002\"\u0016\u0010Y\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bY\u0010\u0002\"\u0016\u0010Z\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bZ\u0010\u0002\"\u0016\u0010[\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b[\u0010\u0002\"\u0016\u0010\\\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\\\u0010\u0002\"\u0016\u0010]\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b]\u0010\u0002\"\u0016\u0010^\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b^\u0010\u0002\"\u0016\u0010_\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b_\u0010\u0002\"\u0016\u0010`\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b`\u0010\u0002\"\u0016\u0010a\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\ba\u0010\u0002\"\u0016\u0010b\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bb\u0010\u0002\"\u0016\u0010c\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bc\u0010\u0002\"\u0016\u0010d\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bd\u0010\u0002\"\u0016\u0010e\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\be\u0010\u0002\"\u0016\u0010f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bf\u0010\u0002\"\u0016\u0010g\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bg\u0010\u0002\"\u0016\u0010h\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bh\u0010\u0002\"\u0016\u0010i\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bi\u0010\u0002\"\u0016\u0010j\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bj\u0010\u0002\"\u0016\u0010k\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bk\u0010\u0002\"\u0016\u0010l\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bl\u0010\u0002\"\u0016\u0010m\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bm\u0010\u0002\"\u0016\u0010n\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bn\u0010\u0002\"\u0016\u0010o\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bo\u0010\u0002\"\u0016\u0010p\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bp\u0010\u0002\"\u0016\u0010q\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bq\u0010\u0002\"\u0016\u0010r\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\br\u0010\u0002\"\u0016\u0010s\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bs\u0010\u0002\"\u0016\u0010t\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bt\u0010\u0002\"\u0016\u0010u\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bu\u0010\u0002\"\u0016\u0010v\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bv\u0010\u0002\"\u0016\u0010w\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bw\u0010\u0002\"\u0016\u0010x\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bx\u0010\u0002\"\u0016\u0010y\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\by\u0010\u0002\"\u0016\u0010z\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bz\u0010\u0002\"\u0016\u0010{\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b{\u0010\u0002\"\u0016\u0010|\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b|\u0010\u0002\"\u0016\u0010}\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b}\u0010\u0002\"\u0016\u0010~\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b~\u0010\u0002\"\u0016\u0010\u007f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u007f\u0010\u0002\"\u0018\u0010\u0080\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0002\"\u0018\u0010\u0081\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0002\"\u0018\u0010\u0082\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0002\"\u0018\u0010\u0083\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0002\"\u0018\u0010\u0084\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0002\"\u0018\u0010\u0085\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0002\"\u0018\u0010\u0086\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0002\"\u0018\u0010\u0087\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0002\"\u0018\u0010\u0088\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0002¨\u0006\u0089\u0001"}, d2 = {"", "INTENT_ALIPAY", "Ljava/lang/String;", "INTENT_CARD_PACK", "INTENT_ACTIVITY_STATUS", "INTENT_HEART_RATE", "INTENT_NOTIFICATION", "INTENT_MUSIC_CONTROL", "INTENT_STOPWATCH", "INTENT_FIND_DEVICE", "INTENT_STOP_FIND_DEVICE", "INTENT_FACE_SETTING", "INTENT_BATTERY", "INTENT_SMART_DND", "INTENT_OPEN_BRIGHTNESS", "INTENT_OPEN_PREVIOUS_WORKOUT", "INTENT_OPEN__SLEEP", "INTENT_OPEN_SPO2", "INTENT_OPEN_PRESSURE", "INTENT_OPEN_ECG", "INTENT_OPEN_SCHEDULE", "INTENT_OPEN_COMPASS", "INTENT_OPEN_ALTIMETER", "INTENT_OPEN_WORLD_TIME", "INTENT_OPEN_SMART_ASSISTANT", "INTENT_OPEN_SETTING", "INTENT_OPEN_NETEASE_CLOUD_MUSIC", "INTENT_OPEN_EXERCISE_TARGET", "INTENT_RUN_IN_DOOR", "INTENT_RUN_OUT_DOOR", "INTENT_CYCLING", "INTENT_INDOOR_CYCLING", "INTENT_WALKING", "INTENT_POLL_SWIM", "INTENT_OPEN_WATER_SWIMMING", "INTENT_TRAINING", "INTENT_OPEN_ELLIPTICAL", "INTENT_OPEN_ROWING", "INTENT_OPEN_ROPE_SKIP", "INTENT_OPEN_YOGA", "INTENT_CLIMB", "INTENT_TRAIL_RUN", "INTENT_SKIING", "INTENT_FREE_TRAINING", "INTENT_DEVICE_SPORT", "INTENT_DEVICE_SPORT_RECORD", "INTENT_TAKE_PHOTO", "INTENT_OPEN_TEMPERATURE", "INTENT_OPEN_SMS", "INTENT_OPEN_TIGER_TRADE", "INTENT_OPEN_PHONE", "INTENT_OPEN_FLIGHT_MANAGER", "INTENT_OPEN_PAI", "INTENT_OPEN_SPORT_INDOOR_FITNESS", "INTENT_OPEN_SPORT_BASKETBALL", "INTENT_OPEN_SPORT_VOLLEYBALL", "INTENT_OPEN_SPORT_TABLE_TENNIS", "INTENT_OPEN_SPORT_DANCE", "INTENT_OPEN_SPORT_STREET_DANCE", "INTENT_OPEN_SPORT_BADMINTON", "INTENT_OPEN_SPORT_GYMNASTICS", "INTENT_OPEN_SPORT_HIIT", "INTENT_OPEN_SPORT_CORE_TRAINING", "INTENT_OPEN_SPORT_STRETCHING", "INTENT_OPEN_SPORT_TREADMILL", "INTENT_OPEN_SPORT_PILATES", "INTENT_OPEN_SPORT_CRICKET", "INTENT_OPEN_SPORT_BOWLING", "INTENT_OPEN_SPORT_BOXING", "INTENT_OPEN_SPORT_FREE_FIGHTING", "INTENT_OPEN_SPORT_ZUMBA", "INTENT_OPEN_SPORT_INDOOR_SKATING", "INTENT_OPEN_TOMATO_CLOCK", "INTENT_OPEN_WECHATPAY", "INTENT_OPEN_BREATHING", "INTENT_OPEN_FLASHLIGHT", "INTENT_SPORT_INDOOR_WALKING", "INTENT_SPORT_OUTDOOR_ROWING", "INTENT_SPORT_SKATEBOARD", "INTENT_SPORT_AEROBICS", "INTENT_SPORT_GROUP_GYMNASTICS", "INTENT_SPORT_LATIN_DANCE", "INTENT_SPORT_JAZZ_DANCE", "INTENT_SPORT_FIGHTING_EXERCISE", "INTENT_SPORT_HULA_HOOP", "INTENT_SPORT_FRISBEE", "INTENT_SPORT_DARTS", "INTENT_SPORT_FLYING_A_KITE", "INTENT_SPORT_TUG_OF_WAR", "INTENT_SPORT_KICKING_SHUTTLECOCK", "INTENT_SPORT_BEACH_VOLLEYBALL", "INTENT_SPORT_PARKOUR", "INTENT_SPORT_CROSS_TRAINING", "INTENT_SPORT_RACE_WALKING", "INTENT_SPORT_E_SPORTS", "INTENT_SPORT_DRAGON_BOAT", "INTENT_SPORT_WATER_SKIING", "INTENT_SPORT_KAYAK", "INTENT_SPORT_ROWING", "INTENT_SPORT_SPINNING_BIKE", "INTENT_SPORT_WALKING_MACHINE", "INTENT_SPORT_WALL_BALL", "INTENT_SPORT_FOLK_DANCE", "INTENT_SPORT_JUJITSU", "INTENT_SPORT_FENCING", "INTENT_SPORT_HORIZONTAL_BAR", "INTENT_SPORT_PARALLEL_BARS", "INTENT_SPORT_BILLIARDS", "INTENT_SPORT_FUJIKI", "INTENT_SPORT_DODGE_BALL", "INTENT_SPORT_WATER_POLO", "INTENT_SPORT_FIN_SWIMMING", "INTENT_SPORT_SYNCHRONIZED_SWIMMING", "INTENT_SPORT_SNORKELING", "INTENT_SPORT_ICE_HOCKEY", "INTENT_SPORT_SWING", "INTENT_SPORT_SHUFFLEBOARD", "INTENT_SPORT_TABLE_FOOTBALL", "INTENT_SPORT_SHUTTLECOCK", "INTENT_SPORT_SOMATOSENSORY_GAME", "INTENT_SPORT_INDOOR_FOOTBALL", "INTENT_SPORT_HIPHOP", "INTENT_SPORT_POLE_DANCING", "INTENT_SPORT_BATTLE_ROPE", "INTENT_SPORT_BREAK_DANCING", "INTENT_SPORT_SANDBAG_BALL", "INTENT_SPORT_GROUND_THROW", "INTENT_SPORT_JAILI_BALL", "INTENT_SPORT_INDOOR_SURFING", "INTENT_SPORT_CHESS", "INTENT_SPORT_CHECKERS", "INTENT_SPORT_GO", "INTENT_SPORT_BRIDGE", "INTENT_SPORT_BOARD_GAMES", "INTENT_OPEN_BASE_MOVEMENT_STATUS", "INTENT_BASE_WRIST_LIFT", "INTENT_BASE_DEVICE_ALARM", "speech-xiaoai_release"}, k = 2, mv = {1, 5, 1})
public final class CustomSkillIntentKt {

    @NotNull
    public static final String INTENT_ACTIVITY_STATUS = "base_device_activity_status";

    @NotNull
    public static final String INTENT_ALIPAY = "base_open_alipay";

    @NotNull
    public static final String INTENT_BASE_DEVICE_ALARM = "base_device_alarm";

    @NotNull
    public static final String INTENT_BASE_WRIST_LIFT = "base_wrist_lift";

    @NotNull
    public static final String INTENT_BATTERY = "base_device_battery";

    @NotNull
    public static final String INTENT_CARD_PACK = "base_device_card_pack";

    @NotNull
    public static final String INTENT_CLIMB = "sport_climbing";

    @NotNull
    public static final String INTENT_CYCLING = "sport_cycling";

    @NotNull
    public static final String INTENT_DEVICE_SPORT = "base_device_sport";

    @NotNull
    public static final String INTENT_DEVICE_SPORT_RECORD = "base_device_activities";

    @NotNull
    public static final String INTENT_FACE_SETTING = "base_device_watch_face_setting";

    @NotNull
    public static final String INTENT_FIND_DEVICE = "base_find_device";

    @NotNull
    public static final String INTENT_FREE_TRAINING = "sport_free_training";

    @NotNull
    public static final String INTENT_HEART_RATE = "base_device_heart_rate";

    @NotNull
    public static final String INTENT_INDOOR_CYCLING = "sport_indoor_cycling";

    @NotNull
    public static final String INTENT_MUSIC_CONTROL = "base_device_music_control";

    @NotNull
    public static final String INTENT_NOTIFICATION = "base_device_notification";

    @NotNull
    public static final String INTENT_OPEN_ALTIMETER = "base_device_barometric_altimeter";

    @NotNull
    public static final String INTENT_OPEN_BASE_MOVEMENT_STATUS = "base_movement_status";

    @NotNull
    public static final String INTENT_OPEN_BREATHING = "base_device_breathing";

    @NotNull
    public static final String INTENT_OPEN_BRIGHTNESS = "base_device_brightness";

    @NotNull
    public static final String INTENT_OPEN_COMPASS = "base_device_compass";

    @NotNull
    public static final String INTENT_OPEN_ECG = "base_device_ecg";

    @NotNull
    public static final String INTENT_OPEN_ELLIPTICAL = "sport_elliptical_machine";

    @NotNull
    public static final String INTENT_OPEN_EXERCISE_TARGET = "base_device_exercise_target";

    @NotNull
    public static final String INTENT_OPEN_FLASHLIGHT = "base_device_flashlight";

    @NotNull
    public static final String INTENT_OPEN_FLIGHT_MANAGER = "base_device_flight_manager";

    @NotNull
    public static final String INTENT_OPEN_NETEASE_CLOUD_MUSIC = "base_device_netease_music";

    @NotNull
    public static final String INTENT_OPEN_PAI = "base_device_pai";

    @NotNull
    public static final String INTENT_OPEN_PHONE = "base_device_phone";

    @NotNull
    public static final String INTENT_OPEN_PRESSURE = "base_device_pressure";

    @NotNull
    public static final String INTENT_OPEN_PREVIOUS_WORKOUT = "base_device_previous_workout";

    @NotNull
    public static final String INTENT_OPEN_ROPE_SKIP = "sport_rope_skipping";

    @NotNull
    public static final String INTENT_OPEN_ROWING = "sport_rowing_machine";

    @NotNull
    public static final String INTENT_OPEN_SCHEDULE = "base_device_schedule";

    @NotNull
    public static final String INTENT_OPEN_SETTING = "base_device_setting";

    @NotNull
    public static final String INTENT_OPEN_SMART_ASSISTANT = "base_device_smart_assistant";

    @NotNull
    public static final String INTENT_OPEN_SMS = "base_device_sms";

    @NotNull
    public static final String INTENT_OPEN_SPO2 = "base_device_spo2";

    @NotNull
    public static final String INTENT_OPEN_SPORT_BADMINTON = "sport_badminton";

    @NotNull
    public static final String INTENT_OPEN_SPORT_BASKETBALL = "sport_basketball";

    @NotNull
    public static final String INTENT_OPEN_SPORT_BOWLING = "sport_Bowling";

    @NotNull
    public static final String INTENT_OPEN_SPORT_BOXING = "sport_Boxing";

    @NotNull
    public static final String INTENT_OPEN_SPORT_CORE_TRAINING = "sport_core_training";

    @NotNull
    public static final String INTENT_OPEN_SPORT_CRICKET = "sport_cricket";

    @NotNull
    public static final String INTENT_OPEN_SPORT_DANCE = "sport_dance";

    @NotNull
    public static final String INTENT_OPEN_SPORT_FREE_FIGHTING = "sport_Free_Fighting";

    @NotNull
    public static final String INTENT_OPEN_SPORT_GYMNASTICS = "sport_gymnastics";

    @NotNull
    public static final String INTENT_OPEN_SPORT_HIIT = "sport_HIIT";

    @NotNull
    public static final String INTENT_OPEN_SPORT_INDOOR_FITNESS = "sport_indoor_fitness";

    @NotNull
    public static final String INTENT_OPEN_SPORT_INDOOR_SKATING = "sport_Indoor_skating";

    @NotNull
    public static final String INTENT_OPEN_SPORT_PILATES = "sport_pilates";

    @NotNull
    public static final String INTENT_OPEN_SPORT_STREET_DANCE = "sport_street_dance";

    @NotNull
    public static final String INTENT_OPEN_SPORT_STRETCHING = "sport_stretching";

    @NotNull
    public static final String INTENT_OPEN_SPORT_TABLE_TENNIS = "sport_table_tennis";

    @NotNull
    public static final String INTENT_OPEN_SPORT_TREADMILL = "sport_treadmill";

    @NotNull
    public static final String INTENT_OPEN_SPORT_VOLLEYBALL = "sport_volleyball";

    @NotNull
    public static final String INTENT_OPEN_SPORT_ZUMBA = "sport_Zumba";

    @NotNull
    public static final String INTENT_OPEN_TEMPERATURE = "base_device_temperature";

    @NotNull
    public static final String INTENT_OPEN_TIGER_TRADE = "base_device_tiger_trade";

    @NotNull
    public static final String INTENT_OPEN_TOMATO_CLOCK = "base_open_tomato_clock";

    @NotNull
    public static final String INTENT_OPEN_WATER_SWIMMING = "sport_open_water_swimming";

    @NotNull
    public static final String INTENT_OPEN_WECHATPAY = "base_open_wechatpay";

    @NotNull
    public static final String INTENT_OPEN_WORLD_TIME = "base_device_world_clock";

    @NotNull
    public static final String INTENT_OPEN_YOGA = "sport_yoga";

    @NotNull
    public static final String INTENT_OPEN__SLEEP = "base_device_sleep";

    @NotNull
    public static final String INTENT_POLL_SWIM = "sport_swimming";

    @NotNull
    public static final String INTENT_RUN_IN_DOOR = "sport_running_indoor";

    @NotNull
    public static final String INTENT_RUN_OUT_DOOR = "sport_running_outdoor";

    @NotNull
    public static final String INTENT_SKIING = "sport_skiing";

    @NotNull
    public static final String INTENT_SMART_DND = "base_device_intelligentDND";

    @NotNull
    public static final String INTENT_SPORT_AEROBICS = "sport_aerobics";

    @NotNull
    public static final String INTENT_SPORT_BATTLE_ROPE = "sport_battle_rope";

    @NotNull
    public static final String INTENT_SPORT_BEACH_VOLLEYBALL = "sport_beach_volleyball";

    @NotNull
    public static final String INTENT_SPORT_BILLIARDS = "sport_billiards";

    @NotNull
    public static final String INTENT_SPORT_BOARD_GAMES = "sport_board_games";

    @NotNull
    public static final String INTENT_SPORT_BREAK_DANCING = "sport_break_dancing";

    @NotNull
    public static final String INTENT_SPORT_BRIDGE = "sport_bridge";

    @NotNull
    public static final String INTENT_SPORT_CHECKERS = "sport_checkers";

    @NotNull
    public static final String INTENT_SPORT_CHESS = "sport_chess";

    @NotNull
    public static final String INTENT_SPORT_CROSS_TRAINING = "sport_cross_training";

    @NotNull
    public static final String INTENT_SPORT_DARTS = "sport_darts";

    @NotNull
    public static final String INTENT_SPORT_DODGE_BALL = "sport_dodge_ball";

    @NotNull
    public static final String INTENT_SPORT_DRAGON_BOAT = "sport_dragon_boat";

    @NotNull
    public static final String INTENT_SPORT_E_SPORTS = "sport_e_sports";

    @NotNull
    public static final String INTENT_SPORT_FENCING = "sport_fencing";

    @NotNull
    public static final String INTENT_SPORT_FIGHTING_EXERCISE = "sport_fighting_exercise";

    @NotNull
    public static final String INTENT_SPORT_FIN_SWIMMING = "sport_fin_swimming";

    @NotNull
    public static final String INTENT_SPORT_FLYING_A_KITE = "sport_flying_a_kite";

    @NotNull
    public static final String INTENT_SPORT_FOLK_DANCE = "sport_folk_dance";

    @NotNull
    public static final String INTENT_SPORT_FRISBEE = "sport_frisbee";

    @NotNull
    public static final String INTENT_SPORT_FUJIKI = "sport_fujiki";

    @NotNull
    public static final String INTENT_SPORT_GO = "sport_go";

    @NotNull
    public static final String INTENT_SPORT_GROUND_THROW = "sport_ground_throw";

    @NotNull
    public static final String INTENT_SPORT_GROUP_GYMNASTICS = "sport_group_gymnastics";

    @NotNull
    public static final String INTENT_SPORT_HIPHOP = "sport_Hiphop";

    @NotNull
    public static final String INTENT_SPORT_HORIZONTAL_BAR = "sport_horizontal_bar";

    @NotNull
    public static final String INTENT_SPORT_HULA_HOOP = "sport_Hula_hoop";

    @NotNull
    public static final String INTENT_SPORT_ICE_HOCKEY = "sport_ice_hockey";

    @NotNull
    public static final String INTENT_SPORT_INDOOR_FOOTBALL = "sport_Indoor_football";

    @NotNull
    public static final String INTENT_SPORT_INDOOR_SURFING = "sport_indoor_surfing";

    @NotNull
    public static final String INTENT_SPORT_INDOOR_WALKING = "sport_indoor_walking";

    @NotNull
    public static final String INTENT_SPORT_JAILI_BALL = "sport_jaili_ball";

    @NotNull
    public static final String INTENT_SPORT_JAZZ_DANCE = "sport_jazz_dance";

    @NotNull
    public static final String INTENT_SPORT_JUJITSU = "sport_jujitsu";

    @NotNull
    public static final String INTENT_SPORT_KAYAK = "sport_kayak";

    @NotNull
    public static final String INTENT_SPORT_KICKING_SHUTTLECOCK = "sport_kicking_shuttlecock";

    @NotNull
    public static final String INTENT_SPORT_LATIN_DANCE = "sport_latin_dance";

    @NotNull
    public static final String INTENT_SPORT_OUTDOOR_ROWING = "sport_outdoor_rowing";

    @NotNull
    public static final String INTENT_SPORT_PARALLEL_BARS = "sport_parallel_bars";

    @NotNull
    public static final String INTENT_SPORT_PARKOUR = "sport_parkour";

    @NotNull
    public static final String INTENT_SPORT_POLE_DANCING = "sport_pole_dancing";

    @NotNull
    public static final String INTENT_SPORT_RACE_WALKING = "sport_race_walking";

    @NotNull
    public static final String INTENT_SPORT_ROWING = "sport_rowing";

    @NotNull
    public static final String INTENT_SPORT_SANDBAG_BALL = "sport_sandbag_ball";

    @NotNull
    public static final String INTENT_SPORT_SHUFFLEBOARD = "sport_shuffleboard";

    @NotNull
    public static final String INTENT_SPORT_SHUTTLECOCK = "sport_shuttlecock";

    @NotNull
    public static final String INTENT_SPORT_SKATEBOARD = "sport_skateboard";

    @NotNull
    public static final String INTENT_SPORT_SNORKELING = "sport_snorkeling";

    @NotNull
    public static final String INTENT_SPORT_SOMATOSENSORY_GAME = "sport_somatosensory_game";

    @NotNull
    public static final String INTENT_SPORT_SPINNING_BIKE = "sport_spinning_bike";

    @NotNull
    public static final String INTENT_SPORT_SWING = "sport_swing";

    @NotNull
    public static final String INTENT_SPORT_SYNCHRONIZED_SWIMMING = "sport_synchronized_swimming";

    @NotNull
    public static final String INTENT_SPORT_TABLE_FOOTBALL = "sport_table_football";

    @NotNull
    public static final String INTENT_SPORT_TUG_OF_WAR = "sport_tug_of_war";

    @NotNull
    public static final String INTENT_SPORT_WALKING_MACHINE = "sport_walking_machine";

    @NotNull
    public static final String INTENT_SPORT_WALL_BALL = "sport_wall_ball";

    @NotNull
    public static final String INTENT_SPORT_WATER_POLO = "sport_water_polo";

    @NotNull
    public static final String INTENT_SPORT_WATER_SKIING = "sport_water_skiing";

    @NotNull
    public static final String INTENT_STOPWATCH = "base_device_stopwatch";

    @NotNull
    public static final String INTENT_STOP_FIND_DEVICE = "stop_findphone";

    @NotNull
    public static final String INTENT_TAKE_PHOTO = "base_device_takephoto";

    @NotNull
    public static final String INTENT_TRAIL_RUN = "sport_trail_running";

    @NotNull
    public static final String INTENT_TRAINING = "training";

    @NotNull
    public static final String INTENT_WALKING = "sport_walking";
}
