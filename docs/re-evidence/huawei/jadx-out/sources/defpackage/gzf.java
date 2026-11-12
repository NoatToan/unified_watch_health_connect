package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public class gzf {
    private int j = 450;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36269c = 420;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36267a = 390;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36268b = 360;
    private int d = 330;
    private int e = 300;

    public int g() {
        return this.j;
    }

    public void f(int i) {
        this.j = i;
    }

    public int a() {
        return this.f36269c;
    }

    public void e(int i) {
        this.f36269c = i;
    }

    public int b() {
        return this.f36267a;
    }

    public void b(int i) {
        this.f36267a = i;
    }

    public int e() {
        return this.f36268b;
    }

    public void d(int i) {
        this.f36268b = i;
    }

    public int d() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public int c() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public int e(float f) {
        float f2 = this.f36269c;
        if (f > f2 && f <= this.j) {
            return 0;
        }
        float f3 = this.f36267a;
        if (f > f3 && f <= f2) {
            return 1;
        }
        float f4 = this.f36268b;
        if (f > f4 && f <= f3) {
            return 2;
        }
        float f5 = this.d;
        if (f <= f5 || f > f4) {
            return (f <= 0.0f || f > f5) ? -1 : 4;
        }
        return 3;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("Track_PaceZoneConfig", "paceZoneConfigStr is null");
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 6) {
                this.j = jSONArray.getInt(0);
                this.f36269c = jSONArray.getInt(1);
                this.f36267a = jSONArray.getInt(2);
                this.f36268b = jSONArray.getInt(3);
                this.d = jSONArray.getInt(4);
                this.e = jSONArray.getInt(5);
            }
        } catch (JSONException e) {
            LogUtil.e("Track_PaceZoneConfig", "transformPaceZoneConfig:", LogAnonymous.b(e));
        }
    }

    public int b(int i, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (z) {
                                return this.e;
                            }
                            return this.d;
                        }
                        LogUtil.e("Track_PaceZoneConfig", "paceZone should be given right data ", Integer.valueOf(i));
                        if (i > 0) {
                            return this.j;
                        }
                        return this.e;
                    }
                    if (z) {
                        i2 = this.d;
                    } else {
                        return this.f36268b;
                    }
                } else if (z) {
                    i2 = this.f36268b;
                } else {
                    return this.f36267a;
                }
            } else if (z) {
                i2 = this.f36267a;
            } else {
                return this.f36269c;
            }
        } else if (z) {
            i2 = this.f36269c;
        } else {
            return this.j;
        }
        return i2 + 1;
    }

    public int[] j() {
        return new int[]{this.j, this.f36269c, this.f36267a, this.f36268b, this.d, this.e};
    }
}
