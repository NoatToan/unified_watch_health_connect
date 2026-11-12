package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class rtr extends sf2 {
    public int f;
    public int g;

    public rtr(a52 a52Var) {
        super(a52Var);
        this.f = 4;
        this.g = -1;
    }

    public static rtr f(a52 a52Var, float f, int i) {
        rtr rtrVar = new rtr(a52Var);
        rtrVar.mAxisMaximum = Math.max(f, 4.0f);
        rtrVar.setLabelCount(i);
        return rtrVar;
    }

    @Override // defpackage.sf2
    public HashMap<Float, Float> a(float f, float f2, int i) {
        float[] fArr = this.mEntries;
        if (fArr == null || fArr.length == 0) {
            return new HashMap<>();
        }
        HashMap<Float, Float> map = this.e;
        if (map == null) {
            this.e = new LinkedHashMap();
        } else {
            map.clear();
        }
        for (int i2 = 0; i2 <= i; i2++) {
            if (i2 > 0) {
                f += f2;
            }
            if (i2 < this.mEntries.length) {
                this.e.put(Float.valueOf(f), Float.valueOf(this.mEntries[i2]));
            } else {
                this.e.put(Float.valueOf(f), Float.valueOf(0.0f));
            }
        }
        return this.e;
    }

    public rtr g(rtr rtrVar) {
        rtrVar.setAxisMinimum(0.0f);
        rtrVar.setAxisMaximum(3.0f);
        rtrVar.setLabelCount(3);
        this.f = 3;
        return rtrVar;
    }

    @Override // defpackage.ft1
    public int getLabelCount() {
        return this.f;
    }

    public rtr h(rtr rtrVar) {
        if (4.0f == this.mAxisMaximum) {
            return null;
        }
        rtrVar.setAxisMaximum(4.0f);
        rtrVar.setAxisMinimum(0.0f);
        rtrVar.setLabelCount(6);
        this.f = 6;
        return rtrVar;
    }

    public rtr i(rtr rtrVar) {
        if (142.7f == this.mAxisMaximum) {
            return null;
        }
        rtrVar.setAxisMaximum(142.7f);
        rtrVar.setAxisMinimum(62.3f);
        rtrVar.setLabelCount(6);
        this.f = 6;
        return rtrVar;
    }

    public rtr j(rtr rtrVar, float f) {
        rtrVar.setAxisMaximum(f);
        this.f = 4;
        rtrVar.setLabelCount(4);
        return rtrVar;
    }

    public rtr k(rtr rtrVar, float f, float f2) {
        rtrVar.setAxisMaximum(f);
        rtrVar.setAxisMinimum(f2);
        rtrVar.setLabelCount(4);
        this.f = 4;
        return rtrVar;
    }

    public rtr l(rtr rtrVar, float f) {
        return n(rtrVar, f, false);
    }

    public rtr m(rtr rtrVar, float f, int i) {
        rtrVar.setAxisMaximum(Math.max(f, 4.0f));
        rtrVar.setLabelCount(i);
        this.f = i;
        return rtrVar;
    }

    public rtr n(rtr rtrVar, float f, boolean z) {
        float f2 = 50000.0f;
        if (f > 50000.0f) {
            this.f = 5;
            f2 = 80000.0f;
        } else {
            float f3 = 30000.0f;
            if (f > 30000.0f) {
                this.f = 5;
            } else {
                f2 = 25000.0f;
                if (f > 25000.0f) {
                    this.f = 5;
                } else {
                    f3 = 20000.0f;
                    if (f > 20000.0f) {
                        this.f = 5;
                    } else {
                        f2 = 15000.0f;
                        if (f > 15000.0f) {
                            this.f = 5;
                        } else {
                            f3 = 10000.0f;
                            if (f > 10000.0f) {
                                this.f = 5;
                            } else {
                                f2 = 8000.0f;
                                if (f > 8000.0f) {
                                    this.f = 5;
                                } else {
                                    f3 = 6000.0f;
                                    if (f > 6000.0f) {
                                        this.f = 5;
                                    } else if (f > 4000.0f) {
                                        this.f = 5;
                                    } else {
                                        f2 = 3000.0f;
                                        if (f > 3000.0f) {
                                            this.f = 5;
                                            f2 = 5000.0f;
                                        } else {
                                            f3 = 2000.0f;
                                            if (f > 2000.0f) {
                                                this.f = 5;
                                            } else {
                                                f2 = 1500.0f;
                                                if (f > 1500.0f) {
                                                    this.f = 5;
                                                } else {
                                                    f3 = 1000.0f;
                                                    if (f > 1000.0f) {
                                                        this.f = 5;
                                                    } else {
                                                        f2 = 800.0f;
                                                        if (f > 800.0f) {
                                                            this.f = 5;
                                                        } else {
                                                            f3 = 500.0f;
                                                            if (f > 500.0f) {
                                                                this.f = 4;
                                                            } else {
                                                                f2 = 300.0f;
                                                                if (f > 300.0f) {
                                                                    this.f = 4;
                                                                } else {
                                                                    f3 = 200.0f;
                                                                    if (f > 200.0f) {
                                                                        this.f = 4;
                                                                    } else {
                                                                        f2 = 140.0f;
                                                                        if (f > 140.0f) {
                                                                            this.f = 4;
                                                                        } else {
                                                                            f3 = 120.0f;
                                                                            if (f > 120.0f) {
                                                                                this.f = 5;
                                                                            } else {
                                                                                f2 = 100.0f;
                                                                                if (f > 100.0f) {
                                                                                    this.f = 5;
                                                                                } else {
                                                                                    f3 = 80.0f;
                                                                                    if (f > 80.0f) {
                                                                                        this.f = 5;
                                                                                    } else if (f > 60.0f) {
                                                                                        this.f = 5;
                                                                                    } else if (f > 40.0f) {
                                                                                        this.f = 5;
                                                                                        f2 = 60.0f;
                                                                                    } else if (f > 30.0f) {
                                                                                        this.f = 5;
                                                                                        f2 = 40.0f;
                                                                                    } else if (f > 20.0f) {
                                                                                        this.f = 5;
                                                                                        f2 = 30.0f;
                                                                                    } else if (f > 12.0f) {
                                                                                        this.f = 5;
                                                                                        f2 = 20.0f;
                                                                                    } else if (f > 10.0f) {
                                                                                        this.f = 4;
                                                                                        f2 = 12.0f;
                                                                                    } else if (f > 8.0f) {
                                                                                        this.f = 5;
                                                                                        f2 = 10.0f;
                                                                                    } else if (f > 5.0f) {
                                                                                        this.f = 4;
                                                                                        f2 = 8.0f;
                                                                                    } else if (f > 3.0f) {
                                                                                        this.f = 5;
                                                                                        f2 = 5.0f;
                                                                                    } else {
                                                                                        this.f = 4;
                                                                                        f2 = 4.0f;
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
                f2 = f3;
            }
        }
        if (f2 == this.mAxisMaximum && !z) {
            return rtrVar;
        }
        rtrVar.setAxisMaximum(f2);
        rtrVar.setLabelCount(this.f);
        return rtrVar;
    }
}
