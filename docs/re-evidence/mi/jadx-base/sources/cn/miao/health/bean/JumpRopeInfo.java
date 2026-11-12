package cn.miao.health.bean;

/* JADX INFO: loaded from: classes.dex */
public class JumpRopeInfo extends BaseInputInfo {
    private Integer jumpNum;
    private Integer proficiency;
    private Integer sex;
    private Double sportDuration;

    public Integer getJumpNum() {
        return this.jumpNum;
    }

    public Integer getProficiency() {
        return this.proficiency;
    }

    public Integer getSex() {
        return this.sex;
    }

    public Double getSportDuration() {
        return this.sportDuration;
    }

    public void setJumpNum(Integer num) {
        this.jumpNum = num;
    }

    public void setProficiency(Integer num) {
        this.proficiency = num;
    }

    public void setSex(Integer num) {
        this.sex = num;
    }

    public void setSportDuration(Double d) {
        this.sportDuration = d;
    }
}
