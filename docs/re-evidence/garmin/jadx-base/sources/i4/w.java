package i4;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.room.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i3.e5;
import java.util.List;
import kotlin.k3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.q0;
import p1.t0;
import p13.h0;
import p5.d0;
import p5.j0;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", TtmlNode.LEFT, "", "top", TtmlNode.RIGHT, "bottom", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.r<Integer, Integer, Integer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f90887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewStructure f90888b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, ViewStructure viewStructure) {
            super(4);
            this.f90887a = jVar;
            this.f90888b = viewStructure;
        }

        @Override // e23.r
        public final Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            int iIntValue3 = num3.intValue() - iIntValue;
            int iIntValue4 = num4.intValue() - iIntValue2;
            this.f90887a.getClass();
            this.f90888b.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3, iIntValue4);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:174:0x039d  */
    /* JADX WARN: Code duplicated, block: B:179:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:182:0x03af  */
    /* JADX WARN: Code duplicated, block: B:183:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:186:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:188:0x03c0 A[LOOP:5: B:187:0x03be->B:188:0x03c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:199:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:201:0x040b  */
    /* JADX WARN: Code duplicated, block: B:204:0x01ba A[EDGE_INSN: B:204:0x01ba->B:72:0x01ba BREAK  A[LOOP:0: B:9:0x0044->B:70:0x0195], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0193 A[DONT_INVERT, PHI: r21 r22 r23 r24 r25 r26 r27 r28 r29 r30 r31
      0x0193: PHI (r21v6 i4.r) = (r21v5 i4.r), (r21v7 i4.r) binds: [B:10:0x004e, B:68:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r22v6 boolean) = (r22v5 boolean), (r22v7 boolean) binds: [B:10:0x004e, B:68:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r23v7 r5.a) = (r23v6 r5.a), (r23v8 r5.a) binds: [B:10:0x004e, B:68:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r24v7 s5.c) = (r24v6 s5.c), (r24v8 s5.c) binds: [B:10:0x004e, B:68:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r25v8 i4.h) = (r25v7 i4.h), (r25v9 i4.h) binds: [B:10:0x004e, B:68:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r26v6 i4.s) = (r26v5 i4.s), (r26v7 i4.s) binds: [B:10:0x004e, B:68:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r27v6 java.lang.Boolean) = (r27v5 java.lang.Boolean), (r27v7 java.lang.Boolean) binds: [B:10:0x004e, B:68:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r28v8 p5.l) = (r28v7 p5.l), (r28v9 p5.l) binds: [B:10:0x004e, B:68:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r29v6 boolean) = (r29v5 boolean), (r29v7 boolean) binds: [B:10:0x004e, B:68:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r30v6 boolean) = (r30v5 boolean), (r30v7 boolean) binds: [B:10:0x004e, B:68:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r31v6 java.lang.Integer) = (r31v5 java.lang.Integer), (r31v7 java.lang.Integer) binds: [B:10:0x004e, B:68:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0195 A[LOOP:0: B:9:0x0044->B:70:0x0195, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ViewStructure viewStructure, p5.s sVar, AutofillId autofillId, String str, q5.e eVar) {
        int i14;
        long j8;
        char c14;
        long j14;
        boolean zBooleanValue;
        r5.a aVar;
        s5.c cVar;
        h hVar;
        p5.l lVar;
        r rVar;
        boolean z14;
        s sVar2;
        Boolean bool;
        boolean z15;
        Integer num;
        int i15;
        h hVar2;
        List list;
        Integer numValueOf;
        boolean z16;
        boolean z17;
        boolean z18;
        int i16;
        String strC;
        int size;
        String strM;
        int i17;
        String[] strArrS;
        String[] strArrS2;
        t0<j0<?>, Object> t0Var;
        d0 d0Var;
        d0 d0Var2;
        int i18;
        t0<j0<?>, Object> t0Var2;
        r5.a aVar2;
        s5.c cVar2;
        h hVar3;
        p5.l lVar2;
        int i19;
        j jVar = j.f90842a;
        d0 d0Var3 = d0.f135959a;
        p5.p pVar = p5.p.f136057a;
        p5.q qVarY = sVar.y();
        int i24 = 8;
        int i25 = 1;
        if (qVarY == null || (t0Var2 = qVarY.f136085a) == null) {
            i14 = 2;
            j8 = 255;
            c14 = 7;
            j14 = -9187201950435737472L;
            zBooleanValue = true;
            aVar = null;
            cVar = null;
            hVar = null;
            lVar = null;
            rVar = null;
            z14 = false;
            sVar2 = null;
            bool = null;
            z15 = false;
            num = null;
        } else {
            Object[] objArr = t0Var2.f134721b;
            j8 = 255;
            Object[] objArr2 = t0Var2.f134722c;
            long[] jArr = t0Var2.f134720a;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                i14 = 2;
                int i26 = 0;
                c14 = 7;
                rVar = null;
                z14 = false;
                aVar2 = null;
                cVar2 = null;
                hVar3 = null;
                sVar2 = null;
                bool = null;
                lVar2 = null;
                z15 = false;
                num = null;
                j14 = -9187201950435737472L;
                while (true) {
                    long j15 = jArr[i26];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j15 & 255) < 128) {
                                int i29 = (i26 << 3) + i28;
                                Object obj = objArr[i29];
                                Object obj2 = objArr2[i29];
                                j0 j0Var = (j0) obj;
                                d0Var3.getClass();
                                i19 = i24;
                                if (p005kotlin.jvm.internal.s.g(j0Var, d0.f135978t)) {
                                    obj2.getClass();
                                    rVar = (r) obj2;
                                } else if (p005kotlin.jvm.internal.s.g(j0Var, d0.f135960b)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) h0.d0((List) obj2);
                                    if (charSequence != null) {
                                        jVar.getClass();
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (p005kotlin.jvm.internal.s.g(j0Var, d0.f135977s)) {
                                    obj2.getClass();
                                    sVar2 = (s) obj2;
                                } else if (p005kotlin.jvm.internal.s.g(j0Var, d0.f135979u)) {
                                    obj2.getClass();
                                    hVar3 = (h) obj2;
                                } else if (p005kotlin.jvm.internal.s.g(j0Var, d0.H)) {
                                    obj2.getClass();
                                    cVar2 = (s5.c) obj2;
                                } else if (p005kotlin.jvm.internal.s.g(j0Var, d0.f135971m)) {
                                    obj2.getClass();
                                    boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                                    jVar.getClass();
                                    viewStructure.setFocused(zBooleanValue2);
                                } else if (p005kotlin.jvm.internal.s.g(j0Var, d0.Q)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (p005kotlin.jvm.internal.s.g(j0Var, d0.M)) {
                                    z15 = true;
                                } else if (p005kotlin.jvm.internal.s.g(j0Var, d0.f135974p)) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (p005kotlin.jvm.internal.s.g(j0Var, d0.A)) {
                                    obj2.getClass();
                                    lVar2 = (p5.l) obj2;
                                } else if (p005kotlin.jvm.internal.s.g(j0Var, d0.K)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (p005kotlin.jvm.internal.s.g(j0Var, d0.L)) {
                                    obj2.getClass();
                                    aVar2 = (r5.a) obj2;
                                } else {
                                    pVar.getClass();
                                    if (p005kotlin.jvm.internal.s.g(j0Var, p5.p.f136059c)) {
                                        jVar.getClass();
                                        viewStructure.setClickable(true);
                                    } else if (p005kotlin.jvm.internal.s.g(j0Var, p5.p.f136060d)) {
                                        jVar.getClass();
                                        viewStructure.setLongClickable(true);
                                    } else if (p005kotlin.jvm.internal.s.g(j0Var, p5.p.f136080x)) {
                                        jVar.getClass();
                                        viewStructure.setFocusable(true);
                                    } else if (p005kotlin.jvm.internal.s.g(j0Var, p5.p.f136068l)) {
                                        z14 = true;
                                    }
                                }
                            } else {
                                i19 = i24;
                            }
                            j15 >>= i19;
                            i28++;
                            i24 = i19;
                        }
                        if (i27 != i24) {
                            break;
                        }
                        if (i26 != length) {
                            break;
                        }
                        i26++;
                        i24 = 8;
                    } else if (i26 != length) {
                        break;
                        break;
                    } else {
                        i26++;
                        i24 = 8;
                    }
                }
            } else {
                i14 = 2;
                c14 = 7;
                j14 = -9187201950435737472L;
                zBooleanValue = true;
                rVar = null;
                z14 = false;
                aVar2 = null;
                cVar2 = null;
                hVar3 = null;
                sVar2 = null;
                bool = null;
                lVar2 = null;
                z15 = false;
                num = null;
            }
            aVar = aVar2;
            cVar = cVar2;
            hVar = hVar3;
            lVar = lVar2;
        }
        p5.q qVarY2 = sVar.y();
        if (qVarY2 != null && qVarY2.f136088d && !qVarY2.f136089e) {
            qVarY2 = qVarY2.b();
            q0 q0Var = new q0(sVar.z().size());
            q0Var.h(sVar.z());
            while (q0Var.e()) {
                p5.s sVar3 = (p5.s) q0Var.l(q0Var.f134668b - 1);
                p5.q qVarY3 = sVar3.y();
                if (qVarY3 != null && !qVarY3.f136088d) {
                    qVarY2.e(qVarY3);
                    if (!qVarY3.f136089e) {
                        q0Var.h(sVar3.z());
                    }
                }
            }
        }
        if (qVarY2 == null || (t0Var = qVarY2.f136085a) == null) {
            i15 = 1;
            hVar2 = hVar;
            list = null;
        } else {
            Object[] objArr3 = t0Var.f134721b;
            Object[] objArr4 = t0Var.f134722c;
            long[] jArr2 = t0Var.f134720a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i30 = 0;
                list = null;
                while (true) {
                    long j16 = jArr2[i30];
                    i15 = i25;
                    hVar2 = hVar;
                    if ((((~j16) << c14) & j16 & j14) != j14) {
                        int i34 = 8 - ((~(i30 - length2)) >>> 31);
                        int i35 = 0;
                        while (i35 < i34) {
                            if ((j16 & j8) < 128) {
                                int i36 = (i30 << 3) + i35;
                                Object obj3 = objArr3[i36];
                                Object obj4 = objArr4[i36];
                                d0Var2 = d0Var3;
                                j0 j0Var2 = (j0) obj3;
                                d0Var2.getClass();
                                i18 = i35;
                                if (p005kotlin.jvm.internal.s.g(j0Var2, d0.f135969k)) {
                                    jVar.getClass();
                                    viewStructure.setEnabled(false);
                                } else if (p005kotlin.jvm.internal.s.g(j0Var2, d0.D)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                d0Var2 = d0Var3;
                                i18 = i35;
                            }
                            j16 >>= 8;
                            i35 = i18 + 1;
                            d0Var3 = d0Var2;
                        }
                        d0Var = d0Var3;
                        if (i34 != 8) {
                            break;
                        }
                    } else {
                        d0Var = d0Var3;
                    }
                    if (i30 == length2) {
                        break;
                    }
                    i30++;
                    i25 = i15;
                    hVar = hVar2;
                    d0Var3 = d0Var;
                }
            } else {
                i15 = 1;
                hVar2 = hVar;
                list = null;
            }
        }
        Integer numValueOf2 = Integer.valueOf(sVar.getF81761b());
        if (sVar.B() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        jVar.getClass();
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (rVar != null) {
            numValueOf = Integer.valueOf(((f) rVar).f90839b);
        } else if (z14) {
            numValueOf = Integer.valueOf(i15);
        } else {
            numValueOf = aVar != null ? Integer.valueOf(i14) : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (cVar != null) {
            viewStructure.setAutofillValue(j.a(cVar.f157138b));
        }
        if (hVar2 != null) {
            viewStructure.setAutofillValue(hVar2.f90841b);
        }
        if (sVar2 != null && (strArrS2 = gg.b.s(sVar2)) != null) {
            viewStructure.setAutofillHints(strArrS2);
        }
        eVar.f142832b.e(sVar.getF81761b(), new a(jVar, viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (aVar != null) {
            viewStructure.setCheckable(i15);
            viewStructure.setChecked(aVar == r5.a.On);
        } else if (bool != null) {
            p5.l.f136032b.getClass();
            int i37 = p5.l.f136036f;
            if (lVar == null || lVar.f136041a != i37) {
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
        }
        s.f90879a.getClass();
        String str2 = (String) p13.u.E(gg.b.s(s.a.f90881b));
        if (sVar2 != null && (strArrS = gg.b.s(sVar2)) != null) {
            boolean z19 = p13.u.z(strArrS, str2);
            z16 = true;
            boolean z24 = z19;
            if (!z15 || z24) {
                z17 = z16;
            } else {
                z17 = false;
            }
            if (!z17 || zBooleanValue) {
                z18 = z16;
            } else {
                z18 = false;
            }
            viewStructure.setDataIsSensitive(z18);
            if (sVar.A()) {
                i16 = 4;
            } else {
                i16 = 0;
            }
            viewStructure.setVisibility(i16);
            if (list != null) {
                size = list.size();
                strM = "";
                for (i17 = 0; i17 < size; i17++) {
                    strM = a0.m(e5.k(strM), ((s5.c) list.get(i17)).f157138b, '\n');
                }
                viewStructure.setText(strM);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (sVar.z().isEmpty() && lVar != null && (strC = k3.c(lVar.f136041a)) != null) {
                viewStructure.setClassName(strC);
            }
            if (z14) {
                viewStructure.setClassName("android.widget.EditText");
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    l.f90844a.getClass();
                    viewStructure.setMaxTextLength(iIntValue2);
                }
                if (z17) {
                    viewStructure.setInputType(129);
                }
            }
        }
        z16 = true;
        if (z15) {
            z17 = z16;
        } else {
            z17 = z16;
        }
        if (z17) {
            z18 = z16;
        } else {
            z18 = z16;
        }
        viewStructure.setDataIsSensitive(z18);
        if (sVar.A()) {
            i16 = 4;
        } else {
            i16 = 0;
        }
        viewStructure.setVisibility(i16);
        if (list != null) {
            size = list.size();
            strM = "";
            while (i17 < size) {
                strM = a0.m(e5.k(strM), ((s5.c) list.get(i17)).f157138b, '\n');
            }
            viewStructure.setText(strM);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (sVar.z().isEmpty()) {
            viewStructure.setClassName(strC);
        }
        if (z14) {
            viewStructure.setClassName("android.widget.EditText");
            if (num != null) {
                int iIntValue3 = num.intValue();
                l.f90844a.getClass();
                viewStructure.setMaxTextLength(iIntValue3);
            }
            if (z17) {
                viewStructure.setInputType(129);
            }
        }
    }
}
