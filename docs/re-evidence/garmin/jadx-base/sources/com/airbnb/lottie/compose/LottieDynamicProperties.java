package com.airbnb.lottie.compose;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import androidx.core.view.j;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\u0010\u0005BÓ\u0001\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00040\u0003\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003\u0012\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u0003\u0012\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u0003¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b!R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "", "properties", "", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "(Ljava/util/List;)V", "intProperties", "", "pointFProperties", "Landroid/graphics/PointF;", "floatProperties", "", "scaleProperties", "Lcom/airbnb/lottie/value/ScaleXY;", "colorFilterProperties", "Landroid/graphics/ColorFilter;", "intArrayProperties", "", "typefaceProperties", "Landroid/graphics/Typeface;", "bitmapProperties", "Landroid/graphics/Bitmap;", "charSequenceProperties", "", "pathProperties", "Landroid/graphics/Path;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "addTo", "", "drawable", "Lcom/airbnb/lottie/LottieDrawable;", "addTo$lottie_compose_release", "removeFrom", "removeFrom$lottie_compose_release", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LottieDynamicProperties {
    public static final int $stable = 8;
    private final List<LottieDynamicProperty<Bitmap>> bitmapProperties;
    private final List<LottieDynamicProperty<CharSequence>> charSequenceProperties;
    private final List<LottieDynamicProperty<ColorFilter>> colorFilterProperties;
    private final List<LottieDynamicProperty<Float>> floatProperties;
    private final List<LottieDynamicProperty<Object[]>> intArrayProperties;
    private final List<LottieDynamicProperty<Integer>> intProperties;
    private final List<LottieDynamicProperty<Path>> pathProperties;
    private final List<LottieDynamicProperty<PointF>> pointFProperties;
    private final List<LottieDynamicProperty<ScaleXY>> scaleProperties;
    private final List<LottieDynamicProperty<Typeface>> typefaceProperties;

    public LottieDynamicProperties(List<? extends LottieDynamicProperty<?>> list) {
        ArrayList arrayListL = j.l(list);
        for (Object obj : list) {
            if (((LottieDynamicProperty) obj).getProperty$lottie_compose_release() instanceof Integer) {
                arrayListL.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((LottieDynamicProperty) obj2).getProperty$lottie_compose_release() instanceof PointF) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (((LottieDynamicProperty) obj3).getProperty$lottie_compose_release() instanceof Float) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list) {
            if (((LottieDynamicProperty) obj4).getProperty$lottie_compose_release() instanceof ScaleXY) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : list) {
            if (((LottieDynamicProperty) obj5).getProperty$lottie_compose_release() instanceof ColorFilter) {
                arrayList4.add(obj5);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj6 : list) {
            if (((LottieDynamicProperty) obj6).getProperty$lottie_compose_release() instanceof Object[]) {
                arrayList5.add(obj6);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj7 : list) {
            if (((LottieDynamicProperty) obj7).getProperty$lottie_compose_release() instanceof Typeface) {
                arrayList6.add(obj7);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj8 : list) {
            if (((LottieDynamicProperty) obj8).getProperty$lottie_compose_release() instanceof Bitmap) {
                arrayList7.add(obj8);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj9 : list) {
            if (((LottieDynamicProperty) obj9).getProperty$lottie_compose_release() instanceof CharSequence) {
                arrayList8.add(obj9);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj10 : list) {
            if (((LottieDynamicProperty) obj10).getProperty$lottie_compose_release() instanceof Path) {
                arrayList9.add(obj10);
            }
        }
        this(arrayListL, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9);
    }

    public final void addTo$lottie_compose_release(LottieDrawable drawable) {
        drawable.getClass();
        Iterator<T> it = this.intProperties.iterator();
        while (it.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty = (LottieDynamicProperty) it.next();
            drawable.addValueCallback(lottieDynamicProperty.getKeyPath(), lottieDynamicProperty.getProperty$lottie_compose_release(), LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty.getCallback$lottie_compose_release()));
        }
        Iterator<T> it3 = this.pointFProperties.iterator();
        while (it3.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty2 = (LottieDynamicProperty) it3.next();
            drawable.addValueCallback(lottieDynamicProperty2.getKeyPath(), lottieDynamicProperty2.getProperty$lottie_compose_release(), LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty2.getCallback$lottie_compose_release()));
        }
        Iterator<T> it4 = this.floatProperties.iterator();
        while (it4.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty3 = (LottieDynamicProperty) it4.next();
            drawable.addValueCallback(lottieDynamicProperty3.getKeyPath(), lottieDynamicProperty3.getProperty$lottie_compose_release(), LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty3.getCallback$lottie_compose_release()));
        }
        Iterator<T> it5 = this.scaleProperties.iterator();
        while (it5.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty4 = (LottieDynamicProperty) it5.next();
            drawable.addValueCallback(lottieDynamicProperty4.getKeyPath(), lottieDynamicProperty4.getProperty$lottie_compose_release(), LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty4.getCallback$lottie_compose_release()));
        }
        Iterator<T> it6 = this.colorFilterProperties.iterator();
        while (it6.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty5 = (LottieDynamicProperty) it6.next();
            drawable.addValueCallback(lottieDynamicProperty5.getKeyPath(), lottieDynamicProperty5.getProperty$lottie_compose_release(), LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty5.getCallback$lottie_compose_release()));
        }
        Iterator<T> it7 = this.intArrayProperties.iterator();
        while (it7.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty6 = (LottieDynamicProperty) it7.next();
            drawable.addValueCallback(lottieDynamicProperty6.getKeyPath(), lottieDynamicProperty6.getProperty$lottie_compose_release(), LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty6.getCallback$lottie_compose_release()));
        }
        Iterator<T> it8 = this.typefaceProperties.iterator();
        while (it8.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty7 = (LottieDynamicProperty) it8.next();
            drawable.addValueCallback(lottieDynamicProperty7.getKeyPath(), lottieDynamicProperty7.getProperty$lottie_compose_release(), LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty7.getCallback$lottie_compose_release()));
        }
        Iterator<T> it9 = this.bitmapProperties.iterator();
        while (it9.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty8 = (LottieDynamicProperty) it9.next();
            drawable.addValueCallback(lottieDynamicProperty8.getKeyPath(), lottieDynamicProperty8.getProperty$lottie_compose_release(), LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty8.getCallback$lottie_compose_release()));
        }
        Iterator<T> it10 = this.charSequenceProperties.iterator();
        while (it10.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty9 = (LottieDynamicProperty) it10.next();
            drawable.addValueCallback(lottieDynamicProperty9.getKeyPath(), lottieDynamicProperty9.getProperty$lottie_compose_release(), LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty9.getCallback$lottie_compose_release()));
        }
        Iterator<T> it11 = this.pathProperties.iterator();
        while (it11.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty10 = (LottieDynamicProperty) it11.next();
            drawable.addValueCallback(lottieDynamicProperty10.getKeyPath(), lottieDynamicProperty10.getProperty$lottie_compose_release(), LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty10.getCallback$lottie_compose_release()));
        }
    }

    public final void removeFrom$lottie_compose_release(LottieDrawable drawable) {
        drawable.getClass();
        Iterator<T> it = this.intProperties.iterator();
        while (it.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty = (LottieDynamicProperty) it.next();
            drawable.addValueCallback(lottieDynamicProperty.getKeyPath(), lottieDynamicProperty.getProperty$lottie_compose_release(), (LottieValueCallback<Object>) null);
        }
        Iterator<T> it3 = this.pointFProperties.iterator();
        while (it3.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty2 = (LottieDynamicProperty) it3.next();
            drawable.addValueCallback(lottieDynamicProperty2.getKeyPath(), lottieDynamicProperty2.getProperty$lottie_compose_release(), (LottieValueCallback<Object>) null);
        }
        Iterator<T> it4 = this.floatProperties.iterator();
        while (it4.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty3 = (LottieDynamicProperty) it4.next();
            drawable.addValueCallback(lottieDynamicProperty3.getKeyPath(), lottieDynamicProperty3.getProperty$lottie_compose_release(), (LottieValueCallback<Object>) null);
        }
        Iterator<T> it5 = this.scaleProperties.iterator();
        while (it5.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty4 = (LottieDynamicProperty) it5.next();
            drawable.addValueCallback(lottieDynamicProperty4.getKeyPath(), lottieDynamicProperty4.getProperty$lottie_compose_release(), (LottieValueCallback<Object>) null);
        }
        Iterator<T> it6 = this.colorFilterProperties.iterator();
        while (it6.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty5 = (LottieDynamicProperty) it6.next();
            drawable.addValueCallback(lottieDynamicProperty5.getKeyPath(), lottieDynamicProperty5.getProperty$lottie_compose_release(), (LottieValueCallback<Object>) null);
        }
        Iterator<T> it7 = this.intArrayProperties.iterator();
        while (it7.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty6 = (LottieDynamicProperty) it7.next();
            drawable.addValueCallback(lottieDynamicProperty6.getKeyPath(), lottieDynamicProperty6.getProperty$lottie_compose_release(), (LottieValueCallback<Object>) null);
        }
        Iterator<T> it8 = this.typefaceProperties.iterator();
        while (it8.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty7 = (LottieDynamicProperty) it8.next();
            drawable.addValueCallback(lottieDynamicProperty7.getKeyPath(), lottieDynamicProperty7.getProperty$lottie_compose_release(), (LottieValueCallback<Object>) null);
        }
        Iterator<T> it9 = this.bitmapProperties.iterator();
        while (it9.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty8 = (LottieDynamicProperty) it9.next();
            drawable.addValueCallback(lottieDynamicProperty8.getKeyPath(), lottieDynamicProperty8.getProperty$lottie_compose_release(), (LottieValueCallback<Object>) null);
        }
        Iterator<T> it10 = this.charSequenceProperties.iterator();
        while (it10.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty9 = (LottieDynamicProperty) it10.next();
            drawable.addValueCallback(lottieDynamicProperty9.getKeyPath(), lottieDynamicProperty9.getProperty$lottie_compose_release(), (LottieValueCallback<Object>) null);
        }
        Iterator<T> it11 = this.pathProperties.iterator();
        while (it11.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty10 = (LottieDynamicProperty) it11.next();
            drawable.addValueCallback(lottieDynamicProperty10.getKeyPath(), lottieDynamicProperty10.getProperty$lottie_compose_release(), (LottieValueCallback<Object>) null);
        }
    }

    public LottieDynamicProperties(List<LottieDynamicProperty<Integer>> list, List<LottieDynamicProperty<PointF>> list2, List<LottieDynamicProperty<Float>> list3, List<LottieDynamicProperty<ScaleXY>> list4, List<LottieDynamicProperty<ColorFilter>> list5, List<LottieDynamicProperty<Object[]>> list6, List<LottieDynamicProperty<Typeface>> list7, List<LottieDynamicProperty<Bitmap>> list8, List<LottieDynamicProperty<CharSequence>> list9, List<LottieDynamicProperty<Path>> list10) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        list10.getClass();
        this.intProperties = list;
        this.pointFProperties = list2;
        this.floatProperties = list3;
        this.scaleProperties = list4;
        this.colorFilterProperties = list5;
        this.intArrayProperties = list6;
        this.typefaceProperties = list7;
        this.bitmapProperties = list8;
        this.charSequenceProperties = list9;
        this.pathProperties = list10;
    }
}
