package org.koin.core.module.dsl;

import e23.a;
import e23.b;
import e23.c;
import e23.d;
import e23.e;
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
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\b\u001aI\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001*\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u000b\u001aW\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001*\u00020\u00012\u001e\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u000e\u001ae\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001*\u00020\u00012$\u0010\u0003\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0011\u001as\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001*\u00020\u00012*\u0010\u0003\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0014\u001a\u0081\u0001\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001*\u00020\u000120\u0010\u0003\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0017\u001a\u008f\u0001\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001*\u00020\u000126\u0010\u0003\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u001a\u001a\u009d\u0001\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001*\u00020\u00012<\u0010\u0003\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u001d\u001a«\u0001\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001*\u00020\u00012B\u0010\u0003\u001a>\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010 \u001a¹\u0001\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001*\u00020\u00012H\u0010\u0003\u001aD\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u00000\"H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010#\u001aÇ\u0001\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001\"\u0006\b\u000b\u0010$\u0018\u0001*\u00020\u00012N\u0010\u0003\u001aJ\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\u00000%H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010&\u001aÕ\u0001\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001\"\u0006\b\u000b\u0010$\u0018\u0001\"\u0006\b\f\u0010'\u0018\u0001*\u00020\u00012T\u0010\u0003\u001aP\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\u00000(H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010)\u001aã\u0001\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001\"\u0006\b\u000b\u0010$\u0018\u0001\"\u0006\b\f\u0010'\u0018\u0001\"\u0006\b\r\u0010*\u0018\u0001*\u00020\u00012Z\u0010\u0003\u001aV\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u00000+H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010,\u001añ\u0001\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001\"\u0006\b\u000b\u0010$\u0018\u0001\"\u0006\b\f\u0010'\u0018\u0001\"\u0006\b\r\u0010*\u0018\u0001\"\u0006\b\u000e\u0010-\u0018\u0001*\u00020\u00012`\u0010\u0003\u001a\\\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u00000.H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010/\u001aÿ\u0001\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001\"\u0006\b\u000b\u0010$\u0018\u0001\"\u0006\b\f\u0010'\u0018\u0001\"\u0006\b\r\u0010*\u0018\u0001\"\u0006\b\u000e\u0010-\u0018\u0001\"\u0006\b\u000f\u00100\u0018\u0001*\u00020\u00012f\u0010\u0003\u001ab\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u000001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u00102\u001a\u008d\u0002\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001\"\u0006\b\u000b\u0010$\u0018\u0001\"\u0006\b\f\u0010'\u0018\u0001\"\u0006\b\r\u0010*\u0018\u0001\"\u0006\b\u000e\u0010-\u0018\u0001\"\u0006\b\u000f\u00100\u0018\u0001\"\u0006\b\u0010\u00103\u0018\u0001*\u00020\u00012l\u0010\u0003\u001ah\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u000004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u00105\u001a\u009b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001\"\u0006\b\u000b\u0010$\u0018\u0001\"\u0006\b\f\u0010'\u0018\u0001\"\u0006\b\r\u0010*\u0018\u0001\"\u0006\b\u000e\u0010-\u0018\u0001\"\u0006\b\u000f\u00100\u0018\u0001\"\u0006\b\u0010\u00103\u0018\u0001\"\u0006\b\u0011\u00106\u0018\u0001*\u00020\u00012r\u0010\u0003\u001an\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u000007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u00108\u001a©\u0002\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001\"\u0006\b\u000b\u0010$\u0018\u0001\"\u0006\b\f\u0010'\u0018\u0001\"\u0006\b\r\u0010*\u0018\u0001\"\u0006\b\u000e\u0010-\u0018\u0001\"\u0006\b\u000f\u00100\u0018\u0001\"\u0006\b\u0010\u00103\u0018\u0001\"\u0006\b\u0011\u00106\u0018\u0001\"\u0006\b\u0012\u00109\u0018\u0001*\u00020\u00012x\u0010\u0003\u001at\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u00000:H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010;\u001a·\u0002\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001\"\u0006\b\u000b\u0010$\u0018\u0001\"\u0006\b\f\u0010'\u0018\u0001\"\u0006\b\r\u0010*\u0018\u0001\"\u0006\b\u000e\u0010-\u0018\u0001\"\u0006\b\u000f\u00100\u0018\u0001\"\u0006\b\u0010\u00103\u0018\u0001\"\u0006\b\u0011\u00106\u0018\u0001\"\u0006\b\u0012\u00109\u0018\u0001\"\u0006\b\u0013\u0010<\u0018\u0001*\u00020\u00012~\u0010\u0003\u001az\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u00000=H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010>\u001aÇ\u0002\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001\"\u0006\b\u000b\u0010$\u0018\u0001\"\u0006\b\f\u0010'\u0018\u0001\"\u0006\b\r\u0010*\u0018\u0001\"\u0006\b\u000e\u0010-\u0018\u0001\"\u0006\b\u000f\u00100\u0018\u0001\"\u0006\b\u0010\u00103\u0018\u0001\"\u0006\b\u0011\u00106\u0018\u0001\"\u0006\b\u0012\u00109\u0018\u0001\"\u0006\b\u0013\u0010<\u0018\u0001\"\u0006\b\u0014\u0010?\u0018\u0001*\u00020\u00012\u0085\u0001\u0010\u0003\u001a\u0080\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u0014\u0012\u0004\u0012\u00028\u00000@H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010A\u001aÕ\u0002\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001\"\u0006\b\u000b\u0010$\u0018\u0001\"\u0006\b\f\u0010'\u0018\u0001\"\u0006\b\r\u0010*\u0018\u0001\"\u0006\b\u000e\u0010-\u0018\u0001\"\u0006\b\u000f\u00100\u0018\u0001\"\u0006\b\u0010\u00103\u0018\u0001\"\u0006\b\u0011\u00106\u0018\u0001\"\u0006\b\u0012\u00109\u0018\u0001\"\u0006\b\u0013\u0010<\u0018\u0001\"\u0006\b\u0014\u0010?\u0018\u0001\"\u0006\b\u0015\u0010B\u0018\u0001*\u00020\u00012\u008b\u0001\u0010\u0003\u001a\u0086\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u0014\u0012\u0004\u0012\u00028\u0015\u0012\u0004\u0012\u00028\u00000CH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010D\u001aã\u0002\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\t\u0018\u0001\"\u0006\b\u0003\u0010\f\u0018\u0001\"\u0006\b\u0004\u0010\u000f\u0018\u0001\"\u0006\b\u0005\u0010\u0012\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0018\u0018\u0001\"\u0006\b\b\u0010\u001b\u0018\u0001\"\u0006\b\t\u0010\u001e\u0018\u0001\"\u0006\b\n\u0010!\u0018\u0001\"\u0006\b\u000b\u0010$\u0018\u0001\"\u0006\b\f\u0010'\u0018\u0001\"\u0006\b\r\u0010*\u0018\u0001\"\u0006\b\u000e\u0010-\u0018\u0001\"\u0006\b\u000f\u00100\u0018\u0001\"\u0006\b\u0010\u00103\u0018\u0001\"\u0006\b\u0011\u00106\u0018\u0001\"\u0006\b\u0012\u00109\u0018\u0001\"\u0006\b\u0013\u0010<\u0018\u0001\"\u0006\b\u0014\u0010?\u0018\u0001\"\u0006\b\u0015\u0010B\u0018\u0001\"\u0006\b\u0016\u0010E\u0018\u0001*\u00020\u00012\u0091\u0001\u0010\u0003\u001a\u008c\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012\u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u0014\u0012\u0004\u0012\u00028\u0015\u0012\u0004\u0012\u00028\u0016\u0012\u0004\u0012\u00028\u00000FH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010G\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H"}, d2 = {"R", "Lorg/koin/core/scope/Scope;", "Lkotlin/Function0;", "constructor", "new", "(Lorg/koin/core/scope/Scope;Le23/a;)Ljava/lang/Object;", "T1", "Lkotlin/Function1;", "(Lorg/koin/core/scope/Scope;Le23/l;)Ljava/lang/Object;", "T2", "Lkotlin/Function2;", "(Lorg/koin/core/scope/Scope;Le23/p;)Ljava/lang/Object;", "T3", "Lkotlin/Function3;", "(Lorg/koin/core/scope/Scope;Le23/q;)Ljava/lang/Object;", "T4", "Lkotlin/Function4;", "(Lorg/koin/core/scope/Scope;Le23/r;)Ljava/lang/Object;", "T5", "Lkotlin/Function5;", "(Lorg/koin/core/scope/Scope;Le23/s;)Ljava/lang/Object;", "T6", "Lkotlin/Function6;", "(Lorg/koin/core/scope/Scope;Le23/t;)Ljava/lang/Object;", "T7", "Lkotlin/Function7;", "(Lorg/koin/core/scope/Scope;Le23/u;)Ljava/lang/Object;", "T8", "Lkotlin/Function8;", "(Lorg/koin/core/scope/Scope;Le23/v;)Ljava/lang/Object;", "T9", "Lkotlin/Function9;", "(Lorg/koin/core/scope/Scope;Le23/w;)Ljava/lang/Object;", "T10", "Lkotlin/Function10;", "(Lorg/koin/core/scope/Scope;Le23/b;)Ljava/lang/Object;", "T11", "Lkotlin/Function11;", "(Lorg/koin/core/scope/Scope;Le23/c;)Ljava/lang/Object;", "T12", "Lkotlin/Function12;", "(Lorg/koin/core/scope/Scope;Le23/d;)Ljava/lang/Object;", "T13", "Lkotlin/Function13;", "(Lorg/koin/core/scope/Scope;Le23/e;)Ljava/lang/Object;", "T14", "Lkotlin/Function14;", "(Lorg/koin/core/scope/Scope;Le23/f;)Ljava/lang/Object;", "T15", "Lkotlin/Function15;", "(Lorg/koin/core/scope/Scope;Le23/g;)Ljava/lang/Object;", "T16", "Lkotlin/Function16;", "(Lorg/koin/core/scope/Scope;Le23/h;)Ljava/lang/Object;", "T17", "Lkotlin/Function17;", "(Lorg/koin/core/scope/Scope;Le23/i;)Ljava/lang/Object;", "T18", "Lkotlin/Function18;", "(Lorg/koin/core/scope/Scope;Le23/j;)Ljava/lang/Object;", "T19", "Lkotlin/Function19;", "(Lorg/koin/core/scope/Scope;Le23/k;)Ljava/lang/Object;", "T20", "Lkotlin/Function20;", "(Lorg/koin/core/scope/Scope;Le23/m;)Ljava/lang/Object;", "T21", "Lkotlin/Function21;", "(Lorg/koin/core/scope/Scope;Le23/n;)Ljava/lang/Object;", "T22", "Lkotlin/Function22;", "(Lorg/koin/core/scope/Scope;Le23/o;)Ljava/lang/Object;", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NewKt {
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R> R m474new(Scope scope, a<? extends R> aVar) {
        scope.getClass();
        aVar.getClass();
        return aVar.invoke();
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> R m475new(Scope scope, b<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> bVar) {
        scope.getClass();
        bVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> R m476new(Scope scope, c<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> cVar) {
        scope.getClass();
        cVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> R m477new(Scope scope, d<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> dVar) {
        scope.getClass();
        dVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> R m478new(Scope scope, e<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> eVar) {
        scope.getClass();
        eVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> R m479new(Scope scope, f<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> fVar) {
        scope.getClass();
        fVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> R m480new(Scope scope, g<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> gVar) {
        scope.getClass();
        gVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> R m481new(Scope scope, h<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> hVar) {
        scope.getClass();
        hVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> R m482new(Scope scope, i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> iVar) {
        scope.getClass();
        iVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> R m483new(Scope scope, j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> jVar) {
        scope.getClass();
        jVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> R m484new(Scope scope, k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> kVar) {
        scope.getClass();
        kVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1> R m485new(Scope scope, l<? super T1, ? extends R> lVar) {
        scope.getClass();
        lVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> R m486new(Scope scope, m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> mVar) {
        scope.getClass();
        mVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> R m487new(Scope scope, n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> nVar) {
        scope.getClass();
        nVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> R m488new(Scope scope, o<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> oVar) {
        scope.getClass();
        oVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2> R m489new(Scope scope, p<? super T1, ? super T2, ? extends R> pVar) {
        scope.getClass();
        pVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3> R m490new(Scope scope, q<? super T1, ? super T2, ? super T3, ? extends R> qVar) {
        scope.getClass();
        qVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4> R m491new(Scope scope, r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> rVar) {
        scope.getClass();
        rVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5> R m492new(Scope scope, e23.s<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sVar) {
        scope.getClass();
        sVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6> R m493new(Scope scope, t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> tVar) {
        scope.getClass();
        tVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7> R m494new(Scope scope, u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> uVar) {
        scope.getClass();
        uVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8> R m495new(Scope scope, v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> vVar) {
        scope.getClass();
        vVar.getClass();
        s.l();
        throw null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final <R, T1, T2, T3, T4, T5, T6, T7, T8, T9> R m496new(Scope scope, w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> wVar) {
        scope.getClass();
        wVar.getClass();
        s.l();
        throw null;
    }
}
