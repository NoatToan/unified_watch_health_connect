package com.huawei.ucd.medal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import defpackage.qid;
import defpackage.qih;
import defpackage.qim;
import java.util.Arrays;

/* JADX INFO: loaded from: classes43.dex */
public class MedalBackContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qim f23244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f23245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f23246c;
    public MedalBackType.ModelType d;
    public MedalBackType.ColorType e;
    public qim i;
    public int j;

    /* synthetic */ MedalBackContent(AnonymousClass1 anonymousClass1) {
        this();
    }

    private MedalBackContent() {
        this.f23244a = new qim();
        this.i = new qim();
    }

    public String toString() {
        return "MedalBackContent{mModelType=" + this.d + ", mColorType=" + this.e + ", mTextColor=" + this.j + ", mFirstStrOffsetXTopY=" + this.f23244a.toString() + ", mSecondStrOffsetXTopY=" + this.i.toString() + ", mContents=" + Arrays.toString(this.f23245b) + ", mIconContent=" + this.f23246c + '}';
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f23249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f23250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MedalBackType.ColorType f23251c;
        public qim d;
        public qim e;
        private Bitmap f;
        private MedalBackType.ModelType i;
        private Integer j;

        public Builder(Context context) {
            this.f23249a = context;
        }

        public Builder a(MedalBackType.ModelType modelType) {
            this.i = modelType;
            return this;
        }

        public Builder c(MedalBackType.ColorType colorType) {
            this.f23251c = colorType;
            return this;
        }

        public Builder c(String[] strArr) {
            this.f23250b = strArr;
            return this;
        }

        public Builder b(Bitmap bitmap) {
            this.f = bitmap;
            return this;
        }

        public MedalBackContent c() {
            MedalBackContent medalBackContent = new MedalBackContent(null);
            medalBackContent.d = this.i;
            medalBackContent.e = this.f23251c;
            medalBackContent.f23245b = this.f23250b;
            c(medalBackContent);
            a(medalBackContent);
            e(medalBackContent);
            b(medalBackContent);
            if (this.i != null && this.f23251c != null && this.f23250b != null) {
                qid.e("MedalBackContent", "MedalBackContent build mModelType= " + this.i.toString() + "mColorType= " + this.f23251c.toString() + "mContents= " + Arrays.toString(this.f23250b));
            }
            return medalBackContent;
        }

        private void b(MedalBackContent medalBackContent) {
            Bitmap bitmap = this.f;
            if (bitmap == null) {
                switch (AnonymousClass1.f23247b[this.i.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        int i = AnonymousClass1.f23248c[this.f23251c.ordinal()];
                        if (i == 1) {
                            medalBackContent.f23246c = qih.c(this.f23249a, "medal/medal_back_icon_solid_copper.png");
                            break;
                        } else if (i == 2) {
                            medalBackContent.f23246c = qih.c(this.f23249a, "medal/medal_back_icon_solid_silver.png");
                            break;
                        } else if (i == 3) {
                            medalBackContent.f23246c = qih.c(this.f23249a, "medal/medal_back_icon_solid_gold.png");
                            break;
                        }
                        break;
                    case 4:
                    case 5:
                        int i2 = AnonymousClass1.f23248c[this.f23251c.ordinal()];
                        if (i2 == 1) {
                            medalBackContent.f23246c = qih.c(this.f23249a, "medal/medal_back_icon_hollow_hexagon_copper.png");
                            break;
                        } else if (i2 == 2) {
                            medalBackContent.f23246c = qih.c(this.f23249a, "medal/medal_back_icon_hollow_hexagon_silver.png");
                            break;
                        } else if (i2 == 3) {
                            medalBackContent.f23246c = qih.c(this.f23249a, "medal/medal_back_icon_hollow_hexagon_gold.png");
                            break;
                        }
                        break;
                    case 6:
                        int i3 = AnonymousClass1.f23248c[this.f23251c.ordinal()];
                        if (i3 == 1) {
                            medalBackContent.f23246c = qih.c(this.f23249a, "medal/medal_back_icon_hollow_tetragonum_copper.png");
                            break;
                        } else if (i3 == 2) {
                            medalBackContent.f23246c = qih.c(this.f23249a, "medal/medal_back_icon_hollow_tetragonum_silver.png");
                            break;
                        } else if (i3 == 3) {
                            medalBackContent.f23246c = qih.c(this.f23249a, "medal/medal_back_icon_hollow_tetragonum_gold.png");
                            break;
                        }
                        break;
                    case 7:
                        int i4 = AnonymousClass1.f23248c[this.f23251c.ordinal()];
                        if (i4 == 1) {
                            medalBackContent.f23246c = qih.c(this.f23249a, "medal/medal_back_icon_hollow_triangle_copper.png");
                            break;
                        } else if (i4 == 2) {
                            medalBackContent.f23246c = qih.c(this.f23249a, "medal/medal_back_icon_hollow_triangle_silver.png");
                            break;
                        } else if (i4 == 3) {
                            medalBackContent.f23246c = qih.c(this.f23249a, "medal/medal_back_icon_hollow_triangle_gold.png");
                            break;
                        }
                        break;
                }
                return;
            }
            medalBackContent.f23246c = bitmap;
        }

        private void e(MedalBackContent medalBackContent) {
            Integer num = this.j;
            if (num == null) {
                int i = AnonymousClass1.f23248c[this.f23251c.ordinal()];
                if (i == 1) {
                    medalBackContent.j = Color.argb(255, 112, 49, 3);
                    return;
                } else if (i == 2) {
                    medalBackContent.j = Color.argb(255, 111, 111, 111);
                    return;
                } else {
                    if (i != 3) {
                        return;
                    }
                    medalBackContent.j = Color.argb(255, 176, 124, 8);
                    return;
                }
            }
            medalBackContent.j = num.intValue();
        }

        private void c(MedalBackContent medalBackContent) {
            if (this.e == null) {
                this.e = new qim(0.0f, 300.0f);
                switch (AnonymousClass1.f23247b[this.i.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                        this.e.f46273c = 376.0f;
                        break;
                    case 6:
                        this.e.d = -20.0f;
                        this.e.f46273c = 376.0f;
                        break;
                    case 7:
                        this.e.f46273c = 284.0f;
                        break;
                    default:
                        this.e.f46273c = 300.0f;
                        break;
                }
            }
            medalBackContent.f23244a = this.e;
        }

        private void a(MedalBackContent medalBackContent) {
            if (this.d == null) {
                this.d = new qim(0.0f, 324.0f);
                switch (AnonymousClass1.f23247b[this.i.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                        this.d.f46273c = 390.0f;
                        break;
                    case 6:
                        this.d.d = -20.0f;
                        this.d.f46273c = 390.0f;
                        break;
                    case 7:
                        this.d.f46273c = 316.0f;
                        break;
                    default:
                        this.d.f46273c = 324.0f;
                        break;
                }
            }
            medalBackContent.i = this.d;
        }
    }

    /* JADX INFO: renamed from: com.huawei.ucd.medal.MedalBackContent$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f23247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f23248c;

        static {
            int[] iArr = new int[MedalBackType.ModelType.values().length];
            f23247b = iArr;
            try {
                iArr[MedalBackType.ModelType.SOLID_CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23247b[MedalBackType.ModelType.SOLID_FLOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23247b[MedalBackType.ModelType.SOLID_PENTAGON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23247b[MedalBackType.ModelType.HOLLOW_CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23247b[MedalBackType.ModelType.HOLLOW_HEXAGON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23247b[MedalBackType.ModelType.HOLLOW_TETRAGONUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23247b[MedalBackType.ModelType.HOLLOW_TRIANGLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[MedalBackType.ColorType.values().length];
            f23248c = iArr2;
            try {
                iArr2[MedalBackType.ColorType.COPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23248c[MedalBackType.ColorType.SILVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23248c[MedalBackType.ColorType.GOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }
}
