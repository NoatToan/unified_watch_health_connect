package com.huami.pai.algorithm;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002JR\u0010\u0010\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003R\u0016\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/pai/algorithm/FitnessAgeAlgorithm;", "", "", "", "Lcom/huami/pai/algorithm/Coefficient;", "getCoefficients", "coeffs", "rawAge", "", "isMale", "rhr", "", "bmi", "currentVo2", "PAI", "days", "calculate", "MIN_AGE", LogUtil.I, "MAX_AGE", "", "a", "Ljava/lang/String;", "COEFFICIENTS", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class FitnessAgeAlgorithm {

    @NotNull
    public static final FitnessAgeAlgorithm INSTANCE = new FitnessAgeAlgorithm();
    public static final int MAX_AGE = 90;
    public static final int MIN_AGE = 20;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String COEFFICIENTS = "[{\"age\":\"18\",\"female_a\":\"-4.636279678\",\"female_b\":\"-0.052301424\",\"female_c\":\"0.009490086\",\"male_a\":\"-4.445930361\",\"male_b\":\"-0.050910502\",\"male_c\":\"0.009510849\"},{\"age\":\"19\",\"female_a\":\"-4.711254301\",\"female_b\":\"-0.05656441\",\"female_c\":\"0.010198882\",\"male_a\":\"-4.517504624\",\"male_b\":\"-0.052800886\",\"male_c\":\"0.009669251\"},{\"age\":\"20\",\"female_a\":\"-4.798424432\",\"female_b\":\"-0.057834609\",\"female_c\":\"0.010245925\",\"male_a\":\"-4.5076071\",\"male_b\":\"-0.053651306\",\"male_c\":\"0.009874008\"},{\"age\":\"21\",\"female_a\":\"-4.761011294\",\"female_b\":\"-0.054938258\",\"female_c\":\"0.009719377\",\"male_a\":\"-4.588607584\",\"male_b\":\"-0.054179659\",\"male_c\":\"0.009776767\"},{\"age\":\"22\",\"female_a\":\"-4.812754047\",\"female_b\":\"-0.055624127\",\"female_c\":\"0.009723772\",\"male_a\":\"-4.585119823\",\"male_b\":\"-0.051871338\",\"male_c\":\"0.00936948\"},{\"age\":\"23\",\"female_a\":\"-4.820525576\",\"female_b\":\"-0.057458091\",\"female_c\":\"0.010144922\",\"male_a\":\"-4.629183945\",\"male_b\":\"-0.053936618\",\"male_c\":\"0.009639355\"},{\"age\":\"24\",\"female_a\":\"-4.838605754\",\"female_b\":\"-0.056232198\",\"female_c\":\"0.009856612\",\"male_a\":\"-4.606175425\",\"male_b\":\"-0.052279007\",\"male_c\":\"0.0093445\"},{\"age\":\"25\",\"female_a\":\"-4.877103194\",\"female_b\":\"-0.056672618\",\"female_c\":\"0.009760443\",\"male_a\":\"-4.650372758\",\"male_b\":\"-0.053820274\",\"male_c\":\"0.009535593\"},{\"age\":\"26\",\"female_a\":\"-4.911741249\",\"female_b\":\"-0.05777423\",\"female_c\":\"0.009922822\",\"male_a\":\"-4.640187203\",\"male_b\":\"-0.055122748\",\"male_c\":\"0.009805551\"},{\"age\":\"27\",\"female_a\":\"-4.866890867\",\"female_b\":\"-0.056560121\",\"female_c\":\"0.009828861\",\"male_a\":\"-4.652763834\",\"male_b\":\"-0.053234857\",\"male_c\":\"0.009394695\"},{\"age\":\"28\",\"female_a\":\"-4.878739204\",\"female_b\":\"-0.057652019\",\"female_c\":\"0.0100035\",\"male_a\":\"-4.685471566\",\"male_b\":\"-0.05528954\",\"male_c\":\"0.009691205\"},{\"age\":\"29\",\"female_a\":\"-4.908757226\",\"female_b\":\"-0.057943758\",\"female_c\":\"0.010069063\",\"male_a\":\"-4.710458315\",\"male_b\":\"-0.054993368\",\"male_c\":\"0.009567953\"},{\"age\":\"30\",\"female_a\":\"-4.909687805\",\"female_b\":\"-0.05797824\",\"female_c\":\"0.010087091\",\"male_a\":\"-4.71877875\",\"male_b\":\"-0.056124454\",\"male_c\":\"0.009824734\"},{\"age\":\"31\",\"female_a\":\"-4.904405314\",\"female_b\":\"-0.058640217\",\"female_c\":\"0.010161947\",\"male_a\":\"-4.740719869\",\"male_b\":\"-0.053417359\",\"male_c\":\"0.009213909\"},{\"age\":\"32\",\"female_a\":\"-4.882263944\",\"female_b\":\"-0.058752398\",\"female_c\":\"0.010178382\",\"male_a\":\"-4.705092271\",\"male_b\":\"-0.053795198\",\"male_c\":\"0.0094323\"},{\"age\":\"33\",\"female_a\":\"-4.907570664\",\"female_b\":\"-0.055908065\",\"female_c\":\"0.00970203\",\"male_a\":\"-4.813647505\",\"male_b\":\"-0.054654393\",\"male_c\":\"0.009335252\"},{\"age\":\"34\",\"female_a\":\"-4.901911393\",\"female_b\":\"-0.056752652\",\"female_c\":\"0.009879079\",\"male_a\":\"-4.767456778\",\"male_b\":\"-0.053716536\",\"male_c\":\"0.009213161\"},{\"age\":\"35\",\"female_a\":\"-4.80854796\",\"female_b\":\"-0.056294562\",\"female_c\":\"0.009966906\",\"male_a\":\"-4.849151718\",\"male_b\":\"-0.055520416\",\"male_c\":\"0.009409514\"},{\"age\":\"36\",\"female_a\":\"-4.837524395\",\"female_b\":\"-0.056475554\",\"female_c\":\"0.009953522\",\"male_a\":\"-4.815669489\",\"male_b\":\"-0.054627884\",\"male_c\":\"0.00937697\"},{\"age\":\"37\",\"female_a\":\"-4.809190685\",\"female_b\":\"-0.056454447\",\"female_c\":\"0.00990493\",\"male_a\":\"-4.822695359\",\"male_b\":\"-0.055787374\",\"male_c\":\"0.00961446\"},{\"age\":\"38\",\"female_a\":\"-4.828862\",\"female_b\":\"-0.057131743\",\"female_c\":\"0.010083107\",\"male_a\":\"-4.85335383\",\"male_b\":\"-0.05596313\",\"male_c\":\"0.009563437\"},{\"age\":\"39\",\"female_a\":\"-4.70562136\",\"female_b\":\"-0.054290752\",\"female_c\":\"0.009796417\",\"male_a\":\"-4.839466917\",\"male_b\":\"-0.054244803\",\"male_c\":\"0.009219316\"},{\"age\":\"40\",\"female_a\":\"-4.71467507\",\"female_b\":\"-0.056511565\",\"female_c\":\"0.010192244\",\"male_a\":\"-4.8676241\",\"male_b\":\"-0.057994212\",\"male_c\":\"0.009862394\"},{\"age\":\"41\",\"female_a\":\"-4.696171071\",\"female_b\":\"-0.054254091\",\"female_c\":\"0.009877644\",\"male_a\":\"-4.892017163\",\"male_b\":\"-0.055964997\",\"male_c\":\"0.009488812\"},{\"age\":\"42\",\"female_a\":\"-4.611321347\",\"female_b\":\"-0.05126691\",\"female_c\":\"0.009447821\",\"male_a\":\"-4.861078684\",\"male_b\":\"-0.055167591\",\"male_c\":\"0.009356566\"},{\"age\":\"43\",\"female_a\":\"-4.532242691\",\"female_b\":\"-0.05195898\",\"female_c\":\"0.009708361\",\"male_a\":\"-4.858656633\",\"male_b\":\"-0.056737079\",\"male_c\":\"0.009695786\"},{\"age\":\"44\",\"female_a\":\"-4.524928006\",\"female_b\":\"-0.053813775\",\"female_c\":\"0.010105154\",\"male_a\":\"-4.875237499\",\"male_b\":\"-0.055819635\",\"male_c\":\"0.009522938\"},{\"age\":\"45\",\"female_a\":\"-4.457623064\",\"female_b\":\"-0.051583342\",\"female_c\":\"0.009791746\",\"male_a\":\"-4.933006446\",\"male_b\":\"-0.057374392\",\"male_c\":\"0.009718559\"},{\"age\":\"46\",\"female_a\":\"-4.365474447\",\"female_b\":\"-0.050442915\",\"female_c\":\"0.009730693\",\"male_a\":\"-4.902666502\",\"male_b\":\"-0.056390353\",\"male_c\":\"0.009428236\"},{\"age\":\"47\",\"female_a\":\"-4.402679945\",\"female_b\":\"-0.051172075\",\"female_c\":\"0.00983215\",\"male_a\":\"-4.923970456\",\"male_b\":\"-0.056799454\",\"male_c\":\"0.009632014\"},{\"age\":\"48\",\"female_a\":\"-4.265892826\",\"female_b\":\"-0.049414037\",\"female_c\":\"0.009712352\",\"male_a\":\"-4.876629234\",\"male_b\":\"-0.055749691\",\"male_c\":\"0.009369077\"},{\"age\":\"49\",\"female_a\":\"-4.217251575\",\"female_b\":\"-0.050322602\",\"female_c\":\"0.010224863\",\"male_a\":\"-4.853694582\",\"male_b\":\"-0.055985062\",\"male_c\":\"0.00964359\"},{\"age\":\"50\",\"female_a\":\"-4.142712638\",\"female_b\":\"-0.049587685\",\"female_c\":\"0.010059022\",\"male_a\":\"-4.892570146\",\"male_b\":\"-0.056421559\",\"male_c\":\"0.009622742\"},{\"age\":\"51\",\"female_a\":\"-4.091193681\",\"female_b\":\"-0.04739189\",\"female_c\":\"0.009712276\",\"male_a\":\"-4.83233007\",\"male_b\":\"-0.05448614\",\"male_c\":\"0.009432108\"},{\"age\":\"52\",\"female_a\":\"-4.009021047\",\"female_b\":\"-0.046768092\",\"female_c\":\"0.009751495\",\"male_a\":\"-4.875576941\",\"male_b\":\"-0.057114162\",\"male_c\":\"0.009918979\"},{\"age\":\"53\",\"female_a\":\"-3.899691414\",\"female_b\":\"-0.045363018\",\"female_c\":\"0.009639591\",\"male_a\":\"-4.882688827\",\"male_b\":\"-0.055747299\",\"male_c\":\"0.009659801\"},{\"age\":\"54\",\"female_a\":\"-3.826292355\",\"female_b\":\"-0.045092392\",\"female_c\":\"0.009905101\",\"male_a\":\"-4.892312303\",\"male_b\":\"-0.055720247\",\"male_c\":\"0.009610584\"},{\"age\":\"55\",\"female_a\":\"-3.73797653\",\"female_b\":\"-0.042534486\",\"female_c\":\"0.009476887\",\"male_a\":\"-4.859686753\",\"male_b\":\"-0.055030918\",\"male_c\":\"0.009471757\"},{\"age\":\"56\",\"female_a\":\"-3.671400414\",\"female_b\":\"-0.041706178\",\"female_c\":\"0.009426785\",\"male_a\":\"-4.880565097\",\"male_b\":\"-0.056639072\",\"male_c\":\"0.009793593\"},{\"age\":\"57\",\"female_a\":\"-3.63465547\",\"female_b\":\"-0.042466559\",\"female_c\":\"0.00978289\",\"male_a\":\"-4.870262344\",\"male_b\":\"-0.056242124\",\"male_c\":\"0.009730196\"},{\"age\":\"58\",\"female_a\":\"-3.5222181\",\"female_b\":\"-0.040405191\",\"female_c\":\"0.009596975\",\"male_a\":\"-4.808344771\",\"male_b\":\"-0.0555919\",\"male_c\":\"0.00981191\"},{\"age\":\"59\",\"female_a\":\"-3.43126195\",\"female_b\":\"-0.039261606\",\"female_c\":\"0.009457493\",\"male_a\":\"-4.855780097\",\"male_b\":\"-0.057774431\",\"male_c\":\"0.010090877\"},{\"age\":\"60\",\"female_a\":\"-3.359019563\",\"female_b\":\"-0.038328243\",\"female_c\":\"0.009472148\",\"male_a\":\"-4.862674606\",\"male_b\":\"-0.056162962\",\"male_c\":\"0.009831337\"},{\"age\":\"61\",\"female_a\":\"-3.289661617\",\"female_b\":\"-0.037250162\",\"female_c\":\"0.009299449\",\"male_a\":\"-4.805402695\",\"male_b\":\"-0.055807237\",\"male_c\":\"0.00984888\"},{\"age\":\"62\",\"female_a\":\"-3.213713743\",\"female_b\":\"-0.03700785\",\"female_c\":\"0.00946154\",\"male_a\":\"-4.870120416\",\"male_b\":\"-0.057219305\",\"male_c\":\"0.010061695\"},{\"age\":\"63\",\"female_a\":\"-3.132885687\",\"female_b\":\"-0.035257209\",\"female_c\":\"0.009193679\",\"male_a\":\"-4.805698288\",\"male_b\":\"-0.057242252\",\"male_c\":\"0.010197642\"},{\"age\":\"64\",\"female_a\":\"-3.098338068\",\"female_b\":\"-0.0362893\",\"female_c\":\"0.009569457\",\"male_a\":\"-4.802738641\",\"male_b\":\"-0.057334509\",\"male_c\":\"0.010229239\"},{\"age\":\"65\",\"female_a\":\"-2.995921803\",\"female_b\":\"-0.034749345\",\"female_c\":\"0.009522653\",\"male_a\":\"-4.775521135\",\"male_b\":\"-0.054775892\",\"male_c\":\"0.009736051\"},{\"age\":\"66\",\"female_a\":\"-2.980320874\",\"female_b\":\"-0.034533229\",\"female_c\":\"0.009528944\",\"male_a\":\"-4.817352808\",\"male_b\":\"-0.056227093\",\"male_c\":\"0.010009966\"},{\"age\":\"67\",\"female_a\":\"-2.854331519\",\"female_b\":\"-0.032036071\",\"female_c\":\"0.009169215\",\"male_a\":\"-4.774124487\",\"male_b\":\"-0.056841009\",\"male_c\":\"0.010208239\"},{\"age\":\"68\",\"female_a\":\"-2.831312891\",\"female_b\":\"-0.032879766\",\"female_c\":\"0.009509289\",\"male_a\":\"-4.737662644\",\"male_b\":\"-0.054477482\",\"male_c\":\"0.009908246\"},{\"age\":\"69\",\"female_a\":\"-2.774926709\",\"female_b\":\"-0.031062687\",\"female_c\":\"0.009132212\",\"male_a\":\"-4.745599344\",\"male_b\":\"-0.056388269\",\"male_c\":\"0.010201691\"},{\"age\":\"70\",\"female_a\":\"-2.720561327\",\"female_b\":\"-0.030603087\",\"female_c\":\"0.009147916\",\"male_a\":\"-4.677583915\",\"male_b\":\"-0.05428773\",\"male_c\":\"0.010004439\"},{\"age\":\"71\",\"female_a\":\"-2.654775939\",\"female_b\":\"-0.029902258\",\"female_c\":\"0.009131614\",\"male_a\":\"-4.699073766\",\"male_b\":\"-0.05483558\",\"male_c\":\"0.010004623\"},{\"age\":\"72\",\"female_a\":\"-2.654453354\",\"female_b\":\"-0.030454072\",\"female_c\":\"0.009279727\",\"male_a\":\"-4.78012641\",\"male_b\":\"-0.056835907\",\"male_c\":\"0.010321361\"},{\"age\":\"73\",\"female_a\":\"-2.589661627\",\"female_b\":\"-0.029737957\",\"female_c\":\"0.009364279\",\"male_a\":\"-4.777869808\",\"male_b\":\"-0.057698722\",\"male_c\":\"0.010472927\"},{\"age\":\"74\",\"female_a\":\"-2.565845386\",\"female_b\":\"-0.029110889\",\"female_c\":\"0.009228332\",\"male_a\":\"-4.737003762\",\"male_b\":\"-0.05795738\",\"male_c\":\"0.010619501\"},{\"age\":\"75\",\"female_a\":\"-2.508901634\",\"female_b\":\"-0.028284231\",\"female_c\":\"0.009021394\",\"male_a\":\"-4.818286457\",\"male_b\":\"-0.057780285\",\"male_c\":\"0.01049557\"},{\"age\":\"76\",\"female_a\":\"-2.460725101\",\"female_b\":\"-0.027870531\",\"female_c\":\"0.009153288\",\"male_a\":\"-4.765279377\",\"male_b\":\"-0.056874987\",\"male_c\":\"0.010415827\"},{\"age\":\"77\",\"female_a\":\"-2.423264018\",\"female_b\":\"-0.027473374\",\"female_c\":\"0.00907637\",\"male_a\":\"-4.781584201\",\"male_b\":\"-0.057688288\",\"male_c\":\"0.010532999\"},{\"age\":\"78\",\"female_a\":\"-2.388810746\",\"female_b\":\"-0.027307063\",\"female_c\":\"0.009166835\",\"male_a\":\"-4.75142339\",\"male_b\":\"-0.055987989\",\"male_c\":\"0.010217994\"},{\"age\":\"79\",\"female_a\":\"-2.347415884\",\"female_b\":\"-0.026978629\",\"female_c\":\"0.009224305\",\"male_a\":\"-4.779835023\",\"male_b\":\"-0.057488942\",\"male_c\":\"0.010380635\"},{\"age\":\"80\",\"female_a\":\"-2.324809935\",\"female_b\":\"-0.027106388\",\"female_c\":\"0.009346923\",\"male_a\":\"-4.766532554\",\"male_b\":\"-0.056860999\",\"male_c\":\"0.01038226\"},{\"age\":\"81\",\"female_a\":\"-2.297892107\",\"female_b\":\"-0.0259735\",\"female_c\":\"0.009100549\",\"male_a\":\"-4.768243871\",\"male_b\":\"-0.055292618\",\"male_c\":\"0.010040816\"},{\"age\":\"82\",\"female_a\":\"-2.256486446\",\"female_b\":\"-0.026098894\",\"female_c\":\"0.009241658\",\"male_a\":\"-4.79077021\",\"male_b\":\"-0.056866742\",\"male_c\":\"0.010255156\"},{\"age\":\"83\",\"female_a\":\"-2.215545878\",\"female_b\":\"-0.025036874\",\"female_c\":\"0.009013412\",\"male_a\":\"-4.776191599\",\"male_b\":\"-0.057337618\",\"male_c\":\"0.010513391\"},{\"age\":\"84\",\"female_a\":\"-2.212961339\",\"female_b\":\"-0.025316458\",\"female_c\":\"0.009195225\",\"male_a\":\"-4.810057454\",\"male_b\":\"-0.058099389\",\"male_c\":\"0.010523539\"},{\"age\":\"85\",\"female_a\":\"-2.190217021\",\"female_b\":\"-0.024458937\",\"female_c\":\"0.008949345\",\"male_a\":\"-4.820557514\",\"male_b\":\"-0.057651181\",\"male_c\":\"0.010501443\"},{\"age\":\"86\",\"female_a\":\"-2.16444761\",\"female_b\":\"-0.024544974\",\"female_c\":\"0.008980128\",\"male_a\":\"-4.758834373\",\"male_b\":\"-0.056202763\",\"male_c\":\"0.010277204\"},{\"age\":\"87\",\"female_a\":\"-2.160499153\",\"female_b\":\"-0.024722343\",\"female_c\":\"0.009145535\",\"male_a\":\"-4.851825723\",\"male_b\":\"-0.057728419\",\"male_c\":\"0.010404702\"},{\"age\":\"88\",\"female_a\":\"-2.126096014\",\"female_b\":\"-0.024178955\",\"female_c\":\"0.009039082\",\"male_a\":\"-4.821508171\",\"male_b\":\"-0.058108855\",\"male_c\":\"0.010514687\"},{\"age\":\"89\",\"female_a\":\"-2.117296546\",\"female_b\":\"-0.023538012\",\"female_c\":\"0.00878263\",\"male_a\":\"-4.906981138\",\"male_b\":\"-0.059239217\",\"male_c\":\"0.010640717\"},{\"age\":\"90\",\"female_a\":\"-2.105750407\",\"female_b\":\"-0.023402573\",\"female_c\":\"0.008944451\",\"male_a\":\"-4.899076158\",\"male_b\":\"-0.058369168\",\"male_c\":\"0.010294268\"}]";

    private FitnessAgeAlgorithm() {
    }

    public final int calculate(@NotNull Map<Integer, Coefficient> coeffs, int rawAge, boolean isMale, int rhr, float bmi, float currentVo2, int PAI, int days) {
        double d;
        double d2;
        double dExp;
        double d3;
        double d4;
        int i = rawAge;
        if (i < 20) {
            i = 20;
        } else if (i > 90) {
            i = 90;
        }
        Coefficient coefficient = coeffs.get(Integer.valueOf(i));
        if (coefficient == null) {
            return -1;
        }
        double d5 = ((double) PAI) / 3.1d;
        if (isMale) {
            d = ((92.05d - (((double) i) * 0.327d)) - (((double) bmi) * 0.933d)) - (((double) rhr) * 0.167d);
            d2 = 0.257d;
        } else {
            d = ((70.77d - (((double) i) * 0.244d)) - (((double) bmi) * 0.749d)) - (((double) rhr) * 0.107d);
            d2 = 0.213d;
        }
        double d6 = d + (d5 * d2);
        double d7 = currentVo2;
        double d8 = d7 - d6;
        Triple triple = isMale ? new Triple(Double.valueOf(coefficient.getMale_a()), Double.valueOf(coefficient.getMale_b()), Double.valueOf(coefficient.getMale_c())) : new Triple(Double.valueOf(coefficient.getFemale_a()), Double.valueOf(coefficient.getFemale_b()), Double.valueOf(coefficient.getFemale_c()));
        double dDoubleValue = ((Number) triple.component1()).doubleValue();
        double dDoubleValue2 = ((Number) triple.component2()).doubleValue();
        double dDoubleValue3 = ((Number) triple.component3()).doubleValue();
        double d9 = dDoubleValue2 / dDoubleValue3;
        double d10 = dDoubleValue - d9;
        if (d8 > d10) {
            double d11 = (((double) 2) * d10) - d8;
            double d12 = (dDoubleValue3 / dDoubleValue2) * (d11 - dDoubleValue);
            double d13 = 1;
            double d14 = -dDoubleValue3;
            dExp = d11 - (dDoubleValue - (d9 * (d13 - Math.exp(d14 * ((Math.log(d12 + d13) / d14) + ((double) (days * 2)))))));
            d7 = d7;
        } else {
            double d15 = (dDoubleValue3 / dDoubleValue2) * (d8 - dDoubleValue);
            double d16 = 1;
            double d17 = -dDoubleValue3;
            dExp = (dDoubleValue - (d9 * (d16 - Math.exp(d17 * ((Math.log(d15 + d16) / d17) + (PAI < 60 ? Math.pow(((double) (PAI + 1)) / 61.0d, 2) * ((double) days) : days)))))) - d8;
        }
        double d18 = d7 + dExp;
        if (isMale) {
            d3 = 63.6d - d18;
            d4 = 0.393d;
        } else {
            d3 = 51.6d - d18;
            d4 = 0.328d;
        }
        int i2 = (int) (d3 / d4);
        if (i2 < 18) {
            return 18;
        }
        if (i2 > 89) {
            return 89;
        }
        return i2;
    }

    @NotNull
    public final Map<Integer, Coefficient> getCoefficients() throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = new JSONArray(COEFFICIENTS);
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                linkedHashMap.put(Integer.valueOf(jSONObject.optInt("age")), new Coefficient(jSONObject.optDouble("female_a"), jSONObject.optDouble("female_b"), jSONObject.optDouble("female_c"), jSONObject.optDouble("male_a"), jSONObject.optDouble("male_b"), jSONObject.optDouble("male_c")));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return linkedHashMap;
    }
}
