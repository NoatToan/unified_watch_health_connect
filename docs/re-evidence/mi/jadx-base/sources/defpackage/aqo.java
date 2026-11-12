package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.r;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class aqo {
    public static final Size q = new Size(GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 480);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Size f3361r = new Size(0, 0);
    public static final Size s = new Size(1920, Constants.FHD_WIDTH);
    public static final Size t = new Size(HMSedentaryConfig.INGORE_START_INDEX, 480);
    public static final Rational u = new Rational(4, 3);
    public static final Rational v = new Rational(3, 4);
    public static final Rational w = new Rational(16, 9);
    public static final Rational x = new Rational(9, 16);
    public final String c;
    public final cc3 d;
    public final vf3 e;
    public final rf8 f;
    public final dl8 g;
    public final int h;
    public final boolean i;
    public lqo m;
    public final hz6 o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<bqo> f3362a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, Size> f3363b = new HashMap();
    public final Map<Integer, List<Size>> j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3364k = false;
    public boolean l = false;
    public Map<Integer, Size[]> n = new HashMap();
    public final zpk p = new zpk();

    @RequiresApi(21)
    public static final class a implements Comparator<Rational> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rational f3365a;

        public a(Rational rational) {
            this.f3365a = rational;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Math.abs(rational.floatValue() - this.f3365a.floatValue()) - Math.abs(rational2.floatValue() - this.f3365a.floatValue()));
        }
    }

    public aqo(Context context, String str, ih3 ih3Var, cc3 cc3Var) throws CameraUnavailableException {
        String str2 = (String) g6i.g(str);
        this.c = str2;
        this.d = (cc3) g6i.g(cc3Var);
        this.f = new rf8(str);
        this.g = new dl8();
        this.o = hz6.b(context);
        try {
            vf3 vf3VarC = ih3Var.c(str2);
            this.e = vf3VarC;
            Integer num = (Integer) vf3VarC.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.h = num != null ? num.intValue() : 2;
            this.i = H();
            h();
            i();
            a();
        } catch (CameraAccessExceptionCompat e) {
            throw bi3.a(e);
        }
    }

    public static boolean E(Size size, Rational rational) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (l(size) >= l(q)) {
            return F(size, rational);
        }
        return false;
    }

    public static boolean F(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0 && height % 16 == 0) {
            return I(Math.max(0, height + (-16)), width, rational) || I(Math.max(0, width + (-16)), height, rational2);
        }
        if (i == 0) {
            return I(height, width, rational);
        }
        if (height % 16 == 0) {
            return I(width, height, rational2);
        }
        return false;
    }

    public static boolean I(int i, int i2, Rational rational) {
        g6i.a(i2 % 16 == 0);
        double numerator = ((double) (i * rational.getNumerator())) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }

    public static int l(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public final Rational A(k kVar) {
        Rational rational;
        int iA = new g0p().a(this.c, this.e);
        if (iA == 0) {
            rational = this.i ? u : v;
        } else if (iA == 1) {
            rational = this.i ? w : x;
        } else {
            if (iA == 2) {
                Size sizeF = f(256);
                return new Rational(sizeF.getWidth(), sizeF.getHeight());
            }
            if (iA != 3) {
                return null;
            }
            Size sizeB = B(kVar);
            if (!kVar.C()) {
                if (sizeB != null) {
                    return new Rational(sizeB.getWidth(), sizeB.getHeight());
                }
                return null;
            }
            int iE = kVar.E();
            if (iE == 0) {
                rational = this.i ? u : v;
            } else {
                if (iE != 1) {
                    zpe.c("SupportedSurfaceCombination", "Undefined target aspect ratio: " + iE);
                    return null;
                }
                rational = this.i ? w : x;
            }
        }
        return rational;
    }

    public final Size B(k kVar) {
        return g(kVar.v(null), kVar.u(0));
    }

    public final List<Integer> C(List<r<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<r<?>> it = list.iterator();
        while (it.hasNext()) {
            int iS = it.next().s(0);
            if (!arrayList2.contains(Integer.valueOf(iS))) {
                arrayList2.add(Integer.valueOf(iS));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            for (r<?> rVar : list) {
                if (iIntValue == rVar.s(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(rVar)));
                }
            }
        }
        return arrayList;
    }

    public final Map<Rational, List<Size>> D(List<Size> list) {
        HashMap map = new HashMap();
        map.put(u, new ArrayList());
        map.put(w, new ArrayList());
        for (Size size : list) {
            Rational rational = null;
            for (Rational rational2 : map.keySet()) {
                if (E(size, rational2)) {
                    List list2 = (List) map.get(rational2);
                    if (!list2.contains(size)) {
                        list2.add(size);
                    }
                    rational = rational2;
                }
            }
            if (rational == null) {
                map.put(new Rational(size.getWidth(), size.getHeight()), new ArrayList(Collections.singleton(size)));
            }
        }
        return map;
    }

    public final boolean G(int i) {
        Integer num = (Integer) this.e.a(CameraCharacteristics.SENSOR_ORIENTATION);
        g6i.h(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int iB = ph3.b(i);
        Integer num2 = (Integer) this.e.a(CameraCharacteristics.LENS_FACING);
        g6i.h(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        int iA = ph3.a(iB, num.intValue(), 1 == num2.intValue());
        return iA == 90 || iA == 270;
    }

    public final boolean H() {
        Size size = (Size) this.e.a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        return size == null || size.getWidth() >= size.getHeight();
    }

    public final void J() {
        this.o.e();
        if (this.m == null) {
            i();
        } else {
            this.m = lqo.a(this.m.b(), this.o.d(), this.m.d());
        }
    }

    public final void K(List<Size> list, Size size) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i >= list.size()) {
                break;
            }
            Size size2 = list.get(i);
            if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                break;
            }
            if (i4 >= 0) {
                arrayList.add(list.get(i4));
            }
            i2 = i + 1;
        }
        list.removeAll(arrayList);
    }

    public SurfaceConfig L(int i, Size size) {
        SurfaceConfig.ConfigType configTypeN = n(i);
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.NOT_SUPPORT;
        Size sizeF = f(i);
        if (size.getWidth() * size.getHeight() <= this.m.b().getWidth() * this.m.b().getHeight()) {
            configSize = SurfaceConfig.ConfigSize.ANALYSIS;
        } else if (size.getWidth() * size.getHeight() <= this.m.c().getWidth() * this.m.c().getHeight()) {
            configSize = SurfaceConfig.ConfigSize.PREVIEW;
        } else if (size.getWidth() * size.getHeight() <= this.m.d().getWidth() * this.m.d().getHeight()) {
            configSize = SurfaceConfig.ConfigSize.RECORD;
        } else if (size.getWidth() * size.getHeight() <= sizeF.getWidth() * sizeF.getHeight()) {
            configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        }
        return SurfaceConfig.a(configTypeN, configSize);
    }

    public final void a() {
    }

    public boolean b(List<SurfaceConfig> list) {
        Iterator<bqo> it = this.f3362a.iterator();
        boolean zD = false;
        while (it.hasNext() && !(zD = it.next().d(list))) {
        }
        return zD;
    }

    public final Size[] c(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.e.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
        if (outputSizes != null) {
            Size[] sizeArrD = d(outputSizes, i);
            Arrays.sort(sizeArrD, new r94(true));
            return sizeArrD;
        }
        throw new IllegalArgumentException("Can not get supported output size for the format: " + i);
    }

    public final Size[] d(Size[] sizeArr, int i) {
        List<Size> listE = e(i);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(listE);
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public final List<Size> e(int i) {
        List<Size> list = this.j.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        List<Size> listA = this.f.a(i);
        this.j.put(Integer.valueOf(i), listA);
        return listA;
    }

    public final Size f(int i) {
        Size size = this.f3363b.get(Integer.valueOf(i));
        if (size != null) {
            return size;
        }
        Size sizeT = t(i);
        this.f3363b.put(Integer.valueOf(i), sizeT);
        return sizeT;
    }

    public final Size g(Size size, int i) {
        return (size == null || !G(i)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    public final void h() {
        this.f3362a.addAll(q());
        int i = this.h;
        if (i == 0 || i == 1 || i == 3) {
            this.f3362a.addAll(s());
        }
        int i2 = this.h;
        if (i2 == 1 || i2 == 3) {
            this.f3362a.addAll(p());
        }
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i3 : iArr) {
                if (i3 == 3) {
                    this.f3364k = true;
                } else if (i3 == 6) {
                    this.l = true;
                }
            }
        }
        if (this.f3364k) {
            this.f3362a.addAll(u());
        }
        if (this.l && this.h == 0) {
            this.f3362a.addAll(m());
        }
        if (this.h == 3) {
            this.f3362a.addAll(r());
        }
        this.f3362a.addAll(this.g.a(this.c, this.h));
    }

    public final void i() {
        this.m = lqo.a(new Size(GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 480), this.o.d(), v());
    }

    public final Size[] j(int i) {
        Size[] sizeArr = this.n.get(Integer.valueOf(i));
        if (sizeArr != null) {
            return sizeArr;
        }
        Size[] sizeArrC = c(i);
        this.n.put(Integer.valueOf(i), sizeArrC);
        return sizeArrC;
    }

    public final List<List<Size>> k(List<List<Size>> list) {
        Iterator<List<Size>> it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= it.next().size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / list.get(0).size();
        int i2 = size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            List<Size> list2 = list.get(i3);
            for (int i4 = 0; i4 < size; i4++) {
                ((List) arrayList.get(i4)).add(list2.get((i4 % i2) / size2));
            }
            if (i3 < list.size() - 1) {
                i2 = size2;
                size2 /= list.get(i3 + 1).size();
            }
        }
        return arrayList;
    }

    public List<bqo> m() {
        ArrayList arrayList = new ArrayList();
        bqo bqoVar = new bqo();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        bqoVar.a(SurfaceConfig.a(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        bqoVar.a(SurfaceConfig.a(configType, configSize2));
        arrayList.add(bqoVar);
        bqo bqoVar2 = new bqo();
        bqoVar2.a(SurfaceConfig.a(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        bqoVar2.a(SurfaceConfig.a(configType2, configSize2));
        arrayList.add(bqoVar2);
        bqo bqoVar3 = new bqo();
        bqoVar3.a(SurfaceConfig.a(configType2, configSize));
        bqoVar3.a(SurfaceConfig.a(configType2, configSize2));
        arrayList.add(bqoVar3);
        return arrayList;
    }

    public final SurfaceConfig.ConfigType n(int i) {
        if (i == 35) {
            return SurfaceConfig.ConfigType.YUV;
        }
        if (i == 256) {
            return SurfaceConfig.ConfigType.JPEG;
        }
        return i == 32 ? SurfaceConfig.ConfigType.RAW : SurfaceConfig.ConfigType.PRIV;
    }

    public final Size[] o(int i, k kVar) {
        Size[] sizeArr = null;
        List<Pair<Integer, Size[]>> listL = kVar.l(null);
        if (listL != null) {
            for (Pair<Integer, Size[]> pair : listL) {
                if (((Integer) pair.first).intValue() == i) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        if (sizeArr == null) {
            return sizeArr;
        }
        Size[] sizeArrD = d(sizeArr, i);
        Arrays.sort(sizeArrD, new r94(true));
        return sizeArrD;
    }

    public List<bqo> p() {
        ArrayList arrayList = new ArrayList();
        bqo bqoVar = new bqo();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        bqoVar.a(SurfaceConfig.a(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        bqoVar.a(SurfaceConfig.a(configType, configSize2));
        arrayList.add(bqoVar);
        bqo bqoVar2 = new bqo();
        bqoVar2.a(SurfaceConfig.a(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        bqoVar2.a(SurfaceConfig.a(configType2, configSize2));
        arrayList.add(bqoVar2);
        bqo bqoVar3 = new bqo();
        bqoVar3.a(SurfaceConfig.a(configType2, configSize));
        bqoVar3.a(SurfaceConfig.a(configType2, configSize2));
        arrayList.add(bqoVar3);
        bqo bqoVar4 = new bqo();
        bqoVar4.a(SurfaceConfig.a(configType, configSize));
        bqoVar4.a(SurfaceConfig.a(configType, configSize));
        bqoVar4.a(SurfaceConfig.a(SurfaceConfig.ConfigType.JPEG, configSize2));
        arrayList.add(bqoVar4);
        bqo bqoVar5 = new bqo();
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.ANALYSIS;
        bqoVar5.a(SurfaceConfig.a(configType2, configSize3));
        bqoVar5.a(SurfaceConfig.a(configType, configSize));
        bqoVar5.a(SurfaceConfig.a(configType2, configSize2));
        arrayList.add(bqoVar5);
        bqo bqoVar6 = new bqo();
        bqoVar6.a(SurfaceConfig.a(configType2, configSize3));
        bqoVar6.a(SurfaceConfig.a(configType2, configSize));
        bqoVar6.a(SurfaceConfig.a(configType2, configSize2));
        arrayList.add(bqoVar6);
        return arrayList;
    }

    public List<bqo> q() {
        ArrayList arrayList = new ArrayList();
        bqo bqoVar = new bqo();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        bqoVar.a(SurfaceConfig.a(configType, configSize));
        arrayList.add(bqoVar);
        bqo bqoVar2 = new bqo();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.JPEG;
        bqoVar2.a(SurfaceConfig.a(configType2, configSize));
        arrayList.add(bqoVar2);
        bqo bqoVar3 = new bqo();
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        bqoVar3.a(SurfaceConfig.a(configType3, configSize));
        arrayList.add(bqoVar3);
        bqo bqoVar4 = new bqo();
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        bqoVar4.a(SurfaceConfig.a(configType, configSize2));
        bqoVar4.a(SurfaceConfig.a(configType2, configSize));
        arrayList.add(bqoVar4);
        bqo bqoVar5 = new bqo();
        bqoVar5.a(SurfaceConfig.a(configType3, configSize2));
        bqoVar5.a(SurfaceConfig.a(configType2, configSize));
        arrayList.add(bqoVar5);
        bqo bqoVar6 = new bqo();
        bqoVar6.a(SurfaceConfig.a(configType, configSize2));
        bqoVar6.a(SurfaceConfig.a(configType, configSize2));
        arrayList.add(bqoVar6);
        bqo bqoVar7 = new bqo();
        bqoVar7.a(SurfaceConfig.a(configType, configSize2));
        bqoVar7.a(SurfaceConfig.a(configType3, configSize2));
        arrayList.add(bqoVar7);
        bqo bqoVar8 = new bqo();
        bqoVar8.a(SurfaceConfig.a(configType, configSize2));
        bqoVar8.a(SurfaceConfig.a(configType3, configSize2));
        bqoVar8.a(SurfaceConfig.a(configType2, configSize));
        arrayList.add(bqoVar8);
        return arrayList;
    }

    public List<bqo> r() {
        ArrayList arrayList = new ArrayList();
        bqo bqoVar = new bqo();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        bqoVar.a(SurfaceConfig.a(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.ANALYSIS;
        bqoVar.a(SurfaceConfig.a(configType, configSize2));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        bqoVar.a(SurfaceConfig.a(configType2, configSize3));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.RAW;
        bqoVar.a(SurfaceConfig.a(configType3, configSize3));
        arrayList.add(bqoVar);
        bqo bqoVar2 = new bqo();
        bqoVar2.a(SurfaceConfig.a(configType, configSize));
        bqoVar2.a(SurfaceConfig.a(configType, configSize2));
        bqoVar2.a(SurfaceConfig.a(SurfaceConfig.ConfigType.JPEG, configSize3));
        bqoVar2.a(SurfaceConfig.a(configType3, configSize3));
        arrayList.add(bqoVar2);
        return arrayList;
    }

    public List<bqo> s() {
        ArrayList arrayList = new ArrayList();
        bqo bqoVar = new bqo();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        bqoVar.a(SurfaceConfig.a(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        bqoVar.a(SurfaceConfig.a(configType, configSize2));
        arrayList.add(bqoVar);
        bqo bqoVar2 = new bqo();
        bqoVar2.a(SurfaceConfig.a(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        bqoVar2.a(SurfaceConfig.a(configType2, configSize2));
        arrayList.add(bqoVar2);
        bqo bqoVar3 = new bqo();
        bqoVar3.a(SurfaceConfig.a(configType2, configSize));
        bqoVar3.a(SurfaceConfig.a(configType2, configSize2));
        arrayList.add(bqoVar3);
        bqo bqoVar4 = new bqo();
        bqoVar4.a(SurfaceConfig.a(configType, configSize));
        bqoVar4.a(SurfaceConfig.a(configType, configSize2));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        bqoVar4.a(SurfaceConfig.a(configType3, configSize2));
        arrayList.add(bqoVar4);
        bqo bqoVar5 = new bqo();
        bqoVar5.a(SurfaceConfig.a(configType, configSize));
        bqoVar5.a(SurfaceConfig.a(configType2, configSize2));
        bqoVar5.a(SurfaceConfig.a(configType3, configSize2));
        arrayList.add(bqoVar5);
        bqo bqoVar6 = new bqo();
        bqoVar6.a(SurfaceConfig.a(configType2, configSize));
        bqoVar6.a(SurfaceConfig.a(configType2, configSize));
        bqoVar6.a(SurfaceConfig.a(configType3, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(bqoVar6);
        return arrayList;
    }

    public Size t(int i) {
        return (Size) Collections.max(Arrays.asList(j(i)), new r94());
    }

    public List<bqo> u() {
        ArrayList arrayList = new ArrayList();
        bqo bqoVar = new bqo();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.RAW;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        bqoVar.a(SurfaceConfig.a(configType, configSize));
        arrayList.add(bqoVar);
        bqo bqoVar2 = new bqo();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        bqoVar2.a(SurfaceConfig.a(configType2, configSize2));
        bqoVar2.a(SurfaceConfig.a(configType, configSize));
        arrayList.add(bqoVar2);
        bqo bqoVar3 = new bqo();
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        bqoVar3.a(SurfaceConfig.a(configType3, configSize2));
        bqoVar3.a(SurfaceConfig.a(configType, configSize));
        arrayList.add(bqoVar3);
        bqo bqoVar4 = new bqo();
        bqoVar4.a(SurfaceConfig.a(configType2, configSize2));
        bqoVar4.a(SurfaceConfig.a(configType2, configSize2));
        bqoVar4.a(SurfaceConfig.a(configType, configSize));
        arrayList.add(bqoVar4);
        bqo bqoVar5 = new bqo();
        bqoVar5.a(SurfaceConfig.a(configType2, configSize2));
        bqoVar5.a(SurfaceConfig.a(configType3, configSize2));
        bqoVar5.a(SurfaceConfig.a(configType, configSize));
        arrayList.add(bqoVar5);
        bqo bqoVar6 = new bqo();
        bqoVar6.a(SurfaceConfig.a(configType3, configSize2));
        bqoVar6.a(SurfaceConfig.a(configType3, configSize2));
        bqoVar6.a(SurfaceConfig.a(configType, configSize));
        arrayList.add(bqoVar6);
        bqo bqoVar7 = new bqo();
        bqoVar7.a(SurfaceConfig.a(configType2, configSize2));
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.JPEG;
        bqoVar7.a(SurfaceConfig.a(configType4, configSize));
        bqoVar7.a(SurfaceConfig.a(configType, configSize));
        arrayList.add(bqoVar7);
        bqo bqoVar8 = new bqo();
        bqoVar8.a(SurfaceConfig.a(configType3, configSize2));
        bqoVar8.a(SurfaceConfig.a(configType4, configSize));
        bqoVar8.a(SurfaceConfig.a(configType, configSize));
        arrayList.add(bqoVar8);
        return arrayList;
    }

    public final Size v() {
        try {
            int i = Integer.parseInt(this.c);
            CamcorderProfile camcorderProfileA = this.d.b(i, 1) ? this.d.a(i, 1) : null;
            return camcorderProfileA != null ? new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight) : w(i);
        } catch (NumberFormatException unused) {
            return x();
        }
    }

    public final Size w(int i) {
        CamcorderProfile camcorderProfileA;
        Size size = t;
        if (this.d.b(i, 10)) {
            camcorderProfileA = this.d.a(i, 10);
        } else if (this.d.b(i, 8)) {
            camcorderProfileA = this.d.a(i, 8);
        } else if (this.d.b(i, 12)) {
            camcorderProfileA = this.d.a(i, 12);
        } else if (this.d.b(i, 6)) {
            camcorderProfileA = this.d.a(i, 6);
        } else if (this.d.b(i, 5)) {
            camcorderProfileA = this.d.a(i, 5);
        } else {
            camcorderProfileA = this.d.b(i, 4) ? this.d.a(i, 4) : null;
        }
        return camcorderProfileA != null ? new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight) : size;
    }

    public final Size x() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.e.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return t;
        }
        Arrays.sort(outputSizes, new r94(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = s;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return t;
    }

    public Map<r<?>, Size> y(List<SurfaceConfig> list, List<r<?>> list2) {
        HashMap map;
        J();
        ArrayList arrayList = new ArrayList(list);
        Iterator<r<?>> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(L(it.next().m(), new Size(GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 480)));
        }
        if (!b(arrayList)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.c + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + list2);
        }
        List<Integer> listC = C(list2);
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it2 = listC.iterator();
        while (it2.hasNext()) {
            arrayList2.add(z(list2.get(it2.next().intValue())));
        }
        Iterator<List<Size>> it3 = k(arrayList2).iterator();
        while (true) {
            if (!it3.hasNext()) {
                map = null;
                break;
            }
            List<Size> next = it3.next();
            ArrayList arrayList3 = new ArrayList(list);
            for (int i = 0; i < next.size(); i++) {
                arrayList3.add(L(list2.get(listC.get(i).intValue()).m(), next.get(i)));
            }
            if (b(arrayList3)) {
                map = new HashMap();
                for (r<?> rVar : list2) {
                    map.put(rVar, next.get(listC.indexOf(Integer.valueOf(list2.indexOf(rVar)))));
                }
                break;
            }
        }
        if (map != null) {
            return map;
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.c + " and Hardware level: " + this.h + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
    }

    @VisibleForTesting
    public List<Size> z(r<?> rVar) {
        int iM = rVar.m();
        k kVar = (k) rVar;
        Size[] sizeArrO = o(iM, kVar);
        if (sizeArrO == null) {
            sizeArrO = j(iM);
        }
        ArrayList arrayList = new ArrayList();
        Size sizeJ = kVar.j(null);
        Size sizeT = t(iM);
        if (sizeJ == null || l(sizeT) < l(sizeJ)) {
            sizeJ = sizeT;
        }
        Arrays.sort(sizeArrO, new r94(true));
        Size sizeB = B(kVar);
        Size size = q;
        int iL = l(size);
        if (l(sizeJ) < iL) {
            size = f3361r;
        } else if (sizeB != null && l(sizeB) < iL) {
            size = sizeB;
        }
        for (Size size2 : sizeArrO) {
            if (l(size2) <= l(sizeJ) && l(size2) >= l(size) && !arrayList.contains(size2)) {
                arrayList.add(size2);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Can not get supported output size under supported maximum for the format: " + iM);
        }
        Rational rationalA = A(kVar);
        if (sizeB == null) {
            sizeB = kVar.F(null);
        }
        ArrayList arrayList2 = new ArrayList();
        new HashMap();
        if (rationalA == null) {
            arrayList2.addAll(arrayList);
            if (sizeB != null) {
                K(arrayList2, sizeB);
            }
        } else {
            Map<Rational, List<Size>> mapD = D(arrayList);
            if (sizeB != null) {
                Iterator<Rational> it = mapD.keySet().iterator();
                while (it.hasNext()) {
                    K(mapD.get(it.next()), sizeB);
                }
            }
            ArrayList arrayList3 = new ArrayList(mapD.keySet());
            Collections.sort(arrayList3, new a(rationalA));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                for (Size size3 : mapD.get((Rational) it2.next())) {
                    if (!arrayList2.contains(size3)) {
                        arrayList2.add(size3);
                    }
                }
            }
        }
        return this.p.a(n(rVar.m()), arrayList2);
    }
}
