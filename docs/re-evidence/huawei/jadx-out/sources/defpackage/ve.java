package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public class ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f50986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50987c = false;
    private float d;
    private byte e;
    private float f;

    private static float d(byte b2, float f) {
        float f2;
        float f3;
        if (b2 == 1) {
            f2 = f - 80.0f;
            f3 = 0.7f;
        } else {
            f2 = f - 70.0f;
            f3 = 0.6f;
        }
        return f2 * f3;
    }

    public static float d(float f, byte b2, float f2, float f3) {
        return ((100.0f - f2) - f3) - (((b2 == 1 ? 3.0f : 2.5f) / f) * 100.0f);
    }

    public static float d(float f, float f2, byte b2, int i, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = (f2 / (f * f)) * 100.0f * 100.0f;
        float f11 = (((f10 * f10) * (-5.686f)) + (f10 * 241.7f)) - 2470.0f;
        if (f11 < 55.0f) {
            f11 = 55.0f;
        }
        if (f11 > 96.0f) {
            f11 = 96.0f;
        }
        float f12 = f3 + (i * 0.03f);
        if (b2 == 1) {
            float f13 = f12 * f12;
            float f14 = f13 * f12;
            f6 = ((((f14 * f12) * 1.085E-4f) - (f14 * 0.003181f)) - (f13 * 0.2952f)) + (f12 * 10.85f) + 0.4248f;
            f7 = 0.77f;
        } else {
            float f15 = f12 * f12;
            float f16 = f15 * f12;
            f6 = (((((f16 * f12) * 2.469E-4f) - (f16 * 0.02788f)) + (f15 * 0.9597f)) - (f12 * 10.02f)) + 80.42f;
            f7 = 0.735f;
        }
        float f17 = ((double) f6) >= 55.0d ? f6 : 55.0f;
        float f18 = (f4 + 90.0f) - (f2 * f7);
        float f19 = f18 <= 100.0f ? f18 : 100.0f;
        if (f5 >= 15.0d) {
            f8 = -50.0f;
        } else {
            float f20 = f5 * f5;
            float f21 = f20 * f5;
            float f22 = f21 * f5;
            f8 = (((((f22 * f5) * 0.007212f) - (f22 * 0.2825f)) + (f21 * 3.912f)) - (f20 * 22.27f)) + (30.38f * f5) + 89.35f;
        }
        float f23 = f8 >= -50.0f ? f8 : -50.0f;
        float f24 = 0.0f;
        if (f5 == 0.0f) {
            f9 = 0.48f;
        } else {
            f24 = 0.08f;
            f9 = 0.4f;
        }
        int i2 = (int) ((f9 * f11) + (f17 * 0.4f) + (f19 * 0.1f) + (f24 * f23));
        if (i2 < 45) {
            i2 = 45;
        }
        if (i2 > 100) {
            i2 = 100;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:80:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00c6  */
    private static float e(float f, float f2, byte b2, int i) {
        char c2;
        char c3;
        int i2 = 0;
        if (b2 == 1) {
            if (i <= 39) {
                if (f < 11.0f) {
                    c2 = 0;
                } else if (f >= 11.0f && f < 17.0f) {
                    c2 = 1;
                } else if (f < 17.0f || f >= 27.0f) {
                    c2 = 3;
                } else {
                    c2 = 2;
                }
            } else if (i <= 59) {
                if (f < 12.0f) {
                    c2 = 0;
                } else if (f >= 12.0f && f < 18.0f) {
                    c2 = 1;
                } else if (f < 18.0f || f >= 28.0f) {
                    c2 = 3;
                } else {
                    c2 = 2;
                }
            } else if (f < 14.0f) {
                c2 = 0;
            } else if (f >= 14.0f && f < 20.0f) {
                c2 = 1;
            } else if (f < 20.0f || f >= 30.0f) {
                c2 = 3;
            } else {
                c2 = 2;
            }
        } else if (i <= 39) {
            if (f < 21.0f) {
                c2 = 0;
            } else if (f >= 21.0f && f < 28.0f) {
                c2 = 1;
            } else if (f < 28.0f || f >= 40.0f) {
                c2 = 3;
            } else {
                c2 = 2;
            }
        } else if (i <= 59) {
            if (f < 22.0f) {
                c2 = 0;
            } else if (f >= 22.0f && f < 29.0f) {
                c2 = 1;
            } else if (f < 29.0f || f >= 41.0f) {
                c2 = 3;
            } else {
                c2 = 2;
            }
        } else if (f < 23.0f) {
            c2 = 0;
        } else if (f >= 23.0f && f < 30.0f) {
            c2 = 1;
        } else if (f < 30.0f || f >= 42.0f) {
            c2 = 3;
        } else {
            c2 = 2;
        }
        if (f2 < 18.5f) {
            c3 = 0;
        } else if (f2 < 18.5f || f2 >= 24.0f) {
            c3 = (f2 < 24.0f || f2 >= 28.0f) ? (char) 3 : (char) 2;
        } else {
            c3 = 1;
        }
        if (c2 == 0 || c2 == 1) {
            if (c3 == 0) {
                i2 = -1;
            } else if (c3 != 1) {
                i2 = 2;
            }
        } else if (c2 == 2 || c2 == 3) {
            i2 = (c3 == 0 || c3 == 1) ? 1 : 3;
        }
        return i2;
    }

    public float g() {
        return this.f50986b;
    }

    public byte f() {
        return this.e;
    }

    public ve(float f, float f2, byte b2, int i, float f3) {
        this.f50986b = f;
        this.f = f2;
        this.e = b2;
        this.f50985a = i;
        this.d = f3;
    }

    public static int a(String str) {
        if (str != null && str.trim().length() != 0) {
            String[] strArrSplit = str.trim().split("\\|");
            if (strArrSplit.length > 0) {
                for (String str2 : strArrSplit) {
                    String[] strArrSplit2 = str2.trim().split("\\:");
                    if (strArrSplit2.length > 1 && strArrSplit2[0].equals("2")) {
                        return Integer.parseInt(strArrSplit2[1]);
                    }
                }
            }
        }
        return 0;
    }

    public float c() {
        float f = this.f;
        float f2 = this.f50986b;
        return (f / (f2 * f2)) * 100.0f * 100.0f;
    }

    public float i() {
        return (b() * this.f) / 100.0f;
    }

    private float n() {
        float f;
        float f2;
        float f3;
        if (this.f50987c) {
            if (this.e == 1) {
                float f4 = this.f50986b;
                f = this.f;
                f2 = (f4 * (-0.2893f)) + (0.6143f * f) + (this.f50985a * 0.0355f) + (this.d * 0.0207f);
                f3 = 7.9298f;
            } else {
                float f5 = this.f50986b;
                f = this.f;
                f2 = (f5 * (-0.2923f)) + (0.787f * f) + (this.f50985a * 0.0071f) + (this.d * 0.0139f);
                f3 = 9.6791f;
            }
        } else if (this.e == 1) {
            float f6 = this.f50986b;
            f = this.f;
            f2 = (f6 * (-0.3315f)) + (0.6216f * f) + (this.f50985a * 1.0f * 0.0183f) + (this.d * 0.0085f);
            f3 = 22.554f;
        } else {
            float f7 = this.f50986b;
            f = this.f;
            f2 = (f7 * (-0.3332f)) + (0.7509f * f) + (this.f50985a * 1.0f * 0.0196f) + (this.d * 0.0072f);
            f3 = 22.7193f;
        }
        return ((f2 + f3) / f) * 100.0f;
    }

    public float b() {
        float fN = n();
        if (fN < 5.0f) {
            fN = 5.0f;
        }
        if (fN > 45.0f) {
            return 45.0f;
        }
        return fN;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    /* JADX WARN: Code duplicated, block: B:21:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7 A[RETURN] */
    public float m() {
        float f;
        float f2;
        float f3;
        float f4;
        int i = this.f50985a;
        if (i <= 17) {
            return 0.0f;
        }
        if (this.f50987c) {
            if (this.e == 1) {
                f = (this.f50986b * (-0.2488f)) + (this.f * 0.3715f) + (i * 0.1346f) + (this.d * 0.0082f);
                f2 = 15.9014f;
            } else {
                f3 = ((((this.f50986b * (-0.0983f)) + (this.f * 0.2885f)) + (i * 0.0729f)) + (this.d * 0.0086f)) - 4.706f;
            }
            f4 = (int) f3;
            if (f3 - f4 >= 0.5f) {
                f4 += 0.5f;
            }
            if (f4 < 1.0f) {
                return 1.0f;
            }
            if (f4 > 59.0f) {
                return 59.0f;
            }
            return f4;
        }
        if (this.e == 1) {
            f = (this.f50986b * (-0.2675f)) + (this.f * 0.42f) + (i * 1.0f * 0.1462f) + (this.d * 0.0123f);
            f2 = 13.9871f;
        } else {
            f = (this.f50986b * (-0.1651f)) + (this.f * 0.2628f) + (i * 1.0f * 0.0649f) + (this.d * 0.0024f);
            f2 = 12.3445f;
        }
        f3 = f + f2;
        f4 = (int) f3;
        if (f3 - f4 >= 0.5f) {
            f4 += 0.5f;
        }
        if (f4 < 1.0f) {
            return 1.0f;
        }
        if (f4 > 59.0f) {
            return 59.0f;
        }
        return f4;
    }

    public float o() {
        float f;
        float f2;
        float f3;
        int i = this.f50985a;
        if (i <= 17) {
            return 0.0f;
        }
        if (this.f50987c) {
            if (this.e == 1) {
                float f4 = this.f50986b;
                f = this.f;
                f2 = (((f4 * 0.2224f) + (0.167f * f)) - (i * 0.0411f)) - (this.d * 0.0311f);
                f3 = 6.9026f;
            } else {
                float f5 = this.f50986b;
                f = this.f;
                f2 = (((f5 * 0.1058f) + (0.2168f * f)) - (i * 0.0016f)) - (this.d * 0.016f);
                f3 = 9.8471f;
            }
        } else if (this.e == 1) {
            float f6 = this.f50986b;
            f = this.f;
            f2 = (((f6 * 0.0939f) + (0.3758f * f)) - ((i * 1.0f) * 0.0032f)) - (this.d * 0.006925f);
            f3 = 0.097f;
        } else {
            float f7 = this.f50986b;
            f = this.f;
            f2 = (((f7 * 0.0877f) + (0.2973f * f)) + ((i * 1.0f) * 0.0128f)) - (this.d * 0.00603f);
            f3 = 0.5175f;
        }
        float f8 = ((f2 + f3) / f) * 100.0f;
        if (f8 < 20.0f) {
            f8 = 20.0f;
        }
        if (f8 > 85.0f) {
            f8 = 85.0f;
        }
        return new BigDecimal(f8).setScale(2, 4).floatValue();
    }

    private float l() {
        float f;
        float f2;
        float f3;
        float f4;
        float fN = n();
        if (fN > 45.0f) {
            float f5 = this.f;
            f4 = f5 - (0.45f * f5);
            f = 4.0f;
        } else {
            f = 1.0f;
            if (fN < 5.0f) {
                float f6 = this.f;
                f4 = f6 - (0.05f * f6);
            } else {
                if (this.f50987c) {
                    if (this.e == 1) {
                        f2 = (((this.f50986b * 0.2764f) + (this.f * 0.3662f)) - (this.f50985a * 0.0337f)) - (this.d * 0.0199f);
                        f3 = 7.739f;
                    } else {
                        f2 = (((this.f50986b * 0.2676f) + (this.f * 0.1948f)) - (this.f50985a * 0.0063f)) - (this.d * 0.0127f);
                        f3 = 7.8411f;
                    }
                } else if (this.e == 1) {
                    f2 = (((this.f50986b * 0.2867f) + (this.f * 0.3894f)) - ((this.f50985a * 1.0f) * 0.0408f)) - (this.d * 0.01235f);
                    f3 = 15.7665f;
                } else {
                    f2 = (((this.f50986b * 0.3186f) + (this.f * 0.1934f)) - ((this.f50985a * 1.0f) * 0.0206f)) - (this.d * 0.0132f);
                    f3 = 16.4556f;
                }
                float f7 = f2 - f3;
                if (f7 < 7.0f) {
                    f7 = 7.0f;
                }
                if (f7 > 141.5f) {
                    return 141.5f;
                }
                return f7;
            }
        }
        return f4 - f;
    }

    public float e(float f) {
        float f2 = this.f;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            if (f == 0.0f) {
                f = l();
                f2 = this.f;
            }
            f3 = (f / f2) * 100.0f;
        }
        return new BigDecimal(f3).setScale(2, 4).floatValue();
    }

    public float j() {
        float fI = (this.f - i()) - l();
        if (fI < 1.0f) {
            return 1.0f;
        }
        if (fI > 4.0f) {
            return 4.0f;
        }
        return fI;
    }

    public float e() {
        float f;
        float f2;
        if (this.f50987c) {
            if (this.e == 1) {
                f = (((this.f50986b * 7.2819f) + (this.f * 12.3775f)) - (this.f50985a * 4.4731f)) - (this.d * 0.5458f);
                f2 = 84.7412f;
            } else {
                f = (((this.f50986b * 6.3442f) + (this.f * 9.8875f)) - (this.f50985a * 3.4612f)) - (this.d * 0.3056f);
                f2 = 59.9762f;
            }
        } else if (this.e == 1) {
            f = (((this.f50986b * 7.5037f) + (this.f * 13.1523f)) - ((this.f50985a * 1.0f) * 4.3376f)) - (this.d * 0.3486f);
            f2 = 311.7751f;
        } else {
            f = (((this.f50986b * 7.5432f) + (this.f * 9.9474f)) - ((this.f50985a * 1.0f) * 3.4382f)) - (this.d * 0.309f);
            f2 = 288.2821f;
        }
        return new BigDecimal(f - f2).setScale(1, 4).floatValue();
    }

    public int d() {
        float f;
        float f2;
        int i = this.f50985a;
        if (i <= 17) {
            return 0;
        }
        if (this.f50987c) {
            if (this.e == 1) {
                f = (this.f50986b * (-0.5378f)) + (this.f * 0.7642f) + (i * 0.3667f) + (this.d * 0.039f);
                f2 = 33.8131f;
            } else {
                f = (this.f50986b * (-0.9531f)) + (this.f * 1.5246f) + (i * 0.4584f) + (this.d * 0.0374f);
                f2 = 58.5035f;
            }
        } else if (this.e == 1) {
            f = (this.f50986b * (-0.7471f)) + (this.f * 0.9161f) + (i * 1.0f * 0.4184f) + (this.d * 0.0517f);
            f2 = 54.2267f;
        } else {
            f = (this.f50986b * (-1.1165f)) + (this.f * 1.5784f) + (i * 1.0f * 0.4615f) + (this.d * 0.0415f);
            f2 = 83.2548f;
        }
        int i2 = (int) (f + f2);
        if (i2 - i > 10) {
            i2 = i + 10;
        } else if (i - i2 > 10) {
            i2 = i - 10;
        }
        if (i2 < 18) {
            i2 = 18;
        }
        if (i2 > 80) {
            return 80;
        }
        return i2;
    }

    public float a() {
        return d(this.e, this.f50986b);
    }

    public float k() {
        return e(b(), c(), this.e, this.f50985a);
    }

    public float h() {
        return b(this.f50986b, this.f, this.e, this.f50985a, b(), l(), m());
    }

    private float b(float f, float f2, byte b2, int i, float f3, float f4, float f5) {
        if (i > 17) {
            return d(f, f2, b2, i, f3, f4, f5);
        }
        return 0.0f;
    }

    public static float b(float f, float f2, byte b2, int i, float f3) {
        return e(f3, (f2 / (f * f)) * 100.0f * 100.0f, b2, i);
    }
}
