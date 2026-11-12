package com.xmlywind.sdk.base.services;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Base64;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.mta.PointEntitySensor;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class h implements SensorEventListener {
    private static Handler b = null;
    private static int c = 500;
    private List<g> e;
    private SensorManager f;
    public DecimalFormat a = new DecimalFormat("#######.######");
    private g d = new g();
    private int g = 300;
    private int h = 50;

    public static class a {
        private static final h a = new h();
    }

    public static h a() {
        return a.a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0116  */
    /* JADX WARN: Code duplicated, block: B:28:0x016c  */
    /* JADX WARN: Code duplicated, block: B:34:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:39:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:40:0x0228  */
    /* JADX WARN: Code duplicated, block: B:44:0x024f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0264  */
    private String a(List<g> list) {
        ArrayList arrayList;
        String strA;
        float[] fArr;
        String strA2;
        float[] fArr2;
        String strA3;
        float[] fArr3;
        ArrayList arrayList2;
        String strA4;
        float[] fArr4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String strA5;
        float[] fArr5;
        String strA6;
        List<g> list2 = list;
        StringBuilder sb = new StringBuilder();
        if (list2 == null || list.size() == 0) {
            return sb.toString();
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        ArrayList arrayList20 = new ArrayList();
        ArrayList arrayList21 = new ArrayList();
        ArrayList arrayList22 = new ArrayList();
        ArrayList arrayList23 = arrayList19;
        int i = 0;
        while (true) {
            ArrayList arrayList24 = arrayList18;
            if (i >= list.size()) {
                ArrayList arrayList25 = arrayList9;
                ArrayList arrayList26 = arrayList11;
                ArrayList arrayList27 = arrayList23;
                sb.append("{");
                sb.append(String.format("\"gravity\":{%s}", String.format("\"x\":%s,\"y\":%s,\"z\":%s", arrayList7.toString(), arrayList8.toString(), arrayList25.toString())));
                sb.append(",");
                sb.append(String.format("\"gyroscope\":{%s}", String.format("\"x\":%s,\"y\":%s,\"z\":%s", arrayList10.toString(), arrayList26.toString(), arrayList12.toString())));
                sb.append(",");
                sb.append(String.format("\"magnetic_field\":{%s}", String.format("\"x\":%s,\"y\":%s,\"z\":%s", arrayList13.toString(), arrayList14.toString(), arrayList15.toString())));
                sb.append(",");
                sb.append(String.format("\"light\":%s", arrayList22.toString()));
                sb.append(",");
                sb.append(String.format("\"linear_acceleration\":{%s}", String.format("\"x\":%s,\"y\":%s,\"z\":%s", arrayList27.toString(), arrayList20.toString(), arrayList21.toString())));
                sb.append(",");
                sb.append(String.format("\"accelerometer\":{%s}", String.format("\"x\":%s,\"y\":%s,\"z\":%s", arrayList16.toString(), arrayList17.toString(), arrayList24.toString())));
                sb.append(com.alipay.sdk.m.u.i.d);
                return Base64.encodeToString(sb.toString().getBytes(), 2);
            }
            g gVar = list2.get(i);
            float[] fArr6 = gVar.a;
            int i2 = i;
            if (fArr6 != null) {
                arrayList = arrayList17;
                if (fArr6.length > 2) {
                    arrayList7.add(a(this.a.format(fArr6[0])));
                    arrayList8.add(a(this.a.format(gVar.a[1])));
                    strA = a(this.a.format(gVar.a[2]));
                }
                arrayList9.add(strA);
                fArr = gVar.b;
                if (fArr != null || fArr.length <= 2) {
                    arrayList10.add(a("0"));
                    arrayList11.add(a("0"));
                    strA2 = a("0");
                } else {
                    arrayList10.add(a(this.a.format(fArr[0])));
                    arrayList11.add(a(this.a.format(gVar.b[1])));
                    strA2 = a(this.a.format(gVar.b[2]));
                }
                arrayList12.add(strA2);
                fArr2 = gVar.c;
                if (fArr2 != null || fArr2.length <= 2) {
                    arrayList13.add(a("0"));
                    arrayList14.add(a("0"));
                    strA3 = a("0");
                } else {
                    arrayList13.add(a(this.a.format(fArr2[0])));
                    arrayList14.add(a(this.a.format(gVar.c[1])));
                    strA3 = a(this.a.format(gVar.c[2]));
                }
                arrayList15.add(strA3);
                fArr3 = gVar.d;
                if (fArr3 != null || fArr3.length <= 2) {
                    arrayList2 = arrayList;
                    arrayList16.add(a("0"));
                    arrayList2.add(a("0"));
                    strA4 = a("0");
                } else {
                    arrayList16.add(a(this.a.format(fArr3[0])));
                    arrayList2 = arrayList;
                    arrayList2.add(a(this.a.format(gVar.d[1])));
                    strA4 = a(this.a.format(gVar.d[2]));
                }
                arrayList24.add(strA4);
                fArr4 = gVar.f;
                if (fArr4 != null) {
                    if (fArr4.length > 2) {
                        arrayList3 = arrayList24;
                        ArrayList arrayList28 = arrayList15;
                        arrayList4 = arrayList23;
                        arrayList4.add(a(this.a.format(fArr4[0])));
                        arrayList6 = arrayList20;
                        arrayList6.add(a(this.a.format(gVar.f[1])));
                        arrayList5 = arrayList28;
                        strA5 = a(this.a.format(gVar.f[2]));
                    }
                    arrayList21.add(strA5);
                    fArr5 = gVar.e;
                    if (fArr5 != null || fArr5.length <= 0) {
                        strA6 = a("0");
                    } else {
                        strA6 = a(this.a.format(fArr5[0]));
                    }
                    arrayList22.add(strA6);
                    arrayList22 = arrayList22;
                    arrayList12 = arrayList12;
                    arrayList13 = arrayList13;
                    arrayList16 = arrayList16;
                    i = i2 + 1;
                    arrayList17 = arrayList2;
                    arrayList20 = arrayList6;
                    arrayList8 = arrayList8;
                    arrayList15 = arrayList5;
                    arrayList18 = arrayList3;
                    list2 = list;
                    arrayList23 = arrayList4;
                    arrayList11 = arrayList11;
                    arrayList9 = arrayList9;
                } else {
                    arrayList3 = arrayList24;
                }
                arrayList3 = arrayList24;
                arrayList4 = arrayList23;
                arrayList5 = arrayList15;
                arrayList6 = arrayList20;
                arrayList4.add(a("0"));
                arrayList6.add(a("0"));
                strA5 = a("0");
                arrayList21.add(strA5);
                fArr5 = gVar.e;
                if (fArr5 != null) {
                    strA6 = a("0");
                } else {
                    strA6 = a("0");
                }
                arrayList22.add(strA6);
                arrayList22 = arrayList22;
                arrayList12 = arrayList12;
                arrayList13 = arrayList13;
                arrayList16 = arrayList16;
                i = i2 + 1;
                arrayList17 = arrayList2;
                arrayList20 = arrayList6;
                arrayList8 = arrayList8;
                arrayList15 = arrayList5;
                arrayList18 = arrayList3;
                list2 = list;
                arrayList23 = arrayList4;
                arrayList11 = arrayList11;
                arrayList9 = arrayList9;
            } else {
                arrayList = arrayList17;
            }
            arrayList7.add(a("0"));
            arrayList8.add(a("0"));
            strA = a("0");
            arrayList9.add(strA);
            fArr = gVar.b;
            if (fArr != null) {
                arrayList10.add(a("0"));
                arrayList11.add(a("0"));
                strA2 = a("0");
            } else {
                arrayList10.add(a("0"));
                arrayList11.add(a("0"));
                strA2 = a("0");
            }
            arrayList12.add(strA2);
            fArr2 = gVar.c;
            if (fArr2 != null) {
                arrayList13.add(a("0"));
                arrayList14.add(a("0"));
                strA3 = a("0");
            } else {
                arrayList13.add(a("0"));
                arrayList14.add(a("0"));
                strA3 = a("0");
            }
            arrayList15.add(strA3);
            fArr3 = gVar.d;
            if (fArr3 != null) {
                arrayList2 = arrayList;
                arrayList16.add(a("0"));
                arrayList2.add(a("0"));
                strA4 = a("0");
            } else {
                arrayList2 = arrayList;
                arrayList16.add(a("0"));
                arrayList2.add(a("0"));
                strA4 = a("0");
            }
            arrayList24.add(strA4);
            fArr4 = gVar.f;
            if (fArr4 != null) {
                if (fArr4.length > 2) {
                    arrayList3 = arrayList24;
                    ArrayList arrayList29 = arrayList15;
                    arrayList4 = arrayList23;
                    arrayList4.add(a(this.a.format(fArr4[0])));
                    arrayList6 = arrayList20;
                    arrayList6.add(a(this.a.format(gVar.f[1])));
                    arrayList5 = arrayList29;
                    strA5 = a(this.a.format(gVar.f[2]));
                }
                arrayList21.add(strA5);
                fArr5 = gVar.e;
                if (fArr5 != null) {
                    strA6 = a("0");
                } else {
                    strA6 = a("0");
                }
                arrayList22.add(strA6);
                arrayList22 = arrayList22;
                arrayList12 = arrayList12;
                arrayList13 = arrayList13;
                arrayList16 = arrayList16;
                i = i2 + 1;
                arrayList17 = arrayList2;
                arrayList20 = arrayList6;
                arrayList8 = arrayList8;
                arrayList15 = arrayList5;
                arrayList18 = arrayList3;
                list2 = list;
                arrayList23 = arrayList4;
                arrayList11 = arrayList11;
                arrayList9 = arrayList9;
            } else {
                arrayList3 = arrayList24;
            }
            arrayList3 = arrayList24;
            arrayList4 = arrayList23;
            arrayList5 = arrayList15;
            arrayList6 = arrayList20;
            arrayList4.add(a("0"));
            arrayList6.add(a("0"));
            strA5 = a("0");
            arrayList21.add(strA5);
            fArr5 = gVar.e;
            if (fArr5 != null) {
                strA6 = a("0");
            } else {
                strA6 = a("0");
            }
            arrayList22.add(strA6);
            arrayList22 = arrayList22;
            arrayList12 = arrayList12;
            arrayList13 = arrayList13;
            arrayList16 = arrayList16;
            i = i2 + 1;
            arrayList17 = arrayList2;
            arrayList20 = arrayList6;
            arrayList8 = arrayList8;
            arrayList15 = arrayList5;
            arrayList18 = arrayList3;
            list2 = list;
            arrayList23 = arrayList4;
            arrayList11 = arrayList11;
            arrayList9 = arrayList9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<g> list, List<g> list2, String str, String str2) {
        PointEntitySensor pointEntitySensor = new PointEntitySensor();
        pointEntitySensor.setAc_type("101");
        pointEntitySensor.setCategory(str);
        pointEntitySensor.setMotion_before(a(list));
        pointEntitySensor.setMotion_after(a(list2));
        pointEntitySensor.setMotion_interval(String.valueOf(this.g));
        pointEntitySensor.setLoad_id(str2);
        pointEntitySensor.commit();
    }

    public String a(String str) {
        return str;
    }

    public void a(Context context) {
        try {
            if (this.f != null) {
                if (!SDKConfig.sharedInstance().enableAntiFraud()) {
                    this.f.unregisterListener(this);
                    b.removeCallbacksAndMessages(null);
                    this.e.clear();
                    this.f = null;
                }
            } else if (SDKConfig.sharedInstance().enableAntiFraud()) {
                SigmobLog.i("start anti spam motion");
                this.e = new ArrayList();
                this.h = SDKConfig.sharedInstance().getMotionCount();
                this.g = SDKConfig.sharedInstance().getMotionInterval();
                c = SDKConfig.sharedInstance().getMotionQueueMax();
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                this.f = sensorManager;
                sensorManager.registerListener(this, sensorManager.getDefaultSensor(5), 3);
                SigmobLog.d("光线传感器 ");
                SensorManager sensorManager2 = this.f;
                sensorManager2.registerListener(this, sensorManager2.getDefaultSensor(1), 3);
                SigmobLog.d("加速传感器 ");
                SensorManager sensorManager3 = this.f;
                sensorManager3.registerListener(this, sensorManager3.getDefaultSensor(2), 3);
                SigmobLog.d("磁场传感器 ");
                SensorManager sensorManager4 = this.f;
                sensorManager4.registerListener(this, sensorManager4.getDefaultSensor(4), 3);
                SigmobLog.d("陀螺仪 ");
                SensorManager sensorManager5 = this.f;
                sensorManager5.registerListener(this, sensorManager5.getDefaultSensor(9), 3);
                SigmobLog.d("重力传感器 ");
                SensorManager sensorManager6 = this.f;
                sensorManager6.registerListener(this, sensorManager6.getDefaultSensor(10), 3);
                SigmobLog.d("线性加速器 ");
                b = new Handler(Looper.getMainLooper()) { // from class: com.xmlywind.sdk.base.services.h.1
                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        int i = 0;
                        if (message.what == f.SENSOR_EVENT_BEGIN.a()) {
                            i iVar = (i) message.obj;
                            int size = h.this.e.size() - 1;
                            iVar.a = (g) h.this.e.get(size >= 0 ? size : 0);
                            Message message2 = new Message();
                            message2.what = f.SENSOR_EVENT_END.a();
                            message2.obj = iVar;
                            h.b.sendMessageDelayed(message2, h.this.g * (h.this.h + 1));
                            return;
                        }
                        if (message.what != f.SENSOR_EVENT_END.a()) {
                            if (message.what == f.SENSOR_EVENT_PUSH.a()) {
                                try {
                                    h.this.d.g = System.currentTimeMillis();
                                    g gVarClone = h.this.d.clone();
                                    if (h.this.e.size() > h.c) {
                                        h.this.e.remove(0);
                                    }
                                    if (gVarClone != null) {
                                        h.this.e.add(gVarClone);
                                    }
                                } catch (CloneNotSupportedException e) {
                                    SigmobLog.e(e.getMessage());
                                }
                                Message message3 = new Message();
                                message3.what = f.SENSOR_EVENT_PUSH.a();
                                h.b.sendMessageDelayed(message3, h.this.g);
                                return;
                            }
                            return;
                        }
                        i iVar2 = (i) message.obj;
                        int iIndexOf = h.this.e.indexOf(iVar2.a);
                        int i2 = h.this.h;
                        if (iIndexOf >= 0 && iIndexOf >= h.this.h) {
                            i = iIndexOf - i2;
                        }
                        int size2 = h.this.h + iIndexOf;
                        if (size2 > h.this.e.size() - 1) {
                            size2 = h.this.e.size() - 1;
                        }
                        if (h.this.e.size() > 0) {
                            CopyOnWriteArrayList copyOnWriteArrayList = i < iIndexOf ? new CopyOnWriteArrayList(h.this.e.subList(i, iIndexOf)) : null;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = iIndexOf < size2 ? new CopyOnWriteArrayList(h.this.e.subList(iIndexOf, size2)) : null;
                            if (copyOnWriteArrayList == null && copyOnWriteArrayList2 == null) {
                                return;
                            }
                            h.this.a(copyOnWriteArrayList, copyOnWriteArrayList2, iVar2.b, iVar2.c);
                        }
                    }
                };
                Message message = new Message();
                message.what = f.SENSOR_EVENT_PUSH.a();
                Handler handler = b;
                if (handler != null) {
                    handler.sendMessage(message);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void a(String str, String str2) {
        if (SDKConfig.sharedInstance().enableAntiFraud() && SDKConfig.sharedInstance().filterAntiEvent(str)) {
            a(com.xmlywind.sdk.common.a.n().af());
            Message message = new Message();
            i iVar = new i();
            iVar.b = str;
            iVar.c = str2;
            message.what = f.SENSOR_EVENT_BEGIN.a();
            message.obj = iVar;
            Handler handler = b;
            if (handler != null) {
                handler.sendMessage(message);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        SigmobLog.d(String.format("name :%s, accuracy %d", sensor.getName(), Integer.valueOf(i)));
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            this.d.d = (float[]) sensorEvent.values.clone();
            return;
        }
        if (type == 2) {
            this.d.c = (float[]) sensorEvent.values.clone();
            return;
        }
        if (type == 4) {
            this.d.b = (float[]) sensorEvent.values.clone();
            return;
        }
        if (type == 5) {
            this.d.e = (float[]) sensorEvent.values.clone();
        } else if (type == 9) {
            this.d.a = (float[]) sensorEvent.values.clone();
        } else {
            if (type != 10) {
                return;
            }
            this.d.f = (float[]) sensorEvent.values.clone();
        }
    }
}
