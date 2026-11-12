package wo;

import am.x0;
import am.z0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.m;
import c22.r0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.j;
import im.g;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;
import p13.y;
import zm.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lwo/e;", "Lzm/c;", "Landroidx/fragment/app/m;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "chartData", "", "divisionPoint", "Lam/x0;", "divisionActivityType", "Lfz/c;", "xAxisType", "", "isDivideMode", "<init>", "(Landroidx/fragment/app/m;Lzm/p;ILam/x0;Lfz/c;Z)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends zm.c {
    public final int A;
    public final x0 B;
    public final boolean C;
    public final c D;
    public final int E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p f186411z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"wo/e$b", "Lh00/j;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends j {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Paint f186412h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ OverlayCombinedChart f186413i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ e f186414j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(XAxis xAxis, OverlayCombinedChart overlayCombinedChart, e eVar, ViewPortHandler viewPortHandler, Transformer transformer) {
            super(viewPortHandler, xAxis, transformer, null, false, null, 56, null);
            this.f186413i = overlayCombinedChart;
            this.f186414j = eVar;
            viewPortHandler.getClass();
            transformer.getClass();
            Paint paint = new Paint();
            this.f186412h = paint;
            paint.setAlpha(128);
        }

        @Override // h00.j, com.github.mikephil.charting.renderer.XAxisRenderer
        public final void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
            Drawable drawableA;
            super.drawLabels(canvas, f14, mPPointF);
            OverlayCombinedChart overlayCombinedChart = this.f186413i;
            float f15 = overlayCombinedChart.getContentRect().left;
            float f16 = overlayCombinedChart.getContentRect().right;
            e eVar = this.f186414j;
            p pVar = eVar.f186411z;
            p pVar2 = eVar.f186411z;
            if (pVar.D3() >= 1) {
                double dC = ((o20.a) h0.m0(pVar2.P(0))).C() - ((o20.a) h0.b0(pVar2.P(0))).C();
                float fC = ((float) (dC > 0.0d ? ((double) f15) + (((((double) eVar.A) - ((o20.a) h0.b0(pVar2.P(0))).C()) * ((double) (f16 - f15))) / dC) : 0.0d)) - 22.0f;
                x0 x0Var = eVar.B;
                Context context = eVar.f205202a;
                if (x0Var == null) {
                    drawableA = a7.b.getDrawable(context, !eVar.C ? 2131232458 : 2131231823);
                } else {
                    context.getClass();
                    String str = x0Var.f4358a;
                    z0 z0Var = z0.f4390a;
                    x0 x0Var2 = x0.P1;
                    if (!z0.b(x0Var2, str)) {
                        x0Var2 = x0.Y;
                        if (!z0.b(x0Var2, str)) {
                            x0Var2 = x0.Z;
                            if (!z0.b(x0Var2, str)) {
                                x0Var2 = x0.X;
                                if (!z0.b(x0Var2, str)) {
                                    x0Var2 = x0.D;
                                    if (!z0.b(x0Var2, str)) {
                                        x0Var2 = x0.I0;
                                        if (!z0.b(x0Var2, str)) {
                                            x0Var2 = x0.D2;
                                            if (!z0.b(x0Var2, str)) {
                                                x0Var2 = x0.O0;
                                                if (!z0.b(x0Var2, str)) {
                                                    x0Var2 = x0.f4308n;
                                                    if (!z0.b(x0Var2, str)) {
                                                        x0Var2 = x0.f4312o;
                                                        if (!z0.b(x0Var2, str)) {
                                                            x0Var2 = x0.f4317p1;
                                                            if (!z0.b(x0Var2, str)) {
                                                                x0Var2 = x0.f4324r;
                                                                if (!z0.b(x0Var2, str)) {
                                                                    x0Var2 = x0.f4331t;
                                                                    if (!z0.b(x0Var2, str)) {
                                                                        x0Var2 = x0.C2;
                                                                        if (!z0.b(x0Var2, str)) {
                                                                            if (z0.e0(str)) {
                                                                                x0Var2 = x0.f4322q2;
                                                                            } else if (z0.w(str)) {
                                                                                x0Var2 = x0.f4290i1;
                                                                            } else if (z0.T(str)) {
                                                                                x0Var2 = x0.f4305m1;
                                                                            } else if (z0.t(str)) {
                                                                                x0Var2 = x0.f4293j1;
                                                                            } else if (z0.z(str)) {
                                                                                x0Var2 = x0.f4333t2;
                                                                            } else if (z0.O(str)) {
                                                                                x0Var2 = x0.f4340v2;
                                                                            } else {
                                                                                x0Var2 = x0.f4267a2;
                                                                                if (!z0.b(x0Var2, str)) {
                                                                                    x0Var2 = x0.f4270b2;
                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                        if (z0.P(str)) {
                                                                                            x0Var2 = x0.U1;
                                                                                        } else {
                                                                                            x0Var2 = x0.X1;
                                                                                            if (!z0.b(x0Var2, str)) {
                                                                                                x0Var2 = x0.W1;
                                                                                                if (!z0.b(x0Var2, str)) {
                                                                                                    if (z0.v(str)) {
                                                                                                        x0Var2 = x0.Y1;
                                                                                                    } else {
                                                                                                        x0Var2 = x0.U1;
                                                                                                        if (!z0.b(x0Var2, str)) {
                                                                                                            if (z0.J(str)) {
                                                                                                                x0Var2 = x0.A2;
                                                                                                            } else if (z0.L(str)) {
                                                                                                                x0Var2 = x0.B2;
                                                                                                            } else {
                                                                                                                x0Var2 = x0.f4352y2;
                                                                                                                if (!z0.b(x0Var2, str)) {
                                                                                                                    x0Var2 = x0.f4356z2;
                                                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                                                        if (z0.X(str)) {
                                                                                                                            x0Var2 = x0.I1;
                                                                                                                        } else if (z0.Q(str)) {
                                                                                                                            x0Var2 = x0.f4273c2;
                                                                                                                        } else {
                                                                                                                            x0Var2 = x0.f4297k1;
                                                                                                                            if (!z0.b(x0Var2, str)) {
                                                                                                                                x0Var2 = x0.f4301l1;
                                                                                                                                if (!z0.b(x0Var2, str)) {
                                                                                                                                    x0Var2 = x0.E2;
                                                                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                                                                        x0Var2 = x0.f4320q;
                                                                                                                                        if (!z0.b(x0Var2, str)) {
                                                                                                                                            if (z0.F(str)) {
                                                                                                                                                x0Var2 = x0.f4314o2;
                                                                                                                                            } else if (z0.d0(str)) {
                                                                                                                                                x0Var2 = x0.f4318p2;
                                                                                                                                            } else if (z0.U(str)) {
                                                                                                                                                x0Var2 = x0.f4294j2;
                                                                                                                                            } else if (z0.p(str)) {
                                                                                                                                                x0Var2 = x0.M1;
                                                                                                                                            } else if (z0.y(str)) {
                                                                                                                                                x0Var2 = x0.D1;
                                                                                                                                            } else if (z0.E(str)) {
                                                                                                                                                x0Var2 = x0.f4306m2;
                                                                                                                                            } else if (z0.s(str)) {
                                                                                                                                                x0Var2 = x0.T1;
                                                                                                                                            } else if (z0.c0(str)) {
                                                                                                                                                x0Var2 = x0.f4302l2;
                                                                                                                                            } else if (z0.S(str)) {
                                                                                                                                                x0Var2 = x0.f4276d2;
                                                                                                                                            } else if (z0.b0(str)) {
                                                                                                                                                x0Var2 = x0.K1;
                                                                                                                                            } else {
                                                                                                                                                x0Var2 = x0.J2;
                                                                                                                                                if (!z0.b(x0Var2, str)) {
                                                                                                                                                    x0Var2 = x0.I2;
                                                                                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                                                                                        x0Var2 = x0.G2;
                                                                                                                                                        if (!z0.b(x0Var2, str)) {
                                                                                                                                                            x0Var2 = x0.X2;
                                                                                                                                                            if (!z0.b(x0Var2, str)) {
                                                                                                                                                                x0Var2 = x0.f4350y;
                                                                                                                                                                if (!z0.b(x0Var2, str)) {
                                                                                                                                                                    x0Var2 = x0.O1;
                                                                                                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                                                                                                        if (z0.Y(str)) {
                                                                                                                                                                            x0Var2 = x0.f4338v;
                                                                                                                                                                        } else {
                                                                                                                                                                            x0Var2 = x0.F2;
                                                                                                                                                                            if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                x0Var2 = x0.f4280e3;
                                                                                                                                                                                if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                    x0Var2 = x0.f4283f3;
                                                                                                                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                        x0Var2 = x0.f4286g3;
                                                                                                                                                                                        if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                            x0Var2 = x0.f4289h3;
                                                                                                                                                                                            if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                x0Var2 = x0.f4292i3;
                                                                                                                                                                                                if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                    x0Var2 = x0.f4295j3;
                                                                                                                                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                        x0Var2 = x0.f4299k3;
                                                                                                                                                                                                        if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                            x0Var2 = x0.f4303l3;
                                                                                                                                                                                                            if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                x0Var2 = x0.f4307m3;
                                                                                                                                                                                                                if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                    x0Var2 = x0.f4311n3;
                                                                                                                                                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                        x0Var2 = x0.f4315o3;
                                                                                                                                                                                                                        if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                            x0Var2 = x0.f4319p3;
                                                                                                                                                                                                                            if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                x0Var2 = x0.f4327r3;
                                                                                                                                                                                                                                if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                    x0Var2 = x0.f4330s3;
                                                                                                                                                                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                        x0Var2 = x0.f4334t3;
                                                                                                                                                                                                                                        if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                            x0Var2 = x0.f4337u3;
                                                                                                                                                                                                                                            if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                x0Var2 = x0.f4341v3;
                                                                                                                                                                                                                                                if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                    x0Var2 = x0.f4345w3;
                                                                                                                                                                                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                        x0Var2 = x0.f4349x3;
                                                                                                                                                                                                                                                        if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                            x0Var2 = x0.J1;
                                                                                                                                                                                                                                                            if (!z0.b(x0Var2, str) && !z0.b(x0.f4353y3, str)) {
                                                                                                                                                                                                                                                                x0Var2 = x0.f4357z3;
                                                                                                                                                                                                                                                                if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                                    x0Var2 = x0.A3;
                                                                                                                                                                                                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                                        x0Var2 = x0.B3;
                                                                                                                                                                                                                                                                        if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                                            x0Var2 = x0.f4277d3;
                                                                                                                                                                                                                                                                            if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                                                x0Var2 = x0.f4323q3;
                                                                                                                                                                                                                                                                                if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                                                    x0Var2 = x0.f4287h1;
                                                                                                                                                                                                                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                                                        x0Var2 = x0.f4275d1;
                                                                                                                                                                                                                                                                                        if (!z0.b(x0Var2, str) && !z0.b(x0.f4278e1, str)) {
                                                                                                                                                                                                                                                                                            x0Var2 = x0.P0;
                                                                                                                                                                                                                                                                                            if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                                                                x0Var2 = x0.f4354z;
                                                                                                                                                                                                                                                                                                if (!z0.b(x0Var2, str) && !z0.b(x0.A, str)) {
                                                                                                                                                                                                                                                                                                    x0Var2 = x0.E3;
                                                                                                                                                                                                                                                                                                    if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                                                                        if (z0.W(str) || z0.b(x0.f4316p, str)) {
                                                                                                                                                                                                                                                                                                            x0Var2 = x0.f4309n1;
                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                            x0Var2 = x0.C3;
                                                                                                                                                                                                                                                                                                            if (!z0.b(x0Var2, str)) {
                                                                                                                                                                                                                                                                                                                x0Var2 = z0.D(str) ? x0.D3 : x0.f4346x;
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
                                    }
                                }
                            }
                        }
                    }
                    int i14 = x0Var2.f4361d;
                    Resources resources = context.getResources();
                    resources.getClass();
                    drawableA = r0.a(context, i14, R.color.gcm_icon_secondary, R.color.gcm_icon_on_color, (int) xy2.b.n(resources, 1.0f), R.color.gcm_icon_stroke, r0.a.SMALL);
                }
                if (drawableA != null) {
                    Bitmap bitmapA = d7.b.a(drawableA, 44, 44, Bitmap.Config.ARGB_8888);
                    if (canvas != null) {
                        canvas.drawBitmap(bitmapA, fC, overlayCombinedChart.getViewPortHandler().contentBottom() - 22.0f, (Paint) null);
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0018  */
        @Override // com.github.mikephil.charting.renderer.XAxisRenderer
        public final void renderLimitLineLine(Canvas canvas, LimitLine limitLine, float[] fArr) {
            float fContentLeft;
            Canvas canvas2;
            OverlayCombinedChart overlayCombinedChart = this.f186413i;
            if (fArr == null) {
                fContentLeft = overlayCombinedChart.getViewPortHandler().contentLeft();
            } else {
                Float fValueOf = fArr.length > 0 ? Float.valueOf(fArr[0]) : null;
                if (fValueOf != null) {
                    fContentLeft = fValueOf.floatValue();
                } else {
                    fContentLeft = overlayCombinedChart.getViewPortHandler().contentLeft();
                }
            }
            float f14 = fContentLeft;
            float fContentTop = overlayCombinedChart.getViewPortHandler().contentTop();
            float fContentRight = overlayCombinedChart.getViewPortHandler().contentRight();
            float fContentBottom = overlayCombinedChart.getViewPortHandler().contentBottom();
            if (canvas != null) {
                canvas2 = canvas;
                canvas2.drawRect(f14, fContentTop, fContentRight, fContentBottom, this.f186412h);
            } else {
                canvas2 = canvas;
            }
            super.renderLimitLineLine(canvas2, limitLine, fArr);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, p pVar, int i14, x0 x0Var, fz.c cVar, boolean z14) {
        super(mVar, pVar, null, null, false, cVar, 28, null);
        mVar.getClass();
        pVar.getClass();
        cVar.getClass();
        this.f186411z = pVar;
        this.A = i14;
        this.B = x0Var;
        this.C = z14;
        this.D = new c(new l22.a(mVar));
        this.E = a7.b.getColor(mVar, R.color.transparent);
    }

    @Override // zm.c
    public final void Q(OverlayCombinedChart overlayCombinedChart, XAxis xAxis) {
        overlayCombinedChart.getClass();
        overlayCombinedChart.setXAxisRenderer(new b(xAxis, overlayCombinedChart, this, overlayCombinedChart.getViewPortHandler(), overlayCombinedChart.getTransformer(YAxis.AxisDependency.LEFT)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet, com.github.mikephil.charting.interfaces.datasets.ILineDataSet] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final void R(float f14) {
        ArrayList arrayListT = t(f14, "ACTIVITY_TYPE_TAG");
        if (arrayListT == null || arrayListT.isEmpty()) {
            Object dataSetByIndex = n().getLineData().getDataSetByIndex(0);
            dataSetByIndex.getClass();
            ?? r14 = (ILineDataSet) dataSetByIndex;
            boolean z14 = this.C;
            int entryCount = r14.getEntryCount();
            if (z14) {
                entryCount--;
            }
            Entry entry = null;
            float f15 = Float.MAX_VALUE;
            ?? r15 = z14;
            while (true) {
                if (r15 >= entryCount) {
                    break;
                }
                Entry entryForIndex = r14.getEntryForIndex(r15);
                float x14 = entryForIndex.getX();
                float fAbs = Math.abs(x14 - f14);
                if (x14 == f14 && entryForIndex.getY() > 0.0f) {
                    entry = entryForIndex;
                    break;
                }
                if (fAbs < f15 && entryForIndex.getY() > 0.0f) {
                    entry = entryForIndex;
                    f15 = fAbs;
                }
                r15++;
            }
            arrayListT = t(entry != null ? entry.getX() : 0.0f, "ACTIVITY_TYPE_TAG");
        }
        n().highlightValues((Highlight[]) y.s(x.l(arrayListT)).toArray(new Highlight[0]));
    }

    @Override // zm.c
    public final void i(OverlayCombinedChart overlayCombinedChart, XAxis xAxis) {
        overlayCombinedChart.getClass();
        LimitLine limitLine = new LimitLine(this.A);
        limitLine.setLineColor(a7.b.getColor(this.f205202a, R.color.gcm_chart_trim_limit_line));
        limitLine.setLineWidth(1.0f);
        xAxis.addLimitLine(limitLine);
        xAxis.setLabelCount(6, true);
    }

    @Override // zm.c
    public final void j(OverlayCombinedChart overlayCombinedChart) {
        super.j(overlayCombinedChart);
        overlayCombinedChart.setTouchEnabled(false);
        overlayCombinedChart.setHighlightPerDragEnabled(false);
        overlayCombinedChart.setHighlightPerTapEnabled(false);
    }

    @Override // zm.c
    /* JADX INFO: renamed from: p */
    public final g getF205218q() {
        return this.D;
    }

    @Override // zm.c
    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getF205212k() {
        return this.E;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lwo/e$a;", "", "<init>", "()V", "", "ACTIVITY_ICON_DIMENSION", "F", "ACTIVITY_ICON_RADIUS", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(m mVar, p pVar, int i14, x0 x0Var, fz.c cVar, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(mVar, pVar, i14, x0Var, cVar, (i15 & 32) != 0 ? false : z14);
    }
}
