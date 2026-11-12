package com.github.mikephil.charting.utils;

import android.content.res.AssetManager;
import android.os.Environment;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class FileUtils {
    private static final String LOG = "MPChart-FileUtils";

    public static List<BarEntry> loadBarEntriesFromAssets(AssetManager assetManager, String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(assetManager.open(str), "UTF-8"));
                    try {
                        for (String line = bufferedReader2.readLine(); line != null; line = bufferedReader2.readLine()) {
                            String[] strArrSplit = line.split("#");
                            arrayList.add(new BarEntry(Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[0])));
                        }
                        bufferedReader2.close();
                        return arrayList;
                    } catch (IOException e4) {
                        e = e4;
                        bufferedReader = bufferedReader2;
                        e.toString();
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e14) {
                                e14.toString();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e15) {
                    e15.toString();
                    return arrayList;
                }
            } catch (IOException e16) {
                e = e16;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static List<Entry> loadEntriesFromAssets(AssetManager assetManager, String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(assetManager.open(str), "UTF-8"));
                    try {
                        for (String line = bufferedReader2.readLine(); line != null; line = bufferedReader2.readLine()) {
                            String[] strArrSplit = line.split("#");
                            if (strArrSplit.length <= 2) {
                                arrayList.add(new Entry(Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[0])));
                            } else {
                                int length = strArrSplit.length - 1;
                                float[] fArr = new float[length];
                                for (int i14 = 0; i14 < length; i14++) {
                                    fArr[i14] = Float.parseFloat(strArrSplit[i14]);
                                }
                                arrayList.add(new BarEntry(Integer.parseInt(strArrSplit[strArrSplit.length - 1]), fArr));
                            }
                        }
                        bufferedReader2.close();
                        return arrayList;
                    } catch (IOException e4) {
                        e = e4;
                        bufferedReader = bufferedReader2;
                        e.toString();
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e14) {
                                e14.toString();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException e15) {
                e = e15;
            }
        } catch (IOException e16) {
            e16.toString();
        }
    }

    public static List<Entry> loadEntriesFromFile(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), str);
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return arrayList;
                }
                String[] strArrSplit = line.split("#");
                if (strArrSplit.length <= 2) {
                    arrayList.add(new Entry(Float.parseFloat(strArrSplit[0]), Integer.parseInt(strArrSplit[1])));
                } else {
                    int length = strArrSplit.length - 1;
                    float[] fArr = new float[length];
                    for (int i14 = 0; i14 < length; i14++) {
                        fArr[i14] = Float.parseFloat(strArrSplit[i14]);
                    }
                    arrayList.add(new BarEntry(Integer.parseInt(strArrSplit[strArrSplit.length - 1]), fArr));
                }
            }
        } catch (IOException e4) {
            e4.toString();
            return arrayList;
        }
    }

    public static void saveToSdCard(List<Entry> list, String str) {
        File file = new File(Environment.getExternalStorageDirectory(), str);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e4) {
                e4.toString();
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            for (Entry entry : list) {
                bufferedWriter.append((CharSequence) (entry.getY() + "#" + entry.getX()));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e14) {
            e14.toString();
        }
    }
}
