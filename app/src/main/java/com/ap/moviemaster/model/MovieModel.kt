package com.ap.moviemaster.model

import androidx.annotation.DrawableRes
import com.ap.moviemaster.R

/**
 * The example global movies DB.
 */
val MOVIES: List<Movie> = listOf(
	Movie(
		id = 0,
		title = "Avtar",
		subtitle = "Coming in 21.01.18",
		description = "When his brother is killed in a robbery, paraplegic Marine Jake Sully decides to take his place in a mission on the distant world of Pandora.",
		poster = R.drawable.avatar,
		rating = 4
	),
	Movie(
		id = 1,
		title = "Avengers",
		subtitle = "Coming in 17.12.20",
		description = "Loki, the adopted brother of Thor, teams-up with the Chitauri Army and uses the Tesseract's power to travel from Asgard to Midgard to plot the invasion of Earth and become a king.",
		poster = R.drawable.avengers,
		rating = 5
	),
	Movie(
		id = 2,
		title = "Batman",
		subtitle = "Coming in 01.01.21",
		description = "Two years of nights have turned Bruce Wayne into a nocturnal animal. But as he continues to find his way as Gotham's dark knight Bruce is forced into a game of cat and mouse with his biggest threat so far.",
		poster = R.drawable.batman,
		rating = 4
	),
	Movie(
		id = 3,
		title = "Spider Man",
		subtitle = "Coming in 12.08.19",
		description = "Following the tragic death of his former girlfriend - seemingly caused by his own attempt to save her - Peter Parker (Warden Wayne) lingers in his guilt of the past.",
		poster = R.drawable.spiderman,
		rating = 3
	),
	Movie(
		id = 4,
		title = "Venom",
		subtitle = "Coming in 31.05.99",
		description = "After a faulty interview with the Life Foundation ruins his career, former reporter Eddie Brock's life is in pieces.",
		poster = R.drawable.venom,
		rating = 3
	)
)

/**
 * Movie model.
 *
 * @property id the id.
 * @property title the title.
 * @property subtitle the subtitle.
 * @property description the description.
 * @property poster the poster drawable resource.
 * @property rating the rating in range from 0 to 4.
 */
data class Movie(
	val id: Int,
	val title: String,
	val subtitle: String,
	val description: String,
	@DrawableRes
	val poster: Int,
	val rating: Int
)
