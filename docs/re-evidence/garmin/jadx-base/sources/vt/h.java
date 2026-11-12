package vt;

import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o13.r;
import o53.b0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import u53.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity$shareMultipleImages$1", f = "MultipleImagesShareSampleActivity.kt", l = {133, 146}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f180030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultipleImagesShareSampleActivity f180031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f180032c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity$shareMultipleImages$1$1", f = "MultipleImagesShareSampleActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<Uri> f180033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f180034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MultipleImagesShareSampleActivity f180035c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends Uri> list, boolean z14, MultipleImagesShareSampleActivity multipleImagesShareSampleActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f180033a = list;
            this.f180034b = z14;
            this.f180035c = multipleImagesShareSampleActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f180033a, this.f180034b, this.f180035c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.setType("image/*");
            intent.addFlags(1);
            List<Uri> list = this.f180033a;
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(list));
            Objects.toString(list);
            if (this.f180034b) {
                intent = Intent.createChooser(intent, "Share Multiple Images.");
            }
            this.f180035c.startActivity(intent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Landroid/net/Uri;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity$shareMultipleImages$1$imageUris$1", f = "MultipleImagesShareSampleActivity.kt", l = {SyslogConstants.LOG_LOCAL1, 137, TsExtractor.TS_STREAM_TYPE_DTS, 139, 140, 141, 142, 143}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super List<? extends Uri>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri[] f180036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri[] f180037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f180038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f180039d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MultipleImagesShareSampleActivity f180040e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MultipleImagesShareSampleActivity multipleImagesShareSampleActivity, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f180040e = multipleImagesShareSampleActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f180040e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<? extends Uri>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:29:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:37:0x0104  */
        /* JADX WARN: Code duplicated, block: B:41:0x011c  */
        /* JADX WARN: Code duplicated, block: B:45:0x0134  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Uri[] uriArr;
            int i14;
            Object[] objArr;
            Object[] objArr2;
            Uri[] uriArr2;
            Object[] objArr3;
            Uri[] uriArr3;
            Object[] objArr4;
            Uri[] uriArr4;
            Object[] objArr5;
            Uri[] uriArr5;
            Object[] objArr6;
            Uri[] uriArr6;
            Object[] objArr7;
            Object[] objArr8;
            Object[] objArr9;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f180039d;
            MultipleImagesShareSampleActivity multipleImagesShareSampleActivity = this.f180040e;
            int i16 = 7;
            int i17 = 6;
            int i18 = 5;
            int i19 = 4;
            int i24 = 3;
            int i25 = 2;
            int i26 = 1;
            switch (i15) {
                case 0:
                    r.b(obj);
                    uriArr = new Uri[8];
                    this.f180036a = uriArr;
                    this.f180037b = uriArr;
                    i14 = 0;
                    this.f180038c = 0;
                    this.f180039d = 1;
                    obj = j.a(multipleImagesShareSampleActivity, R.drawable.share1, "share1.jpg", this);
                    if (obj != obj2) {
                        objArr = uriArr;
                        objArr[i14] = obj;
                        this.f180036a = uriArr;
                        this.f180037b = uriArr;
                        this.f180038c = 1;
                        this.f180039d = 2;
                        obj = j.a(multipleImagesShareSampleActivity, R.drawable.share2, "share2.jpg", this);
                        if (obj != obj2) {
                            objArr2 = uriArr;
                            objArr2[i26] = obj;
                            this.f180036a = uriArr;
                            this.f180037b = uriArr;
                            this.f180038c = 2;
                            this.f180039d = 3;
                            obj = j.a(multipleImagesShareSampleActivity, R.drawable.share3, "share3.jpg", this);
                            if (obj != obj2) {
                                Uri[] uriArr7 = uriArr;
                                uriArr2 = uriArr7;
                                objArr3 = uriArr7;
                                objArr3[i25] = obj;
                                this.f180036a = uriArr2;
                                this.f180037b = uriArr2;
                                this.f180038c = 3;
                                this.f180039d = 4;
                                obj = j.a(multipleImagesShareSampleActivity, R.drawable.share4, "share4.jpg", this);
                                if (obj != obj2) {
                                    Uri[] uriArr8 = uriArr2;
                                    uriArr3 = uriArr8;
                                    objArr4 = uriArr8;
                                    objArr4[i24] = obj;
                                    this.f180036a = uriArr3;
                                    this.f180037b = uriArr3;
                                    this.f180038c = 4;
                                    this.f180039d = 5;
                                    obj = j.a(multipleImagesShareSampleActivity, R.drawable.share5, "share5.jpg", this);
                                    if (obj != obj2) {
                                        Uri[] uriArr9 = uriArr3;
                                        uriArr4 = uriArr9;
                                        objArr5 = uriArr9;
                                        objArr5[i19] = obj;
                                        this.f180036a = uriArr4;
                                        this.f180037b = uriArr4;
                                        this.f180038c = 5;
                                        this.f180039d = 6;
                                        obj = j.a(multipleImagesShareSampleActivity, R.drawable.share6, "share6.jpg", this);
                                        if (obj != obj2) {
                                            Uri[] uriArr10 = uriArr4;
                                            uriArr5 = uriArr10;
                                            objArr6 = uriArr10;
                                            objArr6[i18] = obj;
                                            this.f180036a = uriArr5;
                                            this.f180037b = uriArr5;
                                            this.f180038c = 6;
                                            this.f180039d = 7;
                                            obj = j.a(multipleImagesShareSampleActivity, R.drawable.share7, "share7.jpg", this);
                                            if (obj != obj2) {
                                                Uri[] uriArr11 = uriArr5;
                                                uriArr6 = uriArr11;
                                                objArr7 = uriArr11;
                                                objArr7[i17] = obj;
                                                this.f180036a = uriArr6;
                                                this.f180037b = uriArr6;
                                                this.f180038c = 7;
                                                this.f180039d = 8;
                                                obj = j.a(multipleImagesShareSampleActivity, R.drawable.share8, "share8.jpg", this);
                                                if (obj != obj2) {
                                                    Object[] objArr10 = uriArr6;
                                                    objArr8 = objArr10;
                                                    objArr9 = objArr10;
                                                    objArr9[i16] = obj;
                                                    return h0.Z(x.d(objArr8));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return obj2;
                case 1:
                    i14 = this.f180038c;
                    Object[] objArr11 = this.f180037b;
                    Uri[] uriArr12 = this.f180036a;
                    r.b(obj);
                    objArr = objArr11;
                    uriArr = uriArr12;
                    objArr[i14] = obj;
                    this.f180036a = uriArr;
                    this.f180037b = uriArr;
                    this.f180038c = 1;
                    this.f180039d = 2;
                    obj = j.a(multipleImagesShareSampleActivity, R.drawable.share2, "share2.jpg", this);
                    if (obj != obj2) {
                        objArr2 = uriArr;
                        objArr2[i26] = obj;
                        this.f180036a = uriArr;
                        this.f180037b = uriArr;
                        this.f180038c = 2;
                        this.f180039d = 3;
                        obj = j.a(multipleImagesShareSampleActivity, R.drawable.share3, "share3.jpg", this);
                        if (obj != obj2) {
                            Uri[] uriArr13 = uriArr;
                            uriArr2 = uriArr13;
                            objArr3 = uriArr13;
                            objArr3[i25] = obj;
                            this.f180036a = uriArr2;
                            this.f180037b = uriArr2;
                            this.f180038c = 3;
                            this.f180039d = 4;
                            obj = j.a(multipleImagesShareSampleActivity, R.drawable.share4, "share4.jpg", this);
                            if (obj != obj2) {
                                Uri[] uriArr14 = uriArr2;
                                uriArr3 = uriArr14;
                                objArr4 = uriArr14;
                                objArr4[i24] = obj;
                                this.f180036a = uriArr3;
                                this.f180037b = uriArr3;
                                this.f180038c = 4;
                                this.f180039d = 5;
                                obj = j.a(multipleImagesShareSampleActivity, R.drawable.share5, "share5.jpg", this);
                                if (obj != obj2) {
                                    Uri[] uriArr15 = uriArr3;
                                    uriArr4 = uriArr15;
                                    objArr5 = uriArr15;
                                    objArr5[i19] = obj;
                                    this.f180036a = uriArr4;
                                    this.f180037b = uriArr4;
                                    this.f180038c = 5;
                                    this.f180039d = 6;
                                    obj = j.a(multipleImagesShareSampleActivity, R.drawable.share6, "share6.jpg", this);
                                    if (obj != obj2) {
                                        Uri[] uriArr16 = uriArr4;
                                        uriArr5 = uriArr16;
                                        objArr6 = uriArr16;
                                        objArr6[i18] = obj;
                                        this.f180036a = uriArr5;
                                        this.f180037b = uriArr5;
                                        this.f180038c = 6;
                                        this.f180039d = 7;
                                        obj = j.a(multipleImagesShareSampleActivity, R.drawable.share7, "share7.jpg", this);
                                        if (obj != obj2) {
                                            Uri[] uriArr17 = uriArr5;
                                            uriArr6 = uriArr17;
                                            objArr7 = uriArr17;
                                            objArr7[i17] = obj;
                                            this.f180036a = uriArr6;
                                            this.f180037b = uriArr6;
                                            this.f180038c = 7;
                                            this.f180039d = 8;
                                            obj = j.a(multipleImagesShareSampleActivity, R.drawable.share8, "share8.jpg", this);
                                            if (obj != obj2) {
                                                Object[] objArr12 = uriArr6;
                                                objArr8 = objArr12;
                                                objArr9 = objArr12;
                                                objArr9[i16] = obj;
                                                return h0.Z(x.d(objArr8));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return obj2;
                case 2:
                    i26 = this.f180038c;
                    Object[] objArr13 = this.f180037b;
                    uriArr = this.f180036a;
                    r.b(obj);
                    objArr2 = objArr13;
                    objArr2[i26] = obj;
                    this.f180036a = uriArr;
                    this.f180037b = uriArr;
                    this.f180038c = 2;
                    this.f180039d = 3;
                    obj = j.a(multipleImagesShareSampleActivity, R.drawable.share3, "share3.jpg", this);
                    if (obj != obj2) {
                        Uri[] uriArr18 = uriArr;
                        uriArr2 = uriArr18;
                        objArr3 = uriArr18;
                        objArr3[i25] = obj;
                        this.f180036a = uriArr2;
                        this.f180037b = uriArr2;
                        this.f180038c = 3;
                        this.f180039d = 4;
                        obj = j.a(multipleImagesShareSampleActivity, R.drawable.share4, "share4.jpg", this);
                        if (obj != obj2) {
                            Uri[] uriArr19 = uriArr2;
                            uriArr3 = uriArr19;
                            objArr4 = uriArr19;
                            objArr4[i24] = obj;
                            this.f180036a = uriArr3;
                            this.f180037b = uriArr3;
                            this.f180038c = 4;
                            this.f180039d = 5;
                            obj = j.a(multipleImagesShareSampleActivity, R.drawable.share5, "share5.jpg", this);
                            if (obj != obj2) {
                                Uri[] uriArr110 = uriArr3;
                                uriArr4 = uriArr110;
                                objArr5 = uriArr110;
                                objArr5[i19] = obj;
                                this.f180036a = uriArr4;
                                this.f180037b = uriArr4;
                                this.f180038c = 5;
                                this.f180039d = 6;
                                obj = j.a(multipleImagesShareSampleActivity, R.drawable.share6, "share6.jpg", this);
                                if (obj != obj2) {
                                    Uri[] uriArr111 = uriArr4;
                                    uriArr5 = uriArr111;
                                    objArr6 = uriArr111;
                                    objArr6[i18] = obj;
                                    this.f180036a = uriArr5;
                                    this.f180037b = uriArr5;
                                    this.f180038c = 6;
                                    this.f180039d = 7;
                                    obj = j.a(multipleImagesShareSampleActivity, R.drawable.share7, "share7.jpg", this);
                                    if (obj != obj2) {
                                        Uri[] uriArr112 = uriArr5;
                                        uriArr6 = uriArr112;
                                        objArr7 = uriArr112;
                                        objArr7[i17] = obj;
                                        this.f180036a = uriArr6;
                                        this.f180037b = uriArr6;
                                        this.f180038c = 7;
                                        this.f180039d = 8;
                                        obj = j.a(multipleImagesShareSampleActivity, R.drawable.share8, "share8.jpg", this);
                                        if (obj != obj2) {
                                            Object[] objArr14 = uriArr6;
                                            objArr8 = objArr14;
                                            objArr9 = objArr14;
                                            objArr9[i16] = obj;
                                            return h0.Z(x.d(objArr8));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return obj2;
                case 3:
                    i25 = this.f180038c;
                    Object[] objArr15 = this.f180037b;
                    Uri[] uriArr20 = this.f180036a;
                    r.b(obj);
                    objArr3 = objArr15;
                    uriArr2 = uriArr20;
                    objArr3[i25] = obj;
                    this.f180036a = uriArr2;
                    this.f180037b = uriArr2;
                    this.f180038c = 3;
                    this.f180039d = 4;
                    obj = j.a(multipleImagesShareSampleActivity, R.drawable.share4, "share4.jpg", this);
                    if (obj != obj2) {
                        Uri[] uriArr113 = uriArr2;
                        uriArr3 = uriArr113;
                        objArr4 = uriArr113;
                        objArr4[i24] = obj;
                        this.f180036a = uriArr3;
                        this.f180037b = uriArr3;
                        this.f180038c = 4;
                        this.f180039d = 5;
                        obj = j.a(multipleImagesShareSampleActivity, R.drawable.share5, "share5.jpg", this);
                        if (obj != obj2) {
                            Uri[] uriArr114 = uriArr3;
                            uriArr4 = uriArr114;
                            objArr5 = uriArr114;
                            objArr5[i19] = obj;
                            this.f180036a = uriArr4;
                            this.f180037b = uriArr4;
                            this.f180038c = 5;
                            this.f180039d = 6;
                            obj = j.a(multipleImagesShareSampleActivity, R.drawable.share6, "share6.jpg", this);
                            if (obj != obj2) {
                                Uri[] uriArr115 = uriArr4;
                                uriArr5 = uriArr115;
                                objArr6 = uriArr115;
                                objArr6[i18] = obj;
                                this.f180036a = uriArr5;
                                this.f180037b = uriArr5;
                                this.f180038c = 6;
                                this.f180039d = 7;
                                obj = j.a(multipleImagesShareSampleActivity, R.drawable.share7, "share7.jpg", this);
                                if (obj != obj2) {
                                    Uri[] uriArr116 = uriArr5;
                                    uriArr6 = uriArr116;
                                    objArr7 = uriArr116;
                                    objArr7[i17] = obj;
                                    this.f180036a = uriArr6;
                                    this.f180037b = uriArr6;
                                    this.f180038c = 7;
                                    this.f180039d = 8;
                                    obj = j.a(multipleImagesShareSampleActivity, R.drawable.share8, "share8.jpg", this);
                                    if (obj != obj2) {
                                        Object[] objArr16 = uriArr6;
                                        objArr8 = objArr16;
                                        objArr9 = objArr16;
                                        objArr9[i16] = obj;
                                        return h0.Z(x.d(objArr8));
                                    }
                                }
                            }
                        }
                    }
                    return obj2;
                case 4:
                    i24 = this.f180038c;
                    Object[] objArr17 = this.f180037b;
                    Uri[] uriArr21 = this.f180036a;
                    r.b(obj);
                    objArr4 = objArr17;
                    uriArr3 = uriArr21;
                    objArr4[i24] = obj;
                    this.f180036a = uriArr3;
                    this.f180037b = uriArr3;
                    this.f180038c = 4;
                    this.f180039d = 5;
                    obj = j.a(multipleImagesShareSampleActivity, R.drawable.share5, "share5.jpg", this);
                    if (obj != obj2) {
                        Uri[] uriArr117 = uriArr3;
                        uriArr4 = uriArr117;
                        objArr5 = uriArr117;
                        objArr5[i19] = obj;
                        this.f180036a = uriArr4;
                        this.f180037b = uriArr4;
                        this.f180038c = 5;
                        this.f180039d = 6;
                        obj = j.a(multipleImagesShareSampleActivity, R.drawable.share6, "share6.jpg", this);
                        if (obj != obj2) {
                            Uri[] uriArr118 = uriArr4;
                            uriArr5 = uriArr118;
                            objArr6 = uriArr118;
                            objArr6[i18] = obj;
                            this.f180036a = uriArr5;
                            this.f180037b = uriArr5;
                            this.f180038c = 6;
                            this.f180039d = 7;
                            obj = j.a(multipleImagesShareSampleActivity, R.drawable.share7, "share7.jpg", this);
                            if (obj != obj2) {
                                Uri[] uriArr119 = uriArr5;
                                uriArr6 = uriArr119;
                                objArr7 = uriArr119;
                                objArr7[i17] = obj;
                                this.f180036a = uriArr6;
                                this.f180037b = uriArr6;
                                this.f180038c = 7;
                                this.f180039d = 8;
                                obj = j.a(multipleImagesShareSampleActivity, R.drawable.share8, "share8.jpg", this);
                                if (obj != obj2) {
                                    Object[] objArr18 = uriArr6;
                                    objArr8 = objArr18;
                                    objArr9 = objArr18;
                                    objArr9[i16] = obj;
                                    return h0.Z(x.d(objArr8));
                                }
                            }
                        }
                    }
                    return obj2;
                case 5:
                    i19 = this.f180038c;
                    Object[] objArr19 = this.f180037b;
                    Uri[] uriArr22 = this.f180036a;
                    r.b(obj);
                    objArr5 = objArr19;
                    uriArr4 = uriArr22;
                    objArr5[i19] = obj;
                    this.f180036a = uriArr4;
                    this.f180037b = uriArr4;
                    this.f180038c = 5;
                    this.f180039d = 6;
                    obj = j.a(multipleImagesShareSampleActivity, R.drawable.share6, "share6.jpg", this);
                    if (obj != obj2) {
                        Uri[] uriArr1110 = uriArr4;
                        uriArr5 = uriArr1110;
                        objArr6 = uriArr1110;
                        objArr6[i18] = obj;
                        this.f180036a = uriArr5;
                        this.f180037b = uriArr5;
                        this.f180038c = 6;
                        this.f180039d = 7;
                        obj = j.a(multipleImagesShareSampleActivity, R.drawable.share7, "share7.jpg", this);
                        if (obj != obj2) {
                            Uri[] uriArr1111 = uriArr5;
                            uriArr6 = uriArr1111;
                            objArr7 = uriArr1111;
                            objArr7[i17] = obj;
                            this.f180036a = uriArr6;
                            this.f180037b = uriArr6;
                            this.f180038c = 7;
                            this.f180039d = 8;
                            obj = j.a(multipleImagesShareSampleActivity, R.drawable.share8, "share8.jpg", this);
                            if (obj != obj2) {
                                Object[] objArr110 = uriArr6;
                                objArr8 = objArr110;
                                objArr9 = objArr110;
                                objArr9[i16] = obj;
                                return h0.Z(x.d(objArr8));
                            }
                        }
                    }
                    return obj2;
                case 6:
                    i18 = this.f180038c;
                    Object[] objArr20 = this.f180037b;
                    Uri[] uriArr23 = this.f180036a;
                    r.b(obj);
                    objArr6 = objArr20;
                    uriArr5 = uriArr23;
                    objArr6[i18] = obj;
                    this.f180036a = uriArr5;
                    this.f180037b = uriArr5;
                    this.f180038c = 6;
                    this.f180039d = 7;
                    obj = j.a(multipleImagesShareSampleActivity, R.drawable.share7, "share7.jpg", this);
                    if (obj != obj2) {
                        Uri[] uriArr1112 = uriArr5;
                        uriArr6 = uriArr1112;
                        objArr7 = uriArr1112;
                        objArr7[i17] = obj;
                        this.f180036a = uriArr6;
                        this.f180037b = uriArr6;
                        this.f180038c = 7;
                        this.f180039d = 8;
                        obj = j.a(multipleImagesShareSampleActivity, R.drawable.share8, "share8.jpg", this);
                        if (obj != obj2) {
                            Object[] objArr111 = uriArr6;
                            objArr8 = objArr111;
                            objArr9 = objArr111;
                            objArr9[i16] = obj;
                            return h0.Z(x.d(objArr8));
                        }
                    }
                    return obj2;
                case 7:
                    i17 = this.f180038c;
                    Object[] objArr21 = this.f180037b;
                    Uri[] uriArr24 = this.f180036a;
                    r.b(obj);
                    objArr7 = objArr21;
                    uriArr6 = uriArr24;
                    objArr7[i17] = obj;
                    this.f180036a = uriArr6;
                    this.f180037b = uriArr6;
                    this.f180038c = 7;
                    this.f180039d = 8;
                    obj = j.a(multipleImagesShareSampleActivity, R.drawable.share8, "share8.jpg", this);
                    if (obj != obj2) {
                        Object[] objArr112 = uriArr6;
                        objArr8 = objArr112;
                        objArr9 = objArr112;
                        objArr9[i16] = obj;
                        return h0.Z(x.d(objArr8));
                    }
                    return obj2;
                case 8:
                    i16 = this.f180038c;
                    Object[] objArr22 = this.f180037b;
                    Object[] objArr23 = this.f180036a;
                    r.b(obj);
                    objArr9 = objArr22;
                    objArr8 = objArr23;
                    objArr9[i16] = obj;
                    return h0.Z(x.d(objArr8));
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MultipleImagesShareSampleActivity multipleImagesShareSampleActivity, boolean z14, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f180031b = multipleImagesShareSampleActivity;
        this.f180032c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f180031b, this.f180032c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (ge1.b.e0(r1, r4, r7) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f180030a;
        MultipleImagesShareSampleActivity multipleImagesShareSampleActivity = this.f180031b;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        b bVar2 = new b(multipleImagesShareSampleActivity, null);
        this.f180030a = 1;
        obj = ge1.b.e0(bVar, bVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        x53.c cVar2 = s0.f129406a;
        t1 t1Var = o.f168762a;
        a aVar2 = new a((List) obj, this.f180032c, multipleImagesShareSampleActivity, null);
        this.f180030a = 2;
    }
}
