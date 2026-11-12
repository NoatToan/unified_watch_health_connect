package org.koin.core.module.dsl;

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
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a_\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001am\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001*\u00020\u00012\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00042(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\r\u001a{\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001*\u00020\u00012\u001a\b\u0004\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u000f2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0010\u001a\u0089\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001*\u00020\u00012 \b\u0004\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\u00122(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0013\u001a\u0097\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001*\u00020\u00012&\b\u0004\u0010\u0003\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u00152(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0016\u001a¥\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001*\u00020\u00012,\b\u0004\u0010\u0003\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000\u00182(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0019\u001a³\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001*\u00020\u000122\b\u0004\u0010\u0003\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000\u001b2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u001c\u001aÁ\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001*\u00020\u000128\b\u0004\u0010\u0003\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00000\u001e2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u001f\u001aÏ\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001*\u00020\u00012>\b\u0004\u0010\u0003\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u00000!2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\"\u001aÝ\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001*\u00020\u00012D\b\u0004\u0010\u0003\u001a>\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\u00000$2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010%\u001aë\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001*\u00020\u00012J\b\u0004\u0010\u0003\u001aD\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u00000'2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010(\u001aù\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001\"\u0006\b\u000b\u0010)\u0018\u0001*\u00020\u00012P\b\u0004\u0010\u0003\u001aJ\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\u00000*2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010+\u001a\u0087\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001\"\u0006\b\u000b\u0010)\u0018\u0001\"\u0006\b\f\u0010,\u0018\u0001*\u00020\u00012V\b\u0004\u0010\u0003\u001aP\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\u00000-2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010.\u001a\u0095\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001\"\u0006\b\u000b\u0010)\u0018\u0001\"\u0006\b\f\u0010,\u0018\u0001\"\u0006\b\r\u0010/\u0018\u0001*\u00020\u00012\\\b\u0004\u0010\u0003\u001aV\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u0000002(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u00101\u001a£\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001\"\u0006\b\u000b\u0010)\u0018\u0001\"\u0006\b\f\u0010,\u0018\u0001\"\u0006\b\r\u0010/\u0018\u0001\"\u0006\b\u000e\u00102\u0018\u0001*\u00020\u00012b\b\u0004\u0010\u0003\u001a\\\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u0000032(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u00104\u001a±\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001\"\u0006\b\u000b\u0010)\u0018\u0001\"\u0006\b\f\u0010,\u0018\u0001\"\u0006\b\r\u0010/\u0018\u0001\"\u0006\b\u000e\u00102\u0018\u0001\"\u0006\b\u000f\u00105\u0018\u0001*\u00020\u00012h\b\u0004\u0010\u0003\u001ab\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0000062(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u00107\u001a¿\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001\"\u0006\b\u000b\u0010)\u0018\u0001\"\u0006\b\f\u0010,\u0018\u0001\"\u0006\b\r\u0010/\u0018\u0001\"\u0006\b\u000e\u00102\u0018\u0001\"\u0006\b\u000f\u00105\u0018\u0001\"\u0006\b\u0010\u00108\u0018\u0001*\u00020\u00012n\b\u0004\u0010\u0003\u001ah\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0000092(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010:\u001aÍ\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001\"\u0006\b\u000b\u0010)\u0018\u0001\"\u0006\b\f\u0010,\u0018\u0001\"\u0006\b\r\u0010/\u0018\u0001\"\u0006\b\u000e\u00102\u0018\u0001\"\u0006\b\u000f\u00105\u0018\u0001\"\u0006\b\u0010\u00108\u0018\u0001\"\u0006\b\u0011\u0010;\u0018\u0001*\u00020\u00012t\b\u0004\u0010\u0003\u001an\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u00000<2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010=\u001aÛ\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001\"\u0006\b\u000b\u0010)\u0018\u0001\"\u0006\b\f\u0010,\u0018\u0001\"\u0006\b\r\u0010/\u0018\u0001\"\u0006\b\u000e\u00102\u0018\u0001\"\u0006\b\u000f\u00105\u0018\u0001\"\u0006\b\u0010\u00108\u0018\u0001\"\u0006\b\u0011\u0010;\u0018\u0001\"\u0006\b\u0012\u0010>\u0018\u0001*\u00020\u00012z\b\u0004\u0010\u0003\u001at\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u00000?2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010@\u001aê\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001\"\u0006\b\u000b\u0010)\u0018\u0001\"\u0006\b\f\u0010,\u0018\u0001\"\u0006\b\r\u0010/\u0018\u0001\"\u0006\b\u000e\u00102\u0018\u0001\"\u0006\b\u000f\u00105\u0018\u0001\"\u0006\b\u0010\u00108\u0018\u0001\"\u0006\b\u0011\u0010;\u0018\u0001\"\u0006\b\u0012\u0010>\u0018\u0001\"\u0006\b\u0013\u0010A\u0018\u0001*\u00020\u00012\u0080\u0001\b\u0004\u0010\u0003\u001az\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u00000B2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010C\u001aù\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001\"\u0006\b\u000b\u0010)\u0018\u0001\"\u0006\b\f\u0010,\u0018\u0001\"\u0006\b\r\u0010/\u0018\u0001\"\u0006\b\u000e\u00102\u0018\u0001\"\u0006\b\u000f\u00105\u0018\u0001\"\u0006\b\u0010\u00108\u0018\u0001\"\u0006\b\u0011\u0010;\u0018\u0001\"\u0006\b\u0012\u0010>\u0018\u0001\"\u0006\b\u0013\u0010A\u0018\u0001\"\u0006\b\u0014\u0010D\u0018\u0001*\u00020\u00012\u0087\u0001\b\u0004\u0010\u0003\u001a\u0080\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u0014\u0012\u0004\u0012\u00028\u00000E2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010F\u001a\u0087\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001\"\u0006\b\u000b\u0010)\u0018\u0001\"\u0006\b\f\u0010,\u0018\u0001\"\u0006\b\r\u0010/\u0018\u0001\"\u0006\b\u000e\u00102\u0018\u0001\"\u0006\b\u000f\u00105\u0018\u0001\"\u0006\b\u0010\u00108\u0018\u0001\"\u0006\b\u0011\u0010;\u0018\u0001\"\u0006\b\u0012\u0010>\u0018\u0001\"\u0006\b\u0013\u0010A\u0018\u0001\"\u0006\b\u0014\u0010D\u0018\u0001\"\u0006\b\u0015\u0010G\u0018\u0001*\u00020\u00012\u008d\u0001\b\u0004\u0010\u0003\u001a\u0086\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u0014\u0012\u0004\u0012\u00028\u0015\u0012\u0004\u0012\u00028\u00000H2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010I\u001a\u0095\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\u000e\u0018\u0001\"\u0006\b\u0003\u0010\u0011\u0018\u0001\"\u0006\b\u0004\u0010\u0014\u0018\u0001\"\u0006\b\u0005\u0010\u0017\u0018\u0001\"\u0006\b\u0006\u0010\u001a\u0018\u0001\"\u0006\b\u0007\u0010\u001d\u0018\u0001\"\u0006\b\b\u0010 \u0018\u0001\"\u0006\b\t\u0010#\u0018\u0001\"\u0006\b\n\u0010&\u0018\u0001\"\u0006\b\u000b\u0010)\u0018\u0001\"\u0006\b\f\u0010,\u0018\u0001\"\u0006\b\r\u0010/\u0018\u0001\"\u0006\b\u000e\u00102\u0018\u0001\"\u0006\b\u000f\u00105\u0018\u0001\"\u0006\b\u0010\u00108\u0018\u0001\"\u0006\b\u0011\u0010;\u0018\u0001\"\u0006\b\u0012\u0010>\u0018\u0001\"\u0006\b\u0013\u0010A\u0018\u0001\"\u0006\b\u0014\u0010D\u0018\u0001\"\u0006\b\u0015\u0010G\u0018\u0001\"\u0006\b\u0016\u0010J\u0018\u0001*\u00020\u00012\u0093\u0001\b\u0004\u0010\u0003\u001a\u008c\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u0014\u0012\u0004\u0012\u00028\u0015\u0012\u0004\u0012\u00028\u0016\u0012\u0004\u0012\u00028\u00000K2(\b\n\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010L\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006M"}, d2 = {"R", "Lorg/koin/core/module/Module;", "Lkotlin/Function0;", "constructor", "Lkotlin/Function1;", "Lorg/koin/core/definition/BeanDefinition;", "", "Lorg/koin/core/module/dsl/DefinitionOptions;", "options", "Lorg/koin/core/definition/KoinDefinition;", "singleOf", "(Lorg/koin/core/module/Module;Le23/a;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T1", "(Lorg/koin/core/module/Module;Le23/l;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T2", "Lkotlin/Function2;", "(Lorg/koin/core/module/Module;Le23/p;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T3", "Lkotlin/Function3;", "(Lorg/koin/core/module/Module;Le23/q;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T4", "Lkotlin/Function4;", "(Lorg/koin/core/module/Module;Le23/r;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T5", "Lkotlin/Function5;", "(Lorg/koin/core/module/Module;Le23/s;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T6", "Lkotlin/Function6;", "(Lorg/koin/core/module/Module;Le23/t;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T7", "Lkotlin/Function7;", "(Lorg/koin/core/module/Module;Le23/u;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T8", "Lkotlin/Function8;", "(Lorg/koin/core/module/Module;Le23/v;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T9", "Lkotlin/Function9;", "(Lorg/koin/core/module/Module;Le23/w;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T10", "Lkotlin/Function10;", "(Lorg/koin/core/module/Module;Le23/b;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T11", "Lkotlin/Function11;", "(Lorg/koin/core/module/Module;Le23/c;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T12", "Lkotlin/Function12;", "(Lorg/koin/core/module/Module;Le23/d;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T13", "Lkotlin/Function13;", "(Lorg/koin/core/module/Module;Le23/e;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T14", "Lkotlin/Function14;", "(Lorg/koin/core/module/Module;Le23/f;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T15", "Lkotlin/Function15;", "(Lorg/koin/core/module/Module;Le23/g;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T16", "Lkotlin/Function16;", "(Lorg/koin/core/module/Module;Le23/h;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T17", "Lkotlin/Function17;", "(Lorg/koin/core/module/Module;Le23/i;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T18", "Lkotlin/Function18;", "(Lorg/koin/core/module/Module;Le23/j;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T19", "Lkotlin/Function19;", "(Lorg/koin/core/module/Module;Le23/k;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T20", "Lkotlin/Function20;", "(Lorg/koin/core/module/Module;Le23/m;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T21", "Lkotlin/Function21;", "(Lorg/koin/core/module/Module;Le23/n;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "T22", "Lkotlin/Function22;", "(Lorg/koin/core/module/Module;Le23/o;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SingleOfKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ a<R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(a<? extends R> aVar) {
            this.$constructor = aVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            scope.getClass();
            parametersHolder.getClass();
            return this.$constructor.invoke();
        }
    }

    public static final <R> KoinDefinition<R> singleOf(Module module, a<? extends R> aVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        aVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, a aVar, l lVar, int i14, Object obj) {
        module.getClass();
        aVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$10, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass10<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ w<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> wVar) {
            this.$constructor = wVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$11, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass11<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ b<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass11(b<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> bVar) {
            this.$constructor = bVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$12, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass12<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ c<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass12(c<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> cVar) {
            this.$constructor = cVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$13, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass13<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ d<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass13(d<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> dVar) {
            this.$constructor = dVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$14, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass14<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ e23.e<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass14(e23.e<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> eVar) {
            this.$constructor = eVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$15, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass15<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ f<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass15(f<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> fVar) {
            this.$constructor = fVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$16, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass16<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ g<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass16(g<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> gVar) {
            this.$constructor = gVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$17, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass17<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ h<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass17(h<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> hVar) {
            this.$constructor = hVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$18, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass18<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ i<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass18(i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> iVar) {
            this.$constructor = iVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$19, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass19<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ j<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass19(j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> jVar) {
            this.$constructor = jVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass2<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ l<T1, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(l<? super T1, ? extends R> lVar) {
            this.$constructor = lVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$20, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass20<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ k<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass20(k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> kVar) {
            this.$constructor = kVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$21, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass21<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ m<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass21(m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> mVar) {
            this.$constructor = mVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$22, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass22<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ n<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass22(n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> nVar) {
            this.$constructor = nVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$23, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass23<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ o<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass23(o<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> oVar) {
            this.$constructor = oVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass3<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ p<T1, T2, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(p<? super T1, ? super T2, ? extends R> pVar) {
            this.$constructor = pVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$4, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass4<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ q<T1, T2, T3, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(q<? super T1, ? super T2, ? super T3, ? extends R> qVar) {
            this.$constructor = qVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$5, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass5<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ r<T1, T2, T3, T4, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> rVar) {
            this.$constructor = rVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$6, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass6<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ e23.s<T1, T2, T3, T4, T5, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(e23.s<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sVar) {
            this.$constructor = sVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$7, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass7<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ t<T1, T2, T3, T4, T5, T6, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> tVar) {
            this.$constructor = tVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$8, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass8<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ u<T1, T2, T3, T4, T5, T6, T7, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> uVar) {
            this.$constructor = uVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$9, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass9<R> implements p<Scope, ParametersHolder, R> {
        final /* synthetic */ v<T1, T2, T3, T4, T5, T6, T7, T8, R> $constructor;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> vVar) {
            this.$constructor = vVar;
        }

        @Override // e23.p
        public final R invoke(Scope scope, ParametersHolder parametersHolder) {
            e.p(scope, parametersHolder);
            throw null;
        }
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> KoinDefinition<R> singleOf(Module module, b<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> bVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        bVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, l lVar, l lVar2, int i14, Object obj) {
        module.getClass();
        lVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> KoinDefinition<R> singleOf(Module module, c<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> cVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        cVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> KoinDefinition<R> singleOf(Module module, d<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> dVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        dVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, p pVar, l lVar, int i14, Object obj) {
        module.getClass();
        pVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> KoinDefinition<R> singleOf(Module module, e23.e<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> eVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        eVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> KoinDefinition<R> singleOf(Module module, f<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> fVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        fVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, q qVar, l lVar, int i14, Object obj) {
        module.getClass();
        qVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> KoinDefinition<R> singleOf(Module module, g<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> gVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        gVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> KoinDefinition<R> singleOf(Module module, h<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> hVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        hVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, r rVar, l lVar, int i14, Object obj) {
        module.getClass();
        rVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> KoinDefinition<R> singleOf(Module module, i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> iVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        iVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> KoinDefinition<R> singleOf(Module module, j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> jVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        jVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, e23.s sVar, l lVar, int i14, Object obj) {
        module.getClass();
        sVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> KoinDefinition<R> singleOf(Module module, k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> kVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        kVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1> KoinDefinition<R> singleOf(Module module, l<? super T1, ? extends R> lVar, l<? super BeanDefinition<R>, Unit> lVar2) {
        module.getClass();
        lVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, t tVar, l lVar, int i14, Object obj) {
        module.getClass();
        tVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> KoinDefinition<R> singleOf(Module module, m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> mVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        mVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> KoinDefinition<R> singleOf(Module module, n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> nVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        nVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, u uVar, l lVar, int i14, Object obj) {
        module.getClass();
        uVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> KoinDefinition<R> singleOf(Module module, o<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> oVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        oVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2> KoinDefinition<R> singleOf(Module module, p<? super T1, ? super T2, ? extends R> pVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        pVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, v vVar, l lVar, int i14, Object obj) {
        module.getClass();
        vVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3> KoinDefinition<R> singleOf(Module module, q<? super T1, ? super T2, ? super T3, ? extends R> qVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        qVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4> KoinDefinition<R> singleOf(Module module, r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> rVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        rVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, w wVar, l lVar, int i14, Object obj) {
        module.getClass();
        wVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5> KoinDefinition<R> singleOf(Module module, e23.s<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        sVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6> KoinDefinition<R> singleOf(Module module, t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> tVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        tVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, b bVar, l lVar, int i14, Object obj) {
        module.getClass();
        bVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7> KoinDefinition<R> singleOf(Module module, u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> uVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        uVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8> KoinDefinition<R> singleOf(Module module, v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> vVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        vVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, c cVar, l lVar, int i14, Object obj) {
        module.getClass();
        cVar.getClass();
        s.l();
        throw null;
    }

    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9> KoinDefinition<R> singleOf(Module module, w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> wVar, l<? super BeanDefinition<R>, Unit> lVar) {
        module.getClass();
        wVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, d dVar, l lVar, int i14, Object obj) {
        module.getClass();
        dVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, e23.e eVar, l lVar, int i14, Object obj) {
        module.getClass();
        eVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, f fVar, l lVar, int i14, Object obj) {
        module.getClass();
        fVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, g gVar, l lVar, int i14, Object obj) {
        module.getClass();
        gVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, h hVar, l lVar, int i14, Object obj) {
        module.getClass();
        hVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, i iVar, l lVar, int i14, Object obj) {
        module.getClass();
        iVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, j jVar, l lVar, int i14, Object obj) {
        module.getClass();
        jVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, k kVar, l lVar, int i14, Object obj) {
        module.getClass();
        kVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, m mVar, l lVar, int i14, Object obj) {
        module.getClass();
        mVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, n nVar, l lVar, int i14, Object obj) {
        module.getClass();
        nVar.getClass();
        s.l();
        throw null;
    }

    public static KoinDefinition singleOf$default(Module module, o oVar, l lVar, int i14, Object obj) {
        module.getClass();
        oVar.getClass();
        s.l();
        throw null;
    }
}
