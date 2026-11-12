package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import b.g;
import b82.o;
import c.j;
import d23.b;
import d53.w;
import ds.e0;
import e6.c;
import e6.d;
import f6.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.y;
import vb.h;
import z3.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Lb/g;", "<init>", "()V", "ui-tooling"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewActivity extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6058a = 0;

    /* JADX WARN: Code duplicated, block: B:49:0x00e5 A[Catch: b -> 0x0100, LOOP:3: B:47:0x00df->B:49:0x00e5, LOOP_END, TryCatch #0 {b -> 0x0100, blocks: (B:18:0x0050, B:20:0x005a, B:29:0x0071, B:31:0x007f, B:33:0x008f, B:34:0x0098, B:36:0x00a5, B:37:0x00aa, B:39:0x00b0, B:46:0x00cc, B:47:0x00df, B:49:0x00e5, B:50:0x00f1, B:43:0x00bb, B:45:0x00c4, B:51:0x00f8, B:52:0x00ff, B:25:0x0069), top: B:62:0x0050 }] */
    @Override // b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String stringExtra;
        Class<?> cls;
        Object next;
        ArrayList arrayList;
        Iterator it;
        Object[] array;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        String strH0 = w.h0(stringExtra, '.');
        String strD0 = w.d0('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            j.a(this, new e(-840626948, true, new o(strH0, strD0, 6)));
            return;
        }
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException unused) {
            d.f63146a.getClass();
            cls = null;
        }
        int intExtra = getIntent().getIntExtra("parameterProviderIndex", -1);
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                Constructor<?> constructor = null;
                int i14 = 0;
                boolean z14 = false;
                while (true) {
                    if (i14 < length) {
                        Constructor<?> constructor2 = constructors[i14];
                        if (constructor2.getParameterTypes().length == 0) {
                            if (!z14) {
                                z14 = true;
                                constructor = constructor2;
                            }
                        }
                        i14++;
                    } else if (!z14) {
                    }
                    constructor = null;
                    break;
                }
                if (constructor == null) {
                    throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
                }
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                objNewInstance.getClass();
                a aVar = (a) objNewInstance;
                if (intExtra < 0) {
                    c53.j jVarA = aVar.a();
                    int count = aVar.getCount();
                    Iterator it3 = jVarA.iterator();
                    array = new Object[count];
                    for (int i15 = 0; i15 < count; i15++) {
                        array[i15] = it3.next();
                    }
                } else {
                    c53.j jVarA2 = aVar.a();
                    jVarA2.getClass();
                    if (intExtra >= 0) {
                        Iterator it4 = jVarA2.iterator();
                        int i16 = 0;
                        while (true) {
                            if (it4.hasNext()) {
                                next = it4.next();
                                int i17 = i16 + 1;
                                if (intExtra == i16) {
                                    break;
                                } else {
                                    i16 = i17;
                                }
                            } else {
                                org.apache.commons.lang3.e.v(e0.i("Sequence doesn't contain element at index ", intExtra, '.'));
                            }
                        }
                        List listC = p13.w.c(next);
                        arrayList = new ArrayList(y.r(listC, 10));
                        it = listC.iterator();
                        while (it.hasNext()) {
                            arrayList.add(e6.e.a(it.next()));
                        }
                        array = arrayList.toArray(new Object[0]);
                    } else {
                        org.apache.commons.lang3.e.v(e0.i("Sequence doesn't contain element at index ", intExtra, '.'));
                    }
                    next = null;
                    List listC2 = p13.w.c(next);
                    arrayList = new ArrayList(y.r(listC2, 10));
                    it = listC2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(e6.e.a(it.next()));
                    }
                    array = arrayList.toArray(new Object[0]);
                }
            } catch (b unused2) {
                h.z("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
                return;
            }
        } else {
            array = new Object[0];
        }
        if (array.length > 1) {
            j.a(this, new e(-861939235, true, new c(array, strH0, strD0)));
        } else {
            j.a(this, new e(-1901447514, true, new c(strH0, strD0, array)));
        }
    }
}
