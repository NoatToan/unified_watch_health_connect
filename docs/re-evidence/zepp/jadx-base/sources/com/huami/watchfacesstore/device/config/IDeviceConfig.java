package com.huami.watchfacesstore.device.config;

import com.huami.watchfacesstore.device.process.DialFileType;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0016\u0010\u0017\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u001f\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0005R\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0005R\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0005R\"\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0016\u0010-\u001a\u00020*8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0016\u00101\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0016R\u0016\u00103\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016R$\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0005R\u0016\u00109\u001a\u0002068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010;\u001a\u00020:8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020:8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020:8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0016\u0010?\u001a\u00020:8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010<¨\u0006@"}, d2 = {"Lcom/huami/watchfacesstore/device/config/IDeviceConfig;", "", "Lkotlin/Pair;", "", "getSmallDialSize", "()Lkotlin/Pair;", "smallDialSize", "getMiddleDialSize", "middleDialSize", "getBigDialSize", "bigDialSize", "getDialInCardSizeOne", "dialInCardSizeOne", "getDialInCardSizeTwo", "dialInCardSizeTwo", "getDialInCardSizeThree", "dialInCardSizeThree", "getDialInCardSizeFour", "dialInCardSizeFour", "getDialInCardSizeFive", "dialInCardSizeFive", "getDefaultDeviceImage", "()I", "defaultDeviceImage", "getDefaultLargeDeviceImage", "defaultLargeDeviceImage", "getRadiusOne", "radiusOne", "getRadiusTwo", "radiusTwo", "getPlaceHolderImage", "placeHolderImage", "getShadowInCardSizeOne", "shadowInCardSizeOne", "getShadowInCardSizeTwo", "shadowInCardSizeTwo", "getShadowInCardSizeThree", "shadowInCardSizeThree", "getShadowInCardSizeFour", "shadowInCardSizeFour", "getShadowInCardSizeFive", "shadowInCardSizeFive", "", "getRankPlaceHolderImage", "()[I", "rankPlaceHolderImage", "getRealDialSize", "realDialSize", "getRealDialRadius", "realDialRadius", "getDialRadiusInCard", "dialRadiusInCard", "getRealDialPreviewSize", "realDialPreviewSize", "Lcom/huami/watchfacesstore/device/process/DialFileType;", "getDialFileType", "()Lcom/huami/watchfacesstore/device/process/DialFileType;", "dialFileType", "", "isSupportDialDelete", "()Z", "isSupportDialStyle", "isSupportDialColor", "isSupportDialReplace", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IDeviceConfig {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static int getDialRadiusInCard(@NotNull IDeviceConfig iDeviceConfig) {
            return 0;
        }

        @Nullable
        public static Pair<Integer, Integer> getRealDialPreviewSize(@NotNull IDeviceConfig iDeviceConfig) {
            return null;
        }

        public static boolean isSupportDialColor(@NotNull IDeviceConfig iDeviceConfig) {
            return false;
        }

        public static boolean isSupportDialDelete(@NotNull IDeviceConfig iDeviceConfig) {
            return true;
        }

        public static boolean isSupportDialReplace(@NotNull IDeviceConfig iDeviceConfig) {
            return false;
        }

        public static boolean isSupportDialStyle(@NotNull IDeviceConfig iDeviceConfig) {
            return true;
        }
    }

    @NotNull
    Pair<Integer, Integer> getBigDialSize();

    int getDefaultDeviceImage();

    int getDefaultLargeDeviceImage();

    @NotNull
    DialFileType getDialFileType();

    @NotNull
    Pair<Integer, Integer> getDialInCardSizeFive();

    @NotNull
    Pair<Integer, Integer> getDialInCardSizeFour();

    @NotNull
    Pair<Integer, Integer> getDialInCardSizeOne();

    @NotNull
    Pair<Integer, Integer> getDialInCardSizeThree();

    @NotNull
    Pair<Integer, Integer> getDialInCardSizeTwo();

    int getDialRadiusInCard();

    @NotNull
    Pair<Integer, Integer> getMiddleDialSize();

    int getPlaceHolderImage();

    int getRadiusOne();

    int getRadiusTwo();

    @NotNull
    int[] getRankPlaceHolderImage();

    @Nullable
    Pair<Integer, Integer> getRealDialPreviewSize();

    int getRealDialRadius();

    @NotNull
    Pair<Integer, Integer> getRealDialSize();

    @NotNull
    Pair<Integer, Integer> getShadowInCardSizeFive();

    @NotNull
    Pair<Integer, Integer> getShadowInCardSizeFour();

    @NotNull
    Pair<Integer, Integer> getShadowInCardSizeOne();

    @NotNull
    Pair<Integer, Integer> getShadowInCardSizeThree();

    @NotNull
    Pair<Integer, Integer> getShadowInCardSizeTwo();

    @NotNull
    Pair<Integer, Integer> getSmallDialSize();

    boolean isSupportDialColor();

    boolean isSupportDialDelete();

    boolean isSupportDialReplace();

    boolean isSupportDialStyle();
}
