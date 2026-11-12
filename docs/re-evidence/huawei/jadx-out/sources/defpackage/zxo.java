package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public final class zxo {
    public static zxi a(zxi zxiVar) {
        if (zxiVar == null) {
            return null;
        }
        zvg zvgVarC = zxiVar.c();
        if (zvgVarC == null) {
            throw new IllegalArgumentException("missing request for observation!");
        }
        zvg zvgVar = new zvg(zvgVarC.a());
        zvgVar.setDestinationContext(zvgVarC.getDestinationContext());
        zvgVar.setType(zvgVarC.getType());
        zvgVar.setMID(zvgVarC.getMID());
        zvgVar.setToken(zvgVarC.getToken());
        zvgVar.setOptions(zvgVarC.getOptions());
        if (zvgVarC.isUnintendedPayload()) {
            zvgVar.setUnintendedPayload();
        }
        zvgVar.setPayload(zvgVarC.getPayload());
        zvgVar.e(zvgVarC.g());
        zvgVar.setMaxResourceBodySize(zvgVarC.getMaxResourceBodySize());
        return new zxi(zvgVar, zxiVar.e());
    }
}
