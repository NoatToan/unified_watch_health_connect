package org.koin.androidx.fragment.dsl;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.net.SyslogConstants;
import e23.a;
import e23.b;
import e23.c;
import e23.d;
import e23.f;
import e23.g;
import e23.h;
import e23.i;
import e23.j;
import e23.k;
import e23.l;
import e23.m;
import e23.n;
import e23.o;
import e23.p;
import e23.q;
import e23.r;
import e23.t;
import e23.u;
import e23.v;
import e23.w;
import org.apache.commons.lang3.e;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ac\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aq\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001*\u00020\u00022\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00052(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u000e\u001a\u007f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001*\u00020\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u00102(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0011\u001a\u008d\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001*\u00020\u00022 \b\u0004\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\u00132(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0014\u001a\u009b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001*\u00020\u00022&\b\u0004\u0010\u0004\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u00162(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0017\u001a©\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001*\u00020\u00022,\b\u0004\u0010\u0004\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000\u00192(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u001a\u001a·\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001*\u00020\u000222\b\u0004\u0010\u0004\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000\u001c2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u001d\u001aÅ\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001*\u00020\u000228\b\u0004\u0010\u0004\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00000\u001f2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010 \u001aÓ\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001*\u00020\u00022>\b\u0004\u0010\u0004\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u00000\"2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010#\u001aá\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001*\u00020\u00022D\b\u0004\u0010\u0004\u001a>\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\u00000%2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010&\u001aï\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001*\u00020\u00022J\b\u0004\u0010\u0004\u001aD\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u00000(2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010)\u001aý\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001\"\u0006\b\u000b\u0010*\u0018\u0001*\u00020\u00022P\b\u0004\u0010\u0004\u001aJ\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\u00000+2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010,\u001a\u008b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001\"\u0006\b\u000b\u0010*\u0018\u0001\"\u0006\b\f\u0010-\u0018\u0001*\u00020\u00022V\b\u0004\u0010\u0004\u001aP\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\u00000.2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010/\u001a\u0099\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001\"\u0006\b\u000b\u0010*\u0018\u0001\"\u0006\b\f\u0010-\u0018\u0001\"\u0006\b\r\u00100\u0018\u0001*\u00020\u00022\\\b\u0004\u0010\u0004\u001aV\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u0000012(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u00102\u001a§\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001\"\u0006\b\u000b\u0010*\u0018\u0001\"\u0006\b\f\u0010-\u0018\u0001\"\u0006\b\r\u00100\u0018\u0001\"\u0006\b\u000e\u00103\u0018\u0001*\u00020\u00022b\b\u0004\u0010\u0004\u001a\\\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u0000042(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u00105\u001aµ\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001\"\u0006\b\u000b\u0010*\u0018\u0001\"\u0006\b\f\u0010-\u0018\u0001\"\u0006\b\r\u00100\u0018\u0001\"\u0006\b\u000e\u00103\u0018\u0001\"\u0006\b\u000f\u00106\u0018\u0001*\u00020\u00022h\b\u0004\u0010\u0004\u001ab\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0000072(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u00108\u001aÃ\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001\"\u0006\b\u000b\u0010*\u0018\u0001\"\u0006\b\f\u0010-\u0018\u0001\"\u0006\b\r\u00100\u0018\u0001\"\u0006\b\u000e\u00103\u0018\u0001\"\u0006\b\u000f\u00106\u0018\u0001\"\u0006\b\u0010\u00109\u0018\u0001*\u00020\u00022n\b\u0004\u0010\u0004\u001ah\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u00000:2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010;\u001aÑ\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001\"\u0006\b\u000b\u0010*\u0018\u0001\"\u0006\b\f\u0010-\u0018\u0001\"\u0006\b\r\u00100\u0018\u0001\"\u0006\b\u000e\u00103\u0018\u0001\"\u0006\b\u000f\u00106\u0018\u0001\"\u0006\b\u0010\u00109\u0018\u0001\"\u0006\b\u0011\u0010<\u0018\u0001*\u00020\u00022t\b\u0004\u0010\u0004\u001an\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u00000=2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010>\u001aß\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001\"\u0006\b\u000b\u0010*\u0018\u0001\"\u0006\b\f\u0010-\u0018\u0001\"\u0006\b\r\u00100\u0018\u0001\"\u0006\b\u000e\u00103\u0018\u0001\"\u0006\b\u000f\u00106\u0018\u0001\"\u0006\b\u0010\u00109\u0018\u0001\"\u0006\b\u0011\u0010<\u0018\u0001\"\u0006\b\u0012\u0010?\u0018\u0001*\u00020\u00022z\b\u0004\u0010\u0004\u001at\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u00000@2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010A\u001aî\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001\"\u0006\b\u000b\u0010*\u0018\u0001\"\u0006\b\f\u0010-\u0018\u0001\"\u0006\b\r\u00100\u0018\u0001\"\u0006\b\u000e\u00103\u0018\u0001\"\u0006\b\u000f\u00106\u0018\u0001\"\u0006\b\u0010\u00109\u0018\u0001\"\u0006\b\u0011\u0010<\u0018\u0001\"\u0006\b\u0012\u0010?\u0018\u0001\"\u0006\b\u0013\u0010B\u0018\u0001*\u00020\u00022\u0080\u0001\b\u0004\u0010\u0004\u001az\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u00000C2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010D\u001aý\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001\"\u0006\b\u000b\u0010*\u0018\u0001\"\u0006\b\f\u0010-\u0018\u0001\"\u0006\b\r\u00100\u0018\u0001\"\u0006\b\u000e\u00103\u0018\u0001\"\u0006\b\u000f\u00106\u0018\u0001\"\u0006\b\u0010\u00109\u0018\u0001\"\u0006\b\u0011\u0010<\u0018\u0001\"\u0006\b\u0012\u0010?\u0018\u0001\"\u0006\b\u0013\u0010B\u0018\u0001\"\u0006\b\u0014\u0010E\u0018\u0001*\u00020\u00022\u0087\u0001\b\u0004\u0010\u0004\u001a\u0080\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u0014\u0012\u0004\u0012\u00028\u00000F2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010G\u001a\u008b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001\"\u0006\b\u000b\u0010*\u0018\u0001\"\u0006\b\f\u0010-\u0018\u0001\"\u0006\b\r\u00100\u0018\u0001\"\u0006\b\u000e\u00103\u0018\u0001\"\u0006\b\u000f\u00106\u0018\u0001\"\u0006\b\u0010\u00109\u0018\u0001\"\u0006\b\u0011\u0010<\u0018\u0001\"\u0006\b\u0012\u0010?\u0018\u0001\"\u0006\b\u0013\u0010B\u0018\u0001\"\u0006\b\u0014\u0010E\u0018\u0001\"\u0006\b\u0015\u0010H\u0018\u0001*\u00020\u00022\u008d\u0001\b\u0004\u0010\u0004\u001a\u0086\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u0014\u0012\u0004\u0012\u00028\u0015\u0012\u0004\u0012\u00028\u00000I2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010J\u001a\u0099\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0006\b\u0001\u0010\r\u0018\u0001\"\u0006\b\u0002\u0010\u000f\u0018\u0001\"\u0006\b\u0003\u0010\u0012\u0018\u0001\"\u0006\b\u0004\u0010\u0015\u0018\u0001\"\u0006\b\u0005\u0010\u0018\u0018\u0001\"\u0006\b\u0006\u0010\u001b\u0018\u0001\"\u0006\b\u0007\u0010\u001e\u0018\u0001\"\u0006\b\b\u0010!\u0018\u0001\"\u0006\b\t\u0010$\u0018\u0001\"\u0006\b\n\u0010'\u0018\u0001\"\u0006\b\u000b\u0010*\u0018\u0001\"\u0006\b\f\u0010-\u0018\u0001\"\u0006\b\r\u00100\u0018\u0001\"\u0006\b\u000e\u00103\u0018\u0001\"\u0006\b\u000f\u00106\u0018\u0001\"\u0006\b\u0010\u00109\u0018\u0001\"\u0006\b\u0011\u0010<\u0018\u0001\"\u0006\b\u0012\u0010?\u0018\u0001\"\u0006\b\u0013\u0010B\u0018\u0001\"\u0006\b\u0014\u0010E\u0018\u0001\"\u0006\b\u0015\u0010H\u0018\u0001\"\u0006\b\u0016\u0010K\u0018\u0001*\u00020\u00022\u0093\u0001\b\u0004\u0010\u0004\u001a\u008c\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u0014\u0012\u0004\u0012\u00028\u0015\u0012\u0004\u0012\u00028\u0016\u0012\u0004\u0012\u00028\u00000L2(\b\n\u0010\t\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010M\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006N"}, d2 = {"Landroidx/fragment/app/Fragment;", "R", "Lorg/koin/dsl/ScopeDSL;", "Lkotlin/Function0;", "constructor", "Lkotlin/Function1;", "Lorg/koin/core/definition/BeanDefinition;", "", "Lorg/koin/core/module/dsl/DefinitionOptions;", "options", "Lorg/koin/core/definition/KoinDefinition;", "fragmentOf", "(Lorg/koin/dsl/ScopeDSL;Le23/a;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T1", "(Lorg/koin/dsl/ScopeDSL;Le23/l;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T2", "Lkotlin/Function2;", "(Lorg/koin/dsl/ScopeDSL;Le23/p;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T3", "Lkotlin/Function3;", "(Lorg/koin/dsl/ScopeDSL;Le23/q;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T4", "Lkotlin/Function4;", "(Lorg/koin/dsl/ScopeDSL;Le23/r;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T5", "Lkotlin/Function5;", "(Lorg/koin/dsl/ScopeDSL;Le23/s;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T6", "Lkotlin/Function6;", "(Lorg/koin/dsl/ScopeDSL;Le23/t;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T7", "Lkotlin/Function7;", "(Lorg/koin/dsl/ScopeDSL;Le23/u;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T8", "Lkotlin/Function8;", "(Lorg/koin/dsl/ScopeDSL;Le23/v;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T9", "Lkotlin/Function9;", "(Lorg/koin/dsl/ScopeDSL;Le23/w;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T10", "Lkotlin/Function10;", "(Lorg/koin/dsl/ScopeDSL;Le23/b;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T11", "Lkotlin/Function11;", "(Lorg/koin/dsl/ScopeDSL;Le23/c;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T12", "Lkotlin/Function12;", "(Lorg/koin/dsl/ScopeDSL;Le23/d;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T13", "Lkotlin/Function13;", "(Lorg/koin/dsl/ScopeDSL;Le23/e;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T14", "Lkotlin/Function14;", "(Lorg/koin/dsl/ScopeDSL;Le23/f;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T15", "Lkotlin/Function15;", "(Lorg/koin/dsl/ScopeDSL;Le23/g;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T16", "Lkotlin/Function16;", "(Lorg/koin/dsl/ScopeDSL;Le23/h;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T17", "Lkotlin/Function17;", "(Lorg/koin/dsl/ScopeDSL;Le23/i;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T18", "Lkotlin/Function18;", "(Lorg/koin/dsl/ScopeDSL;Le23/j;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T19", "Lkotlin/Function19;", "(Lorg/koin/dsl/ScopeDSL;Le23/k;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T20", "Lkotlin/Function20;", "(Lorg/koin/dsl/ScopeDSL;Le23/m;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T21", "Lkotlin/Function21;", "(Lorg/koin/dsl/ScopeDSL;Le23/n;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T22", "Lkotlin/Function22;", "(Lorg/koin/dsl/ScopeDSL;Le23/o;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ScopeFragmentOfKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ a<R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(a<? extends R> aVar) {
            this.$constructor = aVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            scope.getClass();
            parametersHolder.getClass();
            return (Fragment) this.$constructor.invoke();
        }
    }

    public static final <R extends Fragment> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, a<? extends R> aVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        aVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, a aVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        aVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$10, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass10<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ w<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> wVar) {
            this.$constructor = wVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$11, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass11<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ b<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass11(b<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> bVar) {
            this.$constructor = bVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$12, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass12<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ c<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass12(c<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> cVar) {
            this.$constructor = cVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$13, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass13<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ d<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass13(d<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> dVar) {
            this.$constructor = dVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$14, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass14<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ e23.e<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass14(e23.e<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> eVar) {
            this.$constructor = eVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$15, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass15<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ f<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass15(f<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> fVar) {
            this.$constructor = fVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$16, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass16<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ g<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass16(g<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> gVar) {
            this.$constructor = gVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$17, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass17<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ h<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass17(h<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> hVar) {
            this.$constructor = hVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$18, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass18<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ i<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass18(i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> iVar) {
            this.$constructor = iVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$19, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass19<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ j<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass19(j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> jVar) {
            this.$constructor = jVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass2<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ l<T1, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(l<? super T1, ? extends R> lVar) {
            this.$constructor = lVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$20, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass20<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ k<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass20(k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> kVar) {
            this.$constructor = kVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$21, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass21<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ m<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass21(m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> mVar) {
            this.$constructor = mVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$22, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass22<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ n<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass22(n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> nVar) {
            this.$constructor = nVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$23, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass23<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ o<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass23(o<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> oVar) {
            this.$constructor = oVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass3<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ p<T1, T2, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(p<? super T1, ? super T2, ? extends R> pVar) {
            this.$constructor = pVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$4, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass4<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ q<T1, T2, T3, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(q<? super T1, ? super T2, ? super T3, ? extends R> qVar) {
            this.$constructor = qVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$5, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass5<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ r<T1, T2, T3, T4, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> rVar) {
            this.$constructor = rVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$6, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass6<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ e23.s<T1, T2, T3, T4, T5, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(e23.s<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sVar) {
            this.$constructor = sVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$7, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass7<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ t<T1, T2, T3, T4, T5, T6, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> tVar) {
            this.$constructor = tVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$8, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass8<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ u<T1, T2, T3, T4, T5, T6, T7, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> uVar) {
            this.$constructor = uVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeFragmentOfKt$fragmentOf$9, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass9<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ v<T1, T2, T3, T4, T5, T6, T7, T8, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> vVar) {
            this.$constructor = vVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // e23.p
        public final Fragment invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, b<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> bVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        bVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, l lVar, l lVar2, int i14, Object obj) {
        scopeDSL.getClass();
        lVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, c<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> cVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        cVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, d<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> dVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        dVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, p pVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        pVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, e23.e<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> eVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        eVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, f<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> fVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        fVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, q qVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        qVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, g<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> gVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        gVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, h<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> hVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        hVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, r rVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        rVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> iVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        iVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> jVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        jVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, e23.s sVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        sVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> kVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        kVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, l<? super T1, ? extends R> lVar, l<? super BeanDefinition<R>, Unit> lVar2) {
        scopeDSL.getClass();
        lVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, t tVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        tVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> mVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        mVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> nVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        nVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, u uVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        uVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, o<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> oVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        oVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, p<? super T1, ? super T2, ? extends R> pVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        pVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, v vVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        vVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, q<? super T1, ? super T2, ? super T3, ? extends R> qVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        qVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> rVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        rVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, w wVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        wVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, e23.s<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        sVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> tVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        tVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, b bVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        bVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> uVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        uVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> vVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        vVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, c cVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        cVar.getClass();
        s.l();
        throw null;
    }

    public static final <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9> KoinDefinition<R> fragmentOf(ScopeDSL scopeDSL, w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> wVar, l<? super BeanDefinition<R>, Unit> lVar) {
        scopeDSL.getClass();
        wVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, d dVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        dVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, e23.e eVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        eVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, f fVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        fVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, g gVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        gVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, h hVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        hVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, i iVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        iVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, j jVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        jVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, k kVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        kVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, m mVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        mVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, n nVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        nVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition fragmentOf$default(ScopeDSL scopeDSL, o oVar, l lVar, int i14, Object obj) {
        scopeDSL.getClass();
        oVar.getClass();
        s.l();
        throw null;
    }
}
