package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0003\bË\u0001\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\f\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\b\u00107\u001a\u0004\u0018\u00010\u0004\u0012\b\u00108\u001a\u0004\u0018\u00010\u0004\u0012\b\u00109\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bS\u0010TR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010V\u001a\u0004\b]\u0010XR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010V\u001a\u0004\b^\u0010XR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010V\u001a\u0004\b`\u0010XR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010V\u001a\u0004\ba\u0010XR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010V\u001a\u0004\bb\u0010XR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010Y\u001a\u0004\bc\u0010[R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010V\u001a\u0004\bg\u0010XR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010V\u001a\u0004\bi\u0010XR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010V\u001a\u0004\bh\u0010XR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010Y\u001a\u0004\bl\u0010[R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010V\u001a\u0004\bn\u0010XR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010Y\u001a\u0004\bt\u0010[R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\by\u0010p\u001a\u0004\bz\u0010rR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010Y\u001a\u0004\b|\u0010[R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010Y\u001a\u0004\b~\u0010[R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u007f\u0010d\u001a\u0005\b\u0080\u0001\u0010fR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010V\u001a\u0005\b\u0082\u0001\u0010XR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0083\u0001\u0010V\u001a\u0004\bk\u0010XR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010V\u001a\u0005\b\u0085\u0001\u0010XR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010V\u001a\u0005\b\u0087\u0001\u0010XR\u001e\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010V\u001a\u0005\b\u0089\u0001\u0010XR\u001e\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010V\u001a\u0005\b\u008b\u0001\u0010XR\u001d\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u008c\u0001\u0010V\u001a\u0004\bo\u0010XR\u001e\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010V\u001a\u0005\b\u008e\u0001\u0010XR\u001e\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010V\u001a\u0005\b\u0090\u0001\u0010XR\u001d\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0091\u0001\u0010V\u001a\u0004\bu\u0010XR\u001e\u0010&\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010Y\u001a\u0005\b\u0093\u0001\u0010[R\u001e\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010V\u001a\u0005\b\u0095\u0001\u0010XR\u001e\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010V\u001a\u0005\b\u0097\u0001\u0010XR\u001d\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0098\u0001\u0010V\u001a\u0004\b)\u0010XR\u001d\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0099\u0001\u0010V\u001a\u0004\b{\u0010XR\u001e\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010V\u001a\u0005\b\u009b\u0001\u0010XR\u001e\u0010,\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010d\u001a\u0005\b\u009d\u0001\u0010fR\u001e\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010V\u001a\u0005\b\u009f\u0001\u0010XR\u001e\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0001\u0010V\u001a\u0005\b\u0083\u0001\u0010XR\u001e\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¡\u0001\u0010V\u001a\u0005\b\u0084\u0001\u0010XR\u001e\u00100\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¢\u0001\u0010Y\u001a\u0005\b£\u0001\u0010[R\u001e\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¤\u0001\u0010V\u001a\u0005\b¥\u0001\u0010XR\u001e\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¦\u0001\u0010V\u001a\u0005\b\u0086\u0001\u0010XR\u001e\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b§\u0001\u0010V\u001a\u0005\b\u008a\u0001\u0010XR\u001e\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¨\u0001\u0010V\u001a\u0005\b©\u0001\u0010XR\u001e\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bª\u0001\u0010V\u001a\u0005\b«\u0001\u0010XR\u001e\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¬\u0001\u0010V\u001a\u0005\b\u00ad\u0001\u0010XR\u001e\u00107\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b®\u0001\u0010Y\u001a\u0005\b¯\u0001\u0010[R\u001e\u00108\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b°\u0001\u0010Y\u001a\u0005\b±\u0001\u0010[R\u001e\u00109\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b²\u0001\u0010v\u001a\u0005\b³\u0001\u0010xR\u001e\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b´\u0001\u0010V\u001a\u0005\b\u008c\u0001\u0010XR\u001e\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bµ\u0001\u0010V\u001a\u0005\b¶\u0001\u0010XR\u001e\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b·\u0001\u0010V\u001a\u0005\b\u008f\u0001\u0010XR\u001e\u0010=\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¸\u0001\u0010Y\u001a\u0005\b¹\u0001\u0010[R\u001e\u0010>\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bº\u0001\u0010Y\u001a\u0005\b»\u0001\u0010[R\u001e\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¼\u0001\u0010V\u001a\u0005\b½\u0001\u0010XR\u001e\u0010@\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¾\u0001\u0010V\u001a\u0005\b¿\u0001\u0010XR\u001e\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÀ\u0001\u0010V\u001a\u0005\bÁ\u0001\u0010XR\u001e\u0010B\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÂ\u0001\u0010V\u001a\u0005\bÃ\u0001\u0010XR\u001e\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÄ\u0001\u0010V\u001a\u0005\b\u0091\u0001\u0010XR\u001e\u0010D\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÅ\u0001\u0010V\u001a\u0005\bÆ\u0001\u0010XR\u001e\u0010E\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÇ\u0001\u0010V\u001a\u0005\b\u0099\u0001\u0010XR\u001e\u0010F\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÈ\u0001\u0010v\u001a\u0005\bÉ\u0001\u0010xR\u001e\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÊ\u0001\u0010V\u001a\u0005\bË\u0001\u0010XR\u001e\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÌ\u0001\u0010V\u001a\u0005\bÍ\u0001\u0010XR\u001e\u0010I\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÎ\u0001\u0010V\u001a\u0005\bÏ\u0001\u0010XR\u001e\u0010J\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÐ\u0001\u0010V\u001a\u0005\bÑ\u0001\u0010XR\u001e\u0010K\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÒ\u0001\u0010V\u001a\u0005\bÓ\u0001\u0010XR\u001e\u0010L\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÔ\u0001\u0010V\u001a\u0005\bÕ\u0001\u0010XR\u001e\u0010M\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÖ\u0001\u0010V\u001a\u0005\b×\u0001\u0010XR\u001e\u0010N\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bØ\u0001\u0010V\u001a\u0005\bÙ\u0001\u0010XR\u001e\u0010O\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÚ\u0001\u0010V\u001a\u0005\bÛ\u0001\u0010XR\u001e\u0010P\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÜ\u0001\u0010V\u001a\u0005\bÝ\u0001\u0010XR\u001d\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\bÞ\u0001\u0010V\u001a\u0004\by\u0010XR\u001e\u0010R\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bß\u0001\u0010V\u001a\u0005\bà\u0001\u0010X¨\u0006á\u0001"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/m;", "Landroid/os/Parcelable;", "", "acuteChronicWorkloadRatioCapable", "", "applicationKey", "benchmarkExerciseCapable", "cardioCapable", "cardioWorkoutCapable", "courseCapable", "criticalSwimSpeedCapable", "currentFirmwareVersion", "", "currentFirmwareVersionMajor", "customWorkoutCapable", "cyclingHeartRateZoneCapable", "cyclingWorkoutCapable", "datasource", "defaultHeartRateZoneCapable", "", "deviceCategories", "deviceEmbedVideoLink", "", "deviceId", "deviceTags", "deviceVideoPageLink", "displayName", "displayOrder", "emergencyCallingCapable", "enhancedWorkoutStepCapable", "fallDetectionCapable", "floorsClimbedGoalCapable", "golfAppPairingCapable", "golfAppSyncCapable", "groupTrack2Capable", "hasOpticalHeartRate", "hasPowerButton", "hiitWorkoutCapable", "imageUrl", "incidentDetectionCapable", "intensityMinutesGoalCapable", "isPrimaryUser", "lapByCoursePointsCapable", "liveTrackCapable", "minGCMAndroidVersion", "mobilityWorkoutCapable", "multisportWorkoutCapable", "pacebandCapable", "partNumber", "pendingActivityCapable", "pilatesWorkoutCapable", "powerGuidanceCapable", "primary", "primaryActivityTrackerIndicator", "primaryTrainingCapable", "productDisplayName", "productSku", "registeredDate", "ruckingWorkoutCapable", "runningHeartRateZoneCapable", "runningWorkoutCapable", "serialNumber", "shortName", "skipLastRestStepCapable", "sportingEventCapable", "strengthWorkoutCapable", "swimWorkoutCapable", "swimWorkout2Capable", "swimmingHeartRateZoneCapable", "topoActiveMapsRealTimeSettingCapable", "unitId", "walkWorkoutCapable", "weightScale", "wellness", "wheelchairCapable", "wifi", "wifiSetup", "workoutAudioPromptsCapable", "workoutCapable", "yogaCapable", "yogaWorkoutCapable", "inReachServicesCapable", "inReachServicesDirectActivationCapable", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getApplicationKey", "()Ljava/lang/String;", "c", "d", "getCardioCapable", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "getCurrentFirmwareVersionMajor", "()Ljava/lang/Integer;", "j", JWKParameterNames.OCT_KEY_VALUE, "getCyclingHeartRateZoneCapable", "l", "m", "getDatasource", JWKParameterNames.RSA_MODULUS, "getDefaultHeartRateZoneCapable", "o", "Ljava/util/List;", "getDeviceCategories", "()Ljava/util/List;", "p", "getDeviceEmbedVideoLink", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Ljava/lang/Long;", "getDeviceId", "()Ljava/lang/Long;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getDeviceTags", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getDeviceVideoPageLink", "v", "getDisplayName", "w", "getDisplayOrder", "x", "getEmergencyCallingCapable", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "z", "getFallDetectionCapable", "A", "getFloorsClimbedGoalCapable", "B", "getGolfAppPairingCapable", "C", "getGolfAppSyncCapable", "D", "E", "getHasOpticalHeartRate", "F", "getHasPowerButton", "I", "P", "getImageUrl", "T", "getIncidentDetectionCapable", "X", "getIntensityMinutesGoalCapable", "Y", "Z", "k0", "getLiveTrackCapable", "H0", "getMinGCMAndroidVersion", "I0", "u", "J0", "K0", "L0", "getPartNumber", "M0", "getPendingActivityCapable", "N0", "O0", "P0", "getPrimary", "Q0", "getPrimaryActivityTrackerIndicator", "R0", "getPrimaryTrainingCapable", "S0", "getProductDisplayName", "T0", "getProductSku", "U0", "getRegisteredDate", "V0", "W0", "getRunningHeartRateZoneCapable", "X0", "Y0", "getSerialNumber", "Z0", "getShortName", "a1", "G", "b1", "getSportingEventCapable", "c1", "H", "d1", "M", "e1", "f1", "getSwimmingHeartRateZoneCapable", "g1", "h1", "a0", "i1", "c0", "j1", "getWeightScale", "k1", "getWellness", "l1", "e0", "m1", "getWifi", "n1", "getWifiSetup", "o1", "f0", "p1", "g0", "q1", "getYogaCapable", "r1", "h0", "s1", "t1", "s", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("floorsClimbedGoalCapable")
    private final Boolean floorsClimbedGoalCapable;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("golfAppPairingCapable")
    private final Boolean golfAppPairingCapable;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("golfAppSyncCapable")
    private final Boolean golfAppSyncCapable;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("groupTrack2Capable")
    private final Boolean groupTrack2Capable;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("hasOpticalHeartRate")
    private final Boolean hasOpticalHeartRate;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("hasPowerButton")
    private final Boolean hasPowerButton;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("minGCMAndroidVersion")
    private final Integer minGCMAndroidVersion;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("hiitWorkoutCapable")
    private final Boolean hiitWorkoutCapable;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("mobilityWorkoutCapable")
    private final Boolean mobilityWorkoutCapable;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @SerializedName("multisportWorkoutCapable")
    private final Boolean multisportWorkoutCapable;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @SerializedName("pacebandCapable")
    private final Boolean pacebandCapable;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @SerializedName("partNumber")
    private final String partNumber;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @SerializedName("pendingActivityCapable")
    private final Boolean pendingActivityCapable;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @SerializedName("pilatesWorkoutCapable")
    private final Boolean pilatesWorkoutCapable;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @SerializedName("powerGuidanceCapable")
    private final Boolean powerGuidanceCapable;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @SerializedName("primary")
    private final Boolean primary;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @SerializedName("primaryActivityTrackerIndicator")
    private final Boolean primaryActivityTrackerIndicator;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @SerializedName("primaryTrainingCapable")
    private final Boolean primaryTrainingCapable;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @SerializedName("productDisplayName")
    private final String productDisplayName;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("incidentDetectionCapable")
    private final Boolean incidentDetectionCapable;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @SerializedName("productSku")
    private final String productSku;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @SerializedName("registeredDate")
    private final Long registeredDate;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @SerializedName("ruckingWorkoutsCapable")
    private final Boolean ruckingWorkoutCapable;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @SerializedName("runningHeartRateZoneCapable")
    private final Boolean runningHeartRateZoneCapable;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("intensityMinutesGoalCapable")
    private final Boolean intensityMinutesGoalCapable;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    @SerializedName("runningWorkoutCapable")
    private final Boolean runningWorkoutCapable;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("isPrimaryUser")
    private final Boolean isPrimaryUser;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    @SerializedName("serialNumber")
    private final String serialNumber;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("lapByCoursePointsCapable")
    private final Boolean lapByCoursePointsCapable;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @SerializedName("shortName")
    private final String shortName;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acuteChronicWorkloadRatioCapable")
    private final Boolean acuteChronicWorkloadRatioCapable;

    /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("skipLastWorkoutStepInRepeatBlockCapable")
    private final Boolean skipLastRestStepCapable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationKey")
    private final String applicationKey;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportingEventCapable")
    private final Boolean sportingEventCapable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("benchmarkExerciseCapable")
    private final Boolean benchmarkExerciseCapable;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("strengthWorkoutCapable")
    private final Boolean strengthWorkoutCapable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardioCapable")
    private final Boolean cardioCapable;

    /* JADX INFO: renamed from: d1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("swimWorkoutCapable")
    private final Boolean swimWorkoutCapable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardioWorkoutCapable")
    private final Boolean cardioWorkoutCapable;

    /* JADX INFO: renamed from: e1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("swimWorkout2Capable")
    private final Boolean swimWorkout2Capable;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseCapable")
    private final Boolean courseCapable;

    /* JADX INFO: renamed from: f1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("swimmingHeartRateZoneCapable")
    private final Boolean swimmingHeartRateZoneCapable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("criticalSwimSpeedCapable")
    private final Boolean criticalSwimSpeedCapable;

    /* JADX INFO: renamed from: g1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("topoactiveMapsRealTimeSettingCapable")
    private final Boolean topoActiveMapsRealTimeSettingCapable;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentFirmwareVersion")
    private final String currentFirmwareVersion;

    /* JADX INFO: renamed from: h1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitId")
    private final Long unitId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentFirmwareVersionMajor")
    private final Integer currentFirmwareVersionMajor;

    /* JADX INFO: renamed from: i1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("walkWorkoutCapable")
    private final Boolean walkWorkoutCapable;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("customWorkoutCapable")
    private final Boolean customWorkoutCapable;

    /* JADX INFO: renamed from: j1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightScale")
    private final Boolean weightScale;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cyclingHeartRateZoneCapable")
    private final Boolean cyclingHeartRateZoneCapable;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveTrackCapable")
    private final Boolean liveTrackCapable;

    /* JADX INFO: renamed from: k1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellness")
    private final Boolean wellness;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cyclingWorkoutCapable")
    private final Boolean cyclingWorkoutCapable;

    /* JADX INFO: renamed from: l1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wheelchairCapable")
    private final Boolean wheelchairCapable;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("datasource")
    private final String datasource;

    /* JADX INFO: renamed from: m1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wifi")
    private final Boolean wifi;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultHeartRateZoneCapable")
    private final Boolean defaultHeartRateZoneCapable;

    /* JADX INFO: renamed from: n1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wifiSetup")
    private final Boolean wifiSetup;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceCategories")
    private final List<String> deviceCategories;

    /* JADX INFO: renamed from: o1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutAudioPromptsCapable")
    private final Boolean workoutAudioPromptsCapable;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceEmbedVideoLink")
    private final String deviceEmbedVideoLink;

    /* JADX INFO: renamed from: p1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutCapable")
    private final Boolean workoutCapable;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final Long deviceId;

    /* JADX INFO: renamed from: q1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("yogaCapable")
    private final Boolean yogaCapable;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceTags")
    private final List<String> deviceTags;

    /* JADX INFO: renamed from: r1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("yogaWorkoutCapable")
    private final Boolean yogaWorkoutCapable;

    /* JADX INFO: renamed from: s1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inReachServicesCapable")
    private final Boolean inReachServicesCapable;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceVideoPageLink")
    private final String deviceVideoPageLink;

    /* JADX INFO: renamed from: t1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inReachServicesDirectActivationCapable")
    private final Boolean inReachServicesDirectActivationCapable;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayOrder")
    private final Integer displayOrder;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("emergencyCallingCapable")
    private final Boolean emergencyCallingCapable;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enhancedWorkoutStepCapable")
    private final Boolean enhancedWorkoutStepCapable;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fallDetectionCapable")
    private final Boolean fallDetectionCapable;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Boolean boolValueOf8;
            Boolean boolValueOf9;
            Boolean bool;
            Boolean boolValueOf10;
            Boolean boolValueOf11;
            Boolean boolValueOf12;
            Boolean boolValueOf13;
            Boolean boolValueOf14;
            Boolean boolValueOf15;
            Boolean boolValueOf16;
            Boolean boolValueOf17;
            Boolean boolValueOf18;
            Boolean boolValueOf19;
            Boolean boolValueOf20;
            Boolean boolValueOf21;
            Boolean boolValueOf22;
            Boolean boolValueOf23;
            Boolean boolValueOf24;
            Boolean boolValueOf25;
            Boolean boolValueOf26;
            Boolean boolValueOf27;
            Boolean boolValueOf28;
            Boolean boolValueOf29;
            Boolean boolValueOf30;
            Boolean boolValueOf31;
            Boolean boolValueOf32;
            Boolean boolValueOf33;
            Boolean boolValueOf34;
            Boolean bool2;
            Boolean boolValueOf35;
            Boolean boolValueOf36;
            Boolean boolValueOf37;
            Boolean bool3;
            Boolean boolValueOf38;
            Boolean boolValueOf39;
            Boolean boolValueOf40;
            Boolean boolValueOf41;
            Boolean boolValueOf42;
            Boolean boolValueOf43;
            Boolean boolValueOf44;
            Boolean boolValueOf45;
            Boolean boolValueOf46;
            Boolean boolValueOf47;
            Boolean boolValueOf48;
            Boolean boolValueOf49;
            Boolean boolValueOf50;
            Boolean boolValueOf51;
            Boolean boolValueOf52;
            Boolean boolValueOf53;
            Boolean boolValueOf54;
            Boolean boolValueOf55;
            Boolean bool4;
            Boolean boolValueOf56;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool5 = boolValueOf4;
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf8 = null;
            } else {
                boolValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf9 = null;
                bool = null;
            } else {
                boolValueOf9 = Boolean.valueOf(parcel.readInt() != 0);
                bool = null;
            }
            Boolean bool6 = boolValueOf3;
            Boolean bool7 = boolValueOf6;
            Boolean bool8 = boolValueOf7;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf10 = bool;
            } else {
                boolValueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool9 = boolValueOf2;
            Boolean bool10 = boolValueOf5;
            Integer num = numValueOf;
            Boolean bool11 = boolValueOf9;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Boolean bool12 = bool;
            String string4 = parcel.readString();
            Object objValueOf = parcel.readInt() == 0 ? bool12 : Long.valueOf(parcel.readLong());
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string5 = parcel.readString();
            Boolean bool13 = boolValueOf8;
            Boolean bool14 = boolValueOf10;
            Long l14 = objValueOf;
            String string6 = parcel.readString();
            Object objValueOf2 = parcel.readInt() == 0 ? bool12 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf11 = bool12;
            } else {
                boolValueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf12 = bool12;
            } else {
                boolValueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf13 = bool12;
            } else {
                boolValueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf14 = bool12;
            } else {
                boolValueOf14 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf15 = bool12;
            } else {
                boolValueOf15 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf16 = bool12;
            } else {
                boolValueOf16 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf17 = bool12;
            } else {
                boolValueOf17 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf18 = bool12;
            } else {
                boolValueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf19 = bool12;
            } else {
                boolValueOf19 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf20 = bool12;
            } else {
                boolValueOf20 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool15 = boolValueOf12;
            Boolean bool16 = boolValueOf15;
            Boolean bool17 = boolValueOf18;
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf21 = bool12;
            } else {
                boolValueOf21 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf22 = bool12;
            } else {
                boolValueOf22 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf23 = bool12;
            } else {
                boolValueOf23 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf24 = bool12;
            } else {
                boolValueOf24 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf25 = bool12;
            } else {
                boolValueOf25 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object objValueOf3 = parcel.readInt() == 0 ? bool12 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf26 = bool12;
            } else {
                boolValueOf26 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf27 = bool12;
            } else {
                boolValueOf27 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf28 = bool12;
            } else {
                boolValueOf28 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer num2 = objValueOf2;
            Boolean bool18 = boolValueOf13;
            Boolean bool19 = boolValueOf16;
            Boolean bool20 = boolValueOf19;
            Boolean bool21 = boolValueOf21;
            Boolean bool22 = boolValueOf24;
            Boolean bool23 = boolValueOf26;
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf29 = bool12;
            } else {
                boolValueOf29 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf30 = bool12;
            } else {
                boolValueOf30 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf31 = bool12;
            } else {
                boolValueOf31 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf32 = bool12;
            } else {
                boolValueOf32 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf33 = bool12;
            } else {
                boolValueOf33 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf34 = bool12;
                bool2 = boolValueOf34;
            } else {
                boolValueOf34 = Boolean.valueOf(parcel.readInt() != 0);
                bool2 = bool12;
            }
            Boolean bool24 = boolValueOf11;
            Boolean bool25 = boolValueOf14;
            Boolean bool26 = boolValueOf17;
            Boolean bool27 = boolValueOf20;
            Boolean bool28 = boolValueOf22;
            Boolean bool29 = boolValueOf25;
            Boolean bool30 = boolValueOf27;
            Boolean bool31 = boolValueOf29;
            Boolean bool32 = boolValueOf32;
            String string9 = parcel.readString();
            Boolean bool33 = boolValueOf23;
            Integer num3 = objValueOf3;
            Boolean bool34 = boolValueOf28;
            Boolean bool35 = boolValueOf30;
            Boolean bool36 = boolValueOf33;
            String string10 = parcel.readString();
            Object objValueOf4 = parcel.readInt() == 0 ? bool2 : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf35 = bool2;
            } else {
                boolValueOf35 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf36 = bool2;
            } else {
                boolValueOf36 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf37 = bool2;
                bool3 = boolValueOf37;
            } else {
                boolValueOf37 = Boolean.valueOf(parcel.readInt() != 0);
                bool3 = bool2;
            }
            Boolean bool37 = boolValueOf35;
            String string11 = parcel.readString();
            boolean z14 = false;
            Boolean bool38 = boolValueOf36;
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf38 = bool3;
            } else {
                boolValueOf38 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf39 = bool3;
            } else {
                boolValueOf39 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf40 = bool3;
            } else {
                boolValueOf40 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf41 = bool3;
            } else {
                boolValueOf41 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf42 = bool3;
            } else {
                boolValueOf42 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf43 = bool3;
            } else {
                boolValueOf43 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf44 = bool3;
            } else {
                boolValueOf44 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object objValueOf5 = parcel.readInt() == 0 ? bool3 : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf45 = bool3;
            } else {
                boolValueOf45 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf46 = bool3;
            } else {
                boolValueOf46 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf47 = bool3;
            } else {
                boolValueOf47 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf48 = bool3;
            } else {
                boolValueOf48 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf49 = bool3;
            } else {
                boolValueOf49 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf50 = bool3;
            } else {
                boolValueOf50 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf51 = bool3;
            } else {
                boolValueOf51 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf52 = bool3;
            } else {
                boolValueOf52 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf53 = bool3;
            } else {
                boolValueOf53 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf54 = bool3;
            } else {
                boolValueOf54 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf55 = bool3;
            } else {
                boolValueOf55 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                Boolean bool39 = boolValueOf53;
                boolValueOf56 = bool3;
                bool4 = bool39;
            } else {
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                bool4 = boolValueOf53;
                boolValueOf56 = Boolean.valueOf(z14);
            }
            return new m(boolValueOf, string, bool9, bool6, bool5, bool10, bool7, string2, num, bool8, bool13, bool11, string3, bool14, arrayListCreateStringArrayList, string4, l14, arrayListCreateStringArrayList2, string5, string6, num2, bool24, bool15, bool18, bool25, bool16, bool19, bool26, bool17, bool20, bool27, string7, bool21, bool28, bool33, bool22, bool29, num3, bool23, bool30, bool34, string8, bool31, bool35, boolValueOf31, bool32, bool36, boolValueOf34, string9, string10, objValueOf4, bool37, bool38, boolValueOf37, string11, string12, boolValueOf38, boolValueOf39, boolValueOf40, boolValueOf41, boolValueOf42, boolValueOf43, boolValueOf44, objValueOf5, boolValueOf45, boolValueOf46, boolValueOf47, boolValueOf48, boolValueOf49, boolValueOf50, boolValueOf51, boolValueOf52, bool4, boolValueOf54, boolValueOf55, boolValueOf56);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public m(Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str2, Integer num, Boolean bool7, Boolean bool8, Boolean bool9, String str3, Boolean bool10, List<String> list, String str4, Long l14, List<String> list2, String str5, String str6, Integer num2, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, String str7, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Integer num3, Boolean bool26, Boolean bool27, Boolean bool28, String str8, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, String str9, String str10, Long l15, Boolean bool35, Boolean bool36, Boolean bool37, String str11, String str12, Boolean bool38, Boolean bool39, Boolean bool40, Boolean bool41, Boolean bool42, Boolean bool43, Boolean bool44, Long l16, Boolean bool45, Boolean bool46, Boolean bool47, Boolean bool48, Boolean bool49, Boolean bool50, Boolean bool51, Boolean bool52, Boolean bool53, Boolean bool54, Boolean bool55, Boolean bool56) {
        this.acuteChronicWorkloadRatioCapable = bool;
        this.applicationKey = str;
        this.benchmarkExerciseCapable = bool2;
        this.cardioCapable = bool3;
        this.cardioWorkoutCapable = bool4;
        this.courseCapable = bool5;
        this.criticalSwimSpeedCapable = bool6;
        this.currentFirmwareVersion = str2;
        this.currentFirmwareVersionMajor = num;
        this.customWorkoutCapable = bool7;
        this.cyclingHeartRateZoneCapable = bool8;
        this.cyclingWorkoutCapable = bool9;
        this.datasource = str3;
        this.defaultHeartRateZoneCapable = bool10;
        this.deviceCategories = list;
        this.deviceEmbedVideoLink = str4;
        this.deviceId = l14;
        this.deviceTags = list2;
        this.deviceVideoPageLink = str5;
        this.displayName = str6;
        this.displayOrder = num2;
        this.emergencyCallingCapable = bool11;
        this.enhancedWorkoutStepCapable = bool12;
        this.fallDetectionCapable = bool13;
        this.floorsClimbedGoalCapable = bool14;
        this.golfAppPairingCapable = bool15;
        this.golfAppSyncCapable = bool16;
        this.groupTrack2Capable = bool17;
        this.hasOpticalHeartRate = bool18;
        this.hasPowerButton = bool19;
        this.hiitWorkoutCapable = bool20;
        this.imageUrl = str7;
        this.incidentDetectionCapable = bool21;
        this.intensityMinutesGoalCapable = bool22;
        this.isPrimaryUser = bool23;
        this.lapByCoursePointsCapable = bool24;
        this.liveTrackCapable = bool25;
        this.minGCMAndroidVersion = num3;
        this.mobilityWorkoutCapable = bool26;
        this.multisportWorkoutCapable = bool27;
        this.pacebandCapable = bool28;
        this.partNumber = str8;
        this.pendingActivityCapable = bool29;
        this.pilatesWorkoutCapable = bool30;
        this.powerGuidanceCapable = bool31;
        this.primary = bool32;
        this.primaryActivityTrackerIndicator = bool33;
        this.primaryTrainingCapable = bool34;
        this.productDisplayName = str9;
        this.productSku = str10;
        this.registeredDate = l15;
        this.ruckingWorkoutCapable = bool35;
        this.runningHeartRateZoneCapable = bool36;
        this.runningWorkoutCapable = bool37;
        this.serialNumber = str11;
        this.shortName = str12;
        this.skipLastRestStepCapable = bool38;
        this.sportingEventCapable = bool39;
        this.strengthWorkoutCapable = bool40;
        this.swimWorkoutCapable = bool41;
        this.swimWorkout2Capable = bool42;
        this.swimmingHeartRateZoneCapable = bool43;
        this.topoActiveMapsRealTimeSettingCapable = bool44;
        this.unitId = l16;
        this.walkWorkoutCapable = bool45;
        this.weightScale = bool46;
        this.wellness = bool47;
        this.wheelchairCapable = bool48;
        this.wifi = bool49;
        this.wifiSetup = bool50;
        this.workoutAudioPromptsCapable = bool51;
        this.workoutCapable = bool52;
        this.yogaCapable = bool53;
        this.yogaWorkoutCapable = bool54;
        this.inReachServicesCapable = bool55;
        this.inReachServicesDirectActivationCapable = bool56;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Boolean getPilatesWorkoutCapable() {
        return this.pilatesWorkoutCapable;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Boolean getPowerGuidanceCapable() {
        return this.powerGuidanceCapable;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Boolean getRuckingWorkoutCapable() {
        return this.ruckingWorkoutCapable;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Boolean getRunningWorkoutCapable() {
        return this.runningWorkoutCapable;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Boolean getSkipLastRestStepCapable() {
        return this.skipLastRestStepCapable;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Boolean getStrengthWorkoutCapable() {
        return this.strengthWorkoutCapable;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Boolean getSwimWorkout2Capable() {
        return this.swimWorkout2Capable;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final Boolean getSwimWorkoutCapable() {
        return this.swimWorkoutCapable;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final Boolean getTopoActiveMapsRealTimeSettingCapable() {
        return this.topoActiveMapsRealTimeSettingCapable;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Long getUnitId() {
        return this.unitId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAcuteChronicWorkloadRatioCapable() {
        return this.acuteChronicWorkloadRatioCapable;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final Boolean getWalkWorkoutCapable() {
        return this.walkWorkoutCapable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getBenchmarkExerciseCapable() {
        return this.benchmarkExerciseCapable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Boolean getWheelchairCapable() {
        return this.wheelchairCapable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this.acuteChronicWorkloadRatioCapable, mVar.acuteChronicWorkloadRatioCapable) && p005kotlin.jvm.internal.s.g(this.applicationKey, mVar.applicationKey) && p005kotlin.jvm.internal.s.g(this.benchmarkExerciseCapable, mVar.benchmarkExerciseCapable) && p005kotlin.jvm.internal.s.g(this.cardioCapable, mVar.cardioCapable) && p005kotlin.jvm.internal.s.g(this.cardioWorkoutCapable, mVar.cardioWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.courseCapable, mVar.courseCapable) && p005kotlin.jvm.internal.s.g(this.criticalSwimSpeedCapable, mVar.criticalSwimSpeedCapable) && p005kotlin.jvm.internal.s.g(this.currentFirmwareVersion, mVar.currentFirmwareVersion) && p005kotlin.jvm.internal.s.g(this.currentFirmwareVersionMajor, mVar.currentFirmwareVersionMajor) && p005kotlin.jvm.internal.s.g(this.customWorkoutCapable, mVar.customWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.cyclingHeartRateZoneCapable, mVar.cyclingHeartRateZoneCapable) && p005kotlin.jvm.internal.s.g(this.cyclingWorkoutCapable, mVar.cyclingWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.datasource, mVar.datasource) && p005kotlin.jvm.internal.s.g(this.defaultHeartRateZoneCapable, mVar.defaultHeartRateZoneCapable) && p005kotlin.jvm.internal.s.g(this.deviceCategories, mVar.deviceCategories) && p005kotlin.jvm.internal.s.g(this.deviceEmbedVideoLink, mVar.deviceEmbedVideoLink) && p005kotlin.jvm.internal.s.g(this.deviceId, mVar.deviceId) && p005kotlin.jvm.internal.s.g(this.deviceTags, mVar.deviceTags) && p005kotlin.jvm.internal.s.g(this.deviceVideoPageLink, mVar.deviceVideoPageLink) && p005kotlin.jvm.internal.s.g(this.displayName, mVar.displayName) && p005kotlin.jvm.internal.s.g(this.displayOrder, mVar.displayOrder) && p005kotlin.jvm.internal.s.g(this.emergencyCallingCapable, mVar.emergencyCallingCapable) && p005kotlin.jvm.internal.s.g(this.enhancedWorkoutStepCapable, mVar.enhancedWorkoutStepCapable) && p005kotlin.jvm.internal.s.g(this.fallDetectionCapable, mVar.fallDetectionCapable) && p005kotlin.jvm.internal.s.g(this.floorsClimbedGoalCapable, mVar.floorsClimbedGoalCapable) && p005kotlin.jvm.internal.s.g(this.golfAppPairingCapable, mVar.golfAppPairingCapable) && p005kotlin.jvm.internal.s.g(this.golfAppSyncCapable, mVar.golfAppSyncCapable) && p005kotlin.jvm.internal.s.g(this.groupTrack2Capable, mVar.groupTrack2Capable) && p005kotlin.jvm.internal.s.g(this.hasOpticalHeartRate, mVar.hasOpticalHeartRate) && p005kotlin.jvm.internal.s.g(this.hasPowerButton, mVar.hasPowerButton) && p005kotlin.jvm.internal.s.g(this.hiitWorkoutCapable, mVar.hiitWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.imageUrl, mVar.imageUrl) && p005kotlin.jvm.internal.s.g(this.incidentDetectionCapable, mVar.incidentDetectionCapable) && p005kotlin.jvm.internal.s.g(this.intensityMinutesGoalCapable, mVar.intensityMinutesGoalCapable) && p005kotlin.jvm.internal.s.g(this.isPrimaryUser, mVar.isPrimaryUser) && p005kotlin.jvm.internal.s.g(this.lapByCoursePointsCapable, mVar.lapByCoursePointsCapable) && p005kotlin.jvm.internal.s.g(this.liveTrackCapable, mVar.liveTrackCapable) && p005kotlin.jvm.internal.s.g(this.minGCMAndroidVersion, mVar.minGCMAndroidVersion) && p005kotlin.jvm.internal.s.g(this.mobilityWorkoutCapable, mVar.mobilityWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.multisportWorkoutCapable, mVar.multisportWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.pacebandCapable, mVar.pacebandCapable) && p005kotlin.jvm.internal.s.g(this.partNumber, mVar.partNumber) && p005kotlin.jvm.internal.s.g(this.pendingActivityCapable, mVar.pendingActivityCapable) && p005kotlin.jvm.internal.s.g(this.pilatesWorkoutCapable, mVar.pilatesWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.powerGuidanceCapable, mVar.powerGuidanceCapable) && p005kotlin.jvm.internal.s.g(this.primary, mVar.primary) && p005kotlin.jvm.internal.s.g(this.primaryActivityTrackerIndicator, mVar.primaryActivityTrackerIndicator) && p005kotlin.jvm.internal.s.g(this.primaryTrainingCapable, mVar.primaryTrainingCapable) && p005kotlin.jvm.internal.s.g(this.productDisplayName, mVar.productDisplayName) && p005kotlin.jvm.internal.s.g(this.productSku, mVar.productSku) && p005kotlin.jvm.internal.s.g(this.registeredDate, mVar.registeredDate) && p005kotlin.jvm.internal.s.g(this.ruckingWorkoutCapable, mVar.ruckingWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.runningHeartRateZoneCapable, mVar.runningHeartRateZoneCapable) && p005kotlin.jvm.internal.s.g(this.runningWorkoutCapable, mVar.runningWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.serialNumber, mVar.serialNumber) && p005kotlin.jvm.internal.s.g(this.shortName, mVar.shortName) && p005kotlin.jvm.internal.s.g(this.skipLastRestStepCapable, mVar.skipLastRestStepCapable) && p005kotlin.jvm.internal.s.g(this.sportingEventCapable, mVar.sportingEventCapable) && p005kotlin.jvm.internal.s.g(this.strengthWorkoutCapable, mVar.strengthWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.swimWorkoutCapable, mVar.swimWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.swimWorkout2Capable, mVar.swimWorkout2Capable) && p005kotlin.jvm.internal.s.g(this.swimmingHeartRateZoneCapable, mVar.swimmingHeartRateZoneCapable) && p005kotlin.jvm.internal.s.g(this.topoActiveMapsRealTimeSettingCapable, mVar.topoActiveMapsRealTimeSettingCapable) && p005kotlin.jvm.internal.s.g(this.unitId, mVar.unitId) && p005kotlin.jvm.internal.s.g(this.walkWorkoutCapable, mVar.walkWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.weightScale, mVar.weightScale) && p005kotlin.jvm.internal.s.g(this.wellness, mVar.wellness) && p005kotlin.jvm.internal.s.g(this.wheelchairCapable, mVar.wheelchairCapable) && p005kotlin.jvm.internal.s.g(this.wifi, mVar.wifi) && p005kotlin.jvm.internal.s.g(this.wifiSetup, mVar.wifiSetup) && p005kotlin.jvm.internal.s.g(this.workoutAudioPromptsCapable, mVar.workoutAudioPromptsCapable) && p005kotlin.jvm.internal.s.g(this.workoutCapable, mVar.workoutCapable) && p005kotlin.jvm.internal.s.g(this.yogaCapable, mVar.yogaCapable) && p005kotlin.jvm.internal.s.g(this.yogaWorkoutCapable, mVar.yogaWorkoutCapable) && p005kotlin.jvm.internal.s.g(this.inReachServicesCapable, mVar.inReachServicesCapable) && p005kotlin.jvm.internal.s.g(this.inReachServicesDirectActivationCapable, mVar.inReachServicesDirectActivationCapable);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getCardioWorkoutCapable() {
        return this.cardioWorkoutCapable;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final Boolean getWorkoutAudioPromptsCapable() {
        return this.workoutAudioPromptsCapable;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getCourseCapable() {
        return this.courseCapable;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final Boolean getWorkoutCapable() {
        return this.workoutCapable;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getCriticalSwimSpeedCapable() {
        return this.criticalSwimSpeedCapable;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final Boolean getYogaWorkoutCapable() {
        return this.yogaWorkoutCapable;
    }

    public final int hashCode() {
        Boolean bool = this.acuteChronicWorkloadRatioCapable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.applicationKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.benchmarkExerciseCapable;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.cardioCapable;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.cardioWorkoutCapable;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.courseCapable;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.criticalSwimSpeedCapable;
        int iHashCode7 = (iHashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str2 = this.currentFirmwareVersion;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.currentFirmwareVersionMajor;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool7 = this.customWorkoutCapable;
        int iHashCode10 = (iHashCode9 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.cyclingHeartRateZoneCapable;
        int iHashCode11 = (iHashCode10 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.cyclingWorkoutCapable;
        int iHashCode12 = (iHashCode11 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str3 = this.datasource;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool10 = this.defaultHeartRateZoneCapable;
        int iHashCode14 = (iHashCode13 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        List<String> list = this.deviceCategories;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.deviceEmbedVideoLink;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l14 = this.deviceId;
        int iHashCode17 = (iHashCode16 + (l14 == null ? 0 : l14.hashCode())) * 31;
        List<String> list2 = this.deviceTags;
        int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.deviceVideoPageLink;
        int iHashCode19 = (iHashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayName;
        int iHashCode20 = (iHashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.displayOrder;
        int iHashCode21 = (iHashCode20 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool11 = this.emergencyCallingCapable;
        int iHashCode22 = (iHashCode21 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.enhancedWorkoutStepCapable;
        int iHashCode23 = (iHashCode22 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.fallDetectionCapable;
        int iHashCode24 = (iHashCode23 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.floorsClimbedGoalCapable;
        int iHashCode25 = (iHashCode24 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.golfAppPairingCapable;
        int iHashCode26 = (iHashCode25 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.golfAppSyncCapable;
        int iHashCode27 = (iHashCode26 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.groupTrack2Capable;
        int iHashCode28 = (iHashCode27 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.hasOpticalHeartRate;
        int iHashCode29 = (iHashCode28 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.hasPowerButton;
        int iHashCode30 = (iHashCode29 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.hiitWorkoutCapable;
        int iHashCode31 = (iHashCode30 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        String str7 = this.imageUrl;
        int iHashCode32 = (iHashCode31 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool21 = this.incidentDetectionCapable;
        int iHashCode33 = (iHashCode32 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.intensityMinutesGoalCapable;
        int iHashCode34 = (iHashCode33 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.isPrimaryUser;
        int iHashCode35 = (iHashCode34 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.lapByCoursePointsCapable;
        int iHashCode36 = (iHashCode35 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        Boolean bool25 = this.liveTrackCapable;
        int iHashCode37 = (iHashCode36 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Integer num3 = this.minGCMAndroidVersion;
        int iHashCode38 = (iHashCode37 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool26 = this.mobilityWorkoutCapable;
        int iHashCode39 = (iHashCode38 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        Boolean bool27 = this.multisportWorkoutCapable;
        int iHashCode40 = (iHashCode39 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        Boolean bool28 = this.pacebandCapable;
        int iHashCode41 = (iHashCode40 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        String str8 = this.partNumber;
        int iHashCode42 = (iHashCode41 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool29 = this.pendingActivityCapable;
        int iHashCode43 = (iHashCode42 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Boolean bool30 = this.pilatesWorkoutCapable;
        int iHashCode44 = (iHashCode43 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        Boolean bool31 = this.powerGuidanceCapable;
        int iHashCode45 = (iHashCode44 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        Boolean bool32 = this.primary;
        int iHashCode46 = (iHashCode45 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        Boolean bool33 = this.primaryActivityTrackerIndicator;
        int iHashCode47 = (iHashCode46 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        Boolean bool34 = this.primaryTrainingCapable;
        int iHashCode48 = (iHashCode47 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        String str9 = this.productDisplayName;
        int iHashCode49 = (iHashCode48 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.productSku;
        int iHashCode50 = (iHashCode49 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l15 = this.registeredDate;
        int iHashCode51 = (iHashCode50 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Boolean bool35 = this.ruckingWorkoutCapable;
        int iHashCode52 = (iHashCode51 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        Boolean bool36 = this.runningHeartRateZoneCapable;
        int iHashCode53 = (iHashCode52 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
        Boolean bool37 = this.runningWorkoutCapable;
        int iHashCode54 = (iHashCode53 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
        String str11 = this.serialNumber;
        int iHashCode55 = (iHashCode54 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.shortName;
        int iHashCode56 = (iHashCode55 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool38 = this.skipLastRestStepCapable;
        int iHashCode57 = (iHashCode56 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
        Boolean bool39 = this.sportingEventCapable;
        int iHashCode58 = (iHashCode57 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
        Boolean bool40 = this.strengthWorkoutCapable;
        int iHashCode59 = (iHashCode58 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
        Boolean bool41 = this.swimWorkoutCapable;
        int iHashCode60 = (iHashCode59 + (bool41 == null ? 0 : bool41.hashCode())) * 31;
        Boolean bool42 = this.swimWorkout2Capable;
        int iHashCode61 = (iHashCode60 + (bool42 == null ? 0 : bool42.hashCode())) * 31;
        Boolean bool43 = this.swimmingHeartRateZoneCapable;
        int iHashCode62 = (iHashCode61 + (bool43 == null ? 0 : bool43.hashCode())) * 31;
        Boolean bool44 = this.topoActiveMapsRealTimeSettingCapable;
        int iHashCode63 = (iHashCode62 + (bool44 == null ? 0 : bool44.hashCode())) * 31;
        Long l16 = this.unitId;
        int iHashCode64 = (iHashCode63 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Boolean bool45 = this.walkWorkoutCapable;
        int iHashCode65 = (iHashCode64 + (bool45 == null ? 0 : bool45.hashCode())) * 31;
        Boolean bool46 = this.weightScale;
        int iHashCode66 = (iHashCode65 + (bool46 == null ? 0 : bool46.hashCode())) * 31;
        Boolean bool47 = this.wellness;
        int iHashCode67 = (iHashCode66 + (bool47 == null ? 0 : bool47.hashCode())) * 31;
        Boolean bool48 = this.wheelchairCapable;
        int iHashCode68 = (iHashCode67 + (bool48 == null ? 0 : bool48.hashCode())) * 31;
        Boolean bool49 = this.wifi;
        int iHashCode69 = (iHashCode68 + (bool49 == null ? 0 : bool49.hashCode())) * 31;
        Boolean bool50 = this.wifiSetup;
        int iHashCode70 = (iHashCode69 + (bool50 == null ? 0 : bool50.hashCode())) * 31;
        Boolean bool51 = this.workoutAudioPromptsCapable;
        int iHashCode71 = (iHashCode70 + (bool51 == null ? 0 : bool51.hashCode())) * 31;
        Boolean bool52 = this.workoutCapable;
        int iHashCode72 = (iHashCode71 + (bool52 == null ? 0 : bool52.hashCode())) * 31;
        Boolean bool53 = this.yogaCapable;
        int iHashCode73 = (iHashCode72 + (bool53 == null ? 0 : bool53.hashCode())) * 31;
        Boolean bool54 = this.yogaWorkoutCapable;
        int iHashCode74 = (iHashCode73 + (bool54 == null ? 0 : bool54.hashCode())) * 31;
        Boolean bool55 = this.inReachServicesCapable;
        int iHashCode75 = (iHashCode74 + (bool55 == null ? 0 : bool55.hashCode())) * 31;
        Boolean bool56 = this.inReachServicesDirectActivationCapable;
        return iHashCode75 + (bool56 != null ? bool56.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCurrentFirmwareVersion() {
        return this.currentFirmwareVersion;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getCustomWorkoutCapable() {
        return this.customWorkoutCapable;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getCyclingWorkoutCapable() {
        return this.cyclingWorkoutCapable;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getEnhancedWorkoutStepCapable() {
        return this.enhancedWorkoutStepCapable;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Boolean getGroupTrack2Capable() {
        return this.groupTrack2Capable;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getHiitWorkoutCapable() {
        return this.hiitWorkoutCapable;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Boolean getInReachServicesCapable() {
        return this.inReachServicesCapable;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Boolean getInReachServicesDirectActivationCapable() {
        return this.inReachServicesDirectActivationCapable;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Boolean getLapByCoursePointsCapable() {
        return this.lapByCoursePointsCapable;
    }

    public final String toString() {
        Boolean bool = this.acuteChronicWorkloadRatioCapable;
        String str = this.applicationKey;
        Boolean bool2 = this.benchmarkExerciseCapable;
        Boolean bool3 = this.cardioCapable;
        Boolean bool4 = this.cardioWorkoutCapable;
        Boolean bool5 = this.courseCapable;
        Boolean bool6 = this.criticalSwimSpeedCapable;
        String str2 = this.currentFirmwareVersion;
        Integer num = this.currentFirmwareVersionMajor;
        Boolean bool7 = this.customWorkoutCapable;
        Boolean bool8 = this.cyclingHeartRateZoneCapable;
        Boolean bool9 = this.cyclingWorkoutCapable;
        String str3 = this.datasource;
        Boolean bool10 = this.defaultHeartRateZoneCapable;
        List<String> list = this.deviceCategories;
        String str4 = this.deviceEmbedVideoLink;
        Long l14 = this.deviceId;
        List<String> list2 = this.deviceTags;
        String str5 = this.deviceVideoPageLink;
        String str6 = this.displayName;
        Integer num2 = this.displayOrder;
        Boolean bool11 = this.emergencyCallingCapable;
        Boolean bool12 = this.enhancedWorkoutStepCapable;
        Boolean bool13 = this.fallDetectionCapable;
        Boolean bool14 = this.floorsClimbedGoalCapable;
        Boolean bool15 = this.golfAppPairingCapable;
        Boolean bool16 = this.golfAppSyncCapable;
        Boolean bool17 = this.groupTrack2Capable;
        Boolean bool18 = this.hasOpticalHeartRate;
        Boolean bool19 = this.hasPowerButton;
        Boolean bool20 = this.hiitWorkoutCapable;
        String str7 = this.imageUrl;
        Boolean bool21 = this.incidentDetectionCapable;
        Boolean bool22 = this.intensityMinutesGoalCapable;
        Boolean bool23 = this.isPrimaryUser;
        Boolean bool24 = this.lapByCoursePointsCapable;
        Boolean bool25 = this.liveTrackCapable;
        Integer num3 = this.minGCMAndroidVersion;
        Boolean bool26 = this.mobilityWorkoutCapable;
        Boolean bool27 = this.multisportWorkoutCapable;
        Boolean bool28 = this.pacebandCapable;
        String str8 = this.partNumber;
        Boolean bool29 = this.pendingActivityCapable;
        Boolean bool30 = this.pilatesWorkoutCapable;
        Boolean bool31 = this.powerGuidanceCapable;
        Boolean bool32 = this.primary;
        Boolean bool33 = this.primaryActivityTrackerIndicator;
        Boolean bool34 = this.primaryTrainingCapable;
        String str9 = this.productDisplayName;
        String str10 = this.productSku;
        Long l15 = this.registeredDate;
        Boolean bool35 = this.ruckingWorkoutCapable;
        Boolean bool36 = this.runningHeartRateZoneCapable;
        Boolean bool37 = this.runningWorkoutCapable;
        String str11 = this.serialNumber;
        String str12 = this.shortName;
        Boolean bool38 = this.skipLastRestStepCapable;
        Boolean bool39 = this.sportingEventCapable;
        Boolean bool40 = this.strengthWorkoutCapable;
        Boolean bool41 = this.swimWorkoutCapable;
        Boolean bool42 = this.swimWorkout2Capable;
        Boolean bool43 = this.swimmingHeartRateZoneCapable;
        Boolean bool44 = this.topoActiveMapsRealTimeSettingCapable;
        Long l16 = this.unitId;
        Boolean bool45 = this.walkWorkoutCapable;
        Boolean bool46 = this.weightScale;
        Boolean bool47 = this.wellness;
        Boolean bool48 = this.wheelchairCapable;
        Boolean bool49 = this.wifi;
        Boolean bool50 = this.wifiSetup;
        Boolean bool51 = this.workoutAudioPromptsCapable;
        Boolean bool52 = this.workoutCapable;
        Boolean bool53 = this.yogaCapable;
        Boolean bool54 = this.yogaWorkoutCapable;
        Boolean bool55 = this.inReachServicesCapable;
        Boolean bool56 = this.inReachServicesDirectActivationCapable;
        StringBuilder sb3 = new StringBuilder("DeviceRegistrationDetailsDTO(acuteChronicWorkloadRatioCapable=");
        sb3.append(bool);
        sb3.append(", applicationKey=");
        sb3.append(str);
        sb3.append(", benchmarkExerciseCapable=");
        b71.i.o(bool2, bool3, ", cardioCapable=", ", cardioWorkoutCapable=", sb3);
        b71.i.o(bool4, bool5, ", courseCapable=", ", criticalSwimSpeedCapable=", sb3);
        b71.i.s(sb3, bool6, ", currentFirmwareVersion=", str2, ", currentFirmwareVersionMajor=");
        kg.f.r(sb3, num, ", customWorkoutCapable=", bool7, ", cyclingHeartRateZoneCapable=");
        b71.i.o(bool8, bool9, ", cyclingWorkoutCapable=", ", datasource=", sb3);
        b71.i.w(sb3, str3, ", defaultHeartRateZoneCapable=", bool10, ", deviceCategories=");
        o2.c.n(", deviceEmbedVideoLink=", str4, ", deviceId=", sb3, list);
        sb3.append(l14);
        sb3.append(", deviceTags=");
        sb3.append(list2);
        sb3.append(", deviceVideoPageLink=");
        sn.a.t(sb3, str5, ", displayName=", str6, ", displayOrder=");
        kg.f.r(sb3, num2, ", emergencyCallingCapable=", bool11, ", enhancedWorkoutStepCapable=");
        b71.i.o(bool12, bool13, ", fallDetectionCapable=", ", floorsClimbedGoalCapable=", sb3);
        b71.i.o(bool14, bool15, ", golfAppPairingCapable=", ", golfAppSyncCapable=", sb3);
        b71.i.o(bool16, bool17, ", groupTrack2Capable=", ", hasOpticalHeartRate=", sb3);
        b71.i.o(bool18, bool19, ", hasPowerButton=", ", hiitWorkoutCapable=", sb3);
        b71.i.s(sb3, bool20, ", imageUrl=", str7, ", incidentDetectionCapable=");
        b71.i.o(bool21, bool22, ", intensityMinutesGoalCapable=", ", isPrimaryUser=", sb3);
        b71.i.o(bool23, bool24, ", lapByCoursePointsCapable=", ", liveTrackCapable=", sb3);
        sb3.append(bool25);
        sb3.append(", minGCMAndroidVersion=");
        sb3.append(num3);
        sb3.append(", mobilityWorkoutCapable=");
        b71.i.o(bool26, bool27, ", multisportWorkoutCapable=", ", pacebandCapable=", sb3);
        b71.i.s(sb3, bool28, ", partNumber=", str8, ", pendingActivityCapable=");
        b71.i.o(bool29, bool30, ", pilatesWorkoutCapable=", ", powerGuidanceCapable=", sb3);
        b71.i.o(bool31, bool32, ", primary=", ", primaryActivityTrackerIndicator=", sb3);
        b71.i.o(bool33, bool34, ", primaryTrainingCapable=", ", productDisplayName=", sb3);
        sn.a.t(sb3, str9, ", productSku=", str10, ", registeredDate=");
        sb3.append(l15);
        sb3.append(", ruckingWorkoutCapable=");
        sb3.append(bool35);
        sb3.append(", runningHeartRateZoneCapable=");
        b71.i.o(bool36, bool37, ", runningWorkoutCapable=", ", serialNumber=", sb3);
        sn.a.t(sb3, str11, ", shortName=", str12, ", skipLastRestStepCapable=");
        b71.i.o(bool38, bool39, ", sportingEventCapable=", ", strengthWorkoutCapable=", sb3);
        b71.i.o(bool40, bool41, ", swimWorkoutCapable=", ", swimWorkout2Capable=", sb3);
        b71.i.o(bool42, bool43, ", swimmingHeartRateZoneCapable=", ", topoActiveMapsRealTimeSettingCapable=", sb3);
        sb3.append(bool44);
        sb3.append(", unitId=");
        sb3.append(l16);
        sb3.append(", walkWorkoutCapable=");
        b71.i.o(bool45, bool46, ", weightScale=", ", wellness=", sb3);
        b71.i.o(bool47, bool48, ", wheelchairCapable=", ", wifi=", sb3);
        b71.i.o(bool49, bool50, ", wifiSetup=", ", workoutAudioPromptsCapable=", sb3);
        b71.i.o(bool51, bool52, ", workoutCapable=", ", yogaCapable=", sb3);
        b71.i.o(bool53, bool54, ", yogaWorkoutCapable=", ", inReachServicesCapable=", sb3);
        sb3.append(bool55);
        sb3.append(", inReachServicesDirectActivationCapable=");
        sb3.append(bool56);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Boolean getMobilityWorkoutCapable() {
        return this.mobilityWorkoutCapable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Boolean bool = this.acuteChronicWorkloadRatioCapable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.applicationKey);
        Boolean bool2 = this.benchmarkExerciseCapable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.cardioCapable;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.cardioWorkoutCapable;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        Boolean bool5 = this.courseCapable;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool5);
        }
        Boolean bool6 = this.criticalSwimSpeedCapable;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool6);
        }
        parcel.writeString(this.currentFirmwareVersion);
        Integer num = this.currentFirmwareVersionMajor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Boolean bool7 = this.customWorkoutCapable;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool7);
        }
        Boolean bool8 = this.cyclingHeartRateZoneCapable;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool8);
        }
        Boolean bool9 = this.cyclingWorkoutCapable;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool9);
        }
        parcel.writeString(this.datasource);
        Boolean bool10 = this.defaultHeartRateZoneCapable;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool10);
        }
        parcel.writeStringList(this.deviceCategories);
        parcel.writeString(this.deviceEmbedVideoLink);
        Long l14 = this.deviceId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeStringList(this.deviceTags);
        parcel.writeString(this.deviceVideoPageLink);
        parcel.writeString(this.displayName);
        Integer num2 = this.displayOrder;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Boolean bool11 = this.emergencyCallingCapable;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool11);
        }
        Boolean bool12 = this.enhancedWorkoutStepCapable;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool12);
        }
        Boolean bool13 = this.fallDetectionCapable;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool13);
        }
        Boolean bool14 = this.floorsClimbedGoalCapable;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool14);
        }
        Boolean bool15 = this.golfAppPairingCapable;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool15);
        }
        Boolean bool16 = this.golfAppSyncCapable;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool16);
        }
        Boolean bool17 = this.groupTrack2Capable;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool17);
        }
        Boolean bool18 = this.hasOpticalHeartRate;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool18);
        }
        Boolean bool19 = this.hasPowerButton;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool19);
        }
        Boolean bool20 = this.hiitWorkoutCapable;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool20);
        }
        parcel.writeString(this.imageUrl);
        Boolean bool21 = this.incidentDetectionCapable;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool21);
        }
        Boolean bool22 = this.intensityMinutesGoalCapable;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool22);
        }
        Boolean bool23 = this.isPrimaryUser;
        if (bool23 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool23);
        }
        Boolean bool24 = this.lapByCoursePointsCapable;
        if (bool24 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool24);
        }
        Boolean bool25 = this.liveTrackCapable;
        if (bool25 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool25);
        }
        Integer num3 = this.minGCMAndroidVersion;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Boolean bool26 = this.mobilityWorkoutCapable;
        if (bool26 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool26);
        }
        Boolean bool27 = this.multisportWorkoutCapable;
        if (bool27 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool27);
        }
        Boolean bool28 = this.pacebandCapable;
        if (bool28 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool28);
        }
        parcel.writeString(this.partNumber);
        Boolean bool29 = this.pendingActivityCapable;
        if (bool29 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool29);
        }
        Boolean bool30 = this.pilatesWorkoutCapable;
        if (bool30 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool30);
        }
        Boolean bool31 = this.powerGuidanceCapable;
        if (bool31 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool31);
        }
        Boolean bool32 = this.primary;
        if (bool32 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool32);
        }
        Boolean bool33 = this.primaryActivityTrackerIndicator;
        if (bool33 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool33);
        }
        Boolean bool34 = this.primaryTrainingCapable;
        if (bool34 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool34);
        }
        parcel.writeString(this.productDisplayName);
        parcel.writeString(this.productSku);
        Long l15 = this.registeredDate;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Boolean bool35 = this.ruckingWorkoutCapable;
        if (bool35 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool35);
        }
        Boolean bool36 = this.runningHeartRateZoneCapable;
        if (bool36 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool36);
        }
        Boolean bool37 = this.runningWorkoutCapable;
        if (bool37 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool37);
        }
        parcel.writeString(this.serialNumber);
        parcel.writeString(this.shortName);
        Boolean bool38 = this.skipLastRestStepCapable;
        if (bool38 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool38);
        }
        Boolean bool39 = this.sportingEventCapable;
        if (bool39 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool39);
        }
        Boolean bool40 = this.strengthWorkoutCapable;
        if (bool40 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool40);
        }
        Boolean bool41 = this.swimWorkoutCapable;
        if (bool41 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool41);
        }
        Boolean bool42 = this.swimWorkout2Capable;
        if (bool42 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool42);
        }
        Boolean bool43 = this.swimmingHeartRateZoneCapable;
        if (bool43 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool43);
        }
        Boolean bool44 = this.topoActiveMapsRealTimeSettingCapable;
        if (bool44 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool44);
        }
        Long l16 = this.unitId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Boolean bool45 = this.walkWorkoutCapable;
        if (bool45 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool45);
        }
        Boolean bool46 = this.weightScale;
        if (bool46 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool46);
        }
        Boolean bool47 = this.wellness;
        if (bool47 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool47);
        }
        Boolean bool48 = this.wheelchairCapable;
        if (bool48 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool48);
        }
        Boolean bool49 = this.wifi;
        if (bool49 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool49);
        }
        Boolean bool50 = this.wifiSetup;
        if (bool50 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool50);
        }
        Boolean bool51 = this.workoutAudioPromptsCapable;
        if (bool51 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool51);
        }
        Boolean bool52 = this.workoutCapable;
        if (bool52 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool52);
        }
        Boolean bool53 = this.yogaCapable;
        if (bool53 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool53);
        }
        Boolean bool54 = this.yogaWorkoutCapable;
        if (bool54 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool54);
        }
        Boolean bool55 = this.inReachServicesCapable;
        if (bool55 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool55);
        }
        Boolean bool56 = this.inReachServicesDirectActivationCapable;
        if (bool56 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool56);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Boolean getMultisportWorkoutCapable() {
        return this.multisportWorkoutCapable;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Boolean getPacebandCapable() {
        return this.pacebandCapable;
    }

    public /* synthetic */ m(Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str2, Integer num, Boolean bool7, Boolean bool8, Boolean bool9, String str3, Boolean bool10, List list, String str4, Long l14, List list2, String str5, String str6, Integer num2, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, String str7, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Integer num3, Boolean bool26, Boolean bool27, Boolean bool28, String str8, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, String str9, String str10, Long l15, Boolean bool35, Boolean bool36, Boolean bool37, String str11, String str12, Boolean bool38, Boolean bool39, Boolean bool40, Boolean bool41, Boolean bool42, Boolean bool43, Boolean bool44, Long l16, Boolean bool45, Boolean bool46, Boolean bool47, Boolean bool48, Boolean bool49, Boolean bool50, Boolean bool51, Boolean bool52, Boolean bool53, Boolean bool54, Boolean bool55, Boolean bool56, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(bool, str, (i14 & 4) != 0 ? null : bool2, bool3, bool4, bool5, bool6, str2, num, (i14 & 512) != 0 ? null : bool7, bool8, bool9, str3, bool10, list, str4, l14, list2, str5, str6, num2, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, str7, bool21, bool22, bool23, bool24, bool25, num3, bool26, bool27, bool28, str8, (i15 & 1024) != 0 ? Boolean.FALSE : bool29, bool30, bool31, bool32, bool33, bool34, str9, str10, l15, bool35, bool36, bool37, str11, str12, bool38, bool39, bool40, bool41, bool42, bool43, bool44, l16, bool45, bool46, bool47, (i16 & 8) != 0 ? Boolean.FALSE : bool48, bool49, bool50, bool51, bool52, bool53, bool54, (i16 & 1024) != 0 ? Boolean.FALSE : bool55, (i16 & 2048) != 0 ? Boolean.FALSE : bool56);
    }
}
