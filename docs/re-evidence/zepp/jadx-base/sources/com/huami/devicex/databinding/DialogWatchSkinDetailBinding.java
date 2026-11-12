package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.baseui.GifMovieView;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinProgressView;

/* JADX INFO: loaded from: classes7.dex */
public final class DialogWatchSkinDetailBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout anetoContainer;

    @NonNull
    public final GifMovieView anetoGifView;

    @NonNull
    public final ImageView anetoThumbnailImg;

    @NonNull
    public final FrameLayout athensContainer;

    @NonNull
    public final GifMovieView athensGifView;

    @NonNull
    public final ImageView athensThumbnailImg;

    @NonNull
    public final FrameLayout beatsContainer;

    @NonNull
    public final GifMovieView beatsGifView;

    @NonNull
    public final ImageView beatsThumbnailImg;

    @NonNull
    public final FrameLayout cincoContainer;

    @NonNull
    public final GifMovieView cincoGifView;

    @NonNull
    public final ImageView cincoThumbnailImg;

    @NonNull
    public final TextView errorTipsTv;

    @NonNull
    public final GifMovieView gifView;

    @NonNull
    public final ImageView gtrBg;

    @NonNull
    public final FrameLayout gtrContainer;

    @NonNull
    public final GifMovieView gtrGifView;

    @NonNull
    public final ImageView gtrThumbnailImg;

    @NonNull
    public final FrameLayout kestrelContainer;

    @NonNull
    public final GifMovieView kestrelGifView;

    @NonNull
    public final ImageView kestrelThumbnailImg;

    @NonNull
    public final FrameLayout peytoContainer;

    @NonNull
    public final WatchSkinProgressView progress;

    @NonNull
    public final FrameLayout pyhContainer;

    @NonNull
    public final GifMovieView pyhGifView;

    @NonNull
    public final ImageView pyhThumbnailImg;

    @NonNull
    public final FrameLayout tempoContainer;

    @NonNull
    public final GifMovieView tempoGifView;

    @NonNull
    public final ImageView tempoThumbnailImg;

    @NonNull
    public final ImageView thumbnailImg;

    @NonNull
    public final TextView tipsTv;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final FrameLayout veniceContainer;

    @NonNull
    public final GifMovieView veniceGifView;

    @NonNull
    public final ImageView veniceThumbnailImg;

    @NonNull
    public final ImageView vultureBg;

    @NonNull
    public final FrameLayout vultureContainer;

    @NonNull
    public final GifMovieView vultureGifView;

    @NonNull
    public final ImageView vultureThumbnailImg;

    private DialogWatchSkinDetailBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull GifMovieView gifMovieView, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout3, @NonNull GifMovieView gifMovieView2, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout4, @NonNull GifMovieView gifMovieView3, @NonNull ImageView imageView3, @NonNull FrameLayout frameLayout5, @NonNull GifMovieView gifMovieView4, @NonNull ImageView imageView4, @NonNull TextView textView, @NonNull GifMovieView gifMovieView5, @NonNull ImageView imageView5, @NonNull FrameLayout frameLayout6, @NonNull GifMovieView gifMovieView6, @NonNull ImageView imageView6, @NonNull FrameLayout frameLayout7, @NonNull GifMovieView gifMovieView7, @NonNull ImageView imageView7, @NonNull FrameLayout frameLayout8, @NonNull WatchSkinProgressView watchSkinProgressView, @NonNull FrameLayout frameLayout9, @NonNull GifMovieView gifMovieView8, @NonNull ImageView imageView8, @NonNull FrameLayout frameLayout10, @NonNull GifMovieView gifMovieView9, @NonNull ImageView imageView9, @NonNull ImageView imageView10, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FrameLayout frameLayout11, @NonNull GifMovieView gifMovieView10, @NonNull ImageView imageView11, @NonNull ImageView imageView12, @NonNull FrameLayout frameLayout12, @NonNull GifMovieView gifMovieView11, @NonNull ImageView imageView13) {
        this.a = frameLayout;
        this.anetoContainer = frameLayout2;
        this.anetoGifView = gifMovieView;
        this.anetoThumbnailImg = imageView;
        this.athensContainer = frameLayout3;
        this.athensGifView = gifMovieView2;
        this.athensThumbnailImg = imageView2;
        this.beatsContainer = frameLayout4;
        this.beatsGifView = gifMovieView3;
        this.beatsThumbnailImg = imageView3;
        this.cincoContainer = frameLayout5;
        this.cincoGifView = gifMovieView4;
        this.cincoThumbnailImg = imageView4;
        this.errorTipsTv = textView;
        this.gifView = gifMovieView5;
        this.gtrBg = imageView5;
        this.gtrContainer = frameLayout6;
        this.gtrGifView = gifMovieView6;
        this.gtrThumbnailImg = imageView6;
        this.kestrelContainer = frameLayout7;
        this.kestrelGifView = gifMovieView7;
        this.kestrelThumbnailImg = imageView7;
        this.peytoContainer = frameLayout8;
        this.progress = watchSkinProgressView;
        this.pyhContainer = frameLayout9;
        this.pyhGifView = gifMovieView8;
        this.pyhThumbnailImg = imageView8;
        this.tempoContainer = frameLayout10;
        this.tempoGifView = gifMovieView9;
        this.tempoThumbnailImg = imageView9;
        this.thumbnailImg = imageView10;
        this.tipsTv = textView2;
        this.titleTv = textView3;
        this.veniceContainer = frameLayout11;
        this.veniceGifView = gifMovieView10;
        this.veniceThumbnailImg = imageView11;
        this.vultureBg = imageView12;
        this.vultureContainer = frameLayout12;
        this.vultureGifView = gifMovieView11;
        this.vultureThumbnailImg = imageView13;
    }

    @NonNull
    public static DialogWatchSkinDetailBinding bind(@NonNull View view) {
        int i = R.id.aneto_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.aneto_gif_view;
            GifMovieView gifMovieView = (GifMovieView) ViewBindings.findChildViewById(view, i);
            if (gifMovieView != null) {
                i = R.id.aneto_thumbnail_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.athens_container;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null) {
                        i = R.id.athens_gif_view;
                        GifMovieView gifMovieView2 = (GifMovieView) ViewBindings.findChildViewById(view, i);
                        if (gifMovieView2 != null) {
                            i = R.id.athens_thumbnail_img;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.beats_container;
                                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout3 != null) {
                                    i = R.id.beats_gif_view;
                                    GifMovieView gifMovieView3 = (GifMovieView) ViewBindings.findChildViewById(view, i);
                                    if (gifMovieView3 != null) {
                                        i = R.id.beats_thumbnail_img;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView3 != null) {
                                            i = R.id.cinco_container;
                                            FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                            if (frameLayout4 != null) {
                                                i = R.id.cinco_gif_view;
                                                GifMovieView gifMovieView4 = (GifMovieView) ViewBindings.findChildViewById(view, i);
                                                if (gifMovieView4 != null) {
                                                    i = R.id.cinco_thumbnail_img;
                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView4 != null) {
                                                        i = R.id.error_tips_tv;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView != null) {
                                                            i = R.id.gif_view;
                                                            GifMovieView gifMovieView5 = (GifMovieView) ViewBindings.findChildViewById(view, i);
                                                            if (gifMovieView5 != null) {
                                                                i = R.id.gtr_bg;
                                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView5 != null) {
                                                                    i = R.id.gtr_container;
                                                                    FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (frameLayout5 != null) {
                                                                        i = R.id.gtr_gif_view;
                                                                        GifMovieView gifMovieView6 = (GifMovieView) ViewBindings.findChildViewById(view, i);
                                                                        if (gifMovieView6 != null) {
                                                                            i = R.id.gtr_thumbnail_img;
                                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                            if (imageView6 != null) {
                                                                                i = R.id.kestrel_container;
                                                                                FrameLayout frameLayout6 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (frameLayout6 != null) {
                                                                                    i = R.id.kestrel_gif_view;
                                                                                    GifMovieView gifMovieView7 = (GifMovieView) ViewBindings.findChildViewById(view, i);
                                                                                    if (gifMovieView7 != null) {
                                                                                        i = R.id.kestrel_thumbnail_img;
                                                                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                        if (imageView7 != null) {
                                                                                            i = R.id.peyto_container;
                                                                                            FrameLayout frameLayout7 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (frameLayout7 != null) {
                                                                                                i = R.id.progress;
                                                                                                WatchSkinProgressView watchSkinProgressView = (WatchSkinProgressView) ViewBindings.findChildViewById(view, i);
                                                                                                if (watchSkinProgressView != null) {
                                                                                                    i = R.id.pyh_container;
                                                                                                    FrameLayout frameLayout8 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                                    if (frameLayout8 != null) {
                                                                                                        i = R.id.pyh_gif_view;
                                                                                                        GifMovieView gifMovieView8 = (GifMovieView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (gifMovieView8 != null) {
                                                                                                            i = R.id.pyh_thumbnail_img;
                                                                                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (imageView8 != null) {
                                                                                                                i = R.id.tempo_container;
                                                                                                                FrameLayout frameLayout9 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                if (frameLayout9 != null) {
                                                                                                                    i = R.id.tempo_gif_view;
                                                                                                                    GifMovieView gifMovieView9 = (GifMovieView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (gifMovieView9 != null) {
                                                                                                                        i = R.id.tempo_thumbnail_img;
                                                                                                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (imageView9 != null) {
                                                                                                                            i = R.id.thumbnail_img;
                                                                                                                            ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (imageView10 != null) {
                                                                                                                                i = R.id.tips_tv;
                                                                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (textView2 != null) {
                                                                                                                                    i = R.id.title_tv;
                                                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (textView3 != null) {
                                                                                                                                        i = R.id.venice_container;
                                                                                                                                        FrameLayout frameLayout10 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (frameLayout10 != null) {
                                                                                                                                            i = R.id.venice_gif_view;
                                                                                                                                            GifMovieView gifMovieView10 = (GifMovieView) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (gifMovieView10 != null) {
                                                                                                                                                i = R.id.venice_thumbnail_img;
                                                                                                                                                ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (imageView11 != null) {
                                                                                                                                                    i = R.id.vulture_bg;
                                                                                                                                                    ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                    if (imageView12 != null) {
                                                                                                                                                        i = R.id.vulture_container;
                                                                                                                                                        FrameLayout frameLayout11 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                        if (frameLayout11 != null) {
                                                                                                                                                            i = R.id.vulture_gif_view;
                                                                                                                                                            GifMovieView gifMovieView11 = (GifMovieView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                            if (gifMovieView11 != null) {
                                                                                                                                                                i = R.id.vulture_thumbnail_img;
                                                                                                                                                                ImageView imageView13 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                if (imageView13 != null) {
                                                                                                                                                                    return new DialogWatchSkinDetailBinding((FrameLayout) view, frameLayout, gifMovieView, imageView, frameLayout2, gifMovieView2, imageView2, frameLayout3, gifMovieView3, imageView3, frameLayout4, gifMovieView4, imageView4, textView, gifMovieView5, imageView5, frameLayout5, gifMovieView6, imageView6, frameLayout6, gifMovieView7, imageView7, frameLayout7, watchSkinProgressView, frameLayout8, gifMovieView8, imageView8, frameLayout9, gifMovieView9, imageView9, imageView10, textView2, textView3, frameLayout10, gifMovieView10, imageView11, imageView12, frameLayout11, gifMovieView11, imageView13);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogWatchSkinDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogWatchSkinDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_watch_skin_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
