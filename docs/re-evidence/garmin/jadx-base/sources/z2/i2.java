package z2;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", l = {923, 923}, m = "invokeSuspend", v = 1)
public final class i2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f201647b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(h2 h2Var, t13.d<? super i2> dVar) {
        super(2, dVar);
        this.f201647b = h2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i2(this.f201647b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x031c, code lost:
    
        if (r3 == r1) goto L139;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        CharSequence text;
        CharSequence charSequence;
        int i14;
        Spanned spanned;
        int i15;
        char c14;
        int i16;
        int i17;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = this.f201646a;
        Object cVar = null;
        h2 h2Var = this.f201647b;
        byte b14 = 1;
        if (i18 == 0) {
            o13.r.b(obj);
            kotlin.o1 o1Var = h2Var.f201611h;
            if (o1Var != null) {
                this.f201646a = 1;
                objA = o1Var.a();
                if (objA != aVar) {
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
        if (i18 == 1) {
            o13.r.b(obj);
            objA = obj;
        } else {
            if (i18 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            cVar = obj;
        }
        s5.c cVar2 = (s5.c) cVar;
        if (cVar2 != null) {
            if (h2Var.q()) {
                s5.c cVarD = w2.a0.l(h2Var.u(), h2Var.u().f188878a.f157138b.length()).d(cVar2).d(w2.a0.k(h2Var.u(), h2Var.u().f188878a.f157138b.length()));
                int length = cVar2.f157138b.length() + s5.w0.h(h2Var.u().f188879b);
                h2Var.f201606c.invoke(h2.k(cVarD, og.a.l(length, length)));
                h2Var.z(p006l2.m1.None);
                s3 s3Var = h2Var.f201604a;
                if (s3Var != null) {
                    s3Var.f108789f = true;
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
        kotlin.m1 m1Var = (kotlin.m1) objA;
        if (m1Var != null) {
            this.f201646a = 2;
            int i19 = b2.a.f14460a;
            int i24 = 0;
            ClipData.Item itemAt = m1Var.f91340a.getItemAt(0);
            if (itemAt != null && (text = itemAt.getText()) != null) {
                if (text instanceof Spanned) {
                    Spanned spanned2 = (Spanned) text;
                    Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, spanned2.length(), Annotation.class);
                    ArrayList arrayList = new ArrayList();
                    annotationArr.getClass();
                    int length2 = annotationArr.length - 1;
                    if (length2 >= 0) {
                        int i25 = 0;
                        while (true) {
                            Annotation annotation = annotationArr[i25];
                            if (p005kotlin.jvm.internal.s.g(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                int spanStart = spanned2.getSpanStart(annotation);
                                int spanEnd = spanned2.getSpanEnd(annotation);
                                b2.c cVar3 = new b2.c(annotation.getValue());
                                b2.f fVar = new b2.f(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
                                i14 = i24;
                                while (true) {
                                    Parcel parcel = cVar3.f14461a;
                                    if (parcel.dataAvail() <= b14) {
                                        break;
                                    }
                                    byte b15 = parcel.readByte();
                                    if (b15 == b14) {
                                        if (parcel.dataAvail() < 8) {
                                            break;
                                        }
                                        fVar.f14463a = cVar3.a();
                                        b14 = 1;
                                    } else if (b15 == 2) {
                                        if (parcel.dataAvail() < 5) {
                                            break;
                                        }
                                        fVar.f14464b = cVar3.b();
                                        b14 = 1;
                                    } else if (b15 == 3) {
                                        if (parcel.dataAvail() < 4) {
                                            break;
                                        }
                                        fVar.f14465c = new w5.f0(parcel.readInt());
                                        b14 = 1;
                                    } else if (b15 == 4) {
                                        if (parcel.dataAvail() < 1) {
                                            break;
                                        }
                                        byte b16 = parcel.readByte();
                                        if (b16 != 0 && b16 == 1) {
                                            w5.b0.f182070b.getClass();
                                            i15 = w5.b0.f182071c;
                                        } else {
                                            w5.b0.f182070b.getClass();
                                            i15 = i14;
                                        }
                                        fVar.f14466d = w5.b0.a(i15);
                                        b14 = 1;
                                    } else if (b15 != 5) {
                                        c14 = 2;
                                        if (b15 == 6) {
                                            fVar.f14469g = parcel.readString();
                                        } else if (b15 == 7) {
                                            if (parcel.dataAvail() < 5) {
                                                break;
                                            }
                                            fVar.f14470h = cVar3.b();
                                        } else if (b15 == 8) {
                                            if (parcel.dataAvail() < 4) {
                                                break;
                                            }
                                            fVar.f14471i = d6.a.a(parcel.readFloat());
                                        } else if (b15 == 9) {
                                            if (parcel.dataAvail() < 8) {
                                                break;
                                            }
                                            fVar.f14472j = new d6.m(parcel.readFloat(), parcel.readFloat());
                                            b14 = 1;
                                        } else if (b15 == 10) {
                                            if (parcel.dataAvail() < 8) {
                                                break;
                                            }
                                            fVar.f14474l = cVar3.a();
                                            b14 = 1;
                                        } else if (b15 != 11) {
                                            if (b15 == 12) {
                                                if (parcel.dataAvail() < 20) {
                                                    break;
                                                }
                                                long jA = cVar3.a();
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L);
                                                n4.c.a aVar2 = n4.c.f123541b;
                                                fVar.f14476n = new o4.q1(jA, jFloatToRawIntBits, parcel.readFloat(), null);
                                                text = text;
                                                spanned2 = spanned2;
                                            }
                                            b14 = 1;
                                        } else {
                                            if (parcel.dataAvail() < 4) {
                                                break;
                                            }
                                            int i26 = parcel.readInt();
                                            d6.i.f57760b.getClass();
                                            d6.i iVar = d6.i.f57763e;
                                            int i27 = (iVar.f57764a & i26) != 0 ? 1 : i14;
                                            d6.i iVar2 = d6.i.f57762d;
                                            int i28 = (i26 & iVar2.f57764a) != 0 ? 1 : i14;
                                            if (i27 != 0 && i28 != 0) {
                                                List listK = p13.x.k(iVar, iVar2);
                                                Integer numValueOf = Integer.valueOf(i14);
                                                int size = listK.size();
                                                int i29 = i14;
                                                while (i29 < size) {
                                                    numValueOf = Integer.valueOf(((d6.i) listK.get(i29)).f57764a | numValueOf.intValue());
                                                    i29++;
                                                    listK = listK;
                                                }
                                                iVar = new d6.i(numValueOf.intValue());
                                            } else if (i27 == 0) {
                                                iVar = i28 != 0 ? iVar2 : d6.i.f57761c;
                                            }
                                            fVar.f14475m = iVar;
                                            b14 = 1;
                                        }
                                        b14 = 1;
                                    } else {
                                        if (parcel.dataAvail() < 1) {
                                            break;
                                        }
                                        byte b17 = parcel.readByte();
                                        if (b17 == 0) {
                                            w5.c0.f182075b.getClass();
                                            i16 = i14;
                                        } else {
                                            if (b17 == 1) {
                                                w5.c0.f182075b.getClass();
                                                i17 = w5.c0.f182078e;
                                            } else {
                                                if (b17 == 3) {
                                                    w5.c0.f182075b.getClass();
                                                    i17 = w5.c0.f182077d;
                                                } else {
                                                    c14 = 2;
                                                    if (b17 == 2) {
                                                        w5.c0.f182075b.getClass();
                                                        i16 = w5.c0.f182076c;
                                                    } else {
                                                        w5.c0.f182075b.getClass();
                                                        i16 = i14;
                                                    }
                                                }
                                                fVar.f14467e = w5.c0.a(i16);
                                                b14 = 1;
                                            }
                                            i16 = i17;
                                        }
                                        c14 = 2;
                                        fVar.f14467e = w5.c0.a(i16);
                                        b14 = 1;
                                    }
                                }
                                charSequence = text;
                                spanned = spanned2;
                                arrayList.add(new s5.c.d(new s5.i0(fVar.f14463a, fVar.f14464b, fVar.f14465c, fVar.f14466d, fVar.f14467e, fVar.f14468f, fVar.f14469g, fVar.f14470h, fVar.f14471i, fVar.f14472j, fVar.f14473k, fVar.f14474l, fVar.f14475m, fVar.f14476n, (s5.b0) null, (q4.g) null, 49152, (p005kotlin.jvm.internal.j) null), spanStart, spanEnd));
                            } else {
                                charSequence = text;
                                spanned = spanned2;
                                i14 = i24;
                            }
                            if (i25 == length2) {
                                break;
                            }
                            i25++;
                            i24 = i14;
                            text = charSequence;
                            spanned2 = spanned;
                            b14 = 1;
                        }
                    } else {
                        charSequence = text;
                    }
                    cVar = new s5.c(charSequence.toString(), arrayList, null, 4, null);
                } else {
                    cVar = new s5.c(text.toString(), null, 2, null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
