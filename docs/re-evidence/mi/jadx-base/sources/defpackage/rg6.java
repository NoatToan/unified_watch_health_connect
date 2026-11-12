package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionModel;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.view.DividerView;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class rg6 extends qg6 {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final ConstraintLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(zqi.p1, 15);
        sparseIntArray.put(zqi.h2, 16);
    }

    public rg6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 12, (SwitchButtonBindingTwoLineTextView) objArr[6], (LottieAnimationView) objArr[15], (DividerView) objArr[16], (DividerView) objArr[3], (SwitchButtonBindingTwoLineTextView) objArr[5], (SwitchButtonBindingTwoLineTextView) objArr[4], (TextView) objArr[12], (RightArrowBindingSingleLineTextView) objArr[7], (TextView) objArr[13], (SwitchButtonBindingTwoLineTextView) objArr[2], (SwitchButtonBindingTwoLineTextView) objArr[1], (TextView) objArr[14], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[11]);
        this.S = -1L;
        this.A.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.R = constraintLayout;
        constraintLayout.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.S |= 1024;
        }
        return true;
    }

    public final boolean B0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.S |= 64;
        }
        return true;
    }

    public final boolean C0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.S |= 8;
        }
        return true;
    }

    public final boolean D0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.S |= 128;
        }
        return true;
    }

    public final boolean E0(ObservableField<List<eg4>> observableField, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.S |= 256;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.S |= 2048;
        }
        return true;
    }

    public final boolean G0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.S |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.S = 8192L;
        }
        e0();
    }

    public final boolean H0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.S |= 2;
        }
        return true;
    }

    public final boolean I0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.S |= 4;
        }
        return true;
    }

    public final boolean J0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.S |= 1;
        }
        return true;
    }

    public final boolean K0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.S |= 16;
        }
        return true;
    }

    public final boolean L0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.S |= 512;
        }
        return true;
    }

    public void M0(FallDetectionViewModel fallDetectionViewModel) {
        this.Q = fallDetectionViewModel;
        synchronized (this) {
            this.S |= 4096;
        }
        notifyPropertyChanged(bw1.f);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return J0((ObservableBoolean) obj, i2);
            case 1:
                return H0((ObservableBoolean) obj, i2);
            case 2:
                return I0((ObservableBoolean) obj, i2);
            case 3:
                return C0((ObservableBoolean) obj, i2);
            case 4:
                return K0((ObservableBoolean) obj, i2);
            case 5:
                return G0((ObservableBoolean) obj, i2);
            case 6:
                return B0((ObservableBoolean) obj, i2);
            case 7:
                return D0((MutableLiveData) obj, i2);
            case 8:
                return E0((ObservableField) obj, i2);
            case 9:
                return L0((ObservableBoolean) obj, i2);
            case 10:
                return A0((ObservableBoolean) obj, i2);
            case 11:
                return F0((ObservableBoolean) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0143  */
    /* JADX WARN: Code duplicated, block: B:103:0x0148  */
    /* JADX WARN: Code duplicated, block: B:106:0x014f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0156  */
    /* JADX WARN: Code duplicated, block: B:110:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0161  */
    /* JADX WARN: Code duplicated, block: B:112:0x0166  */
    /* JADX WARN: Code duplicated, block: B:115:0x016c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0173  */
    /* JADX WARN: Code duplicated, block: B:118:0x0177  */
    /* JADX WARN: Code duplicated, block: B:119:0x017c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0180  */
    /* JADX WARN: Code duplicated, block: B:122:0x0183  */
    /* JADX WARN: Code duplicated, block: B:124:0x0188  */
    /* JADX WARN: Code duplicated, block: B:127:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:142:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:147:0x01da  */
    /* JADX WARN: Code duplicated, block: B:148:0x01df  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:156:0x0203  */
    /* JADX WARN: Code duplicated, block: B:157:0x0208  */
    /* JADX WARN: Code duplicated, block: B:159:0x020b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x020d  */
    /* JADX WARN: Code duplicated, block: B:163:0x021b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0221  */
    /* JADX WARN: Code duplicated, block: B:205:0x02d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:206:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:207:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:210:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:212:0x02e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:215:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:218:0x02fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:221:0x0306  */
    /* JADX WARN: Code duplicated, block: B:223:0x030e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0311  */
    /* JADX WARN: Code duplicated, block: B:226:0x0315  */
    /* JADX WARN: Code duplicated, block: B:227:0x0317  */
    /* JADX WARN: Code duplicated, block: B:229:0x0322  */
    /* JADX WARN: Code duplicated, block: B:232:0x0330 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x0332  */
    /* JADX WARN: Code duplicated, block: B:234:0x0335  */
    /* JADX WARN: Code duplicated, block: B:236:0x0339 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:237:0x033b  */
    /* JADX WARN: Code duplicated, block: B:239:0x0341  */
    /* JADX WARN: Code duplicated, block: B:241:0x0347  */
    /* JADX WARN: Code duplicated, block: B:242:0x034a  */
    /* JADX WARN: Code duplicated, block: B:244:0x0353  */
    /* JADX WARN: Code duplicated, block: B:247:0x035e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x0360  */
    /* JADX WARN: Code duplicated, block: B:249:0x036e  */
    /* JADX WARN: Code duplicated, block: B:252:0x037a  */
    /* JADX WARN: Code duplicated, block: B:253:0x0381  */
    /* JADX WARN: Code duplicated, block: B:256:0x0393 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:257:0x0395  */
    /* JADX WARN: Code duplicated, block: B:258:0x0398  */
    /* JADX WARN: Code duplicated, block: B:261:0x03a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:262:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:264:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:267:0x03b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:268:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:270:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:273:0x03c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:274:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:276:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:282:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:283:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:286:0x03f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:287:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:290:0x0402  */
    /* JADX WARN: Code duplicated, block: B:293:0x040e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:294:0x0410  */
    /* JADX WARN: Code duplicated, block: B:295:0x0413  */
    /* JADX WARN: Code duplicated, block: B:298:0x041b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:299:0x041d  */
    /* JADX WARN: Code duplicated, block: B:300:0x0420  */
    /* JADX WARN: Code duplicated, block: B:301:0x0423  */
    /* JADX WARN: Code duplicated, block: B:304:0x0434 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:305:0x0436  */
    /* JADX WARN: Code duplicated, block: B:306:0x043d  */
    /* JADX WARN: Code duplicated, block: B:309:0x0446  */
    /* JADX WARN: Code duplicated, block: B:310:0x044b  */
    /* JADX WARN: Code duplicated, block: B:311:0x044d  */
    /* JADX WARN: Code duplicated, block: B:314:0x0459 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:315:0x045b  */
    /* JADX WARN: Code duplicated, block: B:316:0x045e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0462 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:319:0x0464  */
    /* JADX WARN: Code duplicated, block: B:321:0x046c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0470  */
    /* JADX WARN: Code duplicated, block: B:325:0x047a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:326:0x047c  */
    /* JADX WARN: Code duplicated, block: B:327:0x047f  */
    /* JADX WARN: Code duplicated, block: B:329:0x0483 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:330:0x0485  */
    /* JADX WARN: Code duplicated, block: B:332:0x048b  */
    /* JADX WARN: Code duplicated, block: B:334:0x0491  */
    /* JADX WARN: Code duplicated, block: B:335:0x0494  */
    /* JADX WARN: Code duplicated, block: B:337:0x049d  */
    /* JADX WARN: Code duplicated, block: B:340:0x04ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:341:0x04af  */
    /* JADX WARN: Code duplicated, block: B:344:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:347:0x04cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:348:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:349:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:352:0x04d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:353:0x04da  */
    /* JADX WARN: Code duplicated, block: B:355:0x04df  */
    /* JADX WARN: Code duplicated, block: B:356:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:359:0x04f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:360:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:361:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:363:0x04f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:364:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:366:0x0503  */
    /* JADX WARN: Code duplicated, block: B:368:0x050b  */
    /* JADX WARN: Code duplicated, block: B:369:0x050e  */
    /* JADX WARN: Code duplicated, block: B:373:0x051a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:374:0x051c  */
    /* JADX WARN: Code duplicated, block: B:375:0x052a  */
    /* JADX WARN: Code duplicated, block: B:378:0x0536  */
    /* JADX WARN: Code duplicated, block: B:380:0x053d  */
    /* JADX WARN: Code duplicated, block: B:383:0x054a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:384:0x054c  */
    /* JADX WARN: Code duplicated, block: B:385:0x054e  */
    /* JADX WARN: Code duplicated, block: B:387:0x0551 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:388:0x0553  */
    /* JADX WARN: Code duplicated, block: B:390:0x055b  */
    /* JADX WARN: Code duplicated, block: B:391:0x0561  */
    /* JADX WARN: Code duplicated, block: B:394:0x056f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:395:0x0571  */
    /* JADX WARN: Code duplicated, block: B:396:0x0576  */
    /* JADX WARN: Code duplicated, block: B:399:0x057e  */
    /* JADX WARN: Code duplicated, block: B:400:0x0583  */
    /* JADX WARN: Code duplicated, block: B:403:0x058d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:404:0x058f  */
    /* JADX WARN: Code duplicated, block: B:405:0x0591  */
    /* JADX WARN: Code duplicated, block: B:407:0x0594 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:408:0x0596  */
    /* JADX WARN: Code duplicated, block: B:410:0x059c  */
    /* JADX WARN: Code duplicated, block: B:412:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:413:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:415:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:418:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:421:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:424:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:427:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:430:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:433:0x0601  */
    /* JADX WARN: Code duplicated, block: B:436:0x060d  */
    /* JADX WARN: Code duplicated, block: B:439:0x0618  */
    /* JADX WARN: Code duplicated, block: B:442:0x0623  */
    /* JADX WARN: Code duplicated, block: B:445:0x063b  */
    /* JADX WARN: Code duplicated, block: B:448:0x0647  */
    /* JADX WARN: Code duplicated, block: B:451:0x0655  */
    /* JADX WARN: Code duplicated, block: B:454:0x0663  */
    /* JADX WARN: Code duplicated, block: B:457:0x0671  */
    /* JADX WARN: Code duplicated, block: B:460:0x067e  */
    /* JADX WARN: Code duplicated, block: B:463:0x0695  */
    /* JADX WARN: Code duplicated, block: B:470:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd A[PHI: r2
      0x00fd: PHI (r2v31 long) = (r2v30 long), (r2v39 long) binds: [B:61:0x00cc, B:74:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0118  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r63v0, types: [androidx.databinding.ViewDataBinding, qg6, rg6] */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        long j2;
        FallDetectionModel mModel;
        boolean z;
        boolean z2;
        ObservableBoolean supportFallDetection;
        int i;
        ObservableBoolean sosContactSwitchOn;
        int i2;
        boolean z3;
        boolean z4;
        ObservableBoolean fallDetectionSwitchOn;
        boolean z5;
        String value;
        ObservableField<List<eg4>> sosContactList;
        boolean z6;
        boolean z7;
        List<eg4> list;
        int size;
        boolean z8;
        boolean z9;
        ObservableBoolean supportFallDetection2;
        long j3;
        long j4;
        boolean z10;
        boolean z11;
        long j5;
        int i3;
        int i4;
        long j6;
        long j7;
        int i5;
        ObservableBoolean fallDetectionSwitchOn2;
        int i6;
        boolean z12;
        ObservableBoolean observableBoolean;
        int i7;
        long j8;
        ObservableBoolean supportFallDetection3;
        boolean z13;
        ObservableBoolean support120;
        long j9;
        boolean z14;
        long j10;
        int i8;
        int i9;
        ObservableBoolean observableBoolean2;
        int i10;
        long j11;
        boolean z15;
        long j12;
        boolean z16;
        long j13;
        boolean z17;
        boolean z18;
        long j14;
        int i11;
        boolean z19;
        int i12;
        long j15;
        ObservableBoolean support121;
        long j16;
        ObservableBoolean fallDetectionSwitchOn3;
        int i13;
        ?? r22;
        int i14;
        long j17;
        ObservableBoolean observableBoolean3;
        boolean z20;
        int i15;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        int i16;
        boolean z21;
        int i17;
        long j23;
        boolean z22;
        int i18;
        long j24;
        long j25;
        int i19;
        long j26;
        long j27;
        long j28;
        ObservableBoolean sosContactLoaded;
        boolean z23;
        long j29;
        ObservableBoolean callMedicalSwitchOn;
        ObservableBoolean supportSosSms;
        long j30;
        MutableLiveData<String> sosContactCountText;
        synchronized (this) {
            j = this.S;
            this.S = 0L;
        }
        FallDetectionViewModel fallDetectionViewModel = this.Q;
        if ((16383 & j) != 0) {
            mModel = fallDetectionViewModel != null ? fallDetectionViewModel.getMModel() : null;
            if ((j & 12357) != 0) {
                supportFallDetection = mModel != null ? mModel.getSupportFallDetection() : null;
                x0(0, supportFallDetection);
                z6 = supportFallDetection != null ? supportFallDetection.get() : false;
                if ((j & 12289) != 0) {
                    j = z6 ? j | PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : j | 16384;
                }
                if ((j & 12357) != 0) {
                    j = z6 ? j | 134217728 : j | 67108864;
                }
                i19 = ((j & 12289) == 0 || z6) ? 0 : 8;
            } else {
                z6 = false;
                i19 = 0;
                supportFallDetection = null;
            }
            long j31 = j & 12359;
            if (j31 != 0) {
                sosContactSwitchOn = mModel != null ? mModel.getSosContactSwitchOn() : null;
                x0(1, sosContactSwitchOn);
                z7 = sosContactSwitchOn != null ? sosContactSwitchOn.get() : false;
                if (j31 != 0) {
                    j = z7 ? j | 562949953421312L : j | 281474976710656L;
                }
            } else {
                sosContactSwitchOn = null;
                z7 = false;
            }
            if ((j & 12296) == 0) {
                z4 = false;
            } else {
                ObservableBoolean shareLocationSwitchOn = mModel != null ? mModel.getShareLocationSwitchOn() : null;
                x0(3, shareLocationSwitchOn);
                if (shareLocationSwitchOn != null) {
                    z4 = shareLocationSwitchOn.get();
                } else {
                    z4 = false;
                }
            }
            long j32 = j & 12304;
            if (j32 == 0) {
                i2 = 0;
            } else {
                ObservableBoolean supportShareLocation = mModel != null ? mModel.getSupportShareLocation() : null;
                x0(4, supportShareLocation);
                boolean z24 = supportShareLocation != null ? supportShareLocation.get() : false;
                if (j32 != 0) {
                    j |= z24 ? 549755813888L : 274877906944L;
                }
                if (z24) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
            }
            if ((j & 12320) == 0) {
                z3 = false;
            } else {
                ObservableBoolean sosContactSmsSwitchOn = mModel != null ? mModel.getSosContactSmsSwitchOn() : null;
                x0(5, sosContactSmsSwitchOn);
                if (sosContactSmsSwitchOn != null) {
                    z3 = sosContactSmsSwitchOn.get();
                } else {
                    z3 = false;
                }
            }
            if ((j & 12352) != 0) {
                fallDetectionSwitchOn = mModel != null ? mModel.getFallDetectionSwitchOn() : null;
                x0(6, fallDetectionSwitchOn);
                z5 = fallDetectionSwitchOn != null ? fallDetectionSwitchOn.get() : false;
                if ((j & 12416) == 0) {
                    value = null;
                } else {
                    if (mModel != null) {
                        sosContactCountText = mModel.getSosContactCountText();
                    } else {
                        sosContactCountText = null;
                    }
                    w0(7, sosContactCountText);
                    if (sosContactCountText != null) {
                        value = sosContactCountText.getValue();
                    } else {
                        value = null;
                    }
                }
                if ((j & 12544) != 0) {
                    if (mModel != null) {
                        sosContactList = mModel.getSosContactList();
                    } else {
                        sosContactList = null;
                    }
                    x0(8, sosContactList);
                    if (sosContactList != null) {
                        list = sosContactList.get();
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        size = list.size();
                    } else {
                        size = 0;
                    }
                    if (size != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    j26 = 12802;
                } else {
                    sosContactList = null;
                    j26 = 12802;
                    list = null;
                    size = 0;
                    z8 = false;
                }
                j27 = j & j26;
                if (j27 != 0) {
                    if (mModel != null) {
                        supportSosSms = mModel.getSupportSosSms();
                    } else {
                        supportSosSms = null;
                    }
                    x0(9, supportSosSms);
                    if (supportSosSms != null) {
                        z9 = supportSosSms.get();
                    } else {
                        z9 = false;
                    }
                    if (j27 != 0) {
                        if (z9) {
                            j30 = 140737488355328L;
                        } else {
                            j30 = 70368744177664L;
                        }
                        j |= j30;
                    }
                } else {
                    z9 = false;
                }
                if ((j & 13312) == 0) {
                    z2 = false;
                } else {
                    if (mModel != null) {
                        callMedicalSwitchOn = mModel.getCallMedicalSwitchOn();
                    } else {
                        callMedicalSwitchOn = null;
                    }
                    x0(10, callMedicalSwitchOn);
                    if (callMedicalSwitchOn != null) {
                        z2 = callMedicalSwitchOn.get();
                    } else {
                        z2 = false;
                    }
                }
                j28 = j & 14592;
                if (j28 != 0) {
                    if (mModel != null) {
                        sosContactLoaded = mModel.getSosContactLoaded();
                    } else {
                        sosContactLoaded = null;
                    }
                    x0(11, sosContactLoaded);
                    if (sosContactLoaded != null) {
                        z23 = sosContactLoaded.get();
                    } else {
                        z23 = false;
                    }
                    if (j28 != 0) {
                        if (z23) {
                            j29 = 137975824384L;
                        } else {
                            j29 = 68987912192L;
                        }
                        j |= j29;
                    }
                    j2 = j;
                    i = i19;
                    z = z23;
                    mModel = mModel;
                } else {
                    z9 = z9;
                    j2 = j;
                    i = i19;
                    z = false;
                }
            } else {
                fallDetectionSwitchOn = null;
            }
            if ((j & 12416) == 0) {
                value = null;
            } else {
                if (mModel != null) {
                    sosContactCountText = mModel.getSosContactCountText();
                } else {
                    sosContactCountText = null;
                }
                w0(7, sosContactCountText);
                if (sosContactCountText != null) {
                    value = sosContactCountText.getValue();
                } else {
                    value = null;
                }
            }
            if ((j & 12544) != 0) {
                if (mModel != null) {
                    sosContactList = mModel.getSosContactList();
                } else {
                    sosContactList = null;
                }
                x0(8, sosContactList);
                if (sosContactList != null) {
                    list = sosContactList.get();
                } else {
                    list = null;
                }
                if (list != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                if (size != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                j26 = 12802;
            } else {
                sosContactList = null;
                j26 = 12802;
                list = null;
                size = 0;
                z8 = false;
            }
            j27 = j & j26;
            if (j27 != 0) {
                if (mModel != null) {
                    supportSosSms = mModel.getSupportSosSms();
                } else {
                    supportSosSms = null;
                }
                x0(9, supportSosSms);
                if (supportSosSms != null) {
                    z9 = supportSosSms.get();
                } else {
                    z9 = false;
                }
                if (j27 != 0) {
                    if (z9) {
                        j30 = 140737488355328L;
                    } else {
                        j30 = 70368744177664L;
                    }
                    j |= j30;
                }
            } else {
                z9 = false;
            }
            if ((j & 13312) == 0) {
                z2 = false;
            } else {
                if (mModel != null) {
                    callMedicalSwitchOn = mModel.getCallMedicalSwitchOn();
                } else {
                    callMedicalSwitchOn = null;
                }
                x0(10, callMedicalSwitchOn);
                if (callMedicalSwitchOn != null) {
                    z2 = callMedicalSwitchOn.get();
                } else {
                    z2 = false;
                }
            }
            j28 = j & 14592;
            if (j28 != 0) {
                if (mModel != null) {
                    sosContactLoaded = mModel.getSosContactLoaded();
                } else {
                    sosContactLoaded = null;
                }
                x0(11, sosContactLoaded);
                if (sosContactLoaded != null) {
                    z23 = sosContactLoaded.get();
                } else {
                    z23 = false;
                }
                if (j28 != 0) {
                    if (z23) {
                        j29 = 137975824384L;
                    } else {
                        j29 = 68987912192L;
                    }
                    j |= j29;
                }
                j2 = j;
                i = i19;
                z = z23;
                mModel = mModel;
            } else {
                z9 = z9;
                j2 = j;
                i = i19;
                z = false;
            }
        } else {
            j2 = j;
            mModel = null;
            z = false;
            z2 = false;
            supportFallDetection = null;
            i = 0;
            sosContactSwitchOn = null;
            i2 = 0;
            z3 = false;
            z4 = false;
            fallDetectionSwitchOn = null;
            z5 = false;
            value = null;
            sosContactList = null;
            z6 = false;
            z7 = false;
            list = null;
            size = 0;
            z8 = false;
            z9 = false;
        }
        if ((j2 & 140737488355328L) != 0) {
            if (mModel != null) {
                sosContactSwitchOn = mModel.getSosContactSwitchOn();
            }
            supportFallDetection2 = supportFallDetection;
            x0(1, sosContactSwitchOn);
            if (sosContactSwitchOn != null) {
                z7 = sosContactSwitchOn.get();
            }
            j3 = 0;
            if ((j2 & 12359) != 0) {
                j2 = z7 ? j2 | 562949953421312L : j2 | 281474976710656L;
            }
        } else {
            supportFallDetection2 = supportFallDetection;
            j3 = 0;
        }
        boolean z25 = z7;
        if ((j2 & 137975824384L) != j3) {
            if (mModel != null) {
                sosContactList = mModel.getSosContactList();
            }
            x0(8, sosContactList);
            if (sosContactList != null) {
                list = sosContactList.get();
            }
            if (list != null) {
                size = list.size();
            }
            j4 = 0;
            if ((j2 & 536870912) != 0) {
                z8 = size != 0;
            }
            if ((j2 & 137438953472L) != 0) {
                z11 = size == 0;
                z10 = z8;
            }
            j5 = j2 & 14592;
            if (j5 != j4) {
                if (z) {
                    z22 = z10;
                } else {
                    z22 = false;
                }
                if (!z) {
                    z11 = false;
                }
                if (j5 != j4) {
                    if (z22) {
                        j25 = 8796093022208L;
                    } else {
                        j25 = 4398046511104L;
                    }
                    j2 |= j25;
                }
                if ((j2 & 14592) != 0) {
                    if (z11) {
                        j24 = 35184372088832L;
                    } else {
                        j24 = 17592186044416L;
                    }
                    j2 |= j24;
                }
                if (z22) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                if (z11) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                j6 = 12802;
                i3 = i18;
            } else {
                i3 = 0;
                i4 = 0;
                j6 = 12802;
            }
            j7 = j2 & j6;
            if (j7 != 0) {
                if (z9) {
                    z21 = z25;
                } else {
                    z21 = false;
                }
                if (j7 != 0) {
                    if (z21) {
                        j23 = 33554432;
                    } else {
                        j23 = 16777216;
                    }
                    j2 |= j23;
                }
                if (z21) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                i5 = i17;
            } else {
                i5 = 0;
            }
            if ((j2 & 281474976710656L) != 0) {
                if (mModel != null) {
                    i16 = 6;
                    fallDetectionSwitchOn2 = mModel.getFallDetectionSwitchOn();
                } else {
                    fallDetectionSwitchOn2 = fallDetectionSwitchOn;
                    i16 = 6;
                }
                x0(i16, fallDetectionSwitchOn2);
                if (fallDetectionSwitchOn2 != null) {
                    z5 = fallDetectionSwitchOn2.get();
                }
            } else {
                z = z;
                z3 = z3;
                fallDetectionSwitchOn2 = fallDetectionSwitchOn;
            }
            if ((j2 & 12359) != 0) {
                if (z25) {
                    z12 = true;
                } else {
                    z12 = z5;
                }
                if ((j2 & 12354) != 0) {
                    if (z12) {
                        j22 = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                    } else {
                        j22 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                    }
                    j2 |= j22;
                }
                if ((j2 & 12359) != 0) {
                    if (z12) {
                        j21 = 8388608;
                    } else {
                        j21 = 4194304;
                    }
                    j2 |= j21;
                }
                if ((j2 & 12355) != 0) {
                    if (z12) {
                        j20 = 2199023255552L;
                    } else {
                        j20 = 1099511627776L;
                    }
                    j2 |= j20;
                }
                if ((j2 & 12354) != 0 || z12) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
            } else {
                i6 = 0;
                z12 = false;
            }
            if ((j2 & 2199023255552L) != 0) {
                if (mModel != null) {
                    supportFallDetection2 = mModel.getSupportFallDetection();
                }
                observableBoolean = fallDetectionSwitchOn2;
                i7 = i6;
                supportFallDetection3 = supportFallDetection2;
                x0(0, supportFallDetection3);
                if (supportFallDetection3 != null) {
                    z6 = supportFallDetection3.get();
                }
                j8 = 0;
                if ((j2 & 12289) != 0) {
                    if (z6) {
                        j2 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                    } else {
                        j2 |= 16384;
                    }
                }
                if ((j2 & 12357) != 0) {
                    if (z6) {
                        j2 |= 134217728;
                    } else {
                        j2 |= 67108864;
                    }
                }
            } else {
                observableBoolean = fallDetectionSwitchOn2;
                i7 = i6;
                j8 = 0;
                supportFallDetection3 = supportFallDetection2;
            }
            if ((j2 & 8388608) != j8) {
                if (mModel != null) {
                    support120 = mModel.getSupport120();
                } else {
                    support120 = null;
                }
                x0(2, support120);
                if (support120 != null) {
                    z13 = support120.get();
                } else {
                    z13 = false;
                }
            } else {
                supportFallDetection3 = supportFallDetection3;
                z13 = false;
                support120 = null;
            }
            j9 = j2 & 12359;
            if (j9 != 0) {
                if (z12) {
                    z14 = z13;
                } else {
                    z14 = false;
                }
                if (j9 != 0) {
                    if (z14) {
                        j19 = 2147483648L;
                    } else {
                        j19 = 1073741824;
                    }
                    j2 |= j19;
                }
            } else {
                z14 = false;
            }
            j10 = j2 & 12355;
            if (j10 != 0) {
                if (z12) {
                    z20 = z6;
                } else {
                    z20 = false;
                }
                if (j10 != 0) {
                    if (z20) {
                        j18 = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                    } else {
                        j18 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    }
                    j2 |= j18;
                }
                if (z20) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                i8 = i15;
            } else {
                i8 = 0;
            }
            if ((j2 & 2147483648L) != 0) {
                if (mModel != null) {
                    supportFallDetection3 = mModel.getSupportFallDetection();
                }
                observableBoolean2 = support120;
                observableBoolean3 = supportFallDetection3;
                i9 = i8;
                i10 = 0;
                x0(0, observableBoolean3);
                if (observableBoolean3 != null) {
                    z6 = observableBoolean3.get();
                }
                j11 = 0;
                if ((j2 & 12289) != 0) {
                    if (z6) {
                        j2 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                    } else {
                        j2 |= 16384;
                    }
                }
                if ((j2 & 12357) != 0) {
                    if (z6) {
                        j2 |= 134217728;
                    } else {
                        j2 |= 67108864;
                    }
                }
            } else {
                i9 = i8;
                observableBoolean2 = support120;
                i10 = 0;
                j11 = 0;
            }
            z15 = z6;
            j12 = j2 & 12359;
            if (j12 != j11) {
                if (z14) {
                    r22 = z15;
                } else {
                    r22 = i10;
                }
                if (j12 != j11) {
                    if (r22 != 0) {
                        j17 = 34359738368L;
                    } else {
                        j17 = 17179869184L;
                    }
                    j2 |= j17;
                }
                if (r22 != 0) {
                    i14 = i10;
                } else {
                    i14 = 8;
                }
                i10 = i14;
            }
            if ((j2 & 134217728) != 0) {
                if (mModel != null) {
                    i13 = 6;
                    fallDetectionSwitchOn3 = mModel.getFallDetectionSwitchOn();
                } else {
                    fallDetectionSwitchOn3 = observableBoolean;
                    i13 = 6;
                }
                x0(i13, fallDetectionSwitchOn3);
                if (fallDetectionSwitchOn3 != null) {
                    z5 = fallDetectionSwitchOn3.get();
                }
            } else {
                z25 = z25;
                i5 = i5;
            }
            z16 = z5;
            j13 = j2 & 12357;
            if (j13 != 0) {
                if (z15) {
                    z17 = z16;
                } else {
                    z17 = false;
                }
                if (j13 != 0) {
                    if (z17) {
                        j16 = 8589934592L;
                    } else {
                        j16 = 4294967296L;
                    }
                    j2 |= j16;
                }
            } else {
                z17 = false;
            }
            if ((j2 & 8589934592L) == 0) {
                z18 = z13;
            } else {
                if (mModel != null) {
                    support121 = mModel.getSupport120();
                } else {
                    support121 = observableBoolean2;
                }
                x0(2, support121);
                if (support121 != null) {
                    z18 = support121.get();
                } else {
                    z18 = z13;
                }
            }
            j14 = j2 & 12357;
            if (j14 != 0) {
                if (z17) {
                    z19 = z18;
                } else {
                    z19 = false;
                }
                if (j14 != 0) {
                    if (z19) {
                        j15 = PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                    } else {
                        j15 = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                    }
                    j2 |= j15;
                }
                if (z19) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                i11 = i12;
            } else {
                i11 = 0;
            }
            if ((j2 & 12357) != 0) {
                this.A.setVisibility(i11);
            }
            if ((j2 & 13312) != 0) {
                SwitchButtonBindingTwoLineTextView.setSwitchOn(this.A, z2);
            }
            if ((j2 & 12289) != 0) {
                this.D.setVisibility(i);
                this.E.setVisibility(i);
            }
            if ((j2 & 12544) != 0) {
                SwitchButtonBindingTwoLineTextView.setEnable(this.E, z10);
                SwitchButtonBindingTwoLineTextView.setEnable(this.F, z10);
                SwitchButtonBindingTwoLineTextView.setEnable(this.K, z10);
            }
            if ((12352 & j2) != 0) {
                SwitchButtonBindingTwoLineTextView.setSwitchOn(this.E, z16);
            }
            if ((12304 & j2) != 0) {
                this.F.setVisibility(i2);
            }
            if ((12296 & j2) != 0) {
                SwitchButtonBindingTwoLineTextView.setSwitchOn(this.F, z4);
            }
            if ((j2 & 12359) != 0) {
                this.G.setVisibility(i10);
            }
            if ((j2 & 14592) != 0) {
                this.H.setVisibility(i3);
                this.I.setVisibility(i4);
                this.L.setVisibility(i4);
            }
            if ((12416 & j2) != 0) {
                RightArrowBindingSingleLineTextView.remindText(this.H, value);
            }
            if ((12802 & j2) != 0) {
                this.J.setVisibility(i5);
            }
            if ((12320 & j2) != 0) {
                SwitchButtonBindingTwoLineTextView.setSwitchOn(this.J, z3);
            }
            if ((12290 & j2) != 0) {
                SwitchButtonBindingTwoLineTextView.setSwitchOn(this.K, z25);
            }
            if ((14336 & j2) != 0) {
                this.L.setEnabled(z);
            }
            if ((j2 & 12355) != 0) {
                int i20 = i9;
                this.M.setVisibility(i20);
                this.N.setVisibility(i20);
                this.O.setVisibility(i20);
            }
            if ((j2 & 12354) != 0) {
                this.P.setVisibility(i7);
            }
        }
        j4 = 0;
        z10 = z8;
        z11 = false;
        j5 = j2 & 14592;
        if (j5 != j4) {
            if (z) {
                z22 = z10;
            } else {
                z22 = false;
            }
            if (!z) {
                z11 = false;
            }
            if (j5 != j4) {
                if (z22) {
                    j25 = 8796093022208L;
                } else {
                    j25 = 4398046511104L;
                }
                j2 |= j25;
            }
            if ((j2 & 14592) != 0) {
                if (z11) {
                    j24 = 35184372088832L;
                } else {
                    j24 = 17592186044416L;
                }
                j2 |= j24;
            }
            if (z22) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            if (z11) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            j6 = 12802;
            i3 = i18;
        } else {
            i3 = 0;
            i4 = 0;
            j6 = 12802;
        }
        j7 = j2 & j6;
        if (j7 != 0) {
            if (z9) {
                z21 = z25;
            } else {
                z21 = false;
            }
            if (j7 != 0) {
                if (z21) {
                    j23 = 33554432;
                } else {
                    j23 = 16777216;
                }
                j2 |= j23;
            }
            if (z21) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            i5 = i17;
        } else {
            i5 = 0;
        }
        if ((j2 & 281474976710656L) != 0) {
            if (mModel != null) {
                i16 = 6;
                fallDetectionSwitchOn2 = mModel.getFallDetectionSwitchOn();
            } else {
                fallDetectionSwitchOn2 = fallDetectionSwitchOn;
                i16 = 6;
            }
            x0(i16, fallDetectionSwitchOn2);
            if (fallDetectionSwitchOn2 != null) {
                z5 = fallDetectionSwitchOn2.get();
            }
        } else {
            z = z;
            z3 = z3;
            fallDetectionSwitchOn2 = fallDetectionSwitchOn;
        }
        if ((j2 & 12359) != 0) {
            if (z25) {
                z12 = true;
            } else {
                z12 = z5;
            }
            if ((j2 & 12354) != 0) {
                if (z12) {
                    j22 = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                } else {
                    j22 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                }
                j2 |= j22;
            }
            if ((j2 & 12359) != 0) {
                if (z12) {
                    j21 = 8388608;
                } else {
                    j21 = 4194304;
                }
                j2 |= j21;
            }
            if ((j2 & 12355) != 0) {
                if (z12) {
                    j20 = 2199023255552L;
                } else {
                    j20 = 1099511627776L;
                }
                j2 |= j20;
            }
            if ((j2 & 12354) != 0) {
                i6 = 0;
            } else {
                i6 = 0;
            }
        } else {
            i6 = 0;
            z12 = false;
        }
        if ((j2 & 2199023255552L) != 0) {
            if (mModel != null) {
                supportFallDetection2 = mModel.getSupportFallDetection();
            }
            observableBoolean = fallDetectionSwitchOn2;
            i7 = i6;
            supportFallDetection3 = supportFallDetection2;
            x0(0, supportFallDetection3);
            if (supportFallDetection3 != null) {
                z6 = supportFallDetection3.get();
            }
            j8 = 0;
            if ((j2 & 12289) != 0) {
                if (z6) {
                    j2 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                } else {
                    j2 |= 16384;
                }
            }
            if ((j2 & 12357) != 0) {
                if (z6) {
                    j2 |= 134217728;
                } else {
                    j2 |= 67108864;
                }
            }
        } else {
            observableBoolean = fallDetectionSwitchOn2;
            i7 = i6;
            j8 = 0;
            supportFallDetection3 = supportFallDetection2;
        }
        if ((j2 & 8388608) != j8) {
            if (mModel != null) {
                support120 = mModel.getSupport120();
            } else {
                support120 = null;
            }
            x0(2, support120);
            if (support120 != null) {
                z13 = support120.get();
            } else {
                z13 = false;
            }
        } else {
            supportFallDetection3 = supportFallDetection3;
            z13 = false;
            support120 = null;
        }
        j9 = j2 & 12359;
        if (j9 != 0) {
            if (z12) {
                z14 = z13;
            } else {
                z14 = false;
            }
            if (j9 != 0) {
                if (z14) {
                    j19 = 2147483648L;
                } else {
                    j19 = 1073741824;
                }
                j2 |= j19;
            }
        } else {
            z14 = false;
        }
        j10 = j2 & 12355;
        if (j10 != 0) {
            if (z12) {
                z20 = z6;
            } else {
                z20 = false;
            }
            if (j10 != 0) {
                if (z20) {
                    j18 = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                } else {
                    j18 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                }
                j2 |= j18;
            }
            if (z20) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            i8 = i15;
        } else {
            i8 = 0;
        }
        if ((j2 & 2147483648L) != 0) {
            if (mModel != null) {
                supportFallDetection3 = mModel.getSupportFallDetection();
            }
            observableBoolean2 = support120;
            observableBoolean3 = supportFallDetection3;
            i9 = i8;
            i10 = 0;
            x0(0, observableBoolean3);
            if (observableBoolean3 != null) {
                z6 = observableBoolean3.get();
            }
            j11 = 0;
            if ((j2 & 12289) != 0) {
                if (z6) {
                    j2 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                } else {
                    j2 |= 16384;
                }
            }
            if ((j2 & 12357) != 0) {
                if (z6) {
                    j2 |= 134217728;
                } else {
                    j2 |= 67108864;
                }
            }
        } else {
            i9 = i8;
            observableBoolean2 = support120;
            i10 = 0;
            j11 = 0;
        }
        z15 = z6;
        j12 = j2 & 12359;
        if (j12 != j11) {
            if (z14) {
                r22 = z15;
            } else {
                r22 = i10;
            }
            if (j12 != j11) {
                if (r22 != 0) {
                    j17 = 34359738368L;
                } else {
                    j17 = 17179869184L;
                }
                j2 |= j17;
            }
            if (r22 != 0) {
                i14 = i10;
            } else {
                i14 = 8;
            }
            i10 = i14;
        }
        if ((j2 & 134217728) != 0) {
            if (mModel != null) {
                i13 = 6;
                fallDetectionSwitchOn3 = mModel.getFallDetectionSwitchOn();
            } else {
                fallDetectionSwitchOn3 = observableBoolean;
                i13 = 6;
            }
            x0(i13, fallDetectionSwitchOn3);
            if (fallDetectionSwitchOn3 != null) {
                z5 = fallDetectionSwitchOn3.get();
            }
        } else {
            z25 = z25;
            i5 = i5;
        }
        z16 = z5;
        j13 = j2 & 12357;
        if (j13 != 0) {
            if (z15) {
                z17 = z16;
            } else {
                z17 = false;
            }
            if (j13 != 0) {
                if (z17) {
                    j16 = 8589934592L;
                } else {
                    j16 = 4294967296L;
                }
                j2 |= j16;
            }
        } else {
            z17 = false;
        }
        if ((j2 & 8589934592L) == 0) {
            z18 = z13;
        } else {
            if (mModel != null) {
                support121 = mModel.getSupport120();
            } else {
                support121 = observableBoolean2;
            }
            x0(2, support121);
            if (support121 != null) {
                z18 = support121.get();
            } else {
                z18 = z13;
            }
        }
        j14 = j2 & 12357;
        if (j14 != 0) {
            if (z17) {
                z19 = z18;
            } else {
                z19 = false;
            }
            if (j14 != 0) {
                if (z19) {
                    j15 = PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                } else {
                    j15 = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                }
                j2 |= j15;
            }
            if (z19) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            i11 = i12;
        } else {
            i11 = 0;
        }
        if ((j2 & 12357) != 0) {
            this.A.setVisibility(i11);
        }
        if ((j2 & 13312) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.A, z2);
        }
        if ((j2 & 12289) != 0) {
            this.D.setVisibility(i);
            this.E.setVisibility(i);
        }
        if ((j2 & 12544) != 0) {
            SwitchButtonBindingTwoLineTextView.setEnable(this.E, z10);
            SwitchButtonBindingTwoLineTextView.setEnable(this.F, z10);
            SwitchButtonBindingTwoLineTextView.setEnable(this.K, z10);
        }
        if ((12352 & j2) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.E, z16);
        }
        if ((12304 & j2) != 0) {
            this.F.setVisibility(i2);
        }
        if ((12296 & j2) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.F, z4);
        }
        if ((j2 & 12359) != 0) {
            this.G.setVisibility(i10);
        }
        if ((j2 & 14592) != 0) {
            this.H.setVisibility(i3);
            this.I.setVisibility(i4);
            this.L.setVisibility(i4);
        }
        if ((12416 & j2) != 0) {
            RightArrowBindingSingleLineTextView.remindText(this.H, value);
        }
        if ((12802 & j2) != 0) {
            this.J.setVisibility(i5);
        }
        if ((12320 & j2) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.J, z3);
        }
        if ((12290 & j2) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.K, z25);
        }
        if ((14336 & j2) != 0) {
            this.L.setEnabled(z);
        }
        if ((j2 & 12355) != 0) {
            int i21 = i9;
            this.M.setVisibility(i21);
            this.N.setVisibility(i21);
            this.O.setVisibility(i21);
        }
        if ((j2 & 12354) != 0) {
            this.P.setVisibility(i7);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        M0((FallDetectionViewModel) obj);
        return true;
    }

    public rg6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 17, T, U));
    }
}
