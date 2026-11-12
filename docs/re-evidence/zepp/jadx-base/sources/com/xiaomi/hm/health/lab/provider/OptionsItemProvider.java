package com.xiaomi.hm.health.lab.provider;

import android.content.Context;
import com.xiaomi.hm.health.lab.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class OptionsItemProvider {
    public static ArrayList<String> buildDeviceData(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(context.getResources().getString(R.string.lab_temperature_mercury));
        arrayList.add(context.getResources().getString(R.string.lab_temperature_infrared));
        arrayList.add(context.getResources().getString(R.string.lab_temperature_elec));
        arrayList.add(context.getResources().getString(R.string.lab_temperature_patch));
        return arrayList;
    }

    public static ArrayList<String> buildDeviceKey() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("merc");
        arrayList.add("infra");
        arrayList.add("elec");
        arrayList.add("stick");
        return arrayList;
    }

    public static ArrayList<ArrayList<String>> buildPartsData(Context context) {
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<>(Arrays.asList(context.getResources().getStringArray(R.array.lab_temperature_mercury_item))));
        arrayList.add(new ArrayList<>(Arrays.asList(context.getResources().getStringArray(R.array.lab_temperature_infrared_item))));
        arrayList.add(new ArrayList<>(Arrays.asList(context.getResources().getStringArray(R.array.lab_temperature_elec_item))));
        arrayList.add(new ArrayList<>(Arrays.asList(context.getResources().getStringArray(R.array.lab_temperature_patch_item))));
        return arrayList;
    }

    public static ArrayList<ArrayList<String>> buildPartsKey() {
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("m1");
        arrayList2.add("m2");
        arrayList2.add("m3");
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("i1");
        arrayList3.add("i2");
        arrayList3.add("i3");
        arrayList3.add("i4");
        arrayList3.add("i5");
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("e1");
        arrayList4.add("e2");
        arrayList4.add("e3");
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("s1");
        arrayList5.add("s2");
        arrayList5.add("s3");
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        arrayList.add(arrayList4);
        arrayList.add(arrayList5);
        return arrayList;
    }

    public static ArrayList<String> buildTemperatureData() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("℃");
        arrayList.add("℉");
        return arrayList;
    }

    public static ArrayList<ArrayList<String>> buildTemperatureRangeData() {
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        DecimalFormat decimalFormat = new DecimalFormat(".0", new DecimalFormatSymbols(Locale.US));
        for (float f = 350.0f; f <= 420.0f; f += 1.0f) {
            float f2 = f / 10.0f;
            arrayList2.add(decimalFormat.format(f2));
            arrayList3.add(decimalFormat.format(((f2 * 9.0f) / 5.0f) + 32.0f));
        }
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        return arrayList;
    }
}
