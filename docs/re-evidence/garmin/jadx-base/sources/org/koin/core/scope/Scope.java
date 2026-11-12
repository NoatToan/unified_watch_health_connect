package org.koin.core.scope;

import am.j;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.a;
import e53.o;
import e53.p;
import e53.q;
import id0.q3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import k23.d;
import o13.l;
import o13.n;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.definition.Kind;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.MissingPropertyException;
import org.koin.core.error.NoDefinitionFoundException;
import org.koin.core.instance.ResolutionContext;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.time.DurationExtKt;
import org.koin.ext.KClassExtKt;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.k;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@KoinDslMarker
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00122\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0016\"\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00122\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0016\"\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0019JS\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0018\u00010\u001fj\u0004\u0018\u0001`!H\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%JU\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000#\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0018\u00010\u001fj\u0004\u0018\u0001`!H\u0086\bø\u0001\u0000¢\u0006\u0004\b&\u0010%JC\u0010'\u001a\u00028\u0000\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0018\u00010\u001fj\u0004\u0018\u0001`!H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b)\u0010*JE\u0010+\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0018\u00010\u001fj\u0004\u0018\u0001`!H\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010(JE\u0010+\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001b2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0018\u00010\u001fj\u0004\u0018\u0001`!¢\u0006\u0004\b+\u0010.J\u001f\u0010+\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102JC\u0010'\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0018\u00010\u001fj\u0004\u0018\u0001`!¢\u0006\u0004\b'\u0010.JJ\u00106\u001a\u00020\u0012\"\u0006\b\u0000\u0010\u001b\u0018\u00012\u0006\u00103\u001a\u00028\u00002\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030,0\u00102\b\b\u0002\u00105\u001a\u00020\bH\u0086\b¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\n¢\u0006\u0004\b8\u00109J\u0019\u0010;\u001a\u00020\u00002\n\u0010:\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020\u00122\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\"\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\bA\u0010BJ%\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u001b2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,¢\u0006\u0004\bA\u0010CJ'\u0010F\u001a\u00028\u0000\"\b\b\u0000\u0010\u001b*\u00020\u00012\u0006\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u00028\u0000¢\u0006\u0004\bF\u0010GJ!\u0010H\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001b*\u00020\u00012\u0006\u0010D\u001a\u00020\u0005¢\u0006\u0004\bH\u0010IJ\u001f\u0010F\u001a\u00028\u0000\"\b\b\u0000\u0010\u001b*\u00020\u00012\u0006\u0010D\u001a\u00020\u0005¢\u0006\u0004\bF\u0010IJ\r\u0010J\u001a\u00020\u0012¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0005H\u0016¢\u0006\u0004\bL\u0010MJ9\u0010'\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b'\u0010NJ7\u0010O\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bO\u0010NJ&\u0010P\u001a\u00020\u00122\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0082\b¢\u0006\u0004\bP\u0010QJ$\u0010V\u001a\u00020\u00122\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010S\u001a\u00020RH\u0082\b¢\u0006\u0004\bT\u0010UJ5\u0010W\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,2\b\u0010\"\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\u0012H\u0082\b¢\u0006\u0004\bY\u0010KJ'\u0010[\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\b\u0010\"\u001a\u0004\u0018\u00010 2\u0006\u0010Z\u001a\u00020/H\u0002¢\u0006\u0004\b[\u0010\\J\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020 0]2\u0006\u0010\"\u001a\u00020 H\u0002¢\u0006\u0004\b^\u0010_J\u001d\u0010a\u001a\u00020\u00122\f\u0010`\u001a\b\u0012\u0004\u0012\u00020 0]H\u0002¢\u0006\u0004\ba\u0010bJ\u0015\u0010c\u001a\b\u0012\u0004\u0012\u00020 0]H\u0002¢\u0006\u0004\bc\u0010dJ\u001d\u0010e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u0010Z\u001a\u00020/H\u0002¢\u0006\u0004\be\u00102J\u001f\u0010f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bf\u00102J \u0010g\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u00100\u001a\u00020/H\u0082\b¢\u0006\u0004\bg\u00102J \u0010h\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u00100\u001a\u00020/H\u0082\b¢\u0006\u0004\bh\u00102J \u0010i\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u00100\u001a\u00020/H\u0082\b¢\u0006\u0004\bi\u00102J\u001f\u0010j\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bj\u00102J\u001e\u0010k\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u00100\u001a\u00020/H\u0082\b¢\u0006\u0004\bk\u00102J\u001f\u0010l\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bl\u00102J\u0018\u0010n\u001a\u00020m2\u0006\u00100\u001a\u00020/H\u0082\b¢\u0006\u0004\bn\u0010oR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010p\u001a\u0004\bq\u0010rR\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010s\u001a\u0004\bt\u0010MR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010u\u001a\u0004\b\t\u0010\u000fR \u0010\u000b\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010v\u0012\u0004\bx\u0010K\u001a\u0004\bw\u00109R$\u0010{\u001a\u0012\u0012\u0004\u0012\u00020\u00000yj\b\u0012\u0004\u0012\u00020\u0000`z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R-\u0010}\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b}\u0010~\u0012\u0005\b\u0082\u0001\u0010K\u001a\u0004\b\u007f\u0010*\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0083\u0001\u001a\u0012\u0012\u0004\u0012\u00020=0yj\b\u0012\u0004\u0012\u00020=`z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010|RB\u0010\u0086\u0001\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0]\u0018\u00010\u0084\u0001j\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0]\u0018\u0001`\u0085\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u0012\u0005\b\u0088\u0001\u0010KR\u0018\u0010\u0089\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010uR\u0013\u0010\u008b\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\u000fR\u0015\u0010\u008f\u0001\u001a\u00030\u008c\u00018F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0090\u0001"}, d2 = {"Lorg/koin/core/scope/Scope;", "", "Lorg/koin/mp/Lockable;", "Lorg/koin/core/qualifier/Qualifier;", "scopeQualifier", "", "Lorg/koin/core/scope/ScopeID;", TtmlNode.ATTR_ID, "", "isRoot", "Lorg/koin/core/Koin;", "_koin", "<init>", "(Lorg/koin/core/qualifier/Qualifier;Ljava/lang/String;ZLorg/koin/core/Koin;)V", "isNotClosed", "()Z", "", "links", "", "create$koin_core", "(Ljava/util/List;)V", "create", "", "scopes", "linkTo", "([Lorg/koin/core/scope/Scope;)V", "unlink", "T", "qualifier", "Lo13/n;", "mode", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lo13/l;", "inject", "(Lorg/koin/core/qualifier/Qualifier;Lo13/n;Le23/a;)Lo13/l;", "injectOrNull", "get", "(Lorg/koin/core/qualifier/Qualifier;Le23/a;)Ljava/lang/Object;", "getSource", "()Ljava/lang/Object;", "getOrNull", "Lk23/d;", "clazz", "(Lk23/d;Lorg/koin/core/qualifier/Qualifier;Le23/a;)Ljava/lang/Object;", "Lorg/koin/core/instance/ResolutionContext;", "ctx", "getOrNull$koin_core", "(Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Object;", "instance", "secondaryTypes", "allowOverride", "declare", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)V", "getKoin", "()Lorg/koin/core/Koin;", "scopeID", "getScope", "(Ljava/lang/String;)Lorg/koin/core/scope/Scope;", "Lorg/koin/core/scope/ScopeCallback;", "callback", "registerCallback", "(Lorg/koin/core/scope/ScopeCallback;)V", "getAll", "()Ljava/util/List;", "(Lk23/d;)Ljava/util/List;", Action.KEY_ATTRIBUTE, "defaultValue", "getProperty", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getPropertyOrNull", "(Ljava/lang/String;)Ljava/lang/Object;", "close", "()V", "toString", "()Ljava/lang/String;", "(Lk23/d;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;", "resolveWithOptionalLogging", "logInstanceRequest", "(Lk23/d;Lorg/koin/core/qualifier/Qualifier;)V", "Le53/c;", "duration", "logInstanceDuration-HG0u8IE", "(Lk23/d;J)V", "logInstanceDuration", "resolveInstance", "(Lorg/koin/core/qualifier/Qualifier;Lk23/d;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;", "checkScopeIsOpen", "instanceContext", "stackParametersCall", "(Lorg/koin/core/parameter/ParametersHolder;Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Object;", "Lp13/k;", "onParameterOnStack", "(Lorg/koin/core/parameter/ParametersHolder;)Lp13/k;", "stack", "clearParameterStack", "(Lp13/k;)V", "getOrCreateParameterStack", "()Lp13/k;", "resolveFromContext", "resolveFromRegistry", "resolveFromInjectedParameters", "resolveFromStackedParameters", "resolveFromScopeSource", "resolveFromParentScopes", "throwNoDefinitionFound", "findInOtherScope", "", "throwDefinitionNotFound", "(Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Void;", "Lorg/koin/core/qualifier/Qualifier;", "getScopeQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "Ljava/lang/String;", "getId", "Z", "Lorg/koin/core/Koin;", "get_koin", "get_koin$annotations", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "linkedScopes", "Ljava/util/LinkedHashSet;", "sourceValue", "Ljava/lang/Object;", "getSourceValue", "setSourceValue", "(Ljava/lang/Object;)V", "getSourceValue$annotations", "_callbacks", "Ljava/lang/ThreadLocal;", "Lorg/koin/mp/ThreadLocal;", "parameterStack", "Ljava/lang/ThreadLocal;", "getParameterStack$annotations", "_closed", "getClosed", "closed", "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "logger", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Scope {
    private final LinkedHashSet<ScopeCallback> _callbacks;
    private boolean _closed;
    private final Koin _koin;
    private final String id;
    private final boolean isRoot;
    private final LinkedHashSet<Scope> linkedScopes;
    private ThreadLocal<k<ParametersHolder>> parameterStack;
    private final Qualifier scopeQualifier;
    private Object sourceValue;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.core.scope.Scope$inject$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class C42581<T> implements a<T> {
        final /* synthetic */ a<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;

        /* JADX WARN: Multi-variable type inference failed */
        public C42581(Qualifier qualifier, a<? extends ParametersHolder> aVar) {
            this.$qualifier = qualifier;
            this.$parameters = aVar;
        }

        @Override // e23.a
        public final T invoke() {
            s.l();
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.core.scope.Scope$injectOrNull$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class C42591<T> implements a<T> {
        final /* synthetic */ a<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;

        /* JADX WARN: Multi-variable type inference failed */
        public C42591(Qualifier qualifier, a<? extends ParametersHolder> aVar) {
            this.$qualifier = qualifier;
            this.$parameters = aVar;
        }

        @Override // e23.a
        public final T invoke() {
            s.l();
            throw null;
        }
    }

    public Scope(Qualifier qualifier, String str, boolean z14, Koin koin) {
        qualifier.getClass();
        str.getClass();
        koin.getClass();
        this.scopeQualifier = qualifier;
        this.id = str;
        this.isRoot = z14;
        this._koin = koin;
        this.linkedScopes = new LinkedHashSet<>();
        this._callbacks = new LinkedHashSet<>();
    }

    private final void checkScopeIsOpen() throws ClosedScopeException {
        if (this._closed) {
            throw new ClosedScopeException(j.o(this.id, "' is closed", new StringBuilder("Scope '")));
        }
    }

    private final void clearParameterStack(k<ParametersHolder> stack) {
        if (!stack.isEmpty()) {
            stack.removeFirst();
        }
        if (stack.isEmpty()) {
            ThreadLocal<k<ParametersHolder>> threadLocal = this.parameterStack;
            if (threadLocal != null) {
                threadLocal.remove();
            }
            this.parameterStack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit close$lambda$8(Scope scope) {
        scope._koin.getLogger().debug("|- (-) Scope - id:'" + scope.id + CoreConstants.SINGLE_QUOTE_CHAR);
        Iterator<T> it = scope._callbacks.iterator();
        while (it.hasNext()) {
            ((ScopeCallback) it.next()).onScopeClose(scope);
        }
        scope._callbacks.clear();
        scope.sourceValue = null;
        scope._closed = true;
        scope._koin.getScopeRegistry().deleteScope$koin_core(scope);
        return Unit.INSTANCE;
    }

    public static void declare$default(Scope scope, Object obj, Qualifier qualifier, List list, boolean z14, int i14, Object obj2) {
        if ((i14 & 4) != 0) {
            list = j0.f134944a;
        }
        list.getClass();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        s.l();
        throw null;
    }

    private final <T> T findInOtherScope(ResolutionContext ctx) {
        Iterator<T> it = this.linkedScopes.iterator();
        while (it.hasNext()) {
            T t7 = (T) ((Scope) it.next()).getOrNull$koin_core(ctx);
            if (t7 != null) {
                return t7;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Scope scope, d dVar, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            qualifier = null;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        return scope.get((d<?>) dVar, qualifier, (a<? extends ParametersHolder>) aVar);
    }

    private final k<ParametersHolder> getOrCreateParameterStack() {
        k<ParametersHolder> kVar;
        ThreadLocal<k<ParametersHolder>> threadLocal = this.parameterStack;
        if (threadLocal != null && (kVar = threadLocal.get()) != null) {
            return kVar;
        }
        k<ParametersHolder> kVar2 = new k<>();
        ThreadLocal<k<ParametersHolder>> threadLocal2 = new ThreadLocal<>();
        this.parameterStack = threadLocal2;
        threadLocal2.set(kVar2);
        return kVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Scope scope, d dVar, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            qualifier = null;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        return scope.getOrNull(dVar, qualifier, aVar);
    }

    @KoinInternalApi
    private static /* synthetic */ void getParameterStack$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getSourceValue$annotations() {
    }

    public static /* synthetic */ void get_koin$annotations() {
    }

    public static l inject$default(Scope scope, Qualifier qualifier, n nVar, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            nVar = n.SYNCHRONIZED;
        }
        nVar.getClass();
        s.l();
        throw null;
    }

    public static l injectOrNull$default(Scope scope, Qualifier qualifier, n nVar, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            nVar = n.SYNCHRONIZED;
        }
        nVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: logInstanceDuration-HG0u8IE, reason: not valid java name */
    private final void m497logInstanceDurationHG0u8IE(d<?> clazz, long duration) {
        this._koin.getLogger().display(Level.DEBUG, "|- '" + KClassExtKt.getFullName(clazz) + "' in " + DurationExtKt.m498getInMsLRDsOJo(duration) + " ms");
    }

    private final void logInstanceRequest(d<?> clazz, Qualifier qualifier) {
        String str;
        if (qualifier != null) {
            str = " with qualifier '" + qualifier + CoreConstants.SINGLE_QUOTE_CHAR;
        } else {
            str = "";
        }
        String strM = this.isRoot ? "" : a0.m(new StringBuilder(" - scope:'"), this.id, CoreConstants.SINGLE_QUOTE_CHAR);
        this._koin.getLogger().display(Level.DEBUG, "|- '" + KClassExtKt.getFullName(clazz) + CoreConstants.SINGLE_QUOTE_CHAR + str + strM + "...");
    }

    private final k<ParametersHolder> onParameterOnStack(ParametersHolder parameters) {
        k<ParametersHolder> orCreateParameterStack = getOrCreateParameterStack();
        orCreateParameterStack.addFirst(parameters);
        return orCreateParameterStack;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    private final <T> T resolveFromContext(ResolutionContext instanceContext) throws NoDefinitionFoundException {
        Object orNull;
        String str;
        Object obj;
        T t7 = null;
        if (instanceContext.getParameters() == null) {
            orNull = (T) null;
        } else {
            this._koin.getLogger().debug("|- ? " + instanceContext.getDebugTag() + " look in injected parameters");
            orNull = instanceContext.getParameters().getOrNull(instanceContext.getClazz());
        }
        if (orNull == null && (orNull = (T) resolveFromRegistry(instanceContext)) == null) {
            ThreadLocal<k<ParametersHolder>> threadLocal = this.parameterStack;
            k<ParametersHolder> kVar = threadLocal != null ? threadLocal.get() : null;
            if (kVar == null || kVar.isEmpty()) {
                orNull = null;
            } else {
                this._koin.getLogger().debug("|- ? " + instanceContext.getDebugTag() + " look in stack parameters");
                ParametersHolder parametersHolderE = kVar.e();
                if (parametersHolderE != null) {
                    orNull = (T) parametersHolderE.getOrNull(instanceContext.getClazz());
                } else {
                    orNull = null;
                }
            }
            if (orNull == null) {
                if (!this.isRoot) {
                    this._koin.getLogger().debug("|- ? " + instanceContext.getDebugTag() + " look at scope source");
                    if (instanceContext.getClazz().q(this.sourceValue) && instanceContext.getQualifier() == null && (obj = this.sourceValue) != null) {
                        t7 = (T) obj;
                    }
                }
                if (t7 != null) {
                    return t7;
                }
                T t14 = (T) resolveFromParentScopes(instanceContext);
                if (t14 != null) {
                    return t14;
                }
                this._koin.getLogger().debug("|- << parameters");
                Qualifier qualifier = instanceContext.getQualifier();
                if (qualifier != null) {
                    str = " and qualifier '" + qualifier + CoreConstants.SINGLE_QUOTE_CHAR;
                } else {
                    str = "";
                }
                throw new NoDefinitionFoundException("No definition found for type '" + KClassExtKt.getFullName(instanceContext.getClazz()) + CoreConstants.SINGLE_QUOTE_CHAR + str + ". Check your Modules configuration and add missing type and/or qualifier!");
            }
        }
        return (T) orNull;
    }

    private final <T> T resolveFromInjectedParameters(ResolutionContext ctx) {
        if (ctx.getParameters() == null) {
            return null;
        }
        this._koin.getLogger().debug("|- ? " + ctx.getDebugTag() + " look in injected parameters");
        return (T) ctx.getParameters().getOrNull(ctx.getClazz());
    }

    private final <T> T resolveFromParentScopes(ResolutionContext ctx) {
        this._koin.getLogger().debug("|- ? " + ctx.getDebugTag() + " look in other scopes");
        return (T) findInOtherScope(ctx);
    }

    private final <T> T resolveFromRegistry(ResolutionContext ctx) {
        return (T) this._koin.getInstanceRegistry().resolveInstance$koin_core(ctx.getQualifier(), ctx.getClazz(), this.scopeQualifier, ctx);
    }

    private final <T> T resolveFromScopeSource(ResolutionContext ctx) {
        T t7;
        if (this.isRoot) {
            return null;
        }
        this._koin.getLogger().debug("|- ? " + ctx.getDebugTag() + " look at scope source");
        if (ctx.getClazz().q(this.sourceValue) && ctx.getQualifier() == null && (t7 = (T) this.sourceValue) != null) {
            return t7;
        }
        return null;
    }

    private final <T> T resolveFromStackedParameters(ResolutionContext ctx) {
        ThreadLocal<k<ParametersHolder>> threadLocal = this.parameterStack;
        k<ParametersHolder> kVar = threadLocal != null ? threadLocal.get() : null;
        if (kVar != null && !kVar.isEmpty()) {
            this._koin.getLogger().debug("|- ? " + ctx.getDebugTag() + " look in stack parameters");
            ParametersHolder parametersHolderE = kVar.e();
            if (parametersHolderE != null) {
                return (T) parametersHolderE.getOrNull(ctx.getClazz());
            }
        }
        return null;
    }

    private final <T> T resolveInstance(Qualifier qualifier, d<?> clazz, ParametersHolder parameters) throws ClosedScopeException {
        if (!this._closed) {
            return (T) stackParametersCall(parameters, new ResolutionContext(this._koin.getLogger(), this, clazz, qualifier, parameters));
        }
        throw new ClosedScopeException(j.o(this.id, "' is closed", new StringBuilder("Scope '")));
    }

    private final <T> T resolveWithOptionalLogging(d<?> clazz, Qualifier qualifier, ParametersHolder parameters) {
        String str;
        Logger logger = this._koin.getLogger();
        Level level = Level.DEBUG;
        if (logger.getLevel().compareTo(level) > 0) {
            return (T) resolveInstance(qualifier, clazz, parameters);
        }
        if (qualifier != null) {
            str = " with qualifier '" + qualifier + CoreConstants.SINGLE_QUOTE_CHAR;
        } else {
            str = "";
        }
        String strM = this.isRoot ? "" : a0.m(new StringBuilder(" - scope:'"), this.id, CoreConstants.SINGLE_QUOTE_CHAR);
        this._koin.getLogger().display(level, "|- '" + KClassExtKt.getFullName(clazz) + CoreConstants.SINGLE_QUOTE_CHAR + str + strM + "...");
        p.a.f63127a.getClass();
        o.f63125a.getClass();
        q qVar = new q(resolveInstance(qualifier, clazz, parameters), p.a.C1330a.b(o.b()), null);
        this._koin.getLogger().display(level, "|- '" + KClassExtKt.getFullName(clazz) + "' in " + DurationExtKt.m498getInMsLRDsOJo(qVar.f63130b) + " ms");
        return qVar.f63129a;
    }

    public static /* synthetic */ Object resolveWithOptionalLogging$default(Scope scope, d dVar, Qualifier qualifier, ParametersHolder parametersHolder, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            parametersHolder = null;
        }
        return scope.resolveWithOptionalLogging(dVar, qualifier, parametersHolder);
    }

    private final <T> T stackParametersCall(ParametersHolder parameters, ResolutionContext instanceContext) {
        if (parameters == null) {
            return (T) resolveFromContext(instanceContext);
        }
        Logger logger = this._koin.getLogger();
        Level level = Level.DEBUG;
        if (logger.getLevel().compareTo(level) <= 0) {
            logger.display(level, "| >> parameters " + parameters);
        }
        k<ParametersHolder> kVarOnParameterOnStack = onParameterOnStack(parameters);
        try {
            return (T) resolveFromContext(instanceContext);
        } finally {
            this._koin.getLogger().debug("| << parameters");
            clearParameterStack(kVarOnParameterOnStack);
        }
    }

    private final Void throwDefinitionNotFound(ResolutionContext ctx) throws NoDefinitionFoundException {
        String str;
        Qualifier qualifier = ctx.getQualifier();
        if (qualifier != null) {
            str = " and qualifier '" + qualifier + CoreConstants.SINGLE_QUOTE_CHAR;
        } else {
            str = "";
        }
        throw new NoDefinitionFoundException("No definition found for type '" + KClassExtKt.getFullName(ctx.getClazz()) + CoreConstants.SINGLE_QUOTE_CHAR + str + ". Check your Modules configuration and add missing type and/or qualifier!");
    }

    private final <T> T throwNoDefinitionFound(ResolutionContext ctx) throws NoDefinitionFoundException {
        String str;
        this._koin.getLogger().debug("|- << parameters");
        Qualifier qualifier = ctx.getQualifier();
        if (qualifier != null) {
            str = " and qualifier '" + qualifier + CoreConstants.SINGLE_QUOTE_CHAR;
        } else {
            str = "";
        }
        throw new NoDefinitionFoundException("No definition found for type '" + KClassExtKt.getFullName(ctx.getClazz()) + CoreConstants.SINGLE_QUOTE_CHAR + str + ". Check your Modules configuration and add missing type and/or qualifier!");
    }

    public final void close() {
        KoinPlatformTools.INSTANCE.m499synchronized(this, new q3(this, 1));
    }

    public final void create$koin_core(List<Scope> links) {
        links.getClass();
        this.linkedScopes.addAll(links);
    }

    public final <T> void declare(T instance, Qualifier qualifier, List<? extends d<?>> secondaryTypes, boolean allowOverride) {
        secondaryTypes.getClass();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        s.l();
        throw null;
    }

    public final <T> T get(d<?> clazz, Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        clazz.getClass();
        return (T) resolveWithOptionalLogging(clazz, qualifier, parameters != null ? parameters.invoke() : null);
    }

    public final <T> List<T> getAll(d<?> clazz) {
        clazz.getClass();
        List<T> all$koin_core = this._koin.getInstanceRegistry().getAll$koin_core(clazz, new ResolutionContext(this._koin.getLogger(), this, clazz, null, null, 24, null));
        LinkedHashSet<Scope> linkedHashSet = this.linkedScopes;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, ((Scope) it.next()).getAll(clazz));
        }
        return h0.C0(all$koin_core, arrayList);
    }

    /* JADX INFO: renamed from: getClosed, reason: from getter */
    public final boolean get_closed() {
        return this._closed;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getKoin, reason: from getter */
    public final Koin get_koin() {
        return this._koin;
    }

    public final Logger getLogger() {
        return this._koin.getLogger();
    }

    public final <T> T getOrNull(d<?> clazz, Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        clazz.getClass();
        try {
            return (T) get(clazz, qualifier, parameters);
        } catch (ClosedScopeException unused) {
            this._koin.getLogger().debug("* Scope closed - no instance found for " + KClassExtKt.getFullName(clazz) + " on scope " + this);
            return null;
        } catch (NoDefinitionFoundException unused2) {
            this._koin.getLogger().debug("* No instance found for type '" + KClassExtKt.getFullName(clazz) + "' on scope '" + this + CoreConstants.SINGLE_QUOTE_CHAR);
            return null;
        }
    }

    public final <T> T getOrNull$koin_core(ResolutionContext ctx) {
        ctx.getClass();
        try {
            return (T) get(ctx.getClazz(), ctx.getQualifier(), ctx.getParameters());
        } catch (ClosedScopeException unused) {
            this._koin.getLogger().debug("* Scope closed - no instance found for " + KClassExtKt.getFullName(ctx.getClazz()) + " on scope " + this);
            return null;
        } catch (NoDefinitionFoundException unused2) {
            this._koin.getLogger().debug("* No instance found for type '" + KClassExtKt.getFullName(ctx.getClazz()) + "' on scope '" + this + CoreConstants.SINGLE_QUOTE_CHAR);
            return null;
        }
    }

    public final <T> T getProperty(String key) throws MissingPropertyException {
        key.getClass();
        T t7 = (T) this._koin.getProperty(key);
        if (t7 != null) {
            return t7;
        }
        throw new MissingPropertyException(j.m("Property '", key, "' not found"));
    }

    public final <T> T getPropertyOrNull(String key) {
        key.getClass();
        return (T) this._koin.getProperty(key);
    }

    public final Scope getScope(String scopeID) {
        scopeID.getClass();
        return get_koin().getScope(scopeID);
    }

    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    public final <T> T getSource() {
        getSourceValue();
        s.l();
        throw null;
    }

    public final Object getSourceValue() {
        return this.sourceValue;
    }

    public final Koin get_koin() {
        return this._koin;
    }

    public final <T> l<T> inject(Qualifier qualifier, n mode, a<? extends ParametersHolder> parameters) {
        mode.getClass();
        s.l();
        throw null;
    }

    public final <T> l<T> injectOrNull(Qualifier qualifier, n mode, a<? extends ParametersHolder> parameters) {
        mode.getClass();
        s.l();
        throw null;
    }

    public final boolean isNotClosed() {
        return !get_closed();
    }

    /* JADX INFO: renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    public final void linkTo(Scope... scopes) {
        scopes.getClass();
        if (this.isRoot) {
            h.z("Can't add scope link to a root scope");
        } else {
            d0.w(this.linkedScopes, scopes);
        }
    }

    public final void registerCallback(ScopeCallback callback) {
        callback.getClass();
        this._callbacks.add(callback);
    }

    public final void setSourceValue(Object obj) {
        this.sourceValue = obj;
    }

    public String toString() {
        return j.o(this.id, "']", new StringBuilder("['"));
    }

    public final void unlink(Scope... scopes) {
        scopes.getClass();
        if (this.isRoot) {
            h.z("Can't remove scope link to a root scope");
            return;
        }
        LinkedHashSet<Scope> linkedHashSet = this.linkedScopes;
        linkedHashSet.getClass();
        if (scopes.length == 0) {
            return;
        }
        List listAsList = Arrays.asList(scopes);
        listAsList.getClass();
        linkedHashSet.removeAll(listAsList);
    }

    public static Object get$default(Scope scope, Qualifier qualifier, a aVar, int i14, Object obj) {
        s.l();
        throw null;
    }

    public static Object getOrNull$default(Scope scope, Qualifier qualifier, a aVar, int i14, Object obj) {
        s.l();
        throw null;
    }

    public static /* synthetic */ Object get$default(Scope scope, d dVar, Qualifier qualifier, ParametersHolder parametersHolder, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            qualifier = null;
        }
        if ((i14 & 4) != 0) {
            parametersHolder = null;
        }
        return scope.get((d<?>) dVar, qualifier, parametersHolder);
    }

    public final <T> T get(Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        s.l();
        throw null;
    }

    private final <T> T get(d<?> clazz, Qualifier qualifier, ParametersHolder parameters) {
        return (T) resolveWithOptionalLogging(clazz, qualifier, parameters);
    }

    /* JADX INFO: renamed from: org.koin.core.scope.Scope$declare$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1 implements a<Unit> {
        final /* synthetic */ boolean $allowOverride;
        final /* synthetic */ T $instance;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ List<d<?>> $secondaryTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(T t7, Qualifier qualifier, List<? extends d<?>> list, boolean z14) {
            this.$instance = t7;
            this.$qualifier = qualifier;
            this.$secondaryTypes = list;
            this.$allowOverride = z14;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Scope.this.get_koin().getInstanceRegistry();
            Scope.this.getScopeQualifier();
            Scope.this.getId();
            Kind kind = Kind.Singleton;
            s.l();
            throw null;
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public final <T> T getProperty(String key, T defaultValue) {
        key.getClass();
        defaultValue.getClass();
        return (T) this._koin.getProperty(key, defaultValue);
    }

    public /* synthetic */ Scope(Qualifier qualifier, String str, boolean z14, Koin koin, int i14, p005kotlin.jvm.internal.j jVar) {
        this(qualifier, str, (i14 & 4) != 0 ? false : z14, koin);
    }

    public final <T> List<T> getAll() {
        s.l();
        throw null;
    }

    public final <T> T getOrNull(Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        s.l();
        throw null;
    }
}
