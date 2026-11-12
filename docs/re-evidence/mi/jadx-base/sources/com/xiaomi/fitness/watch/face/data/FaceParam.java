package com.xiaomi.fitness.watch.face.data;

import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class FaceParam {
    public ArrayList<String> id_list = new ArrayList<>();
    public String model;

    public FaceParam(String str) {
        this.model = str;
    }

    public static FaceParam generateParam(List<WatchFace> list, String str) {
        FaceParam faceParam = new FaceParam(str);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            WatchFace watchFace = list.get(i);
            faceParam.id_list.add(watchFace.getTemplateId().equals("") ? watchFace.getId() : watchFace.getTemplateId());
        }
        return faceParam;
    }
}
