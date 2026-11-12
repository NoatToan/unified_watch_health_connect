package com.huawei.watchface.videoedit.presenter;

import com.huawei.watchface.videoedit.param.PlayerBean;
import com.huawei.watchface.videoedit.param.PlayerMaterial;
import com.huawei.watchface.videoedit.param.PlayerModel;
import com.huawei.watchface.videoedit.param.Segments;
import com.huawei.watchface.videoedit.param.TemplateModel;
import com.huawei.watchface.videoedit.param.Tracks;
import com.huawei.watchface.videoedit.sysc.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public abstract class PlayVisitor extends ModelVisitor<PlayerModel> {
    private final String interested;

    public PlayVisitor(int i, String str) {
        super(i);
        this.interested = str;
    }

    private Optional<PlayerMaterial> findPathById(String str, List<PlayerMaterial> list) {
        for (PlayerMaterial playerMaterial : list) {
            if (str.equals(playerMaterial.getId())) {
                return Optional.ofNullable(playerMaterial);
            }
        }
        return Optional.empty();
    }

    private List<PlayerBean> generatePlayerBean(TemplateModel templateModel) {
        Tracks next;
        Iterator<Tracks> it = templateModel.getTracks().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!this.interested.equals(next.getType()));
        ArrayList arrayList = new ArrayList();
        if (next != null) {
            for (Segments segments : next.getSegments()) {
                PlayerBean playerBean = new PlayerBean();
                playerBean.setSourceTimeRange(segments.getSegmentsSourceTimeRange()).setTargetTimeRange(segments.getSegmentsTargetTimerange()).setId(segments.getId()).setMaterialId(segments.getMaterialId()).setSpeed(segments.getSpeed()).setVolume(segments.getVolume()).setFadeInDuration(segments.getFadeInDuration()).setFadeOutDuration(segments.getFadeOutDuration());
                arrayList.add(playerBean);
            }
        }
        return arrayList;
    }

    private String tranlateModelTypeToBeanType(String str) {
        return "music".equals(str) ? "audio" : str;
    }

    public abstract List<PlayerMaterial> generatePlayerMaterial(TemplateModel templateModel);

    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.huawei.watchface.videoedit.param.PlayerModel] */
    @Override // com.huawei.watchface.videoedit.presenter.ModelVisitor
    public void onDataSetChanged(TemplateModel templateModel) {
        List<PlayerBean> listGeneratePlayerBean = generatePlayerBean(templateModel);
        List<PlayerMaterial> listGeneratePlayerMaterial = generatePlayerMaterial(templateModel);
        for (PlayerBean playerBean : listGeneratePlayerBean) {
            Optional<PlayerMaterial> optionalFindPathById = findPathById(playerBean.getMaterialId(), listGeneratePlayerMaterial);
            if (optionalFindPathById.isPresent()) {
                playerBean.setPath(optionalFindPathById.get().getPath());
                playerBean.setWidth(optionalFindPathById.get().getWidth());
                playerBean.setHeight(optionalFindPathById.get().getHeight());
                playerBean.setPathUri(optionalFindPathById.get().getPathUri());
                playerBean.setType(tranlateModelTypeToBeanType(optionalFindPathById.get().getType()));
            }
        }
        this.selfStorage = new PlayerModel(listGeneratePlayerBean, listGeneratePlayerMaterial);
    }
}
