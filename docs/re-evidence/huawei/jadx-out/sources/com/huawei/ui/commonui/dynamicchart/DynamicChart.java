package com.huawei.ui.commonui.dynamicchart;

import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.ui.commonui.dynamicchart.utils.DynamicChartResponse;
import defpackage.qkv;
import defpackage.qky;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DynamicChart extends SurfaceView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f23495b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23496a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qkv f23497c;
    private List<DynamicChartResponse> d;
    private int e;
    private int[] f;
    private SurfaceHolder.Callback g;
    private SurfaceHolder j;

    public DynamicChart(Context context) {
        super(context);
        this.d = new ArrayList(16);
        this.f23496a = -1;
        this.f = new int[]{40, HeartRateThresholdConfig.HEART_RATE_LIMIT};
        this.g = new SurfaceHolder.Callback() { // from class: com.huawei.ui.commonui.dynamicchart.DynamicChart.5
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                synchronized (DynamicChart.f23495b) {
                    DynamicChart.this.f23497c = qkv.e();
                    DynamicChart.this.f23497c.d(DynamicChart.this.getContext(), DynamicChart.this);
                }
                DynamicChart.this.e();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, final int i2, final int i3) {
                DynamicChart.this.d(new DynamicChartResponse() { // from class: com.huawei.ui.commonui.dynamicchart.DynamicChart.5.5
                    @Override // com.huawei.ui.commonui.dynamicchart.utils.DynamicChartResponse
                    public void exec(qkv qkvVar) {
                        qkvVar.obtainMessage(1, Integer.valueOf(DynamicChart.this.f23496a)).sendToTarget();
                        qkvVar.obtainMessage(4, DynamicChart.this.f).sendToTarget();
                        qkvVar.d(DynamicChart.this.e);
                        Message messageObtainMessage = qkvVar.obtainMessage(2);
                        messageObtainMessage.arg1 = i2;
                        messageObtainMessage.arg2 = i3;
                        messageObtainMessage.sendToTarget();
                    }
                });
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                synchronized (DynamicChart.f23495b) {
                    DynamicChart.this.f23497c.c();
                    DynamicChart.this.f23497c = null;
                }
            }
        };
        a();
    }

    public DynamicChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ArrayList(16);
        this.f23496a = -1;
        this.f = new int[]{40, HeartRateThresholdConfig.HEART_RATE_LIMIT};
        this.g = new SurfaceHolder.Callback() { // from class: com.huawei.ui.commonui.dynamicchart.DynamicChart.5
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                synchronized (DynamicChart.f23495b) {
                    DynamicChart.this.f23497c = qkv.e();
                    DynamicChart.this.f23497c.d(DynamicChart.this.getContext(), DynamicChart.this);
                }
                DynamicChart.this.e();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, final int i2, final int i3) {
                DynamicChart.this.d(new DynamicChartResponse() { // from class: com.huawei.ui.commonui.dynamicchart.DynamicChart.5.5
                    @Override // com.huawei.ui.commonui.dynamicchart.utils.DynamicChartResponse
                    public void exec(qkv qkvVar) {
                        qkvVar.obtainMessage(1, Integer.valueOf(DynamicChart.this.f23496a)).sendToTarget();
                        qkvVar.obtainMessage(4, DynamicChart.this.f).sendToTarget();
                        qkvVar.d(DynamicChart.this.e);
                        Message messageObtainMessage = qkvVar.obtainMessage(2);
                        messageObtainMessage.arg1 = i2;
                        messageObtainMessage.arg2 = i3;
                        messageObtainMessage.sendToTarget();
                    }
                });
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                synchronized (DynamicChart.f23495b) {
                    DynamicChart.this.f23497c.c();
                    DynamicChart.this.f23497c = null;
                }
            }
        };
        a();
    }

    public DynamicChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new ArrayList(16);
        this.f23496a = -1;
        this.f = new int[]{40, HeartRateThresholdConfig.HEART_RATE_LIMIT};
        this.g = new SurfaceHolder.Callback() { // from class: com.huawei.ui.commonui.dynamicchart.DynamicChart.5
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                synchronized (DynamicChart.f23495b) {
                    DynamicChart.this.f23497c = qkv.e();
                    DynamicChart.this.f23497c.d(DynamicChart.this.getContext(), DynamicChart.this);
                }
                DynamicChart.this.e();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, final int i3, final int i4) {
                DynamicChart.this.d(new DynamicChartResponse() { // from class: com.huawei.ui.commonui.dynamicchart.DynamicChart.5.5
                    @Override // com.huawei.ui.commonui.dynamicchart.utils.DynamicChartResponse
                    public void exec(qkv qkvVar) {
                        qkvVar.obtainMessage(1, Integer.valueOf(DynamicChart.this.f23496a)).sendToTarget();
                        qkvVar.obtainMessage(4, DynamicChart.this.f).sendToTarget();
                        qkvVar.d(DynamicChart.this.e);
                        Message messageObtainMessage = qkvVar.obtainMessage(2);
                        messageObtainMessage.arg1 = i3;
                        messageObtainMessage.arg2 = i4;
                        messageObtainMessage.sendToTarget();
                    }
                });
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                synchronized (DynamicChart.f23495b) {
                    DynamicChart.this.f23497c.c();
                    DynamicChart.this.f23497c = null;
                }
            }
        };
        a();
    }

    private void a() {
        qky.e(getContext());
        SurfaceHolder holder = getHolder();
        this.j = holder;
        holder.addCallback(this.g);
        setZOrderOnTop(true);
        this.j.setFormat(-3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setKeepScreenOn(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DynamicChartResponse dynamicChartResponse) {
        synchronized (f23495b) {
            this.d.add(dynamicChartResponse);
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (f23495b) {
            if (this.f23497c == null) {
                return;
            }
            Iterator<DynamicChartResponse> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().exec(this.f23497c);
            }
            this.d.clear();
        }
    }

    public void setPointCountOneScreen(int i) {
        this.f23496a = i;
    }

    public void setColor(int i) {
        this.e = i;
    }

    public void setOrdinateY(int i, int i2) {
        int[] iArr = this.f;
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void e(final float f) {
        d(new DynamicChartResponse() { // from class: com.huawei.ui.commonui.dynamicchart.DynamicChart.4
            @Override // com.huawei.ui.commonui.dynamicchart.utils.DynamicChartResponse
            public void exec(qkv qkvVar) {
                qkvVar.obtainMessage(3, Float.valueOf(f)).sendToTarget();
            }
        });
    }
}
